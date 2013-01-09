package com.squareup.fest.app;

import android.app.Service;
import com.squareup.fest.content.AbstractContextAssert;

public abstract class AbstractServiceAssert<S extends AbstractServiceAssert<S, A>, A extends Service> extends
    AbstractContextAssert<S, A> {
  protected AbstractServiceAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }


}
