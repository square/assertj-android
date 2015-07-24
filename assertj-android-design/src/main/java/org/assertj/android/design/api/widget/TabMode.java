package org.assertj.android.design.api.widget;

import android.support.annotation.IntDef;
import android.support.design.widget.TabLayout;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    TabLayout.MODE_FIXED,
    TabLayout.MODE_SCROLLABLE
})
@Retention(SOURCE)
@interface TabMode {
}
