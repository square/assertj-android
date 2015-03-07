// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.widget.ListView;

/**
 * Assertions for {@link ListView} instances.
 * <p>
 * This class is final. To extend use {@link AbstractListViewAssert}.
 */
public final class ListViewAssert extends AbstractListViewAssert<ListViewAssert, ListView> {
  public ListViewAssert(ListView actual) {
    super(actual, ListViewAssert.class);
  }
}
