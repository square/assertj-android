package org.assertj.android.palette.v7.api.graphics;

import android.support.v7.graphics.Palette;
import android.support.v7.graphics.PaletteItem;

import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Assertions for {@link Palette} instances.
 */
public class PaletteAssert extends AbstractAssert<PaletteAssert, Palette> {
  public PaletteAssert(Palette actual) {
    super(actual, PaletteAssert.class);
  }

  public PaletteAssert hasVibrantColor(PaletteItem color) {
    isNotNull();
    PaletteItem actualColor = actual.getVibrantColor();
    assertThat(equals(color, actualColor)) //
        .overridingErrorMessage("Expected vibrant color <%s> but was <%s>", color, actualColor) //
        .isTrue();
    return this;
  }

  public PaletteAssert hasDarkVibrantColor(PaletteItem color) {
    isNotNull();
    PaletteItem actualColor = actual.getDarkVibrantColor();
    assertThat(equals(color, actualColor)) //
        .overridingErrorMessage("Expected dark vibrant color <%s> but was <%s>", color, actualColor) //
        .isTrue();
    return this;
  }

  public PaletteAssert hasLightVibrantColor(PaletteItem color) {
    isNotNull();
    PaletteItem actualColor = actual.getLightVibrantColor();
    assertThat(equals(color, actualColor)) //
        .overridingErrorMessage("Expected light vibrant color <%s> but was <%s>", color, actualColor) //
        .isTrue();
    return this;
  }

  public PaletteAssert hasMutedColor(PaletteItem color) {
    isNotNull();
    PaletteItem actualColor = actual.getMutedColor();
    assertThat(equals(color, actualColor)) //
        .overridingErrorMessage("Expected muted color <%s> but was <%s>", color, actualColor) //
        .isTrue();
    return this;
  }

  public PaletteAssert hasDarkMutedColor(PaletteItem color) {
    isNotNull();
    PaletteItem actualColor = actual.getDarkMutedColor();
    assertThat(equals(color, actualColor)) //
        .overridingErrorMessage("Expected dark muted color <%s> but was <%s>", color, actualColor) //
        .isTrue();
    return this;
  }

  public PaletteAssert hasLightMutedColor(PaletteItem color) {
    isNotNull();
    PaletteItem actualColor = actual.getLightMutedColor();
    assertThat(equals(color, actualColor)) //
        .overridingErrorMessage("Expected light muted color <%s> but was <%s>", color, actualColor) //
        .isTrue();
    return this;
  }

  private static boolean equals(PaletteItem actualColor, PaletteItem color) {
    if (actualColor == color) {
      return true;
    }
    if ((actualColor == null) || (color == null)) {
      return false;
    }
    return actualColor.toString().equals(color.toString());
  }
}
