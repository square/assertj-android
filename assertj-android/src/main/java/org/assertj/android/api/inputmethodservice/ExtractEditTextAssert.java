// Copyright 2013 Square, Inc.
package org.assertj.android.api.inputmethodservice;

import android.inputmethodservice.ExtractEditText;
import org.assertj.android.api.widget.AbstractTextViewAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class ExtractEditTextAssert extends AbstractTextViewAssert<ExtractEditTextAssert, ExtractEditText> {
  public ExtractEditTextAssert(ExtractEditText actual) {
    super(actual, ExtractEditTextAssert.class);
  }

  public ExtractEditTextAssert isInputMethodTarget() {
    isNotNull();
    assertThat(actual.isInputMethodTarget()) //
        .overridingErrorMessage("Expected to be input method target but was not.") //
        .isTrue();
    return this;
  }

  public ExtractEditTextAssert isNotInputMethodTarget() {
    isNotNull();
    assertThat(actual.isInputMethodTarget()) //
        .overridingErrorMessage("Expected to not be input method target but was.") //
        .isFalse();
    return this;
  }
}
