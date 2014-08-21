package org.assertj.android.api.app;

import android.app.ActionBar;
import android.support.annotation.IntDef;

@IntDef({
    ActionBar.NAVIGATION_MODE_LIST,
    ActionBar.NAVIGATION_MODE_STANDARD,
    ActionBar.NAVIGATION_MODE_TABS
})
@interface ActionBarNavigationMode {
}
