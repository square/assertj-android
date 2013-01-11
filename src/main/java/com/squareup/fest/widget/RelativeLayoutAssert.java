package com.squareup.fest.widget;

import android.widget.RelativeLayout;

/**
 * Assertions for {@link RelativeLayout} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractRelativeLayoutAssert}.
 */
public final class RelativeLayoutAssert
    extends AbstractRelativeLayoutAssert<RelativeLayoutAssert, RelativeLayout> {
  public RelativeLayoutAssert(RelativeLayout actual) {
    super(actual, RelativeLayoutAssert.class);
  }
}
