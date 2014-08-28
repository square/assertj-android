package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.View;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    View.LAYOUT_DIRECTION_RTL,
    View.LAYOUT_DIRECTION_LTR,
    View.LAYOUT_DIRECTION_INHERIT,
    View.LAYOUT_DIRECTION_LOCALE
})
@Retention(SOURCE)
public @interface ViewLayoutDirection {
}
