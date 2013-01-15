// Copyright 2013 Square, Inc.
package com.squareup.fest.hardware;

import android.hardware.Sensor;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link Sensor} instances. */
public class SensorAssert extends AbstractAssert<SensorAssert, Sensor> {
  public SensorAssert(Sensor actual) {
    super(actual, SensorAssert.class);
  }

  public SensorAssert hasMaximumRange(float range) {
    isNotNull();
    float actualRange = actual.getMaximumRange();
    assertThat(actualRange) //
        .overridingErrorMessage("Expected maximum range <%s> but was <%s>.", range, actualRange) //
        .isEqualTo(range);
    return this;
  }

  public SensorAssert hasMinDelay(int delay) {
    isNotNull();
    int actualDelay = actual.getMinDelay();
    assertThat(actualDelay) //
        .overridingErrorMessage("Expected minimum delay <%s> but was <%s>.", delay, actualDelay) //
        .isEqualTo(delay);
    return this;
  }

  public SensorAssert hasName(String name) {
    isNotNull();
    String actualName = actual.getName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected name <%s> but was <%s>.", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public SensorAssert hasPower(float power) {
    isNotNull();
    float actualPower = actual.getPower();
    assertThat(actualPower) //
        .overridingErrorMessage("Expected power <%s> but was <%s>.", power, actualPower) //
        .isEqualTo(power);
    return this;
  }

  public SensorAssert hasResolution(float resolution) {
    isNotNull();
    float actualResolution = actual.getResolution();
    assertThat(actualResolution) //
        .overridingErrorMessage("Expected resolution <%s> but was <%s>.", resolution,
            actualResolution) //
        .isEqualTo(resolution);
    return this;
  }

  public SensorAssert hasType(int type) {
    isNotNull();
    int actualType = actual.getType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected type <%s> but was <%s>.", type, actualType) //
        .isEqualTo(type);
    return this;
  }

  public SensorAssert hasVendor(String vendor) {
    isNotNull();
    String actualVendor = actual.getVendor();
    assertThat(actualVendor) //
        .overridingErrorMessage("Expected vendor <%s> but was <%s>.", vendor, actualVendor) //
        .isEqualTo(vendor);
    return this;
  }

  public SensorAssert hasVersion(int version) {
    isNotNull();
    int actualVersion = actual.getVersion();
    assertThat(actualVersion) //
        .overridingErrorMessage("Expected version <%s> but was <%s>.", version, actualVersion) //
        .isEqualTo(version);
    return this;
  }
}
