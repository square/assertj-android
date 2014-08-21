package org.assertj.android.api.widget;

import android.support.annotation.IntDef;
import android.widget.GridView;

@IntDef({
    GridView.NO_STRETCH,
    GridView.STRETCH_SPACING,
    GridView.STRETCH_SPACING_UNIFORM,
    GridView.STRETCH_COLUMN_WIDTH
})
@interface GridViewStretchMode {
}
