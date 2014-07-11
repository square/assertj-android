// Copyright 2013 Square, Inc.
package org.assertj.android.api.view.animation;

import android.view.animation.LayoutAnimationController;

/**
 * Assertions for {@link LayoutAnimationController} instances.
 * <p>
 * This class is final. To extend use {@link AbstractLayoutAnimationControllerAssert}.
 */
public class LayoutAnimationControllerAssert extends
    AbstractLayoutAnimationControllerAssert<LayoutAnimationControllerAssert, LayoutAnimationController> {
  public LayoutAnimationControllerAssert(LayoutAnimationController actual) {
    super(actual, LayoutAnimationControllerAssert.class);
  }
}
