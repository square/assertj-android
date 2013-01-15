// Copyright 2013 Square, Inc.
package com.squareup.fest.graphics;

import android.graphics.PointF;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link PointF} instances. */
public class PointFAssert extends AbstractAssert<PointFAssert, PointF> {
  public PointFAssert(PointF actual) {
    super(actual, PointFAssert.class);
  }

  public PointFAssert hasX(float x) {
    isNotNull();
    float actualX = actual.x;
    assertThat(actualX) //
        .overridingErrorMessage("Expected X <%s> but was <%s>.", x, actualX) //
        .isEqualTo(x);
    return this;
  }

  public PointFAssert hasY(float y) {
    isNotNull();
    float actualY = actual.y;
    assertThat(actualY) //
        .overridingErrorMessage("Expected Y <%s> but was <%s>.", y, actualY) //
        .isEqualTo(y);
    return this;
  }

  public PointFAssert hasLength(float length) {
    isNotNull();
    float actualLength = actual.length();
    assertThat(actualLength) //
        .overridingErrorMessage("Expected length <%s> but was <%s>.", length, actualLength) //
        .isEqualTo(length);
    return this;
  }
}
