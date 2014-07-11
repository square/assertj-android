// Copyright 2013 Square, Inc.
package org.assertj.android.api.animation;

import android.animation.Animator;
import android.annotation.TargetApi;

import static android.os.Build.VERSION_CODES.HONEYCOMB;

/**
 * Assertions for {@link Animator} instances.
 * <p>
 * This class is final. To extend use {@link AbstractAnimatorAssert}.
 */
@TargetApi(HONEYCOMB)
public final class AnimatorAssert extends AbstractAnimatorAssert<AnimatorAssert, Animator> {
  public AnimatorAssert(Animator actual) {
    super(actual, AnimatorAssert.class);
  }
}
