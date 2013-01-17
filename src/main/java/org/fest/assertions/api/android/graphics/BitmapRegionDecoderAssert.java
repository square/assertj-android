// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.graphics;

import android.graphics.BitmapRegionDecoder;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link BitmapRegionDecoder} instances. */
public class BitmapRegionDecoderAssert
    extends AbstractAssert<BitmapRegionDecoderAssert, BitmapRegionDecoder> {
  public BitmapRegionDecoderAssert(BitmapRegionDecoder actual) {
    super(actual, BitmapRegionDecoderAssert.class);
  }

  public BitmapRegionDecoderAssert hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.getHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>.", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public BitmapRegionDecoderAssert hasWidth(int width) {
    isNotNull();
    int actualHeight = actual.getWidth();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected width <%s> but was <%s>.", width, actualHeight) //
        .isEqualTo(width);
    return this;
  }

  public BitmapRegionDecoderAssert isRecycled() {
    isNotNull();
    assertThat(actual.isRecycled()) //
        .overridingErrorMessage("Expected to be recycled but was not recycled.") //
        .isTrue();
    return this;
  }

  public BitmapRegionDecoderAssert isNotRecycled() {
    isNotNull();
    assertThat(actual.isRecycled()) //
        .overridingErrorMessage("Expected to not be recycled but was recycled.") //
        .isFalse();
    return this;
  }
}
