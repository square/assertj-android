#!/usr/bin/env python

import os
import re

SRC_DIR = 'src/main/java/'
ABSTRACT = re.compile(r'public abstract class Abstract')
TARGET = re.compile(r'\s[A-Z][A-Za-z0-9_]+<[A-Z][A-Za-z0-9_]+(<.+?>)?, (([A-Z][A-Za-z0-9_]+).*?)(<.+?>)?> {')
IMPORT = re.compile(r'import (android\..*?);')
OUTPUT = 'src/main/java/org/fest/assertions/api/ANDROID.java'

assertions = []
for root, dirs, files in os.walk(SRC_DIR):
  for f in files:
    if not f.endswith('Assert.java'):
      continue
    print('-'*80)

    package = '%s.%s' % (root[len(SRC_DIR):].replace('/', '.'), f[:-5])
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
    print('generics   : %s'% generics)

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

    generic_keys = ''
    if generics:
      package += generics
      target_package += generics
      generic_keys = generics + ' '

    assertions.append(
      (package, target_package, generic_keys)
    )

print('-'*80)

with open(OUTPUT, 'w') as out:
  out.write('// Copyright 2012 Square, Inc.\n')
  out.write('//\n')
  out.write('// This class is generated. Do not modify directly!\n')
  out.write('package org.fest.assertions.api;\n\n')
  out.write('/** Assertions for testing Android classes. */\n')
  out.write('public class ANDROID {')
  for package, target_package, generic_keys in sorted(assertions, key=lambda x: x[0]):
    out.write('\n')
    out.write('  public static %s%s assertThat(\n' % (generic_keys, package))
    out.write('      %s actual) {\n' % target_package)
    out.write('    return new %s(actual);\n' % package)
    out.write('  }\n')
  out.write('\n')
  out.write('  protected ANDROID() {\n')
  out.write('  }\n')
  out.write('}')

print('\nNew ANDROID.java written!\n')