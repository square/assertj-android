package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.View;

@IntDef({
    View.LAYER_TYPE_NONE,
    View.LAYER_TYPE_SOFTWARE,
    View.LAYER_TYPE_HARDWARE
})
@interface ViewLayerType {
}
