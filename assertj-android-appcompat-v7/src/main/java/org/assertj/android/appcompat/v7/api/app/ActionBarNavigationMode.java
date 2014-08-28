package org.assertj.android.appcompat.v7.api.app;

import android.support.annotation.IntDef;
import android.support.v7.app.ActionBar;
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
