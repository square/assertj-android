// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.widget;

import android.widget.HorizontalScrollView;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link HorizontalScrollView} instances. */
public class HorizontalScrollViewAssert
    extends AbstractFrameLayoutAssert<HorizontalScrollViewAssert, HorizontalScrollView> {
  public HorizontalScrollViewAssert(HorizontalScrollView actual) {
    super(actual, HorizontalScrollViewAssert.class);
  }

  public HorizontalScrollViewAssert hasMaximumScrollAmount(int amount) {
    isNotNull();
    int actualAmount = actual.getMaxScrollAmount();
    assertThat(actualAmount) //
        .overridingErrorMessage("Expected maximum scroll amount <%s> but was <%s>.", amount,
            actualAmount) //
        .isEqualTo(amount);
    return this;
  }

  public HorizontalScrollViewAssert isFillingViewport() {
    isNotNull();
    assertThat(actual.isFillViewport()) //
        .overridingErrorMessage("Expected to be filling viewport but was not.") //
        .isTrue();
    return this;
  }

  public HorizontalScrollViewAssert isNotFillingViewport() {
    isNotNull();
    assertThat(actual.isFillViewport()) //
        .overridingErrorMessage("Expected to not be filling viewport but was.") //
        .isFalse();
    return this;
  }

  public HorizontalScrollViewAssert isSmoothScrollingEnabled() {
    isNotNull();
    assertThat(actual.isSmoothScrollingEnabled()) //
        .overridingErrorMessage("Expected smooth scrolling to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public HorizontalScrollViewAssert isSmoothScrollingDisabled() {
    isNotNull();
    assertThat(actual.isSmoothScrollingEnabled()) //
        .overridingErrorMessage("Expected smooth scrolling to be disabled but was enabled.") //
        .isFalse();
    return this;
  }
}
