// Copyright 2013 Square, Inc.
package com.squareup.fest.graphics.drawable;

import android.graphics.drawable.ColorDrawable;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link ColorDrawable} instances. */
public class ColorDrawableAssert
    extends AbstractDrawableAssert<ColorDrawableAssert, ColorDrawable> {
  public ColorDrawableAssert(ColorDrawable actual) {
    super(actual, ColorDrawableAssert.class);
  }

  public ColorDrawableAssert hasAlpha(int alpha) {
    isNotNull();
    int actualAlpha = actual.getAlpha();
    assertThat(actualAlpha) //
        .overridingErrorMessage("Expected alpha <%s> but was <%s>.", alpha, actualAlpha) //
        .isEqualTo(alpha);
    return this;
  }

  public ColorDrawableAssert hasColor(int color) {
    isNotNull();
    int actualColor = actual.getColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected color <%s> but was <%s>.", Integer.toHexString(color),
            Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return this;
  }
}
