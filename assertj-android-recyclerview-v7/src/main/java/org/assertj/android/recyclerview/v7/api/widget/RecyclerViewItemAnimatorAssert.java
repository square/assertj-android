package org.assertj.android.recyclerview.v7.api.widget;

import android.support.v7.widget.RecyclerView;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link RecyclerView.ItemAnimator} instances. */
public class RecyclerViewItemAnimatorAssert
    extends AbstractAssert<RecyclerViewItemAnimatorAssert, RecyclerView.ItemAnimator> {
  public RecyclerViewItemAnimatorAssert(RecyclerView.ItemAnimator actual) {
    super(actual, RecyclerViewItemAnimatorAssert.class);
  }

  public RecyclerViewItemAnimatorAssert hasMoveDuration(long duration) {
    isNotNull();
    long actualDuration = actual.getMoveDuration();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected move duration <%s> but was <%s>.", duration,
            actualDuration) //
        .isEqualTo(duration);
    return this;
  }

  public RecyclerViewItemAnimatorAssert hasAddDuration(long duration) {
    isNotNull();
    long actualDuration = actual.getAddDuration();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected add duration <%s> but was <%s>.", duration,
            actualDuration) //
        .isEqualTo(duration);
    return this;
  }

  public RecyclerViewItemAnimatorAssert hasRemoveDuration(long duration) {
    long actualDuration = actual.getRemoveDuration();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected remove duration <%s> but was <%s>.", duration,
            actualDuration) //
        .isEqualTo(duration);
    isNotNull();
    return this;
  }

  public RecyclerViewItemAnimatorAssert isRunning() {
    isNotNull();
    assertThat(actual.isRunning()) //
        .overridingErrorMessage("Expected to be running but was not.") //
        .isTrue();
    return this;
  }

  public RecyclerViewItemAnimatorAssert isNotRunning() {
    isNotNull();
    assertThat(actual.isRunning()) //
        .overridingErrorMessage("Expected to not be running but was.") //
        .isFalse();
    return this;
  }
}
