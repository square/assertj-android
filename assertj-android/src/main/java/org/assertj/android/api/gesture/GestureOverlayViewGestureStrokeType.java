package org.assertj.android.api.gesture;

import android.gesture.GestureOverlayView;
import android.support.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    GestureOverlayView.GESTURE_STROKE_TYPE_SINGLE,
    GestureOverlayView.GESTURE_STROKE_TYPE_MULTIPLE
})
@Retention(SOURCE)
@interface GestureOverlayViewGestureStrokeType {
}
