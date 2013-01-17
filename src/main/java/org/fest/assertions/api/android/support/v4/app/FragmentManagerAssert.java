// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.support.v4.app;

import android.support.v4.app.FragmentManager;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link FragmentManager} instances. */
public class FragmentManagerAssert extends AbstractAssert<FragmentManagerAssert, FragmentManager> {
  public FragmentManagerAssert(FragmentManager actual) {
    super(actual, FragmentManagerAssert.class);
  }

  public FragmentManagerAssert hasFragmentWithId(int id) {
    isNotNull();
    assertThat(actual.findFragmentById(id)) //
        .overridingErrorMessage("Expected fragment with ID <%s> but was not found.") //
        .isNotNull();
    return this;
  }

  public FragmentManagerAssert hasFragmentWithTag(String tag) {
    isNotNull();
    assertThat(actual.findFragmentByTag(tag)) //
        .overridingErrorMessage("Expected fragment with tag <%s> but was not found.") //
        .isNotNull();
    return this;
  }

  public FragmentManagerAssert hasBackStackEntryCount(int count) {
    isNotNull();
    int actualCount = actual.getBackStackEntryCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected back stack entry count <%s> but was <%s>.", count,
            actualCount) //
        .isEqualTo(count);
    return this;
  }
}
