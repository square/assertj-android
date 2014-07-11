// Copyright 2013 Square, Inc.
package org.assertj.android.api.view;

import android.view.Menu;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Menu} instances. */
public final class MenuAssert extends AbstractAssert<MenuAssert, Menu> {
  public MenuAssert(Menu actual) {
    super(actual, MenuAssert.class);
  }

  public MenuAssert hasItem(int id) {
    isNotNull();
    assertThat(actual.findItem(id)) //
        .overridingErrorMessage("Expected menu item with ID <%s> but was not found.", id) //
        .isNotNull();
    return this;
  }

  public MenuAssert hasItemAt(int index) {
    isNotNull();
    assertThat(actual.getItem(index)) //
        .overridingErrorMessage("Expected menu item at index <%s> but was not found.", index) //
        .isNotNull();
    return this;
  }

  public MenuAssert hasVisibleItems() {
    isNotNull();
    Assertions.assertThat(actual.hasVisibleItems()) //
        .overridingErrorMessage("Expected to have visible items but had no visible items.") //
        .isTrue();
    return this;
  }

  public MenuAssert hasNoVisibleItems() {
    isNotNull();
    Assertions.assertThat(actual.hasVisibleItems()) //
        .overridingErrorMessage("Expected to have no visible items but had visible items.") //
        .isFalse();
    return this;
  }

  public MenuAssert hasSize(int size) {
    isNotNull();
    int actualSize = actual.size();
    Assertions.assertThat(actualSize) //
        .overridingErrorMessage("Expected size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }
}
