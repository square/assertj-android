// Copyright 2013 Square, Inc.
package com.squareup.fest.widget;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link ArrayAdapter} instances. */
public class ArrayAdapterAssert
    extends AbstractListAdapterAssert<ArrayAdapterAssert, ArrayAdapter> {
  public ArrayAdapterAssert(ArrayAdapter actual) {
    super(actual, ArrayAdapterAssert.class);
  }

  public ArrayAdapterAssert hasContext(Context context) {
    isNotNull();
    Context actualContext = actual.getContext();
    assertThat(actualContext) //
        .overridingErrorMessage("Expected context <%s> but was <%s>.", context, actualContext) //
        .isSameAs(context);
    return this;
  }

  public ArrayAdapterAssert hasFilter(Filter filter) {
    isNotNull();
    Filter actualFilter = actual.getFilter();
    assertThat(actualFilter) //
        .overridingErrorMessage("Expected filter <%s> but was <%s>.", filter, actualFilter) //
        .isSameAs(filter);
    return this;
  }
}
