// Copyright 2013 Square, Inc.
package com.squareup.fest.gesture;

import android.gesture.GesturePoint;
import com.squareup.fest.Assertions;
import org.fest.assertions.api.AbstractAssert;

/** Assertions for {@link GesturePoint} instances. */
public class GesturePointAssert extends AbstractAssert<GesturePointAssert, GesturePoint> {
  public GesturePointAssert(GesturePoint actual) {
    super(actual, GesturePointAssert.class);
  }

  public GesturePointAssert hasTimestamp(long timestamp) {
    isNotNull();
    long actualTimestamp = actual.timestamp;
    Assertions.assertThat(actualTimestamp) //
        .overridingErrorMessage("Expected timestamp <%s> but was <%s>.", timestamp, actualTimestamp) //
        .isEqualTo(timestamp);
    return this;
  }

  public GesturePointAssert hasX(float x) {
    isNotNull();
    float actualX = actual.x;
    Assertions.assertThat(actualX) //
        .overridingErrorMessage("Expected X <%s> but was <%s>.", x, actualX) //
        .isEqualTo(x);
    return this;
  }

  public GesturePointAssert hasY(float y) {
    isNotNull();
    float actualY = actual.y;
    Assertions.assertThat(actualY) //
        .overridingErrorMessage("Expected Y <%s> but was <%s>.", y, actualY) //
        .isEqualTo(y);
    return this;
  }
}
