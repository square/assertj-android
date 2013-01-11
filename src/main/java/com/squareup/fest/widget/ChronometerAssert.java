// Copyright 2013 Square, Inc.
package com.squareup.fest.widget;

import android.widget.Chronometer;

import static org.fest.assertions.api.Assertions.assertThat;

public class ChronometerAssert extends AbstractTextViewAssert<ChronometerAssert, Chronometer> {
  public ChronometerAssert(Chronometer actual) {
    super(actual, ChronometerAssert.class);
  }

  public ChronometerAssert hasBase(long base) {
    isNotNull();
    long actualBase = actual.getBase();
    assertThat(actualBase) //
        .overridingErrorMessage("Expected base time <%s> but was <%s>.", base, actualBase) //
        .isEqualTo(base);
    return this;
  }

  public ChronometerAssert hasFormat(String format) {
    isNotNull();
    String actualFormat = actual.getFormat();
    assertThat(actualFormat) //
        .overridingErrorMessage("Expected format <%s> but was <%s>.", format, actualFormat) //
        .isEqualTo(format);
    return this;
  }
}
