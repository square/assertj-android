Android FEST
============

A set of FEST assertions geared toward testing Android.

Writing tests is not the most glamorous part of developing an Android
application but it is an invaluable one. Using libaries like JUnit and FEST
provide a great starting point for writing tests.

This library is an extension of [**FEST**](http://fest.easytesting.org) which aims to make it even easier to test
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

When failing, the _FEST Android_ assertion produces an output which allows you
to immediately recognize the problem:
`Expected visibility <gone> but was <invisible>`.

Compare that to the output of regular _FEST_ `Expected:<[8]> but was:<[4]>` and
regular _JUnit_ `Expected: <8> but was: <4>` and you should immediately see the
advantage.


Because _FEST Android_ offers assertions directly on objects rather than
properties they can be chained together.

 *  FEST Android:

    ```java
    assertThat(layout).isVisible()
        .isVertical()
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

Assertions exist for nearly every object that you would ever want to test, from
`LinearLayout` to `ActionBar` to `Fragment` to `MenuItem`. Everything in the
support library is included too.

To get started writing tests add the following import:

```java
import static org.fest.assertions.api.ANDROID.assertThat;
```



Extending
---------

The provided assertions have also been designed to be extended for any custom
controls you have developed.

```java
public class CustomLayout extends LinearLayout {
  public int getBehavior() {
    /* ... */
  }
}
```

Use the following pattern to set up your assertions.

```java
public class CustomLayoutAssert extends AbstractLinearLayoutAssert<CustomLayoutAssert, CustomLayout> {
  public CustomLayoutAssert(CustomLayout actual) {
    super(actual, CustomLayoutAssert.class);
  }

  public CustomLayoutAssert hasSomeBehavior() {
    isNotNull();
    assertThat(actual.getBehavior())
        .overridingErrorMessage("Expected some behavior but was doing other behavior.")
        .isEqualTo(42)
    return this;
  }
}
```

To include this new assertion, create your own class which extends from `ANDROID`.

```java
public class MyAssertions extends ANDROID {
  public static CustomLayoutAssert assertThat(CustomLayout actual) {
    return new CustomLayoutAssert(actual);
  }
}
```

For more information about writing custom assertions see the [official documentation][2].



Download
--------

Download [the latest JAR][1] or grab via Maven:

```xml
<dependency>
  <groupId>com.squareup</groupId>
  <artifactId>fest-android</artifactId>
  <version>1.0.0</version>
</dependency>
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




 [1]: https://oss.sonatype.org/content/repositories/releases/com/squareup/fest-android/1.0.0/fest-android-1.0.0.jar
 [2]: https://github.com/alexruiz/fest-assert-2.x/wiki/Creating-specific-assertions
