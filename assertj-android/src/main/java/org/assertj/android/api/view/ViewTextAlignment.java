package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.View;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    View.TEXT_ALIGNMENT_INHERIT,
    View.TEXT_ALIGNMENT_GRAVITY,
    View.TEXT_ALIGNMENT_TEXT_START,
    View.TEXT_ALIGNMENT_TEXT_END,
    View.TEXT_ALIGNMENT_CENTER,
    View.TEXT_ALIGNMENT_VIEW_START,
    View.TEXT_ALIGNMENT_VIEW_END
})
@Retention(SOURCE)
@interface ViewTextAlignment {
}
