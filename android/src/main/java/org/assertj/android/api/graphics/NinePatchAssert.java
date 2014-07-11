// Copyright 2013 Square, Inc.
package org.assertj.android.api.graphics;

import android.graphics.NinePatch;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link NinePatch} instances. */
public class NinePatchAssert extends AbstractAssert<NinePatchAssert, NinePatch> {
  public NinePatchAssert(NinePatch actual) {
    super(actual, NinePatchAssert.class);
  }

  public NinePatchAssert hasDensity(int density) {
    isNotNull();
    int actualHeight = actual.getDensity();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected density <%s> but was <%s>.", density, actualHeight) //
        .isEqualTo(density);
    return this;
  }

  public NinePatchAssert hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.getHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>.", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public NinePatchAssert hasWidth(int width) {
    isNotNull();
    int actualHeight = actual.getWidth();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected width <%s> but was <%s>.", width, actualHeight) //
        .isEqualTo(width);
    return this;
  }

  public NinePatchAssert hasAlpha() {
    isNotNull();
    assertThat(actual.hasAlpha()) //
        .overridingErrorMessage("Expected to have alpha but did not.") //
        .isTrue();
    return this;
  }

  public NinePatchAssert hasNoAlpha() {
    isNotNull();
    assertThat(actual.hasAlpha()) //
        .overridingErrorMessage("Expected to not have alpha but did.") //
        .isFalse();
    return this;
  }
}
