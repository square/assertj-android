package org.assertj.android.support.v4.api.print;

import android.support.v4.print.PrintHelper;
import org.assertj.core.api.AbstractAssert;

import static android.support.v4.print.PrintHelper.COLOR_MODE_COLOR;
import static android.support.v4.print.PrintHelper.COLOR_MODE_MONOCHROME;
import static android.support.v4.print.PrintHelper.ORIENTATION_LANDSCAPE;
import static android.support.v4.print.PrintHelper.ORIENTATION_PORTRAIT;
import static android.support.v4.print.PrintHelper.SCALE_MODE_FILL;
import static android.support.v4.print.PrintHelper.SCALE_MODE_FIT;
import static org.assertj.android.internal.BitmaskUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

public class PrintHelperAssert extends AbstractAssert<PrintHelperAssert, PrintHelper> {
  public PrintHelperAssert(PrintHelper actual) {
    super(actual, PrintHelperAssert.class);
  }

  public PrintHelperAssert hasColorMode(@PrintHelperColorMode int colorMode) {
    isNotNull();
    int actualColorMode = actual.getColorMode();
    //noinspection ResourceType
    assertThat(actualColorMode) //
        .overridingErrorMessage("Expected color mode <%s> but was <%s>.",
            colorModeToString(colorMode), colorModeToString(actualColorMode)) //
        .isEqualTo(colorMode);
    return this;
  }

  public PrintHelperAssert hasOrientation(@PrintHelperOrientation int orientation) {
    isNotNull();
    int actualOrientation = actual.getOrientation();
    //noinspection ResourceType
    assertThat(actualOrientation) //
        .overridingErrorMessage("Expected orientation <%s> but was <%s>.",
            orientationToString(orientation), orientationToString(actualOrientation)) //
        .isEqualTo(orientation);
    return this;
  }

  public PrintHelperAssert hasScaleMode(@PrintHelperScaleMode int scaleMode) {
    isNotNull();
    int actualScaleMode = actual.getScaleMode();
    //noinspection ResourceType
    assertThat(actualScaleMode) //
        .overridingErrorMessage("Expected scale mode <%s> but was <%s>.",
            scaleModeToString(scaleMode), scaleModeToString(actualScaleMode)) //
        .isEqualTo(scaleMode);
    return this;
  }

  public static String colorModeToString(@PrintHelperColorMode int colorMode) {
    return buildNamedValueString(colorMode)
        .value(COLOR_MODE_COLOR, "color")
        .value(COLOR_MODE_MONOCHROME, "monochrome")
        .get();
  }

  public static String orientationToString(@PrintHelperOrientation int orientation) {
    return buildNamedValueString(orientation)
        .value(ORIENTATION_LANDSCAPE, "landscape")
        .value(ORIENTATION_PORTRAIT, "portrait")
        .get();
  }

  public static String scaleModeToString(@PrintHelperScaleMode int scaleMode) {
    return buildNamedValueString(scaleMode)
        .value(SCALE_MODE_FILL, "fill")
        .value(SCALE_MODE_FIT, "fit")
        .get();
  }
}
