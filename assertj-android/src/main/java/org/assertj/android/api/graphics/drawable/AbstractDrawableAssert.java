// Copyright 2013 Square, Inc.
package org.assertj.android.api.graphics.drawable;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractDrawableAssert<S extends AbstractDrawableAssert<S, A>, A extends Drawable>
    extends AbstractAssert<S, A> {
  protected AbstractDrawableAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasBounds(Rect bounds) {
    isNotNull();
    Rect actualBounds = actual.getBounds();
    assertThat(actualBounds) //
        .overridingErrorMessage("Expected bounds <%s> but was <%s>.", bounds, actualBounds) //
        .isEqualTo(bounds);
    return myself;
  }

  @TargetApi(HONEYCOMB)
  public S hasCallback(Drawable.Callback callback) {
    isNotNull();
    Drawable.Callback actualCallback = actual.getCallback();
    assertThat(actualCallback) //
        .overridingErrorMessage("Expected callback <%s> but was <%s>.", callback, actualCallback) //
        .isSameAs(callback);
    return myself;
  }

  public S hasChangingConfigurations(int mask) {
    isNotNull();
    int actualMask = actual.getChangingConfigurations();
    assertThat(actualMask) //
        .overridingErrorMessage("Expected changing configurations <%s> but was <%s>.", mask,
            actualMask) //
        .isEqualTo(mask);
    return myself;
  }

  public S hasConstantState(Drawable.ConstantState state) {
    isNotNull();
    Drawable.ConstantState actualState = actual.getConstantState();
    assertThat(actualState) //
        .overridingErrorMessage("Expected constant state <%s> but was <%s>.", state, actualState) //
        .isEqualTo(state);
    return myself;
  }

  public S hasIntrinsicHeight(int height) {
    isNotNull();
    int actualHeight = actual.getIntrinsicHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected intrinsic height <%s> but was <%s>.", height,
            actualHeight) //
        .isEqualTo(height);
    return myself;
  }

  public S hasIntrinsicWidth(int width) {
    isNotNull();
    int actualWidth = actual.getIntrinsicWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected intrinsic width <%s> but was <%s>.", width,
            actualWidth) //
        .isEqualTo(width);
    return myself;
  }

  public S hasLevel(int level) {
    isNotNull();
    int actualLevel = actual.getLevel();
    assertThat(actualLevel) //
        .overridingErrorMessage("Expected level <%s> but was <%s>.", level, actualLevel) //
        .isEqualTo(level);
    return myself;
  }

  public S hasMinimumHeight(int height) {
    isNotNull();
    int actualHeight = actual.getMinimumHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected minimum height <%s> but was <%s>.", height,
            actualHeight) //
        .isEqualTo(height);
    return myself;
  }

  public S hasMinimumWidth(int width) {
    isNotNull();
    int actualHeight = actual.getMinimumWidth();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected minimum width <%s> but was <%s>.", width,
            actualHeight) //
        .isEqualTo(width);
    return myself;
  }

  public S hasOpacity(int opacity) {
    isNotNull();
    int actualOpacity = actual.getOpacity();
    assertThat(actualOpacity) //
        .overridingErrorMessage("Expected opacity <%s> but was <%s>.", opacity, actualOpacity) //
        .isEqualTo(opacity);
    return myself;
  }

  public S isStateful() {
    isNotNull();
    assertThat(actual.isStateful()) //
        .overridingErrorMessage("Expected to be stateful but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotStateful() {
    isNotNull();
    assertThat(actual.isStateful()) //
        .overridingErrorMessage("Expected to not be stateful but was.") //
        .isFalse();
    return myself;
  }

  public S isVisible() {
    isNotNull();
    assertThat(actual.isVisible()) //
        .overridingErrorMessage("Expected to be visible but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotVisible() {
    isNotNull();
    assertThat(actual.isVisible()) //
        .overridingErrorMessage("Expected to not be visible but was.") //
        .isFalse();
    return myself;
  }
}
