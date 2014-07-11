// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.assertj.android.api.view.AbstractViewAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static org.assertj.core.api.Assertions.assertThat;

public class ImageViewAssert extends AbstractViewAssert<ImageViewAssert, ImageView> {
  public ImageViewAssert(ImageView actual) {
    super(actual, ImageViewAssert.class);
  }

  @TargetApi(HONEYCOMB)
  public ImageViewAssert isAligningBaselineToBottom() {
    isNotNull();
    assertThat(actual.getBaselineAlignBottom()) //
        .overridingErrorMessage("Expected to be aligning baseline to bottom but was not.") //
        .isTrue();
    return this;
  }

  @TargetApi(HONEYCOMB)
  public ImageViewAssert isNotAligningBaselineToBottom() {
    isNotNull();
    assertThat(actual.getBaselineAlignBottom()) //
        .overridingErrorMessage("Expected to not be aligning baseline to bottom but was.") //
        .isFalse();
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public ImageViewAssert isCroppingToPadding() {
    isNotNull();
    assertThat(actual.getCropToPadding()) //
        .overridingErrorMessage("Expected to be cropping to padding but was not.") //
        .isTrue();
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public ImageViewAssert isNotCroppingToPadding() {
    isNotNull();
    assertThat(actual.getCropToPadding()) //
        .overridingErrorMessage("Expected to not be cropping to padding but was.") //
        .isFalse();
    return this;
  }

  public ImageViewAssert hasDrawable(Drawable drawable) {
    isNotNull();
    Drawable actualDrawable = actual.getDrawable();
    assertThat(actualDrawable) //
        .overridingErrorMessage("Expected drawable <%s> but was <%s>.", drawable, actualDrawable) //
        .isSameAs(drawable);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public ImageViewAssert hasImageAlpha(int alpha) {
    isNotNull();
    int actualAlpha = actual.getImageAlpha();
    assertThat(actualAlpha) //
        .overridingErrorMessage("Expected image alpha <%s> but was <%s>.", alpha, actualAlpha) //
        .isEqualTo(alpha);
    return this;
  }

  public ImageViewAssert hasScaleType(ImageView.ScaleType type) {
    isNotNull();
    ImageView.ScaleType actualType = actual.getScaleType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected scale type <%s> but was <%s>.", type, actualType) //
        .isEqualTo(type);
    return this;
  }
}
