package org.assertj.android.api.widget;

import android.support.annotation.IntDef;
import android.widget.LinearLayout;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    LinearLayout.HORIZONTAL,
    LinearLayout.VERTICAL
})
@Retention(SOURCE)
@interface LinearLayoutOrientation {
}
