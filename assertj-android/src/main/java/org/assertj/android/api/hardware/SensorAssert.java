// Copyright 2013 Square, Inc.
package org.assertj.android.api.hardware;

import android.annotation.TargetApi;
import android.hardware.Sensor;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.GINGERBREAD;
import static org.assertj.core.api.Assertions.assertThat;

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

  @TargetApi(GINGERBREAD)
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
        .overridingErrorMessage("Expected type <%s> but was <%s>.", typeToString(type),
            typeToString(actualType)) //
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

  private static String typeToString(int type) {
    switch (type) {
      case Sensor.TYPE_ACCELEROMETER:
        return "accelerometer";
      case Sensor.TYPE_ALL:
        return "all";
      case Sensor.TYPE_AMBIENT_TEMPERATURE:
        return "ambient_temperature";
      case Sensor.TYPE_GAME_ROTATION_VECTOR:
        return "game_rotation_vector";
      case Sensor.TYPE_GEOMAGNETIC_ROTATION_VECTOR:
        return "geomagnetic_rotation_vector";
      case Sensor.TYPE_GRAVITY:
        return "gravity";
      case Sensor.TYPE_GYROSCOPE:
        return "gyroscope";
      case Sensor.TYPE_GYROSCOPE_UNCALIBRATED:
        return "uncalibrated";
      case Sensor.TYPE_HEART_RATE:
        return "heart_rate";
      case Sensor.TYPE_LIGHT:
        return "light";
      case Sensor.TYPE_LINEAR_ACCELERATION:
        return "linear_acceleration";
      case Sensor.TYPE_MAGNETIC_FIELD:
        return "magnetic_field";
      case Sensor.TYPE_MAGNETIC_FIELD_UNCALIBRATED:
        return "magnetic_field_uncalibrated";
      case Sensor.TYPE_ORIENTATION:
        return "orientation";
      case Sensor.TYPE_PRESSURE:
        return "pressure";
      case Sensor.TYPE_PROXIMITY:
        return "proximity";
      case Sensor.TYPE_RELATIVE_HUMIDITY:
        return "relative_humidity";
      case Sensor.TYPE_ROTATION_VECTOR:
        return "rotation_vector";
      case Sensor.TYPE_SIGNIFICANT_MOTION:
        return "significant_motion";
      case Sensor.TYPE_STEP_COUNTER:
        return "step_counter";
      case Sensor.TYPE_STEP_DETECTOR:
        return "step_detector";
      case Sensor.TYPE_TEMPERATURE:
        return "temperature";
      default:
        throw new IllegalArgumentException("Unknown sensor type: " + type);
    }
  }
}
