// Copyright 2013 Square, Inc.
package com.squareup.fest.view.animation;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LayoutAnimationController;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractLayoutAnimationControllerAssert<S extends AbstractLayoutAnimationControllerAssert<S, A>, A extends LayoutAnimationController>
    extends AbstractAssert<S, A> {
  protected AbstractLayoutAnimationControllerAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasAnimation(Animation animation) {
    isNotNull();
    Animation actualAnimation = actual.getAnimation();
    assertThat(actualAnimation) //
        .overridingErrorMessage("Expected animation <%s> but was <%s>.", animation,
            actualAnimation) //
        .isSameAs(animation);
    return myself;
  }

  public S hasDelay(float delay) {
    isNotNull();
    float actualDelay = actual.getDelay();
    assertThat(actualDelay) //
        .overridingErrorMessage("Expected delay <%s> but was <%s>.", delay, actualDelay) //
        .isEqualTo(delay);
    return myself;
  }

  public S hasInterpolator(Interpolator interpolator) {
    isNotNull();
    Interpolator actualInterpolator = actual.getInterpolator();
    assertThat(actualInterpolator) //
        .overridingErrorMessage("Expected interpolator <%s> but was <%s>.", interpolator,
            actualInterpolator) //
        .isSameAs(interpolator);
    return myself;
  }

  public S hasOrder(int order) {
    isNotNull();
    int actualOrder = actual.getOrder();
    assertThat(actualOrder) //
        .overridingErrorMessage("Expected order <%s> but was <%s>.", order, actualOrder) //
        .isEqualTo(order);
    return myself;
  }

  public S isDone() {
    isNotNull();
    assertThat(actual.isDone()) //
        .overridingErrorMessage("Expected to be done but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotDone() {
    isNotNull();
    assertThat(actual.isDone()) //
        .overridingErrorMessage("Expected to not be done but was.") //
        .isFalse();
    return myself;
  }

  public S isOverlapping() {
    isNotNull();
    assertThat(actual.willOverlap()) //
        .overridingErrorMessage("Expected to be overlapping but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotOverlapping() {
    isNotNull();
    assertThat(actual.willOverlap()) //
        .overridingErrorMessage("Expected to not be overlapping but was.") //
        .isFalse();
    return myself;
  }
}
