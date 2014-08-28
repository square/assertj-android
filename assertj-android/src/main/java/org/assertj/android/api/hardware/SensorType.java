package org.assertj.android.api.hardware;

import android.hardware.Sensor;
import android.support.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    Sensor.TYPE_ACCELEROMETER,
    Sensor.TYPE_ALL,
    Sensor.TYPE_AMBIENT_TEMPERATURE,
    Sensor.TYPE_GAME_ROTATION_VECTOR,
    Sensor.TYPE_GEOMAGNETIC_ROTATION_VECTOR,
    Sensor.TYPE_GRAVITY,
    Sensor.TYPE_GYROSCOPE,
    Sensor.TYPE_GYROSCOPE_UNCALIBRATED,
    Sensor.TYPE_HEART_RATE,
    Sensor.TYPE_LIGHT,
    Sensor.TYPE_LINEAR_ACCELERATION,
    Sensor.TYPE_MAGNETIC_FIELD,
    Sensor.TYPE_MAGNETIC_FIELD_UNCALIBRATED,
    Sensor.TYPE_ORIENTATION,
    Sensor.TYPE_PRESSURE,
    Sensor.TYPE_PROXIMITY,
    Sensor.TYPE_RELATIVE_HUMIDITY,
    Sensor.TYPE_ROTATION_VECTOR,
    Sensor.TYPE_SIGNIFICANT_MOTION,
    Sensor.TYPE_STEP_COUNTER,
    Sensor.TYPE_STEP_DETECTOR,
    Sensor.TYPE_TEMPERATURE
})
@Retention(SOURCE)
@interface SensorType {
}
