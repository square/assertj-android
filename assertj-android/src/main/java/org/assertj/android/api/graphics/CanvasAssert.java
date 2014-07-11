// Copyright 2013 Square, Inc.
package org.assertj.android.api.graphics;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Canvas} instances. */
public class CanvasAssert extends AbstractAssert<CanvasAssert, Canvas> {
  public CanvasAssert(Canvas actual) {
    super(actual, CanvasAssert.class);
  }

  public CanvasAssert hasClipBounds(Rect bounds) {
    isNotNull();
    Rect actualBounds = actual.getClipBounds();
    assertThat(actualBounds) //
        .overridingErrorMessage("Expected clip bounds <%s> but was <%s>.", bounds, actualBounds) //
        .isEqualTo(bounds);
    return this;
  }

  public CanvasAssert hasDensity(int density) {
    isNotNull();
    int actualDensity = actual.getDensity();
    assertThat(actualDensity) //
        .overridingErrorMessage("Expected density <%s> but was <%s>.", density, actualDensity) //
        .isEqualTo(density);
    return this;
  }

  public CanvasAssert hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.getHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>.", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  @TargetApi(ICE_CREAM_SANDWICH)
  public CanvasAssert hasMaximumBitmapHeight(int height) {
    isNotNull();
    int actualHeight = actual.getMaximumBitmapHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected maximum bitmap height <%s> but was <%s>.", height,
            actualHeight) //
        .isEqualTo(height);
    return this;
  }

  @TargetApi(ICE_CREAM_SANDWICH)
  public CanvasAssert hasMaximumBitmapWidth(int width) {
    isNotNull();
    int actualHeight = actual.getMaximumBitmapWidth();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected maximum bitmap width <%s> but was <%s>.", width,
            actualHeight) //
        .isEqualTo(width);
    return this;
  }

  public CanvasAssert hasSaveCount(int count) {
    isNotNull();
    int actualCount = actual.getSaveCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected save count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public CanvasAssert hasWidth(int width) {
    isNotNull();
    int actualWidth = actual.getWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected width <%s> but was <%s>.", width, actualWidth) //
        .isEqualTo(width);
    return this;
  }

  @TargetApi(HONEYCOMB)
  public CanvasAssert isHardwareAccelerated() {
    isNotNull();
    assertThat(actual.isHardwareAccelerated()) //
        .overridingErrorMessage("Expected to be hardware accelerated but was not.") //
        .isTrue();
    return this;
  }

  @TargetApi(HONEYCOMB)
  public CanvasAssert isNotHardwareAccelerated() {
    isNotNull();
    assertThat(actual.isHardwareAccelerated()) //
        .overridingErrorMessage("Expected to not be hardware accelerated but was.") //
        .isFalse();
    return this;
  }

  public CanvasAssert isOpaque() {
    isNotNull();
    assertThat(actual.isOpaque()) //
        .overridingErrorMessage("Expected to be opaque but was not.") //
        .isTrue();
    return this;
  }

  public CanvasAssert isNotOpaque() {
    isNotNull();
    assertThat(actual.isOpaque()) //
        .overridingErrorMessage("Expected to not be opaque but was.") //
        .isFalse();
    return this;
  }
}
