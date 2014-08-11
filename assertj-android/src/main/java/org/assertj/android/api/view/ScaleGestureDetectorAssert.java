package org.assertj.android.api.view;

import android.annotation.TargetApi;
import android.view.ScaleGestureDetector;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.FROYO;
import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.os.Build.VERSION_CODES.KITKAT;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link ScaleGestureDetector} instances. */
@TargetApi(FROYO)
public class ScaleGestureDetectorAssert
    extends AbstractAssert<ScaleGestureDetectorAssert, ScaleGestureDetector> {
  public ScaleGestureDetectorAssert(ScaleGestureDetector actual) {
    super(actual, ScaleGestureDetectorAssert.class);
  }

  public ScaleGestureDetectorAssert hasCurrentSpan(float span) {
    isNotNull();
    float actualSpan = actual.getCurrentSpan();
    assertThat(actualSpan) //
        .overridingErrorMessage("Expected current span <%s> but was <%s>.", span, actualSpan) //
        .isEqualTo(span);
    return this;
  }

  @TargetApi(HONEYCOMB)
  public ScaleGestureDetectorAssert hasCurrentSpanX(float span) {
    isNotNull();
    float actualSpan = actual.getCurrentSpanX();
    assertThat(actualSpan) //
        .overridingErrorMessage("Expected current X span <%s> but was <%s>.", span, actualSpan) //
        .isEqualTo(span);
    return this;
  }

  @TargetApi(HONEYCOMB)
  public ScaleGestureDetectorAssert hasCurrentSpanY(float span) {
    isNotNull();
    float actualSpan = actual.getCurrentSpanY();
    assertThat(actualSpan) //
        .overridingErrorMessage("Expected current Y span <%s> but was <%s>.", span, actualSpan) //
        .isEqualTo(span);
    return this;
  }

  public ScaleGestureDetectorAssert hasEventTime(long time) {
    isNotNull();
    long actualTime = actual.getEventTime();
    assertThat(actualTime) //
        .overridingErrorMessage("Expected event time <%s> but was <%s>.", time, actualTime) //
        .isEqualTo(time);
    return this;
  }

  public ScaleGestureDetectorAssert hasFocusX(float focus) {
    isNotNull();
    float actualFocus = actual.getFocusX();
    assertThat(actualFocus) //
        .overridingErrorMessage("Expected X focus <%s> but was <%s>.", focus, actualFocus) //
        .isEqualTo(focus);
    return this;
  }

  public ScaleGestureDetectorAssert hasFocusY(float focus) {
    isNotNull();
    float actualFocus = actual.getFocusY();
    assertThat(actualFocus) //
        .overridingErrorMessage("Expected Y focus <%s> but was <%s>.", focus, actualFocus) //
        .isEqualTo(focus);
    return this;
  }

  public ScaleGestureDetectorAssert hasPreviousSpan(float span) {
    isNotNull();
    float actualSpan = actual.getPreviousSpan();
    assertThat(actualSpan) //
        .overridingErrorMessage("Expected previous span <%s> but was <%s>.", span, actualSpan) //
        .isEqualTo(span);
    return this;
  }

  @TargetApi(HONEYCOMB)
  public ScaleGestureDetectorAssert hasPreviousSpanX(float span) {
    isNotNull();
    float actualSpan = actual.getPreviousSpanX();
    assertThat(actualSpan) //
        .overridingErrorMessage("Expected previous X span <%s> but was <%s>.", span, actualSpan) //
        .isEqualTo(span);
    return this;
  }

  @TargetApi(HONEYCOMB)
  public ScaleGestureDetectorAssert hasPreviousSpanY(float span) {
    isNotNull();
    float actualSpan = actual.getPreviousSpanY();
    assertThat(actualSpan) //
        .overridingErrorMessage("Expected previous Y span <%s> but was <%s>.", span, actualSpan) //
        .isEqualTo(span);
    return this;
  }

  public ScaleGestureDetectorAssert hasScaleFactor(float factor) {
    isNotNull();
    float actualFactor = actual.getScaleFactor();
    assertThat(actualFactor) //
        .overridingErrorMessage("Expected scale factor <%s> but was <%s>.", factor, actualFactor) //
        .isEqualTo(factor);
    return this;
  }

  public ScaleGestureDetectorAssert hasTimeDelta(long delta) {
    isNotNull();
    long actualDelta = actual.getTimeDelta();
    assertThat(actualDelta) //
        .overridingErrorMessage("Expected time delta <%s> but was <%s>.", delta, actualDelta) //
        .isEqualTo(delta);
    return this;
  }

  public ScaleGestureDetectorAssert isInProgress() {
    isNotNull();
    assertThat(actual.isInProgress()) //
        .overridingErrorMessage("Expected to be in progress but was not in progress.") //
        .isTrue();
    return this;
  }

  public ScaleGestureDetectorAssert isNotInProgress() {
    isNotNull();
    assertThat(actual.isInProgress()) //
        .overridingErrorMessage("Expected to not be in progress but was in progress.") //
        .isFalse();
    return this;
  }

  @TargetApi(KITKAT)
  public ScaleGestureDetectorAssert isQuickScaleEnabled() {
    isNotNull();
    assertThat(actual.isQuickScaleEnabled()) //
        .overridingErrorMessage("Expected to have quick scale enabled but was not.") //
        .isTrue();
    return this;
  }

  @TargetApi(KITKAT)
  public ScaleGestureDetectorAssert isQuickScaleDisabled() {
    isNotNull();
    assertThat(actual.isQuickScaleEnabled()) //
        .overridingErrorMessage("Expected to have quick scale disabled but was not.") //
        .isFalse();
    return this;
  }
}
