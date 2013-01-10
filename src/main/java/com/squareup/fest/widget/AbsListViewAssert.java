package com.squareup.fest.widget;

import android.widget.AbsListView;

/**
 * Assertions for {@link AbsListView} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractAbsListViewAssert}.
 */
public final class AbsListViewAssert
    extends AbstractAbsListViewAssert<AbsListViewAssert, AbsListView> {
  public AbsListViewAssert(AbsListView actual) {
    super(actual, AbsListViewAssert.class);
  }
}
