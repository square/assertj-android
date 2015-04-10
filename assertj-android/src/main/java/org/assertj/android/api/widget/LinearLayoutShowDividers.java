package org.assertj.android.api.widget;

import android.support.annotation.IntDef;
import android.widget.LinearLayout;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef(
    flag = true,
    value = {
        LinearLayout.SHOW_DIVIDER_BEGINNING,
        LinearLayout.SHOW_DIVIDER_MIDDLE,
        LinearLayout.SHOW_DIVIDER_END
    }
)
@Retention(SOURCE)
public @interface LinearLayoutShowDividers {
}
