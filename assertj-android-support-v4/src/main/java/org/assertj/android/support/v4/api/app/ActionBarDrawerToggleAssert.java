package org.assertj.android.support.v4.api.app;

import android.support.v4.app.ActionBarDrawerToggle;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class ActionBarDrawerToggleAssert extends AbstractAssert<ActionBarDrawerToggleAssert, ActionBarDrawerToggle> {
  public ActionBarDrawerToggleAssert(ActionBarDrawerToggle actual) {
    super(actual, ActionBarDrawerToggleAssert.class);
  }

  public ActionBarDrawerToggleAssert hasDrawerIndicatorEnabled() {
    isNotNull();
    assertThat(actual.isDrawerIndicatorEnabled()) //
        .overridingErrorMessage("Expected drawer indicator to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public ActionBarDrawerToggleAssert doesNotHaveDrawerIndicatorEnabled() {
    isNotNull();
    assertThat(actual.isDrawerIndicatorEnabled()) //
        .overridingErrorMessage("Expected drawer indicator to be disabled but was enabled.") //
        .isFalse();
    return this;
  }
}
