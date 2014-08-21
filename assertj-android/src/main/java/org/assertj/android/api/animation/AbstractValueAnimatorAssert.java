// Copyright 2013 Square, Inc.
package org.assertj.android.api.animation;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;

import static android.animation.ValueAnimator.INFINITE;
import static android.animation.ValueAnimator.RESTART;
import static android.animation.ValueAnimator.REVERSE;
import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.os.Build.VERSION_CODES.HONEYCOMB_MR1;
import static org.assertj.android.internal.IntegerUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(HONEYCOMB)
public abstract class AbstractValueAnimatorAssert<S extends AbstractValueAnimatorAssert<S, A>, A extends ValueAnimator>
    extends AbstractAnimatorAssert<S, A> {
  protected AbstractValueAnimatorAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  @TargetApi(HONEYCOMB_MR1)
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

  public S hasRepeatMode(@ValueAnimatorRepeatMode int mode) {
    isNotNull();
    int actualMode = actual.getRepeatMode();
    //noinspection ResourceType
    assertThat(actualMode) //
        .overridingErrorMessage("Expected repeat mode <%s> but was <%s>.", repeatModeToString(mode),
            repeatModeToString(actualMode)) //
        .isEqualTo(mode);
    return myself;
  }

  public static String repeatCountToString(int count) {
    return buildNamedValueString(count)
        .value(INFINITE, "infinite")
        .getOrValue();
  }

  public static String repeatModeToString(@ValueAnimatorRepeatMode int mode) {
    return buildNamedValueString(mode)
        .value(RESTART, "restart")
        .value(REVERSE, "reverse")
        .get();
  }
}
