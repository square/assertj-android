AssertJ Android
===============

A set of AssertJ assertions geared toward testing Android.

Writing tests is not the most glamorous part of developing an Android
application but it is an invaluable one. Using libraries like JUnit and AssertJ
provide a great starting point for writing tests.

This library is an extension of [AssertJ][1] which aims to make it even easier to test
Android.



Examples
--------

 *  AssertJ Android:

    ```java
    assertThat(view).isGone();
    ```

 *  Regular JUnit:

    ```java
    assertEquals(View.GONE, view.getVisibility());
    ```

 *  Regular AssertJ:

    ```java
    assertThat(view.getVisibility()).isEqualTo(View.GONE);
    ```

When failing, the _AssertJ Android_ assertion produces an output which allows you
to immediately recognize the problem:
`Expected visibility <gone> but was <invisible>`.

Compare that to the output of regular _AssertJ_ `Expected:<[8]> but was:<[4]>` and
regular _JUnit_ `Expected: <8> but was: <4>` and you should immediately see the
advantage.


Because _AssertJ Android_ offers assertions directly on objects rather than
properties they can be chained together.

 *  AssertJ Android:

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

 *  Regular AssertJ:

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
import static org.assertj.android.api.Assertions.assertThat;
```



Add-On Modules
--------------

Modules are also provided for the add-on Android libraries. Add the dependency
(listed below) and use the following imports:

 * support-v4: `import static org.assertj.android.support.v4.api.Assertions.assertThat;`
 * play-services: `import static org.assertj.android.playservices.api.Assertions.assertThat;`
 * appcompat-v7: `import static org.assertj.android.appcompat.v7.api.Assertions.assertThat;`
 * mediarouter-v7: `import static org.assertj.android.mediarouter.v7.api.Assertions.assertThat;`
 * gridlayout-v7: `import static org.assertj.android.gridlayout.v7.api.Assertions.assertThat;`
 * cardview-v7: `import static org.assertj.android.cardview.v7.api.Assertions.assertThat;`
 * recyclerview-v7: `import static org.assertj.android.recyclerview.v7.api.Assertions.assertThat;`
 * pallete-v7: `import static org.assertj.android.pallete.v7.api.Assertions.assertThat;`



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
  public static CustomLayoutAssert assertThat(CustomLayout actual) {
    return new CustomLayout(actual);
  }

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

Now static import `CustomLayoutAssert.assertThat` in your test classes.

For more information about writing custom assertions see the [official documentation][2].



Download
--------

Android module:
```groovy
androidTestCompile 'com.squareup.assertj:assertj-android:1.0.0'
```

support-v4 module:
```groovy
androidTestCompile 'com.squareup.assertj:assertj-android-support-v4:1.0.0'
```

Google Play Services module:
```groovy
androidTestCompile 'com.squareup.assertj:assertj-android-play-services:1.0.0'
```

appcompat-v7 module:
```groovy
androidTestCompile 'com.squareup.assertj:assertj-android-appcompat-v7:1.0.0'
```

mediarouter-v7 module:
```groovy
androidTestCompile 'com.squareup.assertj:assertj-android-mediarouter-v7:1.0.0'
```

gridlayout-v7 module:
```groovy
androidTestCompile 'com.squareup.assertj:assertj-android-gridlayout-v7:1.0.0'
```

cardview-v7 module:
```groovy
androidTestCompile 'com.squareup.assertj:assertj-android-cardview-v7:1.0.0'
```

recyclerview-v7 module:
```groovy
androidTestCompile 'com.squareup.assertj:assertj-android-recyclerview-v7:1.0.0'
```

pallete-v7 module:
```groovy
androidTestCompile 'com.squareup.assertj:assertj-android-pallete-v7:1.0.0'
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




 [1]: http://joel-costigliola.github.io/assertj/
 [2]: http://joel-costigliola.github.io/assertj/assertj-core-custom-assertions.html
