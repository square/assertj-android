// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.widget.AbsSpinner;
import android.widget.SpinnerAdapter;
import org.assertj.core.api.Assertions;

public abstract class AbstractAbsSpinnerAssert<S extends AbstractAbsSpinnerAssert<S, A>, A extends AbsSpinner>
    extends AbstractAdapterViewAssert<S, A> {
  protected AbstractAbsSpinnerAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasAdapter(SpinnerAdapter adapter) {
    isNotNull();
    SpinnerAdapter actualAdapter = actual.getAdapter();
    Assertions.assertThat(actualAdapter) //
        .overridingErrorMessage("Expected adapter <%s> but was <%s>.", adapter, actualAdapter) //
        .isSameAs(adapter);
    return myself;
  }
}
