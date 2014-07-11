// Copyright 2013 Square, Inc.
package org.assertj.android.api.view.accessibility;

import android.annotation.TargetApi;
import android.view.accessibility.AccessibilityManager;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link AccessibilityManager} instances. */
public class AccessibilityManagerAssert
    extends AbstractAssert<AccessibilityManagerAssert, AccessibilityManager> {
  public AccessibilityManagerAssert(AccessibilityManager actual) {
    super(actual, AccessibilityManagerAssert.class);
  }

  public AccessibilityManagerAssert isEnabled() {
    isNotNull();
    assertThat(actual.isEnabled()) //
        .overridingErrorMessage("Expected to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public AccessibilityManagerAssert isDisabled() {
    isNotNull();
    assertThat(actual.isEnabled()) //
        .overridingErrorMessage("Expected to be disabled but was enabled.") //
        .isFalse();
    return this;
  }

  @TargetApi(ICE_CREAM_SANDWICH)
  public AccessibilityManagerAssert isTouchExplorationEnabled() {
    isNotNull();
    assertThat(actual.isTouchExplorationEnabled()) //
        .overridingErrorMessage("Expected touch exploration to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  @TargetApi(ICE_CREAM_SANDWICH)
  public AccessibilityManagerAssert isTouchExplorationDisabled() {
    isNotNull();
    assertThat(actual.isTouchExplorationEnabled()) //
        .overridingErrorMessage("Expected touch exploration to be disabled but was enabled.") //
        .isFalse();
    return this;
  }
}
