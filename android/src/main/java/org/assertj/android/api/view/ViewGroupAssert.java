package org.assertj.android.api.view;

import android.view.ViewGroup;
/**
 * Assertions for {@link ViewGroup} instances.
 * <p>
 * This class is final. To extend use {@link AbstractViewGroupAssert}.
 */
public final class ViewGroupAssert extends AbstractViewGroupAssert<ViewGroupAssert, ViewGroup> {
  public ViewGroupAssert(ViewGroup actual) {
    super(actual, ViewGroupAssert.class);
  }
}
