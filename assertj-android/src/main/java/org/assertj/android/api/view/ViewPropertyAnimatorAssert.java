package org.assertj.android.api.view;

import android.annotation.TargetApi;
import android.view.ViewPropertyAnimator;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB_MR1;
import static android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link ViewPropertyAnimator} instances. */
@TargetApi(HONEYCOMB_MR1)
public class ViewPropertyAnimatorAssert
    extends AbstractAssert<ViewPropertyAnimatorAssert, ViewPropertyAnimator> {
  public ViewPropertyAnimatorAssert(ViewPropertyAnimator actual) {
    super(actual, ViewPropertyAnimatorAssert.class);
  }

  @TargetApi(ICE_CREAM_SANDWICH)
  public ViewPropertyAnimatorAssert hasDuration(long duration) {
    isNotNull();
    long actualDuration = actual.getDuration();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected duration <%s> but was <%s>", duration, actualDuration) //
        .isEqualTo(duration);
    return this;
  }

  @TargetApi(ICE_CREAM_SANDWICH)
  public ViewPropertyAnimatorAssert hasStartDelay(long delay) {
    isNotNull();
    long actualDelay = actual.getStartDelay();
    assertThat(actualDelay) //
        .overridingErrorMessage("Expected start delay <%s> but was <%s>", delay, actualDelay) //
        .isEqualTo(delay);
    return this;
  }
}
