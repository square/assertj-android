// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.widget;

import android.widget.TableRow;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link TableRow} instances. */
public class TableRowAssert extends AbstractLinearLayoutAssert<TableRowAssert, TableRow> {
  public TableRowAssert(TableRow actual) {
    super(actual, TableRowAssert.class);
  }

  public TableRowAssert hasVirtualChildCount(int count) {
    isNotNull();
    int actualCount = actual.getVirtualChildCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected virtual child count <%s> but was <%s>.", count,
            actualCount) //
        .isEqualTo(count);
    return this;
  }
}
