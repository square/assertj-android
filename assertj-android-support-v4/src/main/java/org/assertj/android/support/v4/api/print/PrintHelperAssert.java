package org.assertj.android.support.v4.api.print;

import android.support.v4.print.PrintHelper;
import org.assertj.core.api.AbstractAssert;

import static android.support.v4.print.PrintHelper.COLOR_MODE_COLOR;
import static android.support.v4.print.PrintHelper.COLOR_MODE_MONOCHROME;
import static android.support.v4.print.PrintHelper.ORIENTATION_LANDSCAPE;
import static android.support.v4.print.PrintHelper.ORIENTATION_PORTRAIT;
import static android.support.v4.print.PrintHelper.SCALE_MODE_FILL;
import static android.support.v4.print.PrintHelper.SCALE_MODE_FIT;
import static org.assertj.core.api.Assertions.assertThat;

public class PrintHelperAssert extends AbstractAssert<PrintHelperAssert, PrintHelper> {
  public PrintHelperAssert(PrintHelper actual) {
    super(actual, PrintHelperAssert.class);
  }

  public PrintHelperAssert hasColorMode(int colorMode) {
    isNotNull();
    int actualColorMode = actual.getColorMode();
    assertThat(actualColorMode) //
        .overridingErrorMessage("Expected color mode <%s> but was <%s>.",
            colorModeToString(colorMode), colorModeToString(actualColorMode)) //
        .isEqualTo(colorMode);
    return this;
  }

  public PrintHelperAssert hasOrientation(int orientation) {
    isNotNull();
    int actualOrientation = actual.getOrientation();
    assertThat(actualOrientation) //
        .overridingErrorMessage("Expected orientation <%s> but was <%s>.",
            orientationToString(orientation), orientationToString(actualOrientation)) //
        .isEqualTo(orientation);
    return this;
  }

  public PrintHelperAssert hasScaleMode(int scaleMode) {
    isNotNull();
    int actualScaleMode = actual.getScaleMode();
    assertThat(actualScaleMode) //
        .overridingErrorMessage("Expected scale mode <%s> but was <%s>.",
            scaleModeToString(scaleMode), scaleModeToString(actualScaleMode)) //
        .isEqualTo(scaleMode);
    return this;
  }

  public static String colorModeToString(int colorMode) {
    switch (colorMode) {
      case COLOR_MODE_COLOR:
        return "color";
      case COLOR_MODE_MONOCHROME:
        return "monochrome";
      default:
        throw new IllegalArgumentException("Unknown color mode: " + colorMode);
    }
  }

  public static String orientationToString(int orientation) {
    switch (orientation) {
      case ORIENTATION_LANDSCAPE:
        return "landscape";
      case ORIENTATION_PORTRAIT:
        return "portrait";
      default:
        throw new IllegalArgumentException("Unknown orientation: " + orientation);
    }
  }

  public static String scaleModeToString(int scaleMode) {
    switch (scaleMode) {
      case SCALE_MODE_FILL:
        return "fill";
      case SCALE_MODE_FIT:
        return "fit";
      default:
        throw new IllegalArgumentException("Unknown scale mode: " + scaleMode);
    }
  }
}
