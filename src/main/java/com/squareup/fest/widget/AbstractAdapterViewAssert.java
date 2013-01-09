package com.squareup.fest.widget;

import android.widget.AdapterView;
import org.fest.assertions.api.AbstractAssert;

public abstract class AbstractAdapterViewAssert<S extends AbstractAdapterViewAssert<S, A>, A extends AdapterView>
    extends AbstractAssert<S, A> {
  protected AbstractAdapterViewAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }
}
