// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.graphics;

import android.graphics.Camera;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link Camera} instances. */
public class CameraAssert extends AbstractAssert<CameraAssert, Camera> {
  public CameraAssert(Camera actual) {
    super(actual, CameraAssert.class);
  }

  public CameraAssert hasLocationX(float location) {
    isNotNull();
    float actualLocation = actual.getLocationX();
    assertThat(actualLocation) //
        .overridingErrorMessage("Expected X location <%s> but was <%s>.", location,
            actualLocation) //
        .isEqualTo(location);
    return this;
  }

  public CameraAssert hasLocationY(float location) {
    isNotNull();
    float actualLocation = actual.getLocationY();
    assertThat(actualLocation) //
        .overridingErrorMessage("Expected Y location <%s> but was <%s>.", location,
            actualLocation) //
        .isEqualTo(location);
    return this;
  }

  public CameraAssert hasLocationZ(float location) {
    isNotNull();
    float actualLocation = actual.getLocationZ();
    assertThat(actualLocation) //
        .overridingErrorMessage("Expected Z location <%s> but was <%s>.", location,
            actualLocation) //
        .isEqualTo(location);
    return this;
  }
}
