// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.graphics;

import android.graphics.RectF;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link RectF} instances. */
public class RectFAssert extends AbstractAssert<RectFAssert, RectF> {
  public RectFAssert(RectF actual) {
    super(actual, RectFAssert.class);
  }

  public RectFAssert hasBottom(float bottom) {
    isNotNull();
    float actualBottom = actual.bottom;
    assertThat(actualBottom) //
        .overridingErrorMessage("Expected bottom <%s> but was <%s>.", bottom, actualBottom) //
        .isEqualTo(bottom);
    return this;
  }

  public RectFAssert hasLeft(float left) {
    isNotNull();
    float actualLeft = actual.left;
    assertThat(actualLeft) //
        .overridingErrorMessage("Expected left <%s> but was <%s>.", left, actualLeft) //
        .isEqualTo(left);
    return this;
  }

  public RectFAssert hasRight(float right) {
    isNotNull();
    float actualRight = actual.right;
    assertThat(actualRight) //
        .overridingErrorMessage("Expected right <%s> but was <%s>.", right, actualRight) //
        .isEqualTo(right);
    return this;
  }

  public RectFAssert hasTop(float top) {
    isNotNull();
    float actualTop = actual.top;
    assertThat(actualTop) //
        .overridingErrorMessage("Expected top <%s> but was <%s>.", top, actualTop) //
        .isEqualTo(top);
    return this;
  }

  public RectFAssert hasCenterX(float center) {
    isNotNull();
    float actualCenter = actual.centerX();
    assertThat(actualCenter) //
        .overridingErrorMessage("Expected X center <%s> but was <%s>.", center, actualCenter) //
        .isEqualTo(center);
    return this;
  }

  public RectFAssert hasCenterY(float center) {
    isNotNull();
    float actualCenter = actual.centerY();
    assertThat(actualCenter) //
        .overridingErrorMessage("Expected Y center <%s> but was <%s>.", center, actualCenter) //
        .isEqualTo(center);
    return this;
  }

  public RectFAssert hasHeight(float height) {
    isNotNull();
    float actualHeight = actual.height();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>.", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public RectFAssert isEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected to be empty but was not.") //
        .isTrue();
    return this;
  }

  public RectFAssert isNotEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected to not be empty but was.") //
        .isFalse();
    return this;
  }

  public RectFAssert hasWidth(float width) {
    isNotNull();
    float actualWidth = actual.width();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected width <%s> but was <%s>.", width, actualWidth) //
        .isEqualTo(width);
    return this;
  }
}
