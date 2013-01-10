package com.squareup.fest.view;

import android.view.ActionProvider;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link ActionProvider} instances. */
public class ActionProviderAssert extends AbstractAssert<ActionProviderAssert, ActionProvider> {
  public ActionProviderAssert(ActionProvider actual) {
    super(actual, ActionProviderAssert.class);
  }

  public ActionProviderAssert hasSubMenu() {
    isNotNull();
    assertThat(actual.hasSubMenu()) //
        .overridingErrorMessage("Expected sub-menu but was not present") //
        .isTrue();
    return this;
  }

  public ActionProviderAssert hasNoSubMenu() {
    isNotNull();
    assertThat(actual.hasSubMenu()) //
        .overridingErrorMessage("Expected no sub-menu but was not present") //
        .isFalse();
    return this;
  }

  public ActionProviderAssert isVisible() {
    isNotNull();
    assertThat(actual.isVisible()) //
        .overridingErrorMessage("Expected visible but was not visible") //
        .isTrue();
    return this;
  }

  public ActionProviderAssert isNotVisible() {
    isNotNull();
    assertThat(actual.isVisible()) //
        .overridingErrorMessage("Expected not visible but was visible") //
        .isFalse();
    return this;
  }
}
