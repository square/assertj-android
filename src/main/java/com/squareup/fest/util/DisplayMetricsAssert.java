package com.squareup.fest.util;

import android.util.DisplayMetrics;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link DisplayMetrics} instances. */
public class DisplayMetricsAssert extends AbstractAssert<DisplayMetricsAssert, DisplayMetrics> {
  public DisplayMetricsAssert(DisplayMetrics actual) {
    super(actual, DisplayMetricsAssert.class);
  }

  public DisplayMetricsAssert hasDensity(float density) {
    isNotNull();
    float actualDensity = actual.density;
    assertThat(actualDensity) //
        .overridingErrorMessage("Expected density <%s> but was <%s>.", density, actualDensity) //
        .isEqualTo(density);
    return this;
  }

  public DisplayMetricsAssert hasDpi(int dpi) {
    isNotNull();
    int actualDpi = actual.densityDpi;
    assertThat(actualDpi) //
        .overridingErrorMessage("Expected DPI <%s> but was <%s>.", dpi, actualDpi) //
        .isEqualTo(dpi);
    return this;
  }

  public DisplayMetricsAssert hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.heightPixels;
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>.", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public DisplayMetricsAssert hasScaledDensity(float scaledDensity) {
    isNotNull();
    final float actualDensity = actual.scaledDensity;
    assertThat(actualDensity) //
        .overridingErrorMessage("Expected scaled density <%s> but was <%s>.", scaledDensity,
            actualDensity) //
        .isEqualTo(scaledDensity);
    return this;
  }

  public DisplayMetricsAssert hasWidth(int width) {
    isNotNull();
    int actualWidth = actual.widthPixels;
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected width <%s> but was <%s>.", width, actualWidth) //
        .isEqualTo(width);
    return this;
  }

  public DisplayMetricsAssert hasXDpi(float xDpi) {
    isNotNull();
    float actualXDpi = actual.xdpi;
    assertThat(actualXDpi) //
        .overridingErrorMessage("Expected X DPI <%s> but was <%s>.", xDpi, actualXDpi) //
        .isEqualTo(xDpi);
    return this;
  }

  public DisplayMetricsAssert hasYDpi(float yDpi) {
    isNotNull();
    float actualYDpi = actual.ydpi;
    assertThat(actualYDpi) //
        .overridingErrorMessage("Expected Y DPI <%s> but was <%s>.", yDpi, actualYDpi) //
        .isEqualTo(yDpi);
    return this;
  }
}
