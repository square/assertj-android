package com.squareup.fest.view;

import android.view.View;

public final class ViewAssert extends AbstractViewAssert<ViewAssert, View> {
  public ViewAssert(View actual) {
    super(actual, ViewAssert.class);
  }
}
