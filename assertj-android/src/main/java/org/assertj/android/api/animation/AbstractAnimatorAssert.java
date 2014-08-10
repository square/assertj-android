// Copyright 2013 Square, Inc.
package org.assertj.android.api.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH;
import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR2;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(HONEYCOMB)
public abstract class AbstractAnimatorAssert<S extends AbstractAnimatorAssert<S, A>, A extends Animator>
    extends AbstractAssert<S, A> {
  protected AbstractAnimatorAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasDuration(long duration) {
    isNotNull();
    long actualDuration = actual.getDuration();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected duration <%s> but was <%s>.", duration, actualDuration) //
        .isEqualTo(duration);
    return myself;
  }

  @TargetApi(JELLY_BEAN_MR2)
  public S hasInterpolator(TimeInterpolator interpolator) {
    isNotNull();
    TimeInterpolator actualInterpolator = actual.getInterpolator();
    assertThat(actualInterpolator) //
        .overridingErrorMessage("Expected interpolator <%s> but was <%s>.", interpolator,
            actualInterpolator) //
        .isEqualTo(interpolator);
    return myself;
  }

  public S hasListener(Animator.AnimatorListener listener) {
    isNotNull();
    assertThat(actual.getListeners()) //
        .overridingErrorMessage("Expected listener <%s> but was not present.") //
        .contains(listener);
    return myself;
  }

  public S hasStartDelay(long delay) {
    isNotNull();
    long actualDelay = actual.getStartDelay();
    assertThat(actualDelay) //
        .overridingErrorMessage("Expected start delay <%s> but was <%s>.", delay, actualDelay) //
        .isEqualTo(delay);
    return myself;
  }

  public S isRunning() {
    isNotNull();
    assertThat(actual.isRunning()) //
        .overridingErrorMessage("Expected to be running but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotRunning() {
    isNotNull();
    assertThat(actual.isRunning()) //
        .overridingErrorMessage("Expected to not be running but was.") //
        .isFalse();
    return myself;
  }

  @TargetApi(ICE_CREAM_SANDWICH)
  public S isStarted() {
    isNotNull();
    assertThat(actual.isStarted()) //
        .overridingErrorMessage("Expected to be started but was not.") //
        .isTrue();
    return myself;
  }

  @TargetApi(ICE_CREAM_SANDWICH)
  public S isNotStarted() {
    isNotNull();
    assertThat(actual.isStarted()) //
        .overridingErrorMessage("Expected to not be started but was.") //
        .isFalse();
    return myself;
  }
}
