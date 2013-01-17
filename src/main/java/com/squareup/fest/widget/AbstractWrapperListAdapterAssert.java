// Copyright 2013 Square, Inc.
package com.squareup.fest.widget;

import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;

import static com.squareup.fest.Assertions.assertThat;

public abstract class AbstractWrapperListAdapterAssert<S extends AbstractWrapperListAdapterAssert<S, A>, A extends WrapperListAdapter>
    extends AbstractListAdapterAssert<S, A> {
  protected AbstractWrapperListAdapterAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasWrappedAdapter(ListAdapter adapter) {
    isNotNull();
    ListAdapter actualAdapter = actual.getWrappedAdapter();
    assertThat(actualAdapter) //
        .overridingErrorMessage("Expected wrapped adapter <%s> but was <%s>.", adapter,
            actualAdapter) //
        .isSameAs(adapter);
    return myself;
  }
}
