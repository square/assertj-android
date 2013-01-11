#!/bin/bash

ASSERTIONS=`\find src/main/java -type f | \grep "Assert.java" | \sed 's|src/main/java/||' | \sed 's|\.java||' | \grep -v "/Abstract" | \sed 's|/|\.|g' | \sort`
MISSING=0

for assertion in $ASSERTIONS; do
	\grep "$assertion" src/main/java/com/squareup/fest/Assertions.java > /dev/null
	if [ $? -ne 0 ]; then
		echo "MISSING: $assertion"
		MISSING=1
	fi
done

if [ $MISSING -ne 0 ]; then
	exit 1
fi
