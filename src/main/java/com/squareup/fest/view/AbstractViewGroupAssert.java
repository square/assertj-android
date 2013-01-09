package com.squareup.fest.view;

import android.view.ViewGroup;

import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractViewGroupAssert<S extends AbstractViewGroupAssert<S, A>, A extends ViewGroup>
    extends AbstractViewAssert<S, A> {
  protected AbstractViewGroupAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasChildCount(int expectedNumChildren) {
    isNotNull();
    assertThat(actual.getChildCount()).isEqualTo(expectedNumChildren);
    return myself;
  }
}
