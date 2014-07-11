// Copyright 2013 Square, Inc.
package org.assertj.android.api.hardware;

import android.hardware.SensorEvent;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link SensorEvent} instances. */
public class SensorEventAssert extends AbstractAssert<SensorEventAssert, SensorEvent> {
  public SensorEventAssert(SensorEvent actual) {
    super(actual, SensorEventAssert.class);
  }

  public SensorEventAssert hasAccuracy(int accuracy) {
    isNotNull();
    int actualAccuracy = actual.accuracy;
    assertThat(actualAccuracy) //
        .overridingErrorMessage("Expected accuracy <%s> but was <%s>.", accuracy, actualAccuracy) //
        .isEqualTo(accuracy);
    return this;
  }

  public SensorEventAssert hasTimestamp(long timestamp) {
    isNotNull();
    long actualTimestamp = actual.timestamp;
    assertThat(actualTimestamp) //
        .overridingErrorMessage("Expected timestamp <%s> but was <%s>.", timestamp,
            actualTimestamp) //
        .isEqualTo(timestamp);
    return this;
  }

  public SensorEventAssert hasValues(float[] values) {
    isNotNull();
    float[] actualValues = actual.values;
    assertThat(actualValues) //
        .overridingErrorMessage("Expected values <%s> but was <%s>.", values, actualValues) //
        .isEqualTo(values);
    return this;
  }
}
