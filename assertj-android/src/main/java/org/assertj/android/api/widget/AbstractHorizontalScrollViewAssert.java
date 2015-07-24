// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.widget.HorizontalScrollView;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractHorizontalScrollViewAssert<S extends AbstractHorizontalScrollViewAssert<S, A>, A extends HorizontalScrollView>
    extends AbstractFrameLayoutAssert<S, A> {
  protected AbstractHorizontalScrollViewAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasMaximumScrollAmount(int amount) {
    isNotNull();
    int actualAmount = actual.getMaxScrollAmount();
    assertThat(actualAmount) //
        .overridingErrorMessage("Expected maximum scroll amount <%s> but was <%s>.", amount,
            actualAmount) //
        .isEqualTo(amount);
    return myself;
  }

  public S isFillingViewport() {
    isNotNull();
    assertThat(actual.isFillViewport()) //
        .overridingErrorMessage("Expected to be filling viewport but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotFillingViewport() {
    isNotNull();
    assertThat(actual.isFillViewport()) //
        .overridingErrorMessage("Expected to not be filling viewport but was.") //
        .isFalse();
    return myself;
  }

  public S isSmoothScrollingEnabled() {
    isNotNull();
    assertThat(actual.isSmoothScrollingEnabled()) //
        .overridingErrorMessage("Expected smooth scrolling to be enabled but was disabled.") //
        .isTrue();
    return myself;
  }

  public S isSmoothScrollingDisabled() {
    isNotNull();
    assertThat(actual.isSmoothScrollingEnabled()) //
        .overridingErrorMessage("Expected smooth scrolling to be disabled but was enabled.") //
        .isFalse();
    return myself;
  }
}
