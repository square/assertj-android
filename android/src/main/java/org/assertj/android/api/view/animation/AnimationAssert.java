// Copyright 2013 Square, Inc.
package org.assertj.android.api.view.animation;

import android.view.animation.Animation;

/**
 * Assertions for {@link Animation} instances.
 * <p>
 * This class is final. To extend use {@link AbstractAnimationAssert}.
 */
public final class AnimationAssert extends AbstractAnimationAssert<AnimationAssert, Animation> {
  public AnimationAssert(Animation actual) {
    super(actual, AnimationAssert.class);
  }
}
