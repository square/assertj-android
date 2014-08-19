package org.assertj.android.api.app;

import android.app.ActionBar;
import android.support.annotation.IntDef;

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
