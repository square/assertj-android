package org.assertj.android.design.api.widget;

import android.support.annotation.IntDef;
import android.support.design.widget.TabLayout;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    TabLayout.GRAVITY_CENTER,
    TabLayout.GRAVITY_FILL
})
@Retention(SOURCE)
@interface TabGravity {
}
