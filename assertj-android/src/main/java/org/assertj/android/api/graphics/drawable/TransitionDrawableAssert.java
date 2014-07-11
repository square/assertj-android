// Copyright 2013 Square, Inc.
package org.assertj.android.api.graphics.drawable;

import android.graphics.drawable.TransitionDrawable;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link TransitionDrawable} instances. */
public class TransitionDrawableAssert
    extends AbstractDrawableAssert<TransitionDrawableAssert, TransitionDrawable> {
  public TransitionDrawableAssert(TransitionDrawable actual) {
    super(actual, TransitionDrawableAssert.class);
  }

  public TransitionDrawableAssert isCrossFadeEnabled() {
    isNotNull();
    assertThat(actual.isCrossFadeEnabled()) //
        .overridingErrorMessage("Expected cross-fade to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public TransitionDrawableAssert isCrossFadeDisabled() {
    isNotNull();
    assertThat(actual.isCrossFadeEnabled()) //
        .overridingErrorMessage("Expected cross-fade to be disabled but was enabled.") //
        .isFalse();
    return this;
  }
}
