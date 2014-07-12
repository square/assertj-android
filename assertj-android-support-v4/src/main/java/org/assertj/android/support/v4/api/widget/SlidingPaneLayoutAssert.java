package org.assertj.android.support.v4.api.widget;

import android.support.v4.widget.SlidingPaneLayout;
import org.assertj.android.api.view.AbstractViewGroupAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class SlidingPaneLayoutAssert
    extends AbstractViewGroupAssert<SlidingPaneLayoutAssert, SlidingPaneLayout> {
  public SlidingPaneLayoutAssert(SlidingPaneLayout actual) {
    super(actual, SlidingPaneLayoutAssert.class);
  }

  public SlidingPaneLayoutAssert hasCoveredFadeColor(int color) {
    isNotNull();
    int actualColor = actual.getCoveredFadeColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected covered fade color <%s> but was <%s>.", color,
            actualColor) //
        .isEqualTo(color);
    return this;
  }

  public SlidingPaneLayoutAssert hasParallaxDistance(int distance) {
    isNotNull();
    int actualDistance = actual.getParallaxDistance();
    assertThat(actualDistance) //
        .overridingErrorMessage("Expected parallax distance <%s> but was <%s>.", distance,
            actualDistance) //
        .isEqualTo(distance);
    return this;
  }

  public SlidingPaneLayoutAssert hasSliderFadeColor(int color) {
    isNotNull();
    int actualColor = actual.getSliderFadeColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected slider fade color <%s> but was <%s>.", color,
            actualColor) //
        .isEqualTo(color);
    return this;
  }

  public SlidingPaneLayoutAssert isOpen() {
    isNotNull();
    assertThat(actual.isOpen()) //
        .overridingErrorMessage("Expected to be open but was not.") //
        .isTrue();
    return this;
  }

  public SlidingPaneLayoutAssert isNotOpen() {
    isNotNull();
    assertThat(actual.isOpen()) //
        .overridingErrorMessage("Expected to not be open but was.") //
        .isFalse();
    return this;
  }

  public SlidingPaneLayoutAssert isSlidable() {
    isNotNull();
    assertThat(actual.isSlideable()) //
        .overridingErrorMessage("Expected to be slidable but was not.") //
        .isTrue();
    return this;
  }

  public SlidingPaneLayoutAssert isNotSlidable() {
    isNotNull();
    assertThat(actual.isSlideable()) //
        .overridingErrorMessage("Expected to not be slidable but was.") //
        .isFalse();
    return this;
  }
}
