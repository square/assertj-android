// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.animation;

import android.animation.ValueAnimator;

import static android.animation.ValueAnimator.INFINITE;
import static android.animation.ValueAnimator.RESTART;
import static android.animation.ValueAnimator.REVERSE;
import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractValueAnimatorAssert<S extends AbstractValueAnimatorAssert<S, A>, A extends ValueAnimator>
    extends AbstractAnimatorAssert<S, A> {
  protected AbstractValueAnimatorAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasAnimatedFraction(float fraction) {
    isNotNull();
    float actualFraction = actual.getAnimatedFraction();
    assertThat(actualFraction) //
        .overridingErrorMessage("Expected animated fraction <%s> but was <%s>.", fraction,
            actualFraction) //
        .isEqualTo(fraction);
    return myself;
  }

  public S hasAnimatedValue(Object value) {
    isNotNull();
    Object actualValue = actual.getAnimatedValue();
    assertThat(actualValue) //
        .overridingErrorMessage("Expected animated value <%s> but was <%s>.", value, actualValue) //
        .isEqualTo(value);
    return myself;
  }

  public S hasCurrentPlayTime(long time) {
    isNotNull();
    long actualTime = actual.getCurrentPlayTime();
    assertThat(actualTime) //
        .overridingErrorMessage("Expected current play time <%s> but was <%s>.", time,
            actualTime) //
        .isEqualTo(time);
    return myself;
  }

  public S hasRepeatCount(int count) {
    isNotNull();
    int actualCount = actual.getRepeatCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected repeat count <%s> but was <%s>.",
            repeatCountToString(count), repeatCountToString(actualCount)) //
        .isEqualTo(count);
    return myself;
  }

  public S hasRepeatMode(int mode) {
    isNotNull();
    int actualMode = actual.getRepeatMode();
    assertThat(actualMode) //
        .overridingErrorMessage("Expected repeat mode <%s> but was <%s>.", repeatModeToString(mode),
            repeatModeToString(actualMode)) //
        .isEqualTo(mode);
    return myself;
  }

  private static String repeatCountToString(int count) {
    if (count == INFINITE) {
      return "infinite";
    }
    return Integer.toString(count);
  }

  private static String repeatModeToString(int mode) {
    switch (mode) {
      case RESTART:
        return "restart";
      case REVERSE:
        return "reverse";
      default:
        throw new IllegalArgumentException("Unknown repeat mode: " + mode);
    }
  }
}
