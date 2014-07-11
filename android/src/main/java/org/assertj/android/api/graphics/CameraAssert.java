// Copyright 2013 Square, Inc.
package org.assertj.android.api.graphics;

import android.annotation.TargetApi;
import android.graphics.Camera;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Camera} instances. */
public class CameraAssert extends AbstractAssert<CameraAssert, Camera> {
  public CameraAssert(Camera actual) {
    super(actual, CameraAssert.class);
  }

  @TargetApi(JELLY_BEAN)
  public CameraAssert hasLocationX(float location) {
    isNotNull();
    float actualLocation = actual.getLocationX();
    assertThat(actualLocation) //
        .overridingErrorMessage("Expected X location <%s> but was <%s>.", location,
            actualLocation) //
        .isEqualTo(location);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public CameraAssert hasLocationY(float location) {
    isNotNull();
    float actualLocation = actual.getLocationY();
    assertThat(actualLocation) //
        .overridingErrorMessage("Expected Y location <%s> but was <%s>.", location,
            actualLocation) //
        .isEqualTo(location);
    return this;
  }

  @TargetApi(JELLY_BEAN)
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
