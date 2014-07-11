// Copyright 2013 Square, Inc.
package org.assertj.android.api.graphics;

import android.graphics.Rect;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Rect} instances. */
public class RectAssert extends AbstractAssert<RectAssert, Rect> {
  public RectAssert(Rect actual) {
    super(actual, RectAssert.class);
  }

  public RectAssert hasBottom(int bottom) {
    isNotNull();
    int actualBottom = actual.bottom;
    assertThat(actualBottom) //
        .overridingErrorMessage("Expected bottom <%s> but was <%s>.", bottom, actualBottom) //
        .isEqualTo(bottom);
    return this;
  }

  public RectAssert hasLeft(int left) {
    isNotNull();
    int actualLeft = actual.left;
    assertThat(actualLeft) //
        .overridingErrorMessage("Expected left <%s> but was <%s>.", left, actualLeft) //
        .isEqualTo(left);
    return this;
  }

  public RectAssert hasRight(int right) {
    isNotNull();
    int actualRight = actual.right;
    assertThat(actualRight) //
        .overridingErrorMessage("Expected right <%s> but was <%s>.", right, actualRight) //
        .isEqualTo(right);
    return this;
  }

  public RectAssert hasTop(int top) {
    isNotNull();
    int actualTop = actual.top;
    assertThat(actualTop) //
        .overridingErrorMessage("Expected top <%s> but was <%s>.", top, actualTop) //
        .isEqualTo(top);
    return this;
  }

  public RectAssert hasCenterX(int center) {
    isNotNull();
    int actualCenter = actual.centerX();
    assertThat(actualCenter) //
        .overridingErrorMessage("Expected X center <%s> but was <%s>.", center, actualCenter) //
        .isEqualTo(center);
    return this;
  }

  public RectAssert hasCenterY(int center) {
    isNotNull();
    int actualCenter = actual.centerY();
    assertThat(actualCenter) //
        .overridingErrorMessage("Expected Y center <%s> but was <%s>.", center, actualCenter) //
        .isEqualTo(center);
    return this;
  }

  public RectAssert hasExactCenterX(float center) {
    isNotNull();
    float actualCenter = actual.exactCenterX();
    assertThat(actualCenter) //
        .overridingErrorMessage("Expected exact X center <%s> but was <%s>.", center,
            actualCenter) //
        .isEqualTo(center);
    return this;
  }

  public RectAssert hasExactCenterY(float center) {
    isNotNull();
    float actualCenter = actual.exactCenterY();
    assertThat(actualCenter) //
        .overridingErrorMessage("Expected exact Y center <%s> but was <%s>.", center,
            actualCenter) //
        .isEqualTo(center);
    return this;
  }

  public RectAssert hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.height();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>.", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public RectAssert isEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected to be empty but was not.") //
        .isTrue();
    return this;
  }

  public RectAssert isNotEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected to not be empty but was.") //
        .isFalse();
    return this;
  }

  public RectAssert hasWidth(int width) {
    isNotNull();
    int actualWidth = actual.width();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected width <%s> but was <%s>.", width, actualWidth) //
        .isEqualTo(width);
    return this;
  }
}
