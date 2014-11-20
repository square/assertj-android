// Copyright 2014 Square, Inc.
//
// This class is generated. Do not modify directly!
package org.assertj.android.palette.v7.api;

import org.assertj.android.palette.v7.api.graphics.PaletteSwatchAssert;

/** Assertions for testing Android classes. */
@SuppressWarnings("deprecation")
public final class Assertions {
  public static org.assertj.android.palette.v7.api.graphics.PaletteAssert assertThat(
      android.support.v7.graphics.Palette actual) {
    return new org.assertj.android.palette.v7.api.graphics.PaletteAssert(actual);
  }

  public static PaletteSwatchAssert assertThat(
      android.support.v7.graphics.Palette.Swatch actual) {
    return new PaletteSwatchAssert(actual);
  }

  private Assertions() {
    throw new AssertionError("No instances.");
  }
}
