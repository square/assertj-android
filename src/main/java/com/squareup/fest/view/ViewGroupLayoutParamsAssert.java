package com.squareup.fest.view;

import android.view.ViewGroup;

/**
 * Assertions for {@link ViewGroup.LayoutParams} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractViewGroupLayoutParamsAssert}.
 */
public final class ViewGroupLayoutParamsAssert extends
    AbstractViewGroupLayoutParamsAssert<ViewGroupLayoutParamsAssert, ViewGroup.LayoutParams> {
  public ViewGroupLayoutParamsAssert(ViewGroup.LayoutParams actual) {
    super(actual, ViewGroupLayoutParamsAssert.class);
  }
}
