package org.assertj.android.appcompat.v7.api.app;

import android.support.annotation.IntDef;
import android.support.v7.app.ActionBar;

@IntDef(
    flag = true,
    value = {
        ActionBar.DISPLAY_HOME_AS_UP,
        ActionBar.DISPLAY_SHOW_CUSTOM,
        ActionBar.DISPLAY_SHOW_HOME,
        ActionBar.DISPLAY_SHOW_TITLE,
        ActionBar.DISPLAY_USE_LOGO
})
@interface ActionBarDisplayOptions {
}
