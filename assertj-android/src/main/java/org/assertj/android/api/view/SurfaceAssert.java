package org.assertj.android.api.view;

import android.view.Surface;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

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
