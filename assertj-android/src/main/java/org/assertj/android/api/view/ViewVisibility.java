package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.View;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    View.VISIBLE,
    View.INVISIBLE,
    View.GONE
})
@Retention(SOURCE)
@interface ViewVisibility {
}
