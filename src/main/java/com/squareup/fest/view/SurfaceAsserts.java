package com.squareup.fest.view;

import android.view.Surface;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public class SurfaceAsserts extends AbstractAssert<SurfaceAsserts, Surface> {
  public SurfaceAsserts(Surface actual) {
    super(actual, SurfaceAsserts.class);
  }

  public SurfaceAsserts isValid() {
    isNotNull();
    assertThat(actual.isValid()) //
        .overridingErrorMessage("Expected to be valid but was not valid.") //
        .isTrue();
    return this;
  }

  public SurfaceAsserts isNotValid() {
    isNotNull();
    assertThat(actual.isValid()) //
        .overridingErrorMessage("Expected to not be valid but was valid.") //
        .isFalse();
    return this;
  }
}
