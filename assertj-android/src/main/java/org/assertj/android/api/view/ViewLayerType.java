package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.View;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    View.LAYER_TYPE_NONE,
    View.LAYER_TYPE_SOFTWARE,
    View.LAYER_TYPE_HARDWARE
})
@Retention(SOURCE)
@interface ViewLayerType {
}
