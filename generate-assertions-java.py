#!/usr/bin/env python

from datetime import date
import os
import re

SRC_DIR = 'src/main/java/'
ABSTRACT = re.compile(r'public abstract class Abstract')
TARGET = re.compile(r'\s[A-Z][A-Za-z0-9_]+<[A-Z][A-Za-z0-9_]+(<.+?>)?, (([A-Z][A-Za-z0-9_]+).*?)(<.+?>)?> {')
IMPORT = re.compile(r'import (android\..*?);')
ASSERTIONS = 'Assertions.java'


projects = []
for candidate in filter(os.path.isdir, os.listdir('.')):
  if candidate.startswith('android'):
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

  print('[%s] src_dir = %s' % (project, src_dir))
  print('[%s] assertions_file = %s' % (project, assertions_file))
  print('[%s] assertions_dir = %s' % (project, assertions_dir))
  print('[%s] classes_package = %s' % (project, classes_package))

  assertions = []
  for root, dirs, files in os.walk(assertions_dir):
    for f in files:
      if not f.endswith('Assert.java'):
        continue
      print('-'*80)

      local_package = root[len(src_dir):].replace(os.sep, '.')
      package = '%s.%s' % (local_package, f[:-5])
      print('package: %s' % package)

      with open(os.path.join(root, f)) as j:
        java = j.read()
      if ABSTRACT.search(java) is not None:
        print('SKIP (abstract)')
        continue # Abstract class.

      type_match = TARGET.search(java)
      import_type = type_match.group(3)
      target_type = type_match.group(2)
      generics    = type_match.group(4)
      print('import type: %s' % import_type)
      print('target type: %s' % target_type)
      print('generics   : %s' % generics)

      import_package = None
      for match in IMPORT.finditer(java):
        if match.group(1).endswith(import_type):
          import_package = match.group(1)
          break
      if import_package is None:
        raise Exception('Could not find target package for %s' % package)

      target_package = import_package.replace(import_type, target_type)
      print('import package: %s' % import_package)
      print('target package: %s' % target_package)

      assertions.append(
        (package, target_package, generics or '')
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
    for package, target_package, generic_keys in sorted(assertions, key=lambda x: x[0]):
      out.write('\n')
      out.write('  public static %s%s%s assertThat(\n' % (generic_keys + ' ' if generic_keys else '', package, generic_keys))
      out.write('      %s%s actual) {\n' % (target_package, generic_keys))
      out.write('    return new %s%s(actual);\n' % (package, '<>' if generic_keys else ''))
      out.write('  }\n')
    out.write('\n')
    out.write('  private Assertions() {\n')
    out.write('    throw new AssertionError("No instances.");\n')
    out.write('  }\n')
    out.write('}')


print('\nNew Assertions.java files written!\n')
