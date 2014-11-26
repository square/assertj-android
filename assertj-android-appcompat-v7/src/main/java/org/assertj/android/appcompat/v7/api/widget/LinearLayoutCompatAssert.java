package org.assertj.android.appcompat.v7.api.widget;

import android.support.v7.widget.LinearLayoutCompat;

/**
 * Assertions for {@link LinearLayoutCompat} instances.
 * <p>
 * This class is final. To extend use {@link AbstractLinearLayoutCompatAssert}.
 */
public final class LinearLayoutCompatAssert extends
    AbstractLinearLayoutCompatAssert<LinearLayoutCompatAssert, LinearLayoutCompat> {
  public LinearLayoutCompatAssert(LinearLayoutCompat actual) {
    super(actual, LinearLayoutCompatAssert.class);
  }
}
