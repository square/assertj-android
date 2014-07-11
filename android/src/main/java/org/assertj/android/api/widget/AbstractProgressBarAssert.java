// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;
import org.assertj.android.api.view.AbstractViewAssert;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractProgressBarAssert<S extends AbstractProgressBarAssert<S, A>, A extends ProgressBar>
    extends AbstractViewAssert<S, A> {
  protected AbstractProgressBarAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasIndeterminateDrawable(Drawable drawable) {
    isNotNull();
    Drawable actualDrawable = actual.getIndeterminateDrawable();
    assertThat(actualDrawable) //
        .overridingErrorMessage("Expected indeterminate drawable <%s> but was <%s>.", drawable,
            actualDrawable) //
        .isSameAs(drawable);
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

  public S hasMaximum(int maximum) {
    isNotNull();
    int actualMaximum = actual.getMax();
    assertThat(actualMaximum) //
        .overridingErrorMessage("Expected maximum <%s> but was <%s>.", maximum, actualMaximum) //
        .isEqualTo(maximum);
    return myself;
  }

  public S hasProgress(int progress) {
    isNotNull();
    int actualProgress = actual.getProgress();
    assertThat(actualProgress) //
        .overridingErrorMessage("Expected progress <%s> but was <%s>.", progress, actualProgress) //
        .isEqualTo(progress);
    return myself;
  }

  public S hasProgressDrawable(Drawable drawable) {
    isNotNull();
    Drawable actualDrawable = actual.getProgressDrawable();
    assertThat(actualDrawable) //
        .overridingErrorMessage("Expected progress drawable <%s> but was <%s>.", drawable,
            actualDrawable) //
        .isSameAs(drawable);
    return myself;
  }

  public S hasSecondaryProgress(int progress) {
    isNotNull();
    int actualProgress = actual.getSecondaryProgress();
    assertThat(actualProgress) //
        .overridingErrorMessage("Expected secondary progress <%s> but was <%s>.", progress,
            actualProgress) //
        .isEqualTo(progress);
    return myself;
  }

  public S isIndeterminate() {
    isNotNull();
    assertThat(actual.isIndeterminate()) //
        .overridingErrorMessage("Expected to be indeterminate but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotIndeterminate() {
    isNotNull();
    assertThat(actual.isIndeterminate()) //
        .overridingErrorMessage("Expected to not be indeterminate but was.") //
        .isFalse();
    return myself;
  }
}
