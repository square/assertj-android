// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.widget.RadioGroup;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link RadioGroup} instances. */
public class RadioGroupAssert extends AbstractLinearLayoutAssert<RadioGroupAssert, RadioGroup> {
  public RadioGroupAssert(RadioGroup actual) {
    super(actual, RadioGroupAssert.class);
  }

  public RadioGroupAssert hasCheckedRadioButtonId(int id) {
    isNotNull();
    int actualId = actual.getCheckedRadioButtonId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected checked radio button ID <%s> but was <%s>.", id,
            actualId) //
        .isEqualTo(id);
    return this;
  }
}
