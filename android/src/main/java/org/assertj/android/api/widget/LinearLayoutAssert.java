package org.assertj.android.api.widget;

import android.widget.LinearLayout;

/**
 * Assertions for {@link LinearLayout} instances.
 * <p>
 * This class is final. To extend use {@link AbstractLinearLayoutAssert}.
 */
public final class LinearLayoutAssert extends AbstractLinearLayoutAssert<LinearLayoutAssert, LinearLayout> {
  public LinearLayoutAssert(LinearLayout actual) {
    super(actual, LinearLayoutAssert.class);
  }
}
