// Copyright 2012 Square, Inc.
package com.squareup.fest.view;

import android.view.MenuItem;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link MenuItem} instances. */
public class MenuItemAssert extends AbstractAssert<MenuItemAssert, MenuItem> {
  public MenuItemAssert(MenuItem actual) {
    super(actual, MenuItemAssert.class);
  }

  public MenuItemAssert isEnabled() {
    isNotNull();
    assertThat(actual.isEnabled()) //
        .overridingErrorMessage("Expected enabled but was disabled") //
        .isTrue();
    return this;
  }

  public MenuItemAssert isDisabled() {
    isNotNull();
    assertThat(actual.isEnabled()) //
        .overridingErrorMessage("Expected disabled but was enabled") //
        .isFalse();
    return this;
  }
}
