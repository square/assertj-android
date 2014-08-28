package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.View;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    View.SCROLLBAR_POSITION_DEFAULT,
    View.SCROLLBAR_POSITION_LEFT,
    View.SCROLLBAR_POSITION_RIGHT
})
@Retention(SOURCE)
@interface ViewScrollBarPosition {
}
