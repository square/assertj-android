package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.View;

@IntDef({
    View.LAYOUT_DIRECTION_RTL,
    View.LAYOUT_DIRECTION_LTR,
    View.LAYOUT_DIRECTION_INHERIT,
    View.LAYOUT_DIRECTION_LOCALE
})
public @interface ViewLayoutDirection {
}
