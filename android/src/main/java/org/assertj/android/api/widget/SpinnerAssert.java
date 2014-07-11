// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.widget.Spinner;

import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Spinner} instances. */
public class SpinnerAssert extends AbstractAbsSpinnerAssert<SpinnerAssert, Spinner> {
  public SpinnerAssert(Spinner actual) {
    super(actual, SpinnerAssert.class);
  }

  @TargetApi(JELLY_BEAN)
  public SpinnerAssert hasDropDownHorizontalOffset(int offset) {
    isNotNull();
    int actualOffset = actual.getDropDownHorizontalOffset();
    assertThat(actualOffset) //
        .overridingErrorMessage("Expected drop-down horizontal offset <%s> but was <%s>.", offset,
            actualOffset) //
        .isEqualTo(offset);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public SpinnerAssert hasDropDownVerticalOffset(int offset) {
    isNotNull();
    int actualOffset = actual.getDropDownVerticalOffset();
    assertThat(actualOffset) //
        .overridingErrorMessage("Expected drop-down vertical offset <%s> but was <%s>.", offset,
            actualOffset) //
        .isEqualTo(offset);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public SpinnerAssert hasDropDownWidth(int width) {
    isNotNull();
    int actualWidth = actual.getDropDownWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected drop-down width <%s> but was <%s>.", width,
            actualWidth) //
        .isEqualTo(width);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public SpinnerAssert hasGravity(int gravity) {
    isNotNull();
    int actualGravity = actual.getGravity();
    assertThat(actualGravity) //
        .overridingErrorMessage("Expected gravity <%s> but was <%s>.", gravity, actualGravity) //
        .isEqualTo(gravity);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public SpinnerAssert hasPopupBackground(Drawable background) {
    isNotNull();
    Drawable actualBackground = actual.getPopupBackground();
    assertThat(actualBackground) //
        .overridingErrorMessage("Expected popup background <%s> but was <%s>.", background,
            actualBackground) //
        .isSameAs(background);
    return this;
  }

  public SpinnerAssert hasPrompt(CharSequence text) {
    isNotNull();
    CharSequence actualText = actual.getPrompt();
    assertThat(actualText) //
        .overridingErrorMessage("Expected prompt <%s> but was <%s>.", text, actualText) //
        .isEqualTo(text);
    return this;
  }

  public SpinnerAssert hasPrompt(int resId) {
    isNotNull();
    return hasPrompt(actual.getContext().getString(resId));
  }
}
