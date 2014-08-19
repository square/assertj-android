package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.ViewGroup;

@IntDef({
    ViewGroup.FOCUS_AFTER_DESCENDANTS,
    ViewGroup.FOCUS_BEFORE_DESCENDANTS,
    ViewGroup.FOCUS_BLOCK_DESCENDANTS
})
@interface ViewGroupDescendantFocusability {
}
