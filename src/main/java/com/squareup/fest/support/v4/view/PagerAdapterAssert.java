// Copyright 2013 Square, Inc.
package com.squareup.fest.support.v4.view;

import android.support.v4.view.PagerAdapter;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link PagerAdapter} instances. */
public class PagerAdapterAssert extends AbstractAssert<PagerAdapterAssert, PagerAdapter> {
  public PagerAdapterAssert(PagerAdapter actual) {
    super(actual, PagerAdapterAssert.class);
  }

  public PagerAdapterAssert hasCount(int count) {
    isNotNull();
    int actualCount = actual.getCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }
}
