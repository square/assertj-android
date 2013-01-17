package org.fest.assertions.api.android.view;

import android.view.ViewConfiguration;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link ViewConfiguration} instances. */
public class ViewConfigurationAssert
    extends AbstractAssert<ViewConfigurationAssert, ViewConfiguration> {
  public ViewConfigurationAssert(ViewConfiguration actual) {
    super(actual, ViewConfigurationAssert.class);
  }

  public ViewConfigurationAssert hasScaledDoubleTapSlop(int slop) {
    isNotNull();
    int actualSlop = actual.getScaledDoubleTapSlop();
    assertThat(actualSlop) //
        .overridingErrorMessage("Expected scaled double-tap slop <%s> but was <%s>", slop,
            actualSlop) //
        .isEqualTo(slop);
    return this;
  }

  public ViewConfigurationAssert hasScaledEdgeSlop(int slop) {
    isNotNull();
    int actualSlop = actual.getScaledEdgeSlop();
    assertThat(actualSlop) //
        .overridingErrorMessage("Expected scaled edge slop <%s> but was <%s>", slop, actualSlop) //
        .isEqualTo(slop);
    return this;
  }

  public ViewConfigurationAssert hasScaledFadingEdgeLength(int length) {
    isNotNull();
    int actualLength = actual.getScaledFadingEdgeLength();
    assertThat(actualLength) //
        .overridingErrorMessage("Expected scaled fading edge length <%s> but was <%s>", length,
            actualLength) //
        .isEqualTo(length);
    return this;
  }

  public ViewConfigurationAssert hasScaledMaximumDrawingCacheSize(int size) {
    isNotNull();
    int actualSize = actual.getScaledMaximumDrawingCacheSize();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected scaled maximum drawing cache size <%s> but was <%s>",
            size, actualSize) //
        .isEqualTo(size);
    return this;
  }

  public ViewConfigurationAssert hasScaledMaximumFlingVelocity(int velocity) {
    isNotNull();
    int actualVelocity = actual.getScaledMaximumFlingVelocity();
    assertThat(actualVelocity) //
        .overridingErrorMessage("Expected scaled maximum fling velocity <%s> but was <%s>",
            velocity, actualVelocity) //
        .isEqualTo(velocity);
    return this;
  }

  public ViewConfigurationAssert hasScaledMinimumFlingVelocity(int velocity) {
    isNotNull();
    int actualVelocity = actual.getScaledMinimumFlingVelocity();
    assertThat(actualVelocity) //
        .overridingErrorMessage("Expected scaled minimum fling velocity <%s> but was <%s>",
            velocity, actualVelocity) //
        .isEqualTo(velocity);
    return this;
  }

  public ViewConfigurationAssert hasScaledOverflingDistance(int distance) {
    isNotNull();
    int actualDistance = actual.getScaledOverflingDistance();
    assertThat(actualDistance) //
        .overridingErrorMessage("Expected scaled overfling distance <%s> but was <%s>", distance,
            actualDistance) //
        .isEqualTo(distance);
    return this;
  }

  public ViewConfigurationAssert hasScaledOverscrollDistance(int distance) {
    isNotNull();
    int actualDistance = actual.getScaledOverscrollDistance();
    assertThat(actualDistance) //
        .overridingErrorMessage("Expected scaled overscroll distance <%s> but was <%s>", distance,
            actualDistance) //
        .isEqualTo(distance);
    return this;
  }

  public ViewConfigurationAssert hasScaledPagingTouchSlop(int slop) {
    isNotNull();
    int actualSlop = actual.getScaledPagingTouchSlop();
    assertThat(actualSlop) //
        .overridingErrorMessage("Expected scaled paging touch slop <%s> but was <%s>", slop,
            actualSlop) //
        .isEqualTo(slop);
    return this;
  }

  public ViewConfigurationAssert hasScaledScrollBarSize(int size) {
    isNotNull();
    int actualSize = actual.getScaledScrollBarSize();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected scaled scroll bar size <%s> but was <%s>", size,
            actualSize) //
        .isEqualTo(size);
    return this;
  }

  public ViewConfigurationAssert hasScaledTouchSlop(int slop) {
    isNotNull();
    int actualSlop = actual.getScaledTouchSlop();
    assertThat(actualSlop) //
        .overridingErrorMessage("Expected scaled touch slop <%s> but was <%s>", slop, actualSlop) //
        .isEqualTo(slop);
    return this;
  }

  public ViewConfigurationAssert hasScaledWindowTouchSlop(int slop) {
    isNotNull();
    int actualSlop = actual.getScaledWindowTouchSlop();
    assertThat(actualSlop) //
        .overridingErrorMessage("Expected scaled window touch slop <%s> but was <%s>", slop,
            actualSlop) //
        .isEqualTo(slop);
    return this;
  }
}
