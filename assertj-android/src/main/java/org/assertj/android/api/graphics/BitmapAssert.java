// Copyright 2012 Square, Inc.
package org.assertj.android.api.graphics;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB_MR1;
import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Bitmap} instances. */
public class BitmapAssert extends AbstractAssert<BitmapAssert, Bitmap> {
  public BitmapAssert(Bitmap actual) {
    super(actual, BitmapAssert.class);
  }

  public BitmapAssert isRecycled() {
    isNotNull();
    assertThat(actual.isRecycled()) //
        .overridingErrorMessage("Expected to be recycled but was not recycled.") //
        .isTrue();
    return this;
  }

  public BitmapAssert isNotRecycled() {
    isNotNull();
    assertThat(actual.isRecycled()) //
        .overridingErrorMessage("Expected to not be recycled but was recycled.") //
        .isFalse();
    return this;
  }

  public BitmapAssert isMutable() {
    isNotNull();
    assertThat(actual.isMutable()) //
        .overridingErrorMessage("Expected to be mutable but was not mutable.") //
        .isTrue();
    return this;
  }

  public BitmapAssert isNotMutable() {
    isNotNull();
    assertThat(actual.isMutable()) //
        .overridingErrorMessage("Expected to not be mutable but was mutable.") //
        .isFalse();
    return this;
  }

  @TargetApi(JELLY_BEAN_MR1)
  public BitmapAssert isPremultiplied() {
    isNotNull();
    assertThat(actual.isPremultiplied())
        .overridingErrorMessage("Expected to be premultiplied but was not premultiplied.") //
        .isTrue();
    return this;
  }

  @TargetApi(JELLY_BEAN_MR1)
  public BitmapAssert isNotPremultiplied() {
    isNotNull();
    assertThat(actual.isPremultiplied()) //
        .overridingErrorMessage("Expected to not be premultiplied but was premultiplied.") //
        .isFalse();
    return this;
  }

  @TargetApi(HONEYCOMB_MR1)
  public BitmapAssert hasByteCount(int count) {
    isNotNull();
    int actualCount = actual.getByteCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected byte count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public BitmapAssert hasDensity(int density) {
    isNotNull();
    int actualDensity = actual.getDensity();
    assertThat(actualDensity) //
        .overridingErrorMessage("Expected density <%s> but was <%s>.", density, actualDensity) //
        .isEqualTo(density);
    return this;
  }

  public BitmapAssert hasWidth(int width) {
    isNotNull();
    int actualWidth = actual.getWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected width <%s> but was <%s>.", width, actualWidth) //
        .isEqualTo(width);
    return this;
  }

  public BitmapAssert hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.getHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>.", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public BitmapAssert hasAlphaSupport() {
    isNotNull();
    assertThat(actual.hasAlpha()) //
        .overridingErrorMessage("Expected to have alpha support but did not have it.") //
        .isTrue();
    return this;
  }

  public BitmapAssert hasNoAlphaSupport() {
    isNotNull();
    assertThat(actual.hasAlpha()) //
        .overridingErrorMessage("Expected to not have alpha support but had it.") //
        .isFalse();
    return this;
  }

  // TODO API 17
  //public BitmapAssert hasMipMap() {
  //  isNotNull();
  //  assertThat(actual.hasMipMap()) //
  //      .overridingErrorMessage("Expected to have mipmap but did not have it.") //
  //      .isTrue();
  //  return this;
  //}
  //
  //public BitmapAssert hasNoMipMap() {
  //  isNotNull();
  //  assertThat(actual.hasMipMap()) //
  //      .overridingErrorMessage("Expected to not have mipmap but had it.") //
  //      .isFalse();
  //  return this;
  //}
}
