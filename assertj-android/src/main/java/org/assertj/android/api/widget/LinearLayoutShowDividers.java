package org.assertj.android.api.widget;

import android.support.annotation.IntDef;
import android.widget.LinearLayout;

@IntDef(
    flag = true,
    value = {
        LinearLayout.SHOW_DIVIDER_BEGINNING,
        LinearLayout.SHOW_DIVIDER_MIDDLE,
        LinearLayout.SHOW_DIVIDER_END
    }
)
@interface LinearLayoutShowDividers {
}
