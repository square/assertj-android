// Copyright 2013 Square, Inc.
package com.squareup.fest.animation;

import android.animation.ValueAnimator;

/**
 * Assertions for {@link ValueAnimator} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractValueAnimatorAssert}.
 */
public final class ValueAnimatorAssert
    extends AbstractValueAnimatorAssert<ValueAnimatorAssert, ValueAnimator> {
  public ValueAnimatorAssert(ValueAnimator actual) {
    super(actual, ValueAnimatorAssert.class);
  }
}
