// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.widget.ScrollView;

import static org.assertj.core.api.Assertions.assertThat;

public class ScrollViewAssert extends AbstractFrameLayoutAssert<ScrollViewAssert, ScrollView> {
  public ScrollViewAssert(ScrollView actual) {
    super(actual, ScrollViewAssert.class);
  }

  public ScrollViewAssert hasMaxScrollAmount(int amount) {
    isNotNull();
    int actualAmount = actual.getMaxScrollAmount();
    assertThat(actualAmount) //
        .overridingErrorMessage("Expected maximum scroll amount <%s> but was <%s>.", amount,
            actualAmount) //
        .isEqualTo(amount);
    return this;
  }

  public ScrollViewAssert isFillingViewport() {
    isNotNull();
    assertThat(actual.isFillViewport()) //
        .overridingErrorMessage("Expected to be filling viewport but was not.") //
        .isTrue();
    return this;
  }

  public ScrollViewAssert isNotFillingViewport() {
    isNotNull();
    assertThat(actual.isFillViewport()) //
        .overridingErrorMessage("Expected to not be filling viewport but was.") //
        .isFalse();
    return this;
  }

  public ScrollViewAssert hasSmoothScrollEnabled() {
    isNotNull();
    assertThat(actual.isSmoothScrollingEnabled()) //
        .overridingErrorMessage("Expected smooth scroll to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public ScrollViewAssert hasSmoothScrollDisabled() {
    isNotNull();
    assertThat(actual.isSmoothScrollingEnabled()) //
        .overridingErrorMessage("Expected smooth scroll to be disabled but was enabled.") //
        .isFalse();
    return this;
  }
}
