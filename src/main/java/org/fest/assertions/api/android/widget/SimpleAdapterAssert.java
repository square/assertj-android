// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.widget;

import android.widget.Filter;
import android.widget.SimpleAdapter;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link SimpleAdapter} instances. */
public class SimpleAdapterAssert
    extends AbstractListAdapterAssert<SimpleAdapterAssert, SimpleAdapter> {
  public SimpleAdapterAssert(SimpleAdapter actual) {
    super(actual, SimpleAdapterAssert.class);
  }

  public SimpleAdapterAssert hasFilter(Filter filter) {
    isNotNull();
    Filter actualFilter = actual.getFilter();
    assertThat(actualFilter) //
        .overridingErrorMessage("Expected filter <%s> but was <%s>.", filter, actualFilter) //
        .isSameAs(filter);
    return this;
  }

  public SimpleAdapterAssert hasViewBinder(SimpleAdapter.ViewBinder binder) {
    isNotNull();
    SimpleAdapter.ViewBinder actualBinder = actual.getViewBinder();
    assertThat(actualBinder) //
        .overridingErrorMessage("Expected view binder <%s> but was <%s>.", binder, actualBinder) //
        .isSameAs(binder);
    return this;
  }
}
