// Copyright 2012 Square, Inc.
package com.squareup.fest.widget;

import android.widget.Switch;
import com.squareup.fest.view.AbstractViewAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public class SwitchAssert extends AbstractViewAssert<SwitchAssert, Switch> {
  public SwitchAssert(Switch actual) {
    super(actual, SwitchAssert.class);
  }

  public SwitchAssert isChecked() {
    isNotNull();
    assertThat(actual.isChecked())
        .overridingErrorMessage("Expected switch checked but was not checked")
        .isTrue();
    return this;
  }

  public SwitchAssert isNotChecked() {
    isNotNull();
    assertThat(actual.isChecked())
        .overridingErrorMessage("Expected switch not checked but was checked")
        .isFalse();
    return this;
  }
}
