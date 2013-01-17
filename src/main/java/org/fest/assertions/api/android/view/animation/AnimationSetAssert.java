// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.view.animation;

import android.view.animation.AnimationSet;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link AnimationSet} instances. */
public class AnimationSetAssert extends AbstractAnimationAssert<AnimationSetAssert, AnimationSet> {
  public AnimationSetAssert(AnimationSet actual) {
    super(actual, AnimationSetAssert.class);
  }

  public AnimationSetAssert hasDurationHint(long duration) {
    isNotNull();
    long actualDuration = actual.computeDurationHint();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected duration hint <%s> but was <%s>.", duration,
            actualDuration) //
        .isEqualTo(duration);
    return this;
  }

  public AnimationSetAssert hasAnimationCount(int count) {
    isNotNull();
    int actualCount = actual.getAnimations().size();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected animation count <%s> but was <%s>.", count,
            actualCount) //
        .isEqualTo(count);
    return this;
  }
}
