// Copyright 2013 Square, Inc.
package com.squareup.fest.graphics.drawable;

import android.graphics.drawable.GradientDrawable;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link android.graphics.drawable.GradientDrawable} instances. */
public class GradientDrawableAssert
    extends AbstractDrawableAssert<GradientDrawableAssert, GradientDrawable> {
  public GradientDrawableAssert(GradientDrawable actual) {
    super(actual, GradientDrawableAssert.class);
  }

  public GradientDrawableAssert hasOrientation(GradientDrawable.Orientation orientation) {
    isNotNull();
    GradientDrawable.Orientation actualOrientation = actual.getOrientation();
    assertThat(actualOrientation) //
        .overridingErrorMessage("Expected orientation <%s> but was <%s>.", orientation,
            actualOrientation) //
        .isEqualTo(orientation);
    return this;
  }
}
