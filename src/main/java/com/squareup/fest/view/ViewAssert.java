package com.squareup.fest.view;

import android.view.View;

/**
 * Assertions for {@link View} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractViewAssert}.
 */
public final class ViewAssert extends AbstractViewAssert<ViewAssert, View> {
  public ViewAssert(View actual) {
    super(actual, ViewAssert.class);
  }
}
