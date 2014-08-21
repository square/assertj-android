package org.assertj.android.playservices.api.location;

import android.support.annotation.IntDef;

import com.google.android.gms.location.DetectedActivity;

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
@interface DetectedActivityType {
}
