// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.database.Cursor;
import android.widget.CursorAdapter;
import android.widget.Filter;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractCursorAdapterAssert<S extends AbstractCursorAdapterAssert<S, A>, A extends CursorAdapter>
    extends AbstractListAdapterAssert<S, A> {
  protected AbstractCursorAdapterAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasCursor(Cursor cursor) {
    isNotNull();
    Cursor actualCursor = actual.getCursor();
    assertThat(actualCursor) //
        .overridingErrorMessage("Expected cursor <%s> but was <%s>.", cursor, actualCursor) //
        .isSameAs(cursor);
    return myself;
  }

  public S hasFilter(Filter filter) {
    isNotNull();
    Filter actualFilter = actual.getFilter();
    assertThat(actualFilter) //
        .overridingErrorMessage("Expected filter <%s> but was <%s>.", filter, actualFilter) //
        .isSameAs(filter);
    return myself;
  }
}
