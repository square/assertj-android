package com.squareup.fest.app;

import android.app.DialogFragment;

import static org.fest.assertions.api.Assertions.assertThat;

public class DialogFragmentAssert
    extends AbstractFragmentAssert<DialogFragmentAssert, DialogFragment> {
  public DialogFragmentAssert(DialogFragment actual) {
    super(actual, DialogFragmentAssert.class);
  }

  public DialogFragmentAssert isCancelable() {
    isNotNull();
    assertThat(actual.isCancelable()) //
        .overridingErrorMessage("Expected cancelable but was not cancelable") //
        .isTrue();
    return this;
  }

  public DialogFragmentAssert isNotCancelable() {
    isNotNull();
    assertThat(actual.isCancelable()) //
        .overridingErrorMessage("Expected not cancelable but was cancelable") //
        .isFalse();
    return this;
  }
}
