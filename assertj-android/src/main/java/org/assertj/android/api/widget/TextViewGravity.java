package org.assertj.android.api.widget;

import android.support.annotation.IntDef;
import android.view.Gravity;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    Gravity.NO_GRAVITY,
    Gravity.TOP,
    Gravity.BOTTOM,
    Gravity.LEFT,
    Gravity.RIGHT,
    Gravity.CENTER_VERTICAL,
    Gravity.FILL_VERTICAL,
    Gravity.CENTER_HORIZONTAL,
    Gravity.FILL_HORIZONTAL,
    Gravity.CENTER,
    Gravity.FILL,
    Gravity.CLIP_VERTICAL,
    Gravity.CLIP_HORIZONTAL,
    Gravity.START,
    Gravity.END
})
@Retention(SOURCE)
@interface TextViewGravity {
}
