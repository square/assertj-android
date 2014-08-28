package org.assertj.android.api.app;

import android.app.ActionBar;
import android.support.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef(
    flag = true,
    value = {
        ActionBar.DISPLAY_HOME_AS_UP,
        ActionBar.DISPLAY_SHOW_CUSTOM,
        ActionBar.DISPLAY_SHOW_HOME,
        ActionBar.DISPLAY_SHOW_TITLE,
        ActionBar.DISPLAY_USE_LOGO
})
@Retention(SOURCE)
@interface ActionBarDisplayOptions {
}
