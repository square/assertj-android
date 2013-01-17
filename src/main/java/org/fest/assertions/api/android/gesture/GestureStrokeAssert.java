// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.gesture;

import android.gesture.GestureStroke;
import android.graphics.RectF;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link GestureStroke} instances. */
public class GestureStrokeAssert extends AbstractAssert<GestureStrokeAssert, GestureStroke> {
  public GestureStrokeAssert(GestureStroke actual) {
    super(actual, GestureStrokeAssert.class);
  }

  public GestureStrokeAssert hasBoundingBox(RectF rect) {
    isNotNull();
    RectF actualRect = actual.boundingBox;
    assertThat(actualRect) //
        .overridingErrorMessage("Expected bounding box <%s> but was <%s>.", rect, actualRect) //
        .isEqualTo(rect);
    return this;
  }

  public GestureStrokeAssert hasLength(float length) {
    isNotNull();
    float actualLength = actual.length;
    assertThat(actualLength) //
        .overridingErrorMessage("Expected length <%s> but was <%s>.", length, actualLength) //
        .isEqualTo(length);
    return this;
  }

  public GestureStrokeAssert hasPoints(float[] points) {
    isNotNull();
    float[] actualPoints = actual.points;
    assertThat(actualPoints) //
        .overridingErrorMessage("Expected points <%s> but was <%s>.", points, actualPoints) //
        .isEqualTo(points);
    return this;
  }
}
