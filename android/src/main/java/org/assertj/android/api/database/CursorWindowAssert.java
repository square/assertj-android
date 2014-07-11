// Copyright 2013 Square, Inc.
package org.assertj.android.api.database;

import android.database.CursorWindow;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

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
    int actualPosition = actual.getStartPosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected start position <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return this;
  }
}
