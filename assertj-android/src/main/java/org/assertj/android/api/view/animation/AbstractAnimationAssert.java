// Copyright 2013 Square, Inc.
package org.assertj.android.api.view.animation;

import android.annotation.TargetApi;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB_MR1;
import static android.view.animation.Animation.INFINITE;
import static android.view.animation.Animation.RESTART;
import static android.view.animation.Animation.REVERSE;
import static org.assertj.android.internal.IntegerUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractAnimationAssert<S extends AbstractAnimationAssert<S, A>, A extends Animation>
    extends AbstractAssert<S, A> {
  protected AbstractAnimationAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  @TargetApi(HONEYCOMB_MR1)
  public S hasBackgroundColor(int color) {
    isNotNull();
    int actualColor = actual.getBackgroundColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected background color <%s> but was <%s>.",
            Integer.toHexString(color), Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return myself;
  }

  public S hasDuration(long duration) {
    isNotNull();
    long actualDuration = actual.getDuration();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected duration <%s> but was <%s>.", duration, actualDuration) //
        .isEqualTo(duration);
    return myself;
  }

  public S isFillingAfter() {
    isNotNull();
    assertThat(actual.getFillAfter()) //
        .overridingErrorMessage("Expected to be filling after but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotFillingAfter() {
    isNotNull();
    assertThat(actual.getFillAfter()) //
        .overridingErrorMessage("Expected to not be filling after but was.") //
        .isFalse();
    return myself;
  }

  public S isFillingBefore() {
    isNotNull();
    assertThat(actual.getFillBefore()) //
        .overridingErrorMessage("Expected to be filling before but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotFillingBefore() {
    isNotNull();
    assertThat(actual.getFillBefore()) //
        .overridingErrorMessage("Expected to not be filling before but was.") //
        .isFalse();
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

  public S hasRepeatCount(int count) {
    isNotNull();
    int actualCount = actual.getRepeatCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected repeat count <%s> but was <%s>.",
            repeatCountToString(count), repeatCountToString(actualCount)) //
        .isEqualTo(count);
    return myself;
  }

  public S hasRepeatMode(@AnimationRepeatMode int mode) {
    isNotNull();
    int actualMode = actual.getRepeatMode();
    //noinspection ResourceType
    assertThat(actualMode) //
        .overridingErrorMessage("Expected repeat mode <%s> but was <%s>.", repeatModeToString(mode),
            repeatModeToString(actualMode)) //
        .isEqualTo(mode);
    return myself;
  }

  public S hasStartOffset(long offset) {
    isNotNull();
    long actualOffset = actual.getStartOffset();
    assertThat(actualOffset) //
        .overridingErrorMessage("Expected start offset <%s> but was <%s>.", offset, actualOffset) //
        .isEqualTo(offset);
    return myself;
  }

  public S hasStartTime(long time) {
    isNotNull();
    long actualTime = actual.getStartTime();
    assertThat(actualTime) //
        .overridingErrorMessage("Expected start time <%s> but was <%s>.", time, actualTime) //
        .isEqualTo(time);
    return myself;
  }

  public S hasZAdjustment(int adjustment) {
    isNotNull();
    int actualAdjustment = actual.getZAdjustment();
    assertThat(actualAdjustment) //
        .overridingErrorMessage("Expected Z adjustment <%s> but was <%s>.", adjustment,
            actualAdjustment) //
        .isEqualTo(adjustment);
    return myself;
  }

  public S isEnded() {
    isNotNull();
    assertThat(actual.hasEnded()) //
        .overridingErrorMessage("Expected to be ended but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotEnded() {
    isNotNull();
    assertThat(actual.hasEnded()) //
        .overridingErrorMessage("Expected to not be ended but was.") //
        .isFalse();
    return myself;
  }

  public S isStarted() {
    isNotNull();
    assertThat(actual.hasStarted()) //
        .overridingErrorMessage("Expected to be started but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotStarted() {
    isNotNull();
    assertThat(actual.hasStarted()) //
        .overridingErrorMessage("Expected to not be started but was.") //
        .isFalse();
    return myself;
  }

  public S isFillEnabled() {
    isNotNull();
    assertThat(actual.isFillEnabled()) //
        .overridingErrorMessage("Expected fill to be enabled but was disabled.") //
        .isTrue();
    return myself;
  }

  public S isFillDisabled() {
    isNotNull();
    assertThat(actual.isFillEnabled()) //
        .overridingErrorMessage("Expected fill to be disabled but was enabled.") //
        .isFalse();
    return myself;
  }

  public S isInitialized() {
    isNotNull();
    assertThat(actual.isInitialized()) //
        .overridingErrorMessage("Expected to be initialized but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotInitialized() {
    isNotNull();
    assertThat(actual.isInitialized()) //
        .overridingErrorMessage("Expected to not be initialized but was.") //
        .isFalse();
    return myself;
  }

  public S isChangingBounds() {
    isNotNull();
    assertThat(actual.willChangeBounds()) //
        .overridingErrorMessage("Expected to be changing bounds but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotChangingBounds() {
    isNotNull();
    assertThat(actual.willChangeBounds()) //
        .overridingErrorMessage("Expected to not be changing bounds but was.") //
        .isFalse();
    return myself;
  }

  public S isChangingTransformationMatrix() {
    isNotNull();
    assertThat(actual.willChangeTransformationMatrix()) //
        .overridingErrorMessage("Expected to be changing transformation matrix but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotChangingTransformationMatrix() {
    isNotNull();
    assertThat(actual.willChangeTransformationMatrix()) //
        .overridingErrorMessage("Expected to not be changing transformation matrix but was.") //
        .isFalse();
    return myself;
  }

  public static String repeatCountToString(int count) {
    return buildNamedValueString(count)
        .value(INFINITE, "infinite")
        .getOrValue();
  }

  public static String repeatModeToString(@AnimationRepeatMode int mode) {
    return buildNamedValueString(mode)
        .value(RESTART, "restart")
        .value(REVERSE, "reverse")
        .get();
  }
}
