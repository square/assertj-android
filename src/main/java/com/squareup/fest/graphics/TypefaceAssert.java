// Copyright 2013 Square, Inc.
package com.squareup.fest.graphics;

import android.graphics.Typeface;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link Typeface} instances. */
public class TypefaceAssert extends AbstractAssert<TypefaceAssert, Typeface> {
  public TypefaceAssert(Typeface actual) {
    super(actual, TypefaceAssert.class);
  }

  public TypefaceAssert hasStyle(int style) {
    isNotNull();
    int actualStyle = actual.getStyle();
    assertThat(actualStyle) //
        .overridingErrorMessage("Expected style <%s> but was <%s>.", style, actualStyle) //
        .isEqualTo(style);
    return this;
  }

  public TypefaceAssert isBold() {
    isNotNull();
    assertThat(actual.isBold()) //
        .overridingErrorMessage("Expected to be bold but was not.") //
        .isTrue();
    return this;
  }

  public TypefaceAssert isNotBold() {
    isNotNull();
    assertThat(actual.isBold()) //
        .overridingErrorMessage("Expected to not be bold but was.") //
        .isFalse();
    return this;
  }

  public TypefaceAssert isItalic() {
    isNotNull();
    assertThat(actual.isItalic()) //
        .overridingErrorMessage("Expected to be italic but was not.") //
        .isTrue();
    return this;
  }

  public TypefaceAssert isNotItalic() {
    isNotNull();
    assertThat(actual.isItalic()) //
        .overridingErrorMessage("Expected to not be italic but was.") //
        .isFalse();
    return this;
  }
}
