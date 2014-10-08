package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.View;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    View.TEXT_DIRECTION_INHERIT,
    View.TEXT_DIRECTION_FIRST_STRONG,
    View.TEXT_DIRECTION_ANY_RTL,
    View.TEXT_DIRECTION_LTR,
    View.TEXT_DIRECTION_RTL,
    View.TEXT_DIRECTION_LOCALE
})
@Retention(SOURCE)
@interface ViewTextDirection {
}
