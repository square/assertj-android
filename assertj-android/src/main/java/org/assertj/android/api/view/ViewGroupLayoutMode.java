package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.ViewGroup;

@IntDef({
    ViewGroup.LAYOUT_MODE_CLIP_BOUNDS,
    ViewGroup.LAYOUT_MODE_OPTICAL_BOUNDS
})
@interface ViewGroupLayoutMode {
}
