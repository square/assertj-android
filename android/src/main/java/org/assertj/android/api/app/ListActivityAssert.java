// Copyright 2013 Square, Inc.
package org.assertj.android.api.app;

import android.app.ListActivity;

/**
 * Assertions for {@link ListActivity} instances.
 * <p>
 * This class is final. To extend use {@link AbstractListActivityAssert}.
 */
public final class ListActivityAssert
    extends AbstractListActivityAssert<ListActivityAssert, ListActivity> {
  public ListActivityAssert(ListActivity actual) {
    super(actual, ListActivityAssert.class);
  }
}
