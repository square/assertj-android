package com.squareup.fest.content;

import android.content.Context;
import org.fest.assertions.api.AbstractAssert;

public abstract class AbstractContextAssert<S extends AbstractContextAssert<S, A>, A extends Context>
    extends AbstractAssert<S, A> {
  protected AbstractContextAssert(A actual, Class<?> selfType) {
    super(actual, selfType);
  }

  // TODO!
}
