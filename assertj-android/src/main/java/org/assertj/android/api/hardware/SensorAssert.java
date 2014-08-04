// Copyright 2013 Square, Inc.
package org.assertj.android.api.hardware;

import android.annotation.TargetApi;
import android.hardware.Sensor;
import org.assertj.core.api.AbstractAssert;

import static android.hardware.Sensor.TYPE_ACCELEROMETER;
import static android.hardware.Sensor.TYPE_ALL;
import static android.hardware.Sensor.TYPE_AMBIENT_TEMPERATURE;
import static android.hardware.Sensor.TYPE_GAME_ROTATION_VECTOR;
import static android.hardware.Sensor.TYPE_GEOMAGNETIC_ROTATION_VECTOR;
import static android.hardware.Sensor.TYPE_GRAVITY;
import static android.hardware.Sensor.TYPE_GYROSCOPE;
import static android.hardware.Sensor.TYPE_GYROSCOPE_UNCALIBRATED;
import static android.hardware.Sensor.TYPE_HEART_RATE;
import static android.hardware.Sensor.TYPE_LIGHT;
import static android.hardware.Sensor.TYPE_LINEAR_ACCELERATION;
import static android.hardware.Sensor.TYPE_MAGNETIC_FIELD;
import static android.hardware.Sensor.TYPE_MAGNETIC_FIELD_UNCALIBRATED;
import static android.hardware.Sensor.TYPE_ORIENTATION;
import static android.hardware.Sensor.TYPE_PRESSURE;
import static android.hardware.Sensor.TYPE_PROXIMITY;
import static android.hardware.Sensor.TYPE_RELATIVE_HUMIDITY;
import static android.hardware.Sensor.TYPE_ROTATION_VECTOR;
import static android.hardware.Sensor.TYPE_SIGNIFICANT_MOTION;
import static android.hardware.Sensor.TYPE_STEP_COUNTER;
import static android.hardware.Sensor.TYPE_STEP_DETECTOR;
import static android.hardware.Sensor.TYPE_TEMPERATURE;
import static android.os.Build.VERSION_CODES.GINGERBREAD;
import static org.assertj.android.internal.IntegerUtils.buildNamedValueString;
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

  public static String typeToString(int type) {
    return buildNamedValueString(type)
        .value(TYPE_ACCELEROMETER, "accelerometer")
        .value(TYPE_ALL, "all")
        .value(TYPE_AMBIENT_TEMPERATURE, "ambient_temperature")
        .value(TYPE_GAME_ROTATION_VECTOR, "game_rotation_vector")
        .value(TYPE_GEOMAGNETIC_ROTATION_VECTOR, "geomagnetic_rotation_vector")
        .value(TYPE_GRAVITY, "gravity")
        .value(TYPE_GYROSCOPE, "gyroscope")
        .value(TYPE_GYROSCOPE_UNCALIBRATED, "gyroscope_uncalibrated")
        .value(TYPE_HEART_RATE, "heart_rate")
        .value(TYPE_LIGHT, "light")
        .value(TYPE_LINEAR_ACCELERATION, "linear_acceleration")
        .value(TYPE_MAGNETIC_FIELD, "magnetic_field")
        .value(TYPE_MAGNETIC_FIELD_UNCALIBRATED, "magnetic_field_uncalibrated")
        .value(TYPE_ORIENTATION, "orientation")
        .value(TYPE_PRESSURE, "pressure")
        .value(TYPE_PROXIMITY, "proximity")
        .value(TYPE_RELATIVE_HUMIDITY, "relative_humidity")
        .value(TYPE_ROTATION_VECTOR, "rotation_vector")
        .value(TYPE_SIGNIFICANT_MOTION, "significant_motion")
        .value(TYPE_STEP_COUNTER, "step_counter")
        .value(TYPE_STEP_DETECTOR, "step_detector")
        .value(TYPE_TEMPERATURE, "temperature")
        .get();
  }
}
