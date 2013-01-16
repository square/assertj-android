// Copyright 2013 Square, Inc.
package com.squareup.fest.animation;

import android.animation.ObjectAnimator;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link ObjectAnimator} instances. */
public class ObjectAnimatorAssert
    extends AbstractValueAnimatorAssert<ObjectAnimatorAssert, ObjectAnimator> {
  public ObjectAnimatorAssert(ObjectAnimator actual) {
    super(actual, ObjectAnimatorAssert.class);
  }

  public ObjectAnimatorAssert hasPropertyName(String name) {
    isNotNull();
    String actualName = actual.getPropertyName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected property name <%s> but was <%s>.", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public ObjectAnimatorAssert hasTarget(Object target) {
    isNotNull();
    Object actualTarget = actual.getTarget();
    assertThat(actualTarget) //
        .overridingErrorMessage("Expected target <%s> but was <%s>.", target, actualTarget) //
        .isSameAs(target);
    return this;
  }
}
