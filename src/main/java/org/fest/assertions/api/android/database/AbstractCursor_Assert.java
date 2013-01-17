// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.database;

import android.database.AbstractCursor;

/**
 * Assertions for {@link AbstractCursor} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractAbstractCursorAssert}.
 */
public final class AbstractCursor_Assert
    extends AbstractAbstractCursorAssert<AbstractCursor_Assert, AbstractCursor> {
  public AbstractCursor_Assert(AbstractCursor actual) {
    super(actual, AbstractCursor_Assert.class);
  }
}
