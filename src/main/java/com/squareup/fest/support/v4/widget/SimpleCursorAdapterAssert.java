// Copyright 2013 Square, Inc.
package com.squareup.fest.support.v4.widget;

import android.support.v4.widget.SimpleCursorAdapter;

import static android.support.v4.widget.SimpleCursorAdapter.CursorToStringConverter;
import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link SimpleCursorAdapter} instances. */
public class SimpleCursorAdapterAssert
    extends AbstractCursorAdapterAssert<SimpleCursorAdapterAssert, SimpleCursorAdapter> {
  public SimpleCursorAdapterAssert(SimpleCursorAdapter actual) {
    super(actual, SimpleCursorAdapterAssert.class);
  }

  public SimpleCursorAdapterAssert hasCursorToStringConverter(CursorToStringConverter converter) {
    isNotNull();
    CursorToStringConverter actualConverter = actual.getCursorToStringConverter();
    assertThat(actualConverter) //
        .overridingErrorMessage("Expected cursor 'toString' converter <%s> but was <%s>.",
            converter, actualConverter) //
        .isSameAs(converter);
    return this;
  }

  public SimpleCursorAdapterAssert hasStringConversionColumn(int column) {
    isNotNull();
    int actualColumn = actual.getStringConversionColumn();
    assertThat(actualColumn) //
        .overridingErrorMessage("Expected string conversion column <%s> but was <%s>.", column,
            actualColumn) //
        .isEqualTo(column);
    return this;
  }

  public SimpleCursorAdapterAssert hasViewBinder(SimpleCursorAdapter.ViewBinder binder) {
    isNotNull();
    SimpleCursorAdapter.ViewBinder actualBinder = actual.getViewBinder();
    assertThat(actualBinder) //
        .overridingErrorMessage("Expected view binder <%s> but was <%s>.", binder, actualBinder) //
        .isSameAs(binder);
    return this;
  }
}
