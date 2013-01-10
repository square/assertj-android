// Copyright 2012 Square, Inc.
package com.squareup.fest.widget;

import android.view.View;
import android.widget.ViewAnimator;
import com.squareup.fest.view.AbstractViewGroupAssert;

import static com.squareup.fest.Assertions.assertThat;

/** Assertions for {@link ViewAnimator} instances. */
public class ViewAnimatorAssert extends AbstractViewGroupAssert<ViewAnimatorAssert, ViewAnimator> {
  public ViewAnimatorAssert(ViewAnimator actual) {
    super(actual, ViewAnimatorAssert.class);
  }

  private View getDisplayedView() {
    return actual.getChildAt(actual.getDisplayedChild());
  }

  public ViewAnimatorAssert hasDisplayedChild(View view) {
    isNotNull();
    View actualView = getDisplayedView();
    assertThat(actualView) //
        .overridingErrorMessage("Expected displayed child <%s> but was <%s>.", view, actualView) //
        .isSameAs(view);
    return this;
  }

  public ViewAnimatorAssert hasDisplayedChildId(int id) {
    isNotNull();
    assertThat(getDisplayedView()).hasId(id);
    return this;
  }

  public ViewAnimatorAssert hasDisplayedChild(int index) {
    isNotNull();
    int actualIndex = actual.getDisplayedChild();
    assertThat(actualIndex) //
        .overridingErrorMessage("Expected displayed child index <%s> but was <%s>.", index,
            actualIndex) //
        .isEqualTo(index);
    return this;
  }
}
