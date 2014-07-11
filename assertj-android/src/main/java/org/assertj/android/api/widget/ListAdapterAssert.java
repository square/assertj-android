// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.widget.ListAdapter;

/**
 * Assertions for {@link ListAdapter} instances.
 * <p>
 * This class is final. To extend use {@link AbstractListAdapterAssert}.
 */
public final class ListAdapterAssert
    extends AbstractListAdapterAssert<ListAdapterAssert, ListAdapter> {
  public ListAdapterAssert(ListAdapter actual) {
    super(actual, ListAdapterAssert.class);
  }
}
