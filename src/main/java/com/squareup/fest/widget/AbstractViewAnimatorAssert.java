// Copyright 2012 Square, Inc.
package com.squareup.fest.widget;

import android.view.View;
import android.widget.ViewAnimator;
import com.squareup.fest.view.AbstractViewGroupAssert;

import static com.squareup.fest.Assertions.assertThat;

public abstract class AbstractViewAnimatorAssert<S extends AbstractViewAnimatorAssert<S, A>, A extends ViewAnimator>
    extends AbstractViewGroupAssert<S, A> {
  public AbstractViewAnimatorAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  private View getDisplayedView() {
    return actual.getChildAt(actual.getDisplayedChild());
  }

  public S hasDisplayedChild(View view) {
    isNotNull();
    View actualView = getDisplayedView();
    assertThat(actualView) //
        .overridingErrorMessage("Expected displayed child <%s> but was <%s>.", view, actualView) //
        .isSameAs(view);
    return myself;
  }

  public S hasDisplayedChildId(int id) {
    isNotNull();
    assertThat(getDisplayedView()).hasId(id);
    return myself;
  }

  public S hasDisplayedChild(int index) {
    isNotNull();
    int actualIndex = actual.getDisplayedChild();
    assertThat(actualIndex) //
        .overridingErrorMessage("Expected displayed child index <%s> but was <%s>.", index,
            actualIndex) //
        .isEqualTo(index);
    return myself;
  }
}
