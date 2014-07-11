#!/bin/bash

MISSING=0

for project in $(\find . -type d -name 'assertj-android*' -maxdepth 1 | \sed 's|./||g'); do
  echo "Checking ${project}..."
  ASSERTIONS=$(\find ${project} -name 'Assertions.java')
  CLASSES=$(\find ${project} -type f -name '*Assert.java' | \cut -d'/' -f 5- | \grep -v '/Abstract' | \sed 's|.java||' | \sed 's|/|.|g')
  for class in ${CLASSES}; do
    \grep "$class" ${ASSERTIONS} > /dev/null
    if [ $? -ne 0 ]; then
      echo "MISSING: $class"
      MISSING=1
    fi
  done
done

if [ ${MISSING} -ne 0 ]; then
  echo "Failed :("
	exit 1
fi
echo "Success!"
