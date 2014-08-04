package org.assertj.android.recyclerview.v7.api.widget;

import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link RecyclerView.SmoothScroller.Action} instances. */
public class RecyclerViewSmoothScrollerActionAssert extends
    AbstractAssert<RecyclerViewSmoothScrollerActionAssert, RecyclerView.SmoothScroller.Action> {
  public RecyclerViewSmoothScrollerActionAssert(RecyclerView.SmoothScroller.Action actual) {
    super(actual, RecyclerViewSmoothScrollerActionAssert.class);
  }

  public RecyclerViewSmoothScrollerActionAssert hasDx(int dx) {
    isNotNull();
    int actualDx = actual.getDx();
    assertThat(actualDx) //
        .overridingErrorMessage("Expected dx <%s> but was <%s>.", dx, actualDx) //
        .isEqualTo(dx);
    return this;
  }

  public RecyclerViewSmoothScrollerActionAssert hasDy(int dy) {
    isNotNull();
    int actualDy = actual.getDy();
    assertThat(actualDy) //
        .overridingErrorMessage("Expected dy <%s> but was <%s>.", dy, actualDy) //
        .isEqualTo(dy);
    return this;
  }

  public RecyclerViewSmoothScrollerActionAssert hasDuration(int duration) {
    isNotNull();
    int actualDuration = actual.getDuration();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected duration <%s> but was <%s>.", duration, actualDuration) //
        .isEqualTo(duration);
    return this;
  }

  public RecyclerViewSmoothScrollerActionAssert hasInterpolator(Interpolator interpolator) {
    isNotNull();
    Interpolator actualInterpolator = actual.getInterpolator();
    assertThat(actualInterpolator) //
        .overridingErrorMessage("Expected interpolator <%s> but was <%s>.", interpolator,
            actualInterpolator) //
        .isEqualTo(interpolator);
    return this;
  }
}
