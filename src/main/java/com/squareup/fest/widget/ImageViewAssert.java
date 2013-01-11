// Copyright 2013 Square, Inc.
package com.squareup.fest.widget;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.fest.view.AbstractViewAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public class ImageViewAssert extends AbstractViewAssert<ImageViewAssert, ImageView> {
  public ImageViewAssert(ImageView actual) {
    super(actual, ImageViewAssert.class);
  }

  public ImageViewAssert isAligningBaselineToBottom() {
    isNotNull();
    assertThat(actual.getBaselineAlignBottom()) //
        .overridingErrorMessage("Expected to be aligning baseline to bottom but was not.") //
        .isTrue();
    return this;
  }

  public ImageViewAssert isNotAligningBaselineToBottom() {
    isNotNull();
    assertThat(actual.getBaselineAlignBottom()) //
        .overridingErrorMessage("Expected to not be aligning baseline to bottom but was.") //
        .isFalse();
    return this;
  }

  public ImageViewAssert isCroppingToPadding() {
    isNotNull();
    assertThat(actual.getCropToPadding()) //
        .overridingErrorMessage("Expected to be cropping to padding but was not.") //
        .isTrue();
    return this;
  }

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
