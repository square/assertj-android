package org.assertj.android.api.content.res;

import android.content.res.Configuration;
import android.support.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    Configuration.UI_MODE_TYPE_NORMAL,
    Configuration.UI_MODE_TYPE_APPLIANCE,
    Configuration.UI_MODE_TYPE_CAR,
    Configuration.UI_MODE_TYPE_DESK,
    Configuration.UI_MODE_TYPE_TELEVISION,
    Configuration.UI_MODE_TYPE_UNDEFINED,
    Configuration.UI_MODE_TYPE_WATCH
})
@Retention(SOURCE)
public @interface ConfigurationUiModeType {
}
