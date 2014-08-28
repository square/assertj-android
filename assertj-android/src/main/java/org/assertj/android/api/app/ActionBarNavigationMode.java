package org.assertj.android.api.app;

import android.app.ActionBar;
import android.support.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    ActionBar.NAVIGATION_MODE_LIST,
    ActionBar.NAVIGATION_MODE_STANDARD,
    ActionBar.NAVIGATION_MODE_TABS
})
@Retention(SOURCE)
@interface ActionBarNavigationMode {
}
