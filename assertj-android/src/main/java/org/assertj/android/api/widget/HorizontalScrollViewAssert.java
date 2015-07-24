// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.widget.HorizontalScrollView;

/**
 * Assertions for {@link HorizontalScrollView} instances.
 * <p>
 * This class is final. To extend use {@link AbstractHorizontalScrollViewAssert}.
 */
public final class HorizontalScrollViewAssert
    extends AbstractHorizontalScrollViewAssert<HorizontalScrollViewAssert, HorizontalScrollView> {
  public HorizontalScrollViewAssert(HorizontalScrollView actual) {
    super(actual, HorizontalScrollViewAssert.class);
  }
}
