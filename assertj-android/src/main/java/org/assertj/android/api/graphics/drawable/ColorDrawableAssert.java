// Copyright 2013 Square, Inc.
package org.assertj.android.api.graphics.drawable;

import android.annotation.TargetApi;
import android.graphics.drawable.ColorDrawable;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link ColorDrawable} instances. */
public class ColorDrawableAssert
    extends AbstractDrawableAssert<ColorDrawableAssert, ColorDrawable> {
  public ColorDrawableAssert(ColorDrawable actual) {
    super(actual, ColorDrawableAssert.class);
  }

  @TargetApi(HONEYCOMB)
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
