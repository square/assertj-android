// Copyright 2013 Square, Inc.
package com.squareup.fest.database;

import android.database.CursorWindow;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link CursorWindow} instances. */
public class CursorWindowAssert extends AbstractAssert<CursorWindowAssert, CursorWindow> {
  public CursorWindowAssert(CursorWindow actual) {
    super(actual, CursorWindowAssert.class);
  }

  public CursorWindowAssert hasRowCount(int count) {
    isNotNull();
    int actualCount = actual.getNumRows();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected row count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public CursorWindowAssert hasStartPosition(int position) {
    isNotNull();
    int actualPositon = actual.getStartPosition();
    assertThat(actualPositon) //
        .overridingErrorMessage("Expected start position <%s> but was <%s>.", position,
            actualPositon) //
        .isEqualTo(position);
    return this;
  }
}
