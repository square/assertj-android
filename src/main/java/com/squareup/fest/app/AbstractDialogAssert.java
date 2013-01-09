package com.squareup.fest.app;

import android.app.Dialog;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractDialogAssert<S extends AbstractDialogAssert<S, A>, A extends Dialog>
    extends AbstractAssert<S, A> {
  public AbstractDialogAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S isShowing() {
    isNotNull();
    assertThat(actual.isShowing()) //
        .overridingErrorMessage("Expected showing but was not showing") //
        .isTrue();
    return myself;
  }

  public S isNotShowing() {
    isNotNull();
    assertThat(actual.isShowing()) //
        .overridingErrorMessage("Expected not showing but was showing") //
        .isFalse();
    return myself;
  }
}
