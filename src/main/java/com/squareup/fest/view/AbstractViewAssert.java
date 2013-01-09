package com.squareup.fest.view;

import android.view.View;
import com.squareup.fest.Assertions;
import org.fest.assertions.api.AbstractAssert;

public abstract class AbstractViewAssert<S extends AbstractViewAssert<S, A>, A extends View>
    extends AbstractAssert<S, A> {
  protected AbstractViewAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasId(int id) {
    isNotNull();
    Assertions.assertThat(actual.getId()).isEqualTo(id);
    return myself;
  }
}
