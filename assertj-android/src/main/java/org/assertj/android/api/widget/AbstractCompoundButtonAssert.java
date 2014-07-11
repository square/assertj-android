// Copyright 2012 Square, Inc.
package org.assertj.android.api.widget;

import android.widget.CompoundButton;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractCompoundButtonAssert<S extends AbstractCompoundButtonAssert<S, A>, A extends CompoundButton>
    extends AbstractTextViewAssert<S, A> {
  public AbstractCompoundButtonAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S isChecked() {
    isNotNull();
    assertThat(actual.isChecked()) //
        .overridingErrorMessage("Expected checked but was not checked.") //
        .isTrue();
    return myself;
  }

  public S isNotChecked() {
    isNotNull();
    assertThat(actual.isChecked()) //
        .overridingErrorMessage("Expected not checked but was checked.") //
        .isFalse();
    return myself;
  }
}
