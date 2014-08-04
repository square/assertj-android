#!/usr/bin/env python

from datetime import date
import os
import re

SRC_DIR = 'src/main/java/'
ABSTRACT = re.compile(r'public abstract class Abstract')
TYPE   = re.compile(r'class [A-Za-z0-9]+(<[^>]+?(?: extends ([A-Za-z0-9_]+))?>)?')
TARGET = re.compile(r'\s[A-Z][A-Za-z0-9_]+<[A-Z][A-Za-z0-9_]+(?:<.+?>)?, (([A-Z][A-Za-z0-9_]+).*?)(<.+?>)?> {')
IMPORT = re.compile(r'import (?:static )?((?:com\.google\.)?android\..*?);')
ASSERTIONS = 'Assertions.java'


projects = []
for candidate in filter(os.path.isdir, os.listdir('.')):
  if candidate.startswith('assertj-android'):
    projects.append(candidate)
print('Projects: %s\n' % projects)


def _find_assertions(path):
  for root, dirs, files in os.walk(path):
    if ASSERTIONS in files:
      return os.path.join(root, ASSERTIONS)
  raise Exception('Could not locate Assertions.java in %s.' % path)


for project in projects:
  src_dir = os.path.join(project, SRC_DIR)
  assertions_file = _find_assertions(src_dir)
  assertions_dir = os.path.dirname(assertions_file)
  classes_package = assertions_dir[len(src_dir):].replace(os.sep, '.')

  print('\n' * 3)
  print(project)
  print('')
  print('src_dir = %s' % src_dir)
  print('assertions_file = %s' % assertions_file)
  print('assertions_dir = %s' % assertions_dir)
  print('classes_package = %s' % classes_package)
  print('')

  assertions = []
  for root, dirs, files in os.walk(assertions_dir):
    for f in files:
      if not f.endswith('Assert.java'):
        continue
      print('-'*80)

      local_package = root[len(src_dir):].replace(os.sep, '.')
      package = '%s.%s' % (local_package, f[:-5])
      print('package    : %s' % package)

      with open(os.path.join(root, f)) as j:
        java = j.read()
      if ABSTRACT.search(java) is not None:
        print('SKIP (abstract)')
        continue # Abstract class.

      target_match = TARGET.search(java)
      import_type = target_match.group(2)
      target_type = target_match.group(1)
      generics    = target_match.group(3)
      print('import type: %s' % import_type)
      print('target type: %s' % target_type)
      print('generics   : %s' % generics)

      for match in IMPORT.finditer(java):
        if match.group(1).endswith(import_type):
          import_package = match.group(1)
          break
      else:
        raise Exception('Could not find target package for %s' % import_type)

      type_match = TYPE.search(java)
      bounds_type = type_match.group(1)
      bounds_ext  = type_match.group(2)
      if generics:
        print('bounds type: %s' % bounds_type)
        print('bounds ext : %s' % bounds_ext)

      if bounds_ext:
        for match in IMPORT.finditer(java):
          if match.group(1).endswith(bounds_ext):
            bounds_type = bounds_type.replace(bounds_ext, match.group(1))
            break
        else:
          raise Exception('Could not find target package for %s' % bounds_ext)
        print('bounds fqcn: %s' % bounds_type)

      target_package = import_package.replace(import_type, target_type)
      print('import pkg : %s' % import_package)
      print('target pkg : %s' % target_package)

      assertions.append(
        (package, target_package, bounds_type or '', generics or '')
      )

  print('-'*80)

  with open(assertions_file, 'w') as out:
    out.write('// Copyright %s Square, Inc.\n' % date.today().year)
    out.write('//\n')
    out.write('// This class is generated. Do not modify directly!\n')
    out.write('package %s;\n\n' % classes_package)
    out.write('/** Assertions for testing Android classes. */\n')
    out.write('@SuppressWarnings("deprecation")\n')
    out.write('public final class Assertions {')
    for package, target_package, bounds_type, generic_keys in sorted(assertions, key=lambda x: x[0]):
      out.write('\n')
      out.write('  public static %s%s%s assertThat(\n' % (bounds_type + ' ' if bounds_type else '', package, generic_keys))
      out.write('      %s%s actual) {\n' % (target_package, generic_keys))
      out.write('    return new %s%s(actual);\n' % (package, '<>' if generic_keys else ''))
      out.write('  }\n')
    out.write('\n')
    out.write('  private Assertions() {\n')
    out.write('    throw new AssertionError("No instances.");\n')
    out.write('  }\n')
    out.write('}\n')


print('\nNew Assertions.java files written!\n')
