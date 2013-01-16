// Copyright 2013 Square, Inc.
package com.squareup.fest.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.squareup.fest.Assertions;
import java.util.ArrayList;

public class AnimatorSetAssert extends AbstractAnimatorAssert<AnimatorSetAssert, AnimatorSet> {
  public AnimatorSetAssert(AnimatorSet actual) {
    super(actual, AnimatorSetAssert.class);
  }

  public AnimatorSetAssert hasAnimatorCount(int count) {
    isNotNull();
    ArrayList<Animator> childAnimations = actual.getChildAnimations();
    int actualCount = childAnimations != null ? childAnimations.size() : -1;
    Assertions.assertThat(childAnimations) //
        .overridingErrorMessage("Expected animator count <%s> but was <%s>.", count, actualCount) //
        .hasSize(count);
    return myself;
  }
}
