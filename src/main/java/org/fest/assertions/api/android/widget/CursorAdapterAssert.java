// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.widget;

import android.widget.CursorAdapter;

/**
 * Assertions for {@link CursorAdapter} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractCursorAdapterAssert}.
 */
public final class CursorAdapterAssert
    extends AbstractCursorAdapterAssert<CursorAdapterAssert, CursorAdapter> {
  public CursorAdapterAssert(CursorAdapter actual) {
    super(actual, CursorAdapterAssert.class);
  }
}
