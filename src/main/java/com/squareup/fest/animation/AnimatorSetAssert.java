// Copyright 2013 Square, Inc.
package com.squareup.fest.animation;

import android.animation.AnimatorSet;

import static org.fest.assertions.api.Assertions.assertThat;

public class AnimatorSetAssert extends AbstractAnimatorAssert<AnimatorSetAssert, AnimatorSet> {
  public AnimatorSetAssert(AnimatorSet actual) {
    super(actual, AnimatorSetAssert.class);
  }

  public AnimatorSetAssert hasAnimatorCount(int count) {
    isNotNull();
    int actualCount = actual.getChildAnimations().size();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected animator count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return myself;
  }
}
