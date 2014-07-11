// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.widget.ViewAnimator;

/**
 * Assertions for {@link ViewAnimator} instances.
 * <p>
 * This class is final. To extend use {@link AbstractViewAnimatorAssert}.
 */
public final class ViewAnimatorAssert extends AbstractViewAnimatorAssert<ViewAnimatorAssert, ViewAnimator> {
  public ViewAnimatorAssert(ViewAnimator actual) {
    super(actual, ViewAnimatorAssert.class);
  }
}
