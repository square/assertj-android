// Copyright 2013 Square, Inc.
package com.squareup.fest.animation;

import android.animation.Animator;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

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

  public S isStarted() {
    isNotNull();
    assertThat(actual.isStarted()) //
        .overridingErrorMessage("Expected to be started but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotStarted() {
    isNotNull();
    assertThat(actual.isStarted()) //
        .overridingErrorMessage("Expected to not be started but was.") //
        .isFalse();
    return myself;
  }
}
