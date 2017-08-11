// Copyright 2013 Square, Inc.
package org.assertj.android.api.gesture;

import android.gesture.GestureOverlayView;
import org.assertj.android.api.widget.AbstractFrameLayoutAssert;

import static android.gesture.GestureOverlayView.GESTURE_STROKE_TYPE_MULTIPLE;
import static android.gesture.GestureOverlayView.GESTURE_STROKE_TYPE_SINGLE;
import static android.gesture.GestureOverlayView.ORIENTATION_HORIZONTAL;
import static android.gesture.GestureOverlayView.ORIENTATION_VERTICAL;
import static org.assertj.android.internal.BitmaskUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link GestureOverlayView} instances. */
public class GestureOverlayViewAssert
    extends AbstractFrameLayoutAssert<GestureOverlayViewAssert, GestureOverlayView> {
  public GestureOverlayViewAssert(GestureOverlayView actual) {
    super(actual, GestureOverlayViewAssert.class);
  }

  public GestureOverlayViewAssert hasFadeOffset(long offset) {
    isNotNull();
    long actualOffset = actual.getFadeOffset();
    assertThat(actualOffset) //
        .overridingErrorMessage("Expected fade offset <%s> but was <%s>.", offset, actualOffset) //
        .isEqualTo(offset);
    return this;
  }

  public GestureOverlayViewAssert hasGestureColor(int color) {
    isNotNull();
    int actualColor = actual.getGestureColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected gesture color <%s> but was <%s>.",
            Integer.toHexString(color), Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return this;
  }

  public GestureOverlayViewAssert hasGestureStrokeAngleThreshold(float threshold) {
    isNotNull();
    float actualThreshold = actual.getGestureStrokeAngleThreshold();
    assertThat(actualThreshold) //
        .overridingErrorMessage("Expected gesture stroke angle threshold <%s> but was <%s>.",
            threshold, actualThreshold) //
        .isEqualTo(threshold);
    return this;
  }

  public GestureOverlayViewAssert hasGestureStrokeLengthThreshold(float threshold) {
    isNotNull();
    float actualThreshold = actual.getGestureStrokeLengthThreshold();
    assertThat(actualThreshold) //
        .overridingErrorMessage("Expected gesture stroke length threshold <%s> but was <%s>.",
            threshold, actualThreshold) //
        .isEqualTo(threshold);
    return this;
  }

  public GestureOverlayViewAssert hasGestureStrokeSquarenessThreshold(float threshold) {
    isNotNull();
    float actualThreshold = actual.getGestureStrokeSquarenessTreshold();
    assertThat(actualThreshold) //
        .overridingErrorMessage("Expected gesture stroke squareness threshold <%s> but was <%s>.",
            threshold, actualThreshold) //
        .isEqualTo(threshold);
    return this;
  }

  public GestureOverlayViewAssert hasGestureStokeType(@GestureOverlayViewGestureStrokeType int type) {
    isNotNull();
    int actualType = actual.getGestureStrokeType();
    //noinspection ResourceType
    assertThat(actualType) //
        .overridingErrorMessage("Expected gesture stroke type <%s> but was <%s>.",
            gestureStrokeTypeToString(type), gestureStrokeTypeToString(actualType)) //
        .isEqualTo(type);
    return this;
  }

  public GestureOverlayViewAssert hasGestureStrokeWidth(float width) {
    isNotNull();
    float actualWidth = actual.getGestureStrokeWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected gesture stroke width <%s> but was <%s>.", width,
            actualWidth) //
        .isEqualTo(width);
    return this;
  }

  public GestureOverlayViewAssert hasOrientation(@GestureOverlayViewOrientation int orientation) {
    isNotNull();
    int actualOrientation = actual.getOrientation();
    //noinspection ResourceType
    assertThat(actualOrientation) //
        .overridingErrorMessage("Expected orientation <%s> but was <%s>.",
            orientationToString(orientation), orientationToString(actualOrientation)) //
        .isEqualTo(orientation);
    return this;
  }

  public GestureOverlayViewAssert hasUncertainGestureColor(int color) {
    isNotNull();
    int actualColor = actual.getUncertainGestureColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected uncertain gesture color <%s> but was <%s>.",
            Integer.toHexString(color), Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return this;
  }

  public GestureOverlayViewAssert isInterceptingEvents() {
    isNotNull();
    assertThat(actual.isEventsInterceptionEnabled()) //
        .overridingErrorMessage("Expected to be intercepting events but was not.") //
        .isTrue();
    return this;
  }

  public GestureOverlayViewAssert isNotInterceptingEvents() {
    isNotNull();
    assertThat(actual.isEventsInterceptionEnabled()) //
        .overridingErrorMessage("Expected to not be intercepting events but was.") //
        .isFalse();
    return this;
  }

  public GestureOverlayViewAssert isFadeEnabled() {
    isNotNull();
    assertThat(actual.isFadeEnabled()) //
        .overridingErrorMessage("Expected to have fade enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public GestureOverlayViewAssert isFadeDisabled() {
    isNotNull();
    assertThat(actual.isFadeEnabled()) //
        .overridingErrorMessage("Expected to have fade disabled but was enabled.") //
        .isFalse();
    return this;
  }

  public GestureOverlayViewAssert isGestureVisible() {
    isNotNull();
    assertThat(actual.isGestureVisible()) //
        .overridingErrorMessage("Expected gesture to be visible but was not.") //
        .isTrue();
    return this;
  }

  public GestureOverlayViewAssert isGestureNotVisible() {
    isNotNull();
    assertThat(actual.isGestureVisible()) //
        .overridingErrorMessage("Expected gesture to not be visible but was.") //
        .isFalse();
    return this;
  }

  public GestureOverlayViewAssert isGesturing() {
    isNotNull();
    assertThat(actual.isGesturing()) //
        .overridingErrorMessage("Expected to be gesturing but was not.") //
        .isTrue();
    return this;
  }

  public GestureOverlayViewAssert isNotGesturing() {
    isNotNull();
    assertThat(actual.isGesturing()) //
        .overridingErrorMessage("Expected to not be gesturing but was.") //
        .isFalse();
    return this;
  }

  public static String gestureStrokeTypeToString(@GestureOverlayViewGestureStrokeType int type) {
    return buildNamedValueString(type)
        .value(GESTURE_STROKE_TYPE_SINGLE, "single")
        .value(GESTURE_STROKE_TYPE_MULTIPLE, "multiple")
        .get();
  }

  public static String orientationToString(@GestureOverlayViewOrientation int orientation) {
    return buildNamedValueString(orientation)
        .value(ORIENTATION_HORIZONTAL, "horizontal")
        .value(ORIENTATION_VERTICAL, "vertical")
        .get();
  }
}
