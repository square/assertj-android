package org.assertj.android.api.app;

import android.annotation.TargetApi;
import android.app.UiModeManager;

import org.assertj.android.api.content.res.ConfigurationUiModeType;
import org.assertj.core.api.AbstractAssert;

import static android.app.UiModeManager.MODE_NIGHT_NO;
import static android.os.Build.VERSION_CODES.FROYO;
import static org.assertj.android.api.content.res.ConfigurationAssert.uiModeTypeToString;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link UiModeManager} instances. */
@TargetApi(FROYO)
public class UiModeManagerAssert extends AbstractAssert<UiModeManagerAssert, UiModeManager> {
  public UiModeManagerAssert(UiModeManager actual) {
    super(actual, UiModeManagerAssert.class);
  }

  public UiModeManagerAssert isNightMode() {
    isNotNull();
    assertThat(actual.getNightMode()) //
        .overridingErrorMessage("Expected to be in night mode but was not in night mode.") //
        .isNotEqualTo(MODE_NIGHT_NO);
    return this;
  }

  public UiModeManagerAssert isNotNightMode() {
    isNotNull();
    assertThat(actual.getNightMode()) //
        .overridingErrorMessage("Expected not to be in night mode but was in night mode.") //
        .isEqualTo(MODE_NIGHT_NO);
    return this;
  }

  public UiModeManagerAssert isInUiModeType(@ConfigurationUiModeType int mode) {
    isNotNull();
    int actualMode = actual.getCurrentModeType();
    //noinspection ResourceType
    assertThat(actualMode) //
        .overridingErrorMessage("Expected mode <%s> but was <%s>.", uiModeTypeToString(mode),
            uiModeTypeToString(actualMode)) //
        .isEqualTo(mode);
    return this;
  }

  public UiModeManagerAssert isNotInUiModeType(@ConfigurationUiModeType int mode) {
    isNotNull();
    int actualMode = actual.getCurrentModeType();
    //noinspection ResourceType
    assertThat(actualMode) //
        .overridingErrorMessage("Expected not mode <%s> but was <%s>.", uiModeTypeToString(mode),
            uiModeTypeToString(actualMode)) //
        .isNotEqualTo(mode);
    return this;
  }
}
