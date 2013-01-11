Android FEST
============

A set of FEST assertions geared toward testing Android.

Writing tests is not the most glamorous part of developing an Android
application but it is an invaluable one. Using libaries like JUnit and FEST
provide a great starting point for writing tests.

This library is an extension of FEST which aims to make it even easier to test
Android.



Examples
--------

 *  FEST Android:

    ```java
    assertThat(view).isGone();
    ```

 *  Regular JUnit:

    ```java
    assertEquals(View.GONE, view.getVisibility());
    ```

 *  Regular FEST:

    ```java
    assertThat(view.getVisibility()).isEqualTo(View.GONE);
    ```

When failing, the FEST Android assertion produces an output which allows you to immediately recognize the problem: `Expected visibility <gone> but was <invisible>`.

Compare that to the output of regular FEST `Expected:<[8]> but was:<[4]>` and regular JUnit `Expected: <8> but was: <4>` and you should immediately see the advantage.


Because FEST Android offers assertions directly on objects rather than properties you can chain multiple assertions.

 *  FEST Android:

    ```java
    assertThat(layout).isVisible()
        .hasOrientation(VERTICAL)
        .hasChildCount(4)
        .hasShowDividers(SHOW_DIVIDERS_MIDDLE);
    ```

 *  Regular JUnit:

    ```java
    assertEquals(View.VISIBLE, layout.getVisibility());
    assertEquals(VERTICAL, layout.getOrientation());
    assertEquals(4, layout.getChildCount());
    assertEquals(SHOW_DIVIDERS_MIDDLE, layout.getShowDividers());
    ```

 *  Regular FEST:

    ```java
    assertThat(layout.getVisibility()).isEqualTo(View.VISIBLE);
    assertThat(layout.getOrientation()).isEqualTo(VERTICAL);
    assertThat(layout.getChildCount()).isEqualTo(4);
    assertThat(layout.getShowDividers()).isEqualTo(SHOW_DIVIDERS_MIDDLE);
    ```

Assertions exist for nearly every object that you would ever want to test, from `LinearLayout` to `ActionBar` to `Fragment` to `MenuItem`. Everything in the support library is included too.



Download
--------

Download [the latest JAR][1] or grab via Maven:

```xml
<dependency>
  <groupId>com.squareup.fest</groupId>
  <artifactId>fest-android</artifactId>
  <version>(insert latest version)</version>
</version>
```



License
-------

    Copyright 2013 Square, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.