// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

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

  public AccessibilityManagerAssert isTouchExplorationEnabled() {
    isNotNull();
    assertThat(actual.isTouchExplorationEnabled()) //
        .overridingErrorMessage("Expected touch exploration to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public AccessibilityManagerAssert isTouchExplorationDisabled() {
    isNotNull();
    assertThat(actual.isTouchExplorationEnabled()) //
        .overridingErrorMessage("Expected touch exploration to be disabled but was enabled.") //
        .isFalse();
    return this;
  }
}
