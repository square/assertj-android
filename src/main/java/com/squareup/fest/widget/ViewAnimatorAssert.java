// Copyright 2012 Square, Inc.
package com.squareup.fest.widget;

import android.view.View;
import android.widget.ViewAnimator;
import com.squareup.fest.view.AbstractViewGroupAssert;

import static com.squareup.fest.Assertions.assertThat;

public class ViewAnimatorAssert extends AbstractViewGroupAssert<ViewAnimatorAssert, ViewAnimator> {
  public ViewAnimatorAssert(ViewAnimator actual) {
    super(actual, ViewAnimatorAssert.class);
  }

  private View getDisplayedView() {
    return actual.getChildAt(actual.getDisplayedChild());
  }

  public ViewAnimatorAssert isShowingView(View view) {
    isNotNull();
    assertThat(getDisplayedView()).isSameAs(view);
    return this;
  }

  public ViewAnimatorAssert isShowingId(int id) {
    isNotNull();
    assertThat(getDisplayedView()).hasId(id);
    return this;
  }

  public ViewAnimatorAssert isShowingIndex(int index) {
    isNotNull();
    assertThat(actual.getDisplayedChild()).isEqualTo(index);
    return this;
  }
}
