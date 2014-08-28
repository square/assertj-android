package org.assertj.android.api.widget;

import android.support.annotation.IntDef;
import android.widget.GridLayout;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    GridLayout.HORIZONTAL,
    GridLayout.VERTICAL
})
@Retention(SOURCE)
@interface GridLayoutOrientation {
}
