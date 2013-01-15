// Copyright 2013 Square, Inc.
package com.squareup.fest.graphics;

import android.graphics.Interpolator;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link Interpolator} instances. */
public class InterpolatorAssert extends AbstractAssert<InterpolatorAssert, Interpolator> {
  public InterpolatorAssert(Interpolator actual) {
    super(actual, InterpolatorAssert.class);
  }

  public InterpolatorAssert hasKeyFrameCount(int count) {
    isNotNull();
    int actualCount = actual.getKeyFrameCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected key frame count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public InterpolatorAssert hasValueCount(int count) {
    isNotNull();
    int actualCount = actual.getValueCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected value count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }
}
