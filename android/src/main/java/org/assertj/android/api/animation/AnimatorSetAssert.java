// Copyright 2013 Square, Inc.
package org.assertj.android.api.animation;

import android.animation.AnimatorSet;
import android.annotation.TargetApi;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(HONEYCOMB)
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
