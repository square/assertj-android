package com.squareup.fest.app;

import android.app.FragmentTransaction;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public class FragmentTransactionAssert
    extends AbstractAssert<FragmentTransactionAssert, FragmentTransaction> {
  public FragmentTransactionAssert(FragmentTransaction actual) {
    super(actual, FragmentManagerAssert.class);
  }

  public FragmentTransactionAssert isAddToBackStackAllowed() {
    isNotNull();
    assertThat(actual.isAddToBackStackAllowed()) //
        .overridingErrorMessage("Expected add to back stack allow but was disallowed") //
        .isTrue();
    return this;
  }

  public FragmentTransactionAssert isAddToBackStackDisallowed() {
    isNotNull();
    assertThat(actual.isAddToBackStackAllowed()) //
        .overridingErrorMessage("Expected add to back stack disallowed but as allowed") //
        .isFalse();
    return this;
  }

  public FragmentTransactionAssert isEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected empty transaction but was not empty") //
        .isTrue();
    return this;
  }

  public FragmentTransactionAssert isNotEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected not empty transaction but was empty") //
        .isFalse();
    return this;
  }
}
