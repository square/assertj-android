package com.squareup.fest.app;

import android.app.UiModeManager;
import org.fest.assertions.api.AbstractAssert;

import static android.app.UiModeManager.MODE_NIGHT_NO;
import static com.squareup.fest.content.res.ConfigurationAssert.uiModeTypeToString;
import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link UiModeManager} instances. */
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

  public UiModeManagerAssert isInUiModeType(int mode) {
    isNotNull();
    int actualMode = actual.getCurrentModeType();
    assertThat(actualMode) //
        .overridingErrorMessage("Expected mode <%s> but was <%s>.", uiModeTypeToString(mode),
            uiModeTypeToString(actualMode)) //
        .isEqualTo(mode);
    return this;
  }

  public UiModeManagerAssert isNotInUiModeType(int mode) {
    isNotNull();
    int actualMode = actual.getCurrentModeType();
    assertThat(actualMode) //
        .overridingErrorMessage("Expected not mode <%s> but was <%s>.", uiModeTypeToString(mode),
            uiModeTypeToString(actualMode)) //
        .isNotEqualTo(mode);
    return this;
  }
}
