package org.assertj.android.api.content.res;

import android.annotation.TargetApi;
import android.content.res.Configuration;
import org.assertj.core.api.AbstractAssert;

import static android.content.res.Configuration.UI_MODE_TYPE_APPLIANCE;
import static android.content.res.Configuration.UI_MODE_TYPE_CAR;
import static android.content.res.Configuration.UI_MODE_TYPE_DESK;
import static android.content.res.Configuration.UI_MODE_TYPE_NORMAL;
import static android.content.res.Configuration.UI_MODE_TYPE_TELEVISION;
import static android.content.res.Configuration.UI_MODE_TYPE_UNDEFINED;
import static android.content.res.Configuration.UI_MODE_TYPE_WATCH;
import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static org.assertj.android.api.view.AbstractViewAssert.layoutDirectionToString;
import static org.assertj.android.internal.IntegerUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Configuration} instances. */
public class ConfigurationAssert extends AbstractAssert<ConfigurationAssert, Configuration> {
  public ConfigurationAssert(Configuration actual) {
    super(actual, ConfigurationAssert.class);
  }

  @TargetApi(JELLY_BEAN_MR1)
  public ConfigurationAssert hasLayoutDirection(int layoutDirection) {
    isNotNull();
    int actualLayoutDirection = actual.getLayoutDirection();
    assertThat(actualLayoutDirection) //
        .overridingErrorMessage("Expected layout direction to be <%s> but was <%s>.",
            layoutDirectionToString(layoutDirection),
            layoutDirectionToString(actualLayoutDirection)) //
        .isEqualTo(layoutDirection);
    return this;
  }

  // TODO a lot!

  public static String uiModeTypeToString(int mode) {
    return buildNamedValueString(mode)
        .value(UI_MODE_TYPE_NORMAL, "normal")
        .value(UI_MODE_TYPE_APPLIANCE, "appliance")
        .value(UI_MODE_TYPE_CAR, "car")
        .value(UI_MODE_TYPE_DESK, "desk")
        .value(UI_MODE_TYPE_TELEVISION, "television")
        .value(UI_MODE_TYPE_UNDEFINED, "undefined")
        .value(UI_MODE_TYPE_WATCH, "watch")
        .get();
  }
}
