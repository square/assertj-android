// Copyright 2013 Square, Inc.
package org.assertj.android.api.animation;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link ObjectAnimator} instances. */
@TargetApi(HONEYCOMB)
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
