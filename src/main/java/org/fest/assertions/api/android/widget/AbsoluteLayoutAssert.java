package org.fest.assertions.api.android.widget;

import android.widget.AbsoluteLayout;

/**
 * Assertions for {@link AbsoluteLayout} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractAbsoluteLayoutAssert}.
 */
public final class AbsoluteLayoutAssert
    extends AbstractAbsoluteLayoutAssert<AbsoluteLayoutAssert, AbsoluteLayout> {
  public AbsoluteLayoutAssert(AbsoluteLayout actual) {
    super(actual, AbsoluteLayoutAssert.class);
  }
}
