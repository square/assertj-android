package org.fest.assertions.api.android.app;

import android.app.Service;
import org.fest.assertions.api.android.content.AbstractContextAssert;

public abstract class AbstractServiceAssert<S extends AbstractServiceAssert<S, A>, A extends Service> extends
    AbstractContextAssert<S, A> {
  protected AbstractServiceAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }


}
