package org.assertj.android.playservices.api.location;

import android.support.annotation.IntDef;

import com.google.android.gms.location.DetectedActivity;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    DetectedActivity.IN_VEHICLE,
    DetectedActivity.ON_BICYCLE,
    DetectedActivity.ON_FOOT,
    DetectedActivity.RUNNING,
    DetectedActivity.STILL,
    DetectedActivity.TILTING,
    DetectedActivity.UNKNOWN,
    DetectedActivity.WALKING
})
@Retention(SOURCE)
@interface DetectedActivityType {
}
