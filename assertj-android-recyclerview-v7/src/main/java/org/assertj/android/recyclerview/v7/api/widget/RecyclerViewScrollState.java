package org.assertj.android.recyclerview.v7.api.widget;

import android.support.annotation.IntDef;
import android.support.v7.widget.RecyclerView;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    RecyclerView.SCROLL_STATE_DRAGGING,
    RecyclerView.SCROLL_STATE_IDLE,
    RecyclerView.SCROLL_STATE_SETTLING,
})
@Retention(SOURCE)
@interface RecyclerViewScrollState {
}
