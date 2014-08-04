package org.assertj.android.palette.v7.api.graphics;

import android.support.v7.graphics.PaletteItem;

import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Assertions for {@link PaletteItem} instances.
 */
public class PaletteItemAssert extends AbstractAssert<PaletteItemAssert, PaletteItem> {
  public PaletteItemAssert(PaletteItem actual) {
    super(actual, PaletteItemAssert.class);
  }

  public PaletteItemAssert hasRgb(int rgb) {
    isNotNull();
    int actualRgb = actual.getRgb();
    assertThat(actualRgb) //
        .overridingErrorMessage("Expected RGB <%s> but was <%s>", rgb, actualRgb) //
        .isEqualTo(rgb);
    return this;
  }
}
