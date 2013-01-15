// Copyright 2013 Square, Inc.
package com.squareup.fest.graphics.drawable.shapes;

import android.graphics.drawable.shapes.Shape;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link Shape} instances. */
public class ShapeAssert extends AbstractAssert<ShapeAssert, Shape> {
  public ShapeAssert(Shape actual) {
    super(actual, ShapeAssert.class);
  }

  public ShapeAssert hasHeight(float height) {
    isNotNull();
    float actualHeight = actual.getHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>.", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public ShapeAssert hasWidth(float width) {
    isNotNull();
    float actualHeight = actual.getWidth();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected width <%s> but was <%s>.", width, actualHeight) //
        .isEqualTo(width);
    return this;
  }

  public ShapeAssert hasAlpha() {
    isNotNull();
    assertThat(actual.hasAlpha()) //
        .overridingErrorMessage("Expected to have alpha but did not.") //
        .isTrue();
    return this;
  }

  public ShapeAssert hasNoAlpha() {
    isNotNull();
    assertThat(actual.hasAlpha()) //
        .overridingErrorMessage("Expected to not have alpha but did.") //
        .isFalse();
    return this;
  }
}
