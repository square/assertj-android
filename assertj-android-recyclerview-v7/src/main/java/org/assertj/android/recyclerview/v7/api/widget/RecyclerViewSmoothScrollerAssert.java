package org.assertj.android.recyclerview.v7.api.widget;

import android.support.v7.widget.RecyclerView;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link RecyclerView.SmoothScroller} instances. */
public class RecyclerViewSmoothScrollerAssert
    extends AbstractAssert<RecyclerViewSmoothScrollerAssert, RecyclerView.SmoothScroller> {
  public RecyclerViewSmoothScrollerAssert(RecyclerView.SmoothScroller actual) {
    super(actual, RecyclerViewSmoothScrollerAssert.class);
  }

  public RecyclerViewSmoothScrollerAssert isPendingInitialRun() {
    isNotNull();
    assertThat(actual.isPendingInitialRun()) //
        .overridingErrorMessage("Expected to be pending initial run but was not.") //
        .isTrue();
    return this;
  }

  public RecyclerViewSmoothScrollerAssert isNotPendingInitialRun() {
    isNotNull();
    assertThat(actual.isPendingInitialRun()) //
        .overridingErrorMessage("Expected to not be pending initial run but was.") //
        .isFalse();
    return this;
  }

  public RecyclerViewSmoothScrollerAssert isRunning() {
    isNotNull();
    assertThat(actual.isRunning()) //
        .overridingErrorMessage("Expected to be running but was not.") //
        .isFalse();
    return this;
  }

  public RecyclerViewSmoothScrollerAssert isNotRunning() {
    isNotNull();
    assertThat(actual.isRunning()) //
        .overridingErrorMessage("Expected to not be running but was.") //
        .isFalse();
    return this;
  }

  public RecyclerViewSmoothScrollerAssert hasTargetPosition(int position) {
    isNotNull();
    int actualPosition = actual.getTargetPosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected target position <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return this;
  }

  public RecyclerViewSmoothScrollerAssert hasChildCount(int count) {
    isNotNull();
    int actualCount = actual.getChildCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected child count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }
}
