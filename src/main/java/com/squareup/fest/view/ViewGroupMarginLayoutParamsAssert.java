package com.squareup.fest.view;

import android.view.ViewGroup;

/**
 * Assertions for {@link ViewGroup.MarginLayoutParams} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractViewGroupLayoutParamsAssert}.
 */
public final class ViewGroupMarginLayoutParamsAssert extends
    AbstractViewGroupMarginLayoutParamsAssert<ViewGroupMarginLayoutParamsAssert, ViewGroup.MarginLayoutParams> {
  public ViewGroupMarginLayoutParamsAssert(ViewGroup.MarginLayoutParams actual) {
    super(actual, ViewGroupMarginLayoutParamsAssert.class);
  }
}
