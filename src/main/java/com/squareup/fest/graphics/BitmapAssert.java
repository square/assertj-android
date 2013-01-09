// Copyright 2012 Square, Inc.
package com.squareup.fest.graphics;

import android.graphics.Bitmap;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public class BitmapAssert extends AbstractAssert<BitmapAssert, Bitmap> {
  public BitmapAssert(Bitmap actual) {
    super(actual, BitmapAssert.class);
  }

  public BitmapAssert isRecycled() {
    isNotNull();
    assertThat(actual.isRecycled()).isTrue();
    return this;
  }

  public BitmapAssert isNotRecycled() {
    isNotNull();
    assertThat(actual.isRecycled()).isFalse();
    return this;
  }

  public BitmapAssert isMutable() {
    isNotNull();
    assertThat(actual.isMutable()).isTrue();
    return this;
  }

  public BitmapAssert isNotMutable() {
    isNotNull();
    assertThat(actual.isMutable()).isFalse();
    return this;
  }

  // TODO API 17
  //public BitmapAssert isPremultiplied() {
  //  isNotNull();
  //  assertThat(actual.isPremultiplied()).isTrue();
  //  return this;
  //}
  //
  //public BitmapAssert isNotPremultiplied() {
  //  isNotNull();
  //  assertThat(actual.isPremultiplied()).isFalse();
  //  return this;
  //}

  public BitmapAssert hasByteCount(int count) {
    isNotNull();
    assertThat(actual.getByteCount()).isEqualTo(count);
    return this;
  }

  public BitmapAssert hasDensity(int density) {
    isNotNull();
    assertThat(actual.getDensity()).isEqualTo(density);
    return this;
  }

  public BitmapAssert hasWidth(int width) {
    isNotNull();
    assertThat(actual.getWidth()).isEqualTo(width);
    return this;
  }

  public BitmapAssert hasHeight(int height) {
    isNotNull();
    assertThat(actual.getHeight()).isEqualTo(height);
    return this;
  }

  public BitmapAssert hasAlphaSupport() {
    isNotNull();
    assertThat(actual.hasAlpha()).isTrue();
    return this;
  }

  public BitmapAssert hasNoAlphaSupport() {
    isNotNull();
    assertThat(actual.hasAlpha()).isFalse();
    return this;
  }

  // TODO API 17
  //public BitmapAssert hasMipMap() {
  //  isNotNull();
  //  assertThat(actual.hasMipMap()).isTrue();
  //  return this;
  //}
  //
  //public BitmapAssert hasNoMipMap() {
  //  isNotNull();
  //  assertThat(actual.hasMipMap()).isFalse();
  //  return this;
  //}
}
