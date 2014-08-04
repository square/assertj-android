// Copyright 2014 Square, Inc.
//
// This class is generated. Do not modify directly!
package org.assertj.android.palette.v7.api;

/** Assertions for testing Android classes. */
@SuppressWarnings("deprecation")
public final class Assertions {
  public static org.assertj.android.palette.v7.api.graphics.PaletteAssert assertThat(
      android.support.v7.graphics.Palette actual) {
    return new org.assertj.android.palette.v7.api.graphics.PaletteAssert(actual);
  }

  public static org.assertj.android.palette.v7.api.graphics.PaletteItemAssert assertThat(
      android.support.v7.graphics.PaletteItem actual) {
    return new org.assertj.android.palette.v7.api.graphics.PaletteItemAssert(actual);
  }

  private Assertions() {
    throw new AssertionError("No instances.");
  }
}
