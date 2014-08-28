package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.ViewGroup;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    ViewGroup.FOCUS_AFTER_DESCENDANTS,
    ViewGroup.FOCUS_BEFORE_DESCENDANTS,
    ViewGroup.FOCUS_BLOCK_DESCENDANTS
})
@Retention(SOURCE)
@interface ViewGroupDescendantFocusability {
}
