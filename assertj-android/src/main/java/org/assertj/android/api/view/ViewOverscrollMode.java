package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.View;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    View.OVER_SCROLL_ALWAYS,
    View.OVER_SCROLL_IF_CONTENT_SCROLLS,
    View.OVER_SCROLL_NEVER
})
@Retention(SOURCE)
@interface ViewOverscrollMode {
}
