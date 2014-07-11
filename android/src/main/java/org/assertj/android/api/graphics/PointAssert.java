// Copyright 2013 Square, Inc.
package org.assertj.android.api.graphics;

import android.graphics.Point;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Point} instances. */
public class PointAssert extends AbstractAssert<PointAssert, Point> {
  public PointAssert(Point actual) {
    super(actual, PointAssert.class);
  }

  public PointAssert hasX(int x) {
    isNotNull();
    int actualX = actual.x;
    assertThat(actualX) //
        .overridingErrorMessage("Expected X <%s> but was <%s>.", x, actualX) //
        .isEqualTo(x);
    return this;
  }

  public PointAssert hasY(int y) {
    isNotNull();
    int actualY = actual.y;
    assertThat(actualY) //
        .overridingErrorMessage("Expected Y <%s> but was <%s>.", y, actualY) //
        .isEqualTo(y);
    return this;
  }
}
