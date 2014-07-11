package org.assertj.android.api.content;

import android.content.Context;
import org.assertj.core.api.AbstractAssert;

public abstract class AbstractContextAssert<S extends AbstractContextAssert<S, A>, A extends Context>
    extends AbstractAssert<S, A> {
  protected AbstractContextAssert(A actual, Class<?> selfType) {
    super(actual, selfType);
  }

  // TODO!
}
