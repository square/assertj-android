// Copyright 2013 Square, Inc.
package com.squareup.fest.widget;

import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link ExpandableListView} instances. */
public class ExpandableListViewAssert
    extends AbstractListViewAssert<ExpandableListViewAssert, ExpandableListView> {
  public ExpandableListViewAssert(ExpandableListView actual) {
    super(actual, ExpandableListViewAssert.class);
  }

  public ExpandableListViewAssert hasExpandableListAdapter(ExpandableListAdapter adapter) {
    isNotNull();
    ExpandableListAdapter actualAdapter = actual.getExpandableListAdapter();
    assertThat(actualAdapter) //
        .overridingErrorMessage("Expected expandable list adapter <%s> but was <%s>.", adapter,
            actualAdapter) //
        .isSameAs(adapter);
    return this;
  }

  public ExpandableListViewAssert hasSelectedId(long id) {
    isNotNull();
    long actualId = actual.getSelectedId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected selected ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public ExpandableListViewAssert hasSelectedPosition(long position) {
    isNotNull();
    long actualPosition = actual.getSelectedPosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected selected position <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return this;
  }
}
