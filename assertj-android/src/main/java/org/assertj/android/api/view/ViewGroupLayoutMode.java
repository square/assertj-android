package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.ViewGroup;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    ViewGroup.LAYOUT_MODE_CLIP_BOUNDS,
    ViewGroup.LAYOUT_MODE_OPTICAL_BOUNDS
})
@Retention(SOURCE)
@interface ViewGroupLayoutMode {
}
