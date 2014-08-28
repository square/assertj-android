package org.assertj.android.gridlayout.v7.api.widget;

import android.support.annotation.IntDef;
import android.support.v7.widget.GridLayout;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    GridLayout.ALIGN_BOUNDS,
    GridLayout.ALIGN_MARGINS
})
@Retention(SOURCE)
@interface GridLayoutAlignmentMode {
}
