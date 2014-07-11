// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.widget.ViewFlipper;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link ViewFlipper} instances. */
public class ViewFlipperAssert extends AbstractViewAnimatorAssert<ViewFlipperAssert, ViewFlipper> {
  public ViewFlipperAssert(ViewFlipper actual) {
    super(actual, ViewFlipperAssert.class);
  }

  public ViewFlipperAssert isAutoStarting() {
    isNotNull();
    assertThat(actual.isAutoStart()) //
        .overridingErrorMessage("Expected to be auto-starting but was not.") //
        .isTrue();
    return this;
  }

  public ViewFlipperAssert isNotAutoStarting() {
    isNotNull();
    assertThat(actual.isAutoStart()) //
        .overridingErrorMessage("Expected to not be auto-starting but was.") //
        .isTrue();
    return this;
  }

  public ViewFlipperAssert isFlipping() {
    isNotNull();
    assertThat(actual.isFlipping()) //
        .overridingErrorMessage("Expected to be flipping but was not.") //
        .isTrue();
    return this;
  }

  public ViewFlipperAssert isNotFlipping() {
    isNotNull();
    assertThat(actual.isFlipping()) //
        .overridingErrorMessage("Expected to not be flipping but was.") //
        .isFalse();
    return this;
  }
}
