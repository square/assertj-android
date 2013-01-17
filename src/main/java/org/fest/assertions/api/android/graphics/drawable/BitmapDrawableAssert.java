// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.graphics.drawable;

import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link BitmapDrawable} instances. */
public class BitmapDrawableAssert
    extends AbstractDrawableAssert<BitmapDrawableAssert, BitmapDrawable> {
  public BitmapDrawableAssert(BitmapDrawable actual) {
    super(actual, BitmapDrawableAssert.class);
  }

  public BitmapDrawableAssert hasGravity(int gravity) {
    isNotNull();
    int actualGravity = actual.getGravity();
    assertThat(actualGravity) //
        .overridingErrorMessage("Expected gravity <%s> but was <%s>.", gravity, actualGravity) //
        .isEqualTo(gravity);
    return this;
  }

  public BitmapDrawableAssert hasTileModeX(Shader.TileMode mode) {
    isNotNull();
    Shader.TileMode actualMode = actual.getTileModeX();
    assertThat(actualMode) //
        .overridingErrorMessage("Expected X tile mode <%s> but was <%s>", mode, actualMode) //
        .isEqualTo(mode);
    return this;
  }

  public BitmapDrawableAssert hasTileModeY(Shader.TileMode mode) {
    isNotNull();
    Shader.TileMode actualMode = actual.getTileModeY();
    assertThat(actualMode) //
        .overridingErrorMessage("Expected Y tile mode <%s> but was <%s>", mode, actualMode) //
        .isEqualTo(mode);
    return this;
  }
}
