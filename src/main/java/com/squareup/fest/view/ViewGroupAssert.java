package com.squareup.fest.view;

import android.view.ViewGroup;

public final class ViewGroupAssert extends AbstractViewGroupAssert<ViewGroupAssert, ViewGroup> {
  public ViewGroupAssert(ViewGroup actual) {
    super(actual, ViewGroupAssert.class);
  }
}
