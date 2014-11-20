package org.assertj.android.palette.v7.api.graphics;

import android.support.v7.graphics.Palette;

import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Assertions for {@link Palette.Swatch} instances.
 */
public class PaletteSwatchAssert extends AbstractAssert<PaletteSwatchAssert, Palette.Swatch> {
  public PaletteSwatchAssert(Palette.Swatch actual) {
    super(actual, PaletteSwatchAssert.class);
  }

  public PaletteSwatchAssert hasRgb(int rgb) {
    isNotNull();
    int actualRgb = actual.getRgb();
    assertThat(actualRgb) //
        .overridingErrorMessage("Expected RGB <%s> but was <%s>", rgb, actualRgb) //
        .isEqualTo(rgb);
    return this;
  }
}
