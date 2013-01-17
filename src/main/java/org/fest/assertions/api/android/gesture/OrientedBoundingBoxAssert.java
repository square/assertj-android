// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.gesture;

import android.gesture.OrientedBoundingBox;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link OrientedBoundingBox} instances. */
public class OrientedBoundingBoxAssert
    extends AbstractAssert<OrientedBoundingBoxAssert, OrientedBoundingBox> {
  public OrientedBoundingBoxAssert(OrientedBoundingBox actual) {
    super(actual, OrientedBoundingBoxAssert.class);
  }

  public OrientedBoundingBoxAssert hasCenterX(float centerX) {
    isNotNull();
    float actualCenterX = actual.centerX;
    assertThat(actualCenterX) //
        .overridingErrorMessage("Expected X center <%s> but was <%s>.", centerX, actualCenterX) //
        .isEqualTo(centerX);
    return this;
  }

  public OrientedBoundingBoxAssert hasCenterY(float centerY) {
    isNotNull();
    float actualCenterY = actual.centerY;
    assertThat(actualCenterY) //
        .overridingErrorMessage("Expected Y center <%s> but was <%s>.", centerY, actualCenterY) //
        .isEqualTo(centerY);
    return this;
  }

  public OrientedBoundingBoxAssert hasHeight(float height) {
    isNotNull();
    float actualHeight = actual.height;
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>.", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public OrientedBoundingBoxAssert hasOrientation(float orientation) {
    isNotNull();
    float actualOrientation = actual.orientation;
    assertThat(actualOrientation) //
        .overridingErrorMessage("Expected orientation <%s> but was <%s>.", orientation,
            actualOrientation) //
        .isEqualTo(orientation);
    return this;
  }

  public OrientedBoundingBoxAssert hasSquareness(float squareness) {
    isNotNull();
    float actualSquareness = actual.squareness;
    assertThat(actualSquareness) //
        .overridingErrorMessage("Expected squareness <%s> but was <%s>.", squareness,
            actualSquareness) //
        .isEqualTo(squareness);
    return this;
  }

  public OrientedBoundingBoxAssert hasWidth(float width) {
    isNotNull();
    float actualWidth = actual.width;
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected width <%s> but was <%s>.", width, actualWidth) //
        .isEqualTo(width);
    return this;
  }
}
