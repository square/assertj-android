// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.widget.ListAdapter;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractListAdapterAssert<S extends AbstractListAdapterAssert<S, A>, A extends ListAdapter>
    extends AbstractAdapterAssert<S, A> {
  protected AbstractListAdapterAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasAllItemsEnabled() {
    isNotNull();
    assertThat(actual.areAllItemsEnabled()) //
        .overridingErrorMessage("Expected all items to be enabled but was all were not.") //
        .isTrue();
    return myself;
  }

  public S hasAllItemsNotEnabled() {
    isNotNull();
    assertThat(actual.areAllItemsEnabled()) //
        .overridingErrorMessage("Expected all items to not be enabled but all were.") //
        .isFalse();
    return myself;
  }
}
