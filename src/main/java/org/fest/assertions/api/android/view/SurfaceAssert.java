package org.fest.assertions.api.android.view;

import android.view.Surface;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public class SurfaceAssert extends AbstractAssert<SurfaceAssert, Surface> {
  public SurfaceAssert(Surface actual) {
    super(actual, SurfaceAssert.class);
  }

  public SurfaceAssert isValid() {
    isNotNull();
    assertThat(actual.isValid()) //
        .overridingErrorMessage("Expected to be valid but was not valid.") //
        .isTrue();
    return this;
  }

  public SurfaceAssert isNotValid() {
    isNotNull();
    assertThat(actual.isValid()) //
        .overridingErrorMessage("Expected to not be valid but was valid.") //
        .isFalse();
    return this;
  }
}
