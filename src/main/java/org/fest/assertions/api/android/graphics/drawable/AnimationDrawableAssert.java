// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.graphics.drawable;

import android.graphics.drawable.AnimationDrawable;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link AnimationDrawable} instances. */
public class AnimationDrawableAssert
    extends AbstractDrawableAssert<AnimationDrawableAssert, AnimationDrawable> {
  public AnimationDrawableAssert(AnimationDrawable actual) {
    super(actual, AnimationDrawableAssert.class);
  }

  public AnimationDrawableAssert hasFrameCount(int count) {
    isNotNull();
    int actualCount = actual.getNumberOfFrames();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected frame count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public AnimationDrawableAssert isOneShot() {
    isNotNull();
    assertThat(actual.isOneShot()) //
        .overridingErrorMessage("Expected to be one-short but was not.") //
        .isTrue();
    return this;
  }

  public AnimationDrawableAssert isNotOneShot() {
    isNotNull();
    assertThat(actual.isOneShot()) //
        .overridingErrorMessage("Expected to not be one-shot but was.") //
        .isFalse();
    return this;
  }

  public AnimationDrawableAssert isRunning() {
    isNotNull();
    assertThat(actual.isRunning()) //
        .overridingErrorMessage("Expected to be running but was not.") //
        .isTrue();
    return this;
  }

  public AnimationDrawableAssert isNotRunning() {
    isNotNull();
    assertThat(actual.isRunning()) //
        .overridingErrorMessage("Expected to not be running but was.") //
        .isFalse();
    return this;
  }
}
