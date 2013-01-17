// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.support.v4.app;

import android.support.v4.app.FragmentTransaction;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link FragmentTransaction} instances. */
public class FragmentTransactionAssert
    extends AbstractAssert<FragmentTransactionAssert, FragmentTransaction> {
  public FragmentTransactionAssert(FragmentTransaction actual) {
    super(actual, FragmentManagerAssert.class);
  }

  public FragmentTransactionAssert isAddToBackStackAllowed() {
    isNotNull();
    assertThat(actual.isAddToBackStackAllowed()) //
        .overridingErrorMessage("Expected add to back stack to be allowed but was disallowed.") //
        .isTrue();
    return this;
  }

  public FragmentTransactionAssert isAddToBackStackDisallowed() {
    isNotNull();
    assertThat(actual.isAddToBackStackAllowed()) //
        .overridingErrorMessage("Expected add to back stack to be disallowed but was allowed.") //
        .isFalse();
    return this;
  }

  public FragmentTransactionAssert isEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected empty transaction but was not empty.") //
        .isTrue();
    return this;
  }

  public FragmentTransactionAssert isNotEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected non-empty transaction but was empty.") //
        .isFalse();
    return this;
  }
}
