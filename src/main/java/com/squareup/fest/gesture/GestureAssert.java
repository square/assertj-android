// Copyright 2013 Square, Inc.
package com.squareup.fest.gesture;

import android.gesture.Gesture;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link Gesture} instances. */
public class GestureAssert extends AbstractAssert<GestureAssert, Gesture> {
  public GestureAssert(Gesture actual) {
    super(actual, GestureAssert.class);
  }

  public GestureAssert hasId(long id) {
    isNotNull();
    long actualId = actual.getID();
    assertThat(actualId) //
        .overridingErrorMessage("Expected ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public GestureAssert hasLength(float length) {
    isNotNull();
    float actualLength = actual.getLength();
    assertThat(actualLength) //
        .overridingErrorMessage("Expected length <%s> but was <%s>.", length, actualLength) //
        .isEqualTo(length);
    return this;
  }

  public GestureAssert hasStrokeCount(int count) {
    isNotNull();
    int actualCount = actual.getStrokesCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected stroke count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }
}
