// Copyright 2013 Square, Inc.
package org.assertj.android.api.graphics.drawable;

import android.annotation.TargetApi;
import android.graphics.drawable.GradientDrawable;

import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link android.graphics.drawable.GradientDrawable} instances. */
public class GradientDrawableAssert
    extends AbstractDrawableAssert<GradientDrawableAssert, GradientDrawable> {
  public GradientDrawableAssert(GradientDrawable actual) {
    super(actual, GradientDrawableAssert.class);
  }

  @TargetApi(JELLY_BEAN)
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
