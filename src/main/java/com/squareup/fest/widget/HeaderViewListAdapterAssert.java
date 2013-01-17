// Copyright 2013 Square, Inc.
package com.squareup.fest.widget;

import android.widget.Filter;
import android.widget.HeaderViewListAdapter;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link HeaderViewListAdapter} instances. */
public class HeaderViewListAdapterAssert
    extends AbstractWrapperListAdapterAssert<HeaderViewListAdapterAssert, HeaderViewListAdapter> {
  public HeaderViewListAdapterAssert(HeaderViewListAdapter actual) {
    super(actual, HeaderViewListAdapterAssert.class);
  }

  public HeaderViewListAdapterAssert hasFootersCount(int count) {
    isNotNull();
    int actualCount = actual.getFootersCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected footers count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public HeaderViewListAdapterAssert hasHeadersCount(int count) {
    isNotNull();
    int actualCount = actual.getHeadersCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected headers count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public HeaderViewListAdapterAssert hasFilter(Filter filter) {
    isNotNull();
    Filter actualFilter = actual.getFilter();
    assertThat(actualFilter) //
        .overridingErrorMessage("Expected filter <%s> but was <%s>.", filter, actualFilter) //
        .isSameAs(filter);
    return this;
  }
}
