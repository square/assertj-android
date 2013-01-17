package org.fest.assertions.api.android.widget;

import android.widget.FrameLayout;

/**
 * Assertions for {@link FrameLayout} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractFrameLayoutAssert}.
 */
public class FrameLayoutAssert extends AbstractFrameLayoutAssert<FrameLayoutAssert, FrameLayout> {
  public FrameLayoutAssert(FrameLayout actual) {
    super(actual, FrameLayoutAssert.class);
  }
}
