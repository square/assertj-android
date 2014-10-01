package org.assertj.android.api.app;

import android.content.pm.ActivityInfo;
import android.support.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED,
    ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE,
    ActivityInfo.SCREEN_ORIENTATION_PORTRAIT,
    ActivityInfo.SCREEN_ORIENTATION_USER,
    ActivityInfo.SCREEN_ORIENTATION_BEHIND,
    ActivityInfo.SCREEN_ORIENTATION_SENSOR,
    ActivityInfo.SCREEN_ORIENTATION_NOSENSOR,
    ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE,
    ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT,
    ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE,
    ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT,
    ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR,
    ActivityInfo.SCREEN_ORIENTATION_USER_LANDSCAPE,
    ActivityInfo.SCREEN_ORIENTATION_USER_PORTRAIT,
    ActivityInfo.SCREEN_ORIENTATION_FULL_USER,
    ActivityInfo.SCREEN_ORIENTATION_LOCKED
})
@Retention(SOURCE)
@interface ActivityScreenOrientation {
}
