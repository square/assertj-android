// Copyright 2013 Square, Inc.
package org.assertj.android.support.v4.api.view;

import android.support.v4.view.PagerAdapter;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

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
