package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.Window;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef(
    flag = true,
    value = {
        Window.FEATURE_ACTION_BAR,
        Window.FEATURE_ACTION_BAR_OVERLAY,
        Window.FEATURE_ACTION_MODE_OVERLAY,
        Window.FEATURE_CONTEXT_MENU,
        Window.FEATURE_CUSTOM_TITLE,
        Window.FEATURE_INDETERMINATE_PROGRESS,
        Window.FEATURE_LEFT_ICON,
        Window.FEATURE_NO_TITLE,
        Window.FEATURE_OPTIONS_PANEL,
        Window.FEATURE_PROGRESS,
        Window.FEATURE_RIGHT_ICON,
        Window.FEATURE_SWIPE_TO_DISMISS
})
@Retention(SOURCE)
@interface WindowFeature {
}
