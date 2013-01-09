package com.squareup.fest.app;

import android.app.FragmentManager;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public class FragmentManagerAssert extends AbstractAssert<FragmentManagerAssert, FragmentManager> {
  public FragmentManagerAssert(FragmentManager actual) {
    super(actual, FragmentManagerAssert.class);
  }

  public FragmentManagerAssert hasFragmentWithId(int id) {
    isNotNull();
    assertThat(actual.findFragmentById(id)) //
        .overridingErrorMessage("Expected fragment with ID <%s> but was not found") //
        .isNotNull();
    return this;
  }

  public FragmentManagerAssert hasFragmentWithTag(String tag) {
    isNotNull();
    assertThat(actual.findFragmentByTag(tag)) //
        .overridingErrorMessage("Expected fragment with tag <%s> but was not found") //
        .isNotNull();
    return this;
  }

  public FragmentManagerAssert hasBackStackEntryCount(int count) {
    isNotNull();
    assertThat(actual.getBackStackEntryCount()).isEqualTo(count);
    return this;
  }
}
