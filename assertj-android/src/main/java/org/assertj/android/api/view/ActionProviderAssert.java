package org.assertj.android.api.view;

import android.annotation.TargetApi;
import android.view.ActionProvider;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH;
import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link ActionProvider} instances. */
@TargetApi(ICE_CREAM_SANDWICH)
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

  @TargetApi(JELLY_BEAN)
  public ActionProviderAssert isVisible() {
    isNotNull();
    assertThat(actual.isVisible()) //
        .overridingErrorMessage("Expected visible but was not visible") //
        .isTrue();
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public ActionProviderAssert isNotVisible() {
    isNotNull();
    assertThat(actual.isVisible()) //
        .overridingErrorMessage("Expected not visible but was visible") //
        .isFalse();
    return this;
  }
}
