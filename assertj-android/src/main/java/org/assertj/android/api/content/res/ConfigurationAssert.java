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
import static android.view.View.LAYOUT_DIRECTION_LTR;
import static android.view.View.LAYOUT_DIRECTION_RTL;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Configuration} instances. */
public class ConfigurationAssert extends AbstractAssert<ConfigurationAssert, Configuration> {
  public ConfigurationAssert(Configuration actual) {
    super(actual, ConfigurationAssert.class);
  }

  @TargetApi(JELLY_BEAN_MR1)
  public ConfigurationAssert hasLayoutDirection(int layoutDirection) {
    isNotNull();
    assertThat(actual.getLayoutDirection()) //
        .overridingErrorMessage("Expected layout direction to be <%s> but was <%s>.",
            layoutDirectionToString(layoutDirection),
            layoutDirectionToString(actual.getLayoutDirection())) //
        .isEqualTo(layoutDirection);
    return this;
  }

  // TODO a lot!

  public static String layoutDirectionToString(int layoutDirection) {
    switch (layoutDirection) {
      case LAYOUT_DIRECTION_RTL:
        return "rtl";
      case LAYOUT_DIRECTION_LTR:
        return "ltr";
      default:
        throw new IllegalArgumentException("Unknown layout direction: " + layoutDirection);
    }
  }

  public static String uiModeTypeToString(int mode) {
    switch (mode) {
      case UI_MODE_TYPE_NORMAL:
        return "normal";
      case UI_MODE_TYPE_APPLIANCE:
        return "appliance";
      case UI_MODE_TYPE_CAR:
        return "car";
      case UI_MODE_TYPE_DESK:
        return "desk";
      case UI_MODE_TYPE_TELEVISION:
        return "television";
      case UI_MODE_TYPE_UNDEFINED:
        return "undefined";
      case UI_MODE_TYPE_WATCH:
        return "watch";
      default:
        throw new IllegalArgumentException("Unknown UI mode type: " + mode);
    }
  }
}
