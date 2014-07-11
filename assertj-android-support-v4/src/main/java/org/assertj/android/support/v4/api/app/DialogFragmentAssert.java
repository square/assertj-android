// Copyright 2013 Square, Inc.
package org.assertj.android.support.v4.api.app;

import android.support.v4.app.DialogFragment;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link DialogFragment} instances. */
public class DialogFragmentAssert
    extends AbstractFragmentAssert<DialogFragmentAssert, DialogFragment> {
  public DialogFragmentAssert(DialogFragment actual) {
    super(actual, DialogFragmentAssert.class);
  }

  public DialogFragmentAssert isCancelable() {
    isNotNull();
    assertThat(actual.isCancelable()) //
        .overridingErrorMessage("Expected to be cancelable but was not cancelable.") //
        .isTrue();
    return this;
  }

  public DialogFragmentAssert isNotCancelable() {
    isNotNull();
    assertThat(actual.isCancelable()) //
        .overridingErrorMessage("Expected to be not cancelable but was cancelable.") //
        .isFalse();
    return this;
  }
}
