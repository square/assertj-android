package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.View;

@IntDef({
    View.OVER_SCROLL_ALWAYS,
    View.OVER_SCROLL_IF_CONTENT_SCROLLS,
    View.OVER_SCROLL_NEVER
})
@interface ViewOverscrollMode {
}
