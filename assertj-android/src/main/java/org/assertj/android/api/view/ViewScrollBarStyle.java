package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.View;

@IntDef({
    View.SCROLLBARS_INSIDE_INSET,
    View.SCROLLBARS_INSIDE_OVERLAY,
    View.SCROLLBARS_OUTSIDE_INSET,
    View.SCROLLBARS_OUTSIDE_OVERLAY
})
@interface ViewScrollBarStyle {
}
