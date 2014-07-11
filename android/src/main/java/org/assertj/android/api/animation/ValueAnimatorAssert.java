// Copyright 2013 Square, Inc.
package org.assertj.android.api.animation;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;

import static android.os.Build.VERSION_CODES.HONEYCOMB;

/**
 * Assertions for {@link ValueAnimator} instances.
 * <p>
 * This class is final. To extend use {@link AbstractValueAnimatorAssert}.
 */
@TargetApi(HONEYCOMB)
public final class ValueAnimatorAssert
    extends AbstractValueAnimatorAssert<ValueAnimatorAssert, ValueAnimator> {
  public ValueAnimatorAssert(ValueAnimator actual) {
    super(actual, ValueAnimatorAssert.class);
  }
}
