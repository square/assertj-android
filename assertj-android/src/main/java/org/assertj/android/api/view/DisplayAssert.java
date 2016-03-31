package org.assertj.android.api.view;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.Display;
import org.assertj.core.api.AbstractAssert;

import static android.graphics.PixelFormat.A_8;
import static android.graphics.PixelFormat.JPEG;
import static android.graphics.PixelFormat.LA_88;
import static android.graphics.PixelFormat.L_8;
import static android.graphics.PixelFormat.OPAQUE;
import static android.graphics.PixelFormat.RGBA_4444;
import static android.graphics.PixelFormat.RGBA_5551;
import static android.graphics.PixelFormat.RGBA_8888;
import static android.graphics.PixelFormat.RGBX_8888;
import static android.graphics.PixelFormat.RGB_332;
import static android.graphics.PixelFormat.RGB_565;
import static android.graphics.PixelFormat.RGB_888;
import static android.graphics.PixelFormat.TRANSLUCENT;
import static android.graphics.PixelFormat.TRANSPARENT;
import static android.graphics.PixelFormat.UNKNOWN;
import static android.graphics.PixelFormat.YCbCr_420_SP;
import static android.graphics.PixelFormat.YCbCr_422_I;
import static android.graphics.PixelFormat.YCbCr_422_SP;
import static android.os.Build.VERSION_CODES.FROYO;
import static android.os.Build.VERSION_CODES.HONEYCOMB_MR2;
import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static android.os.Build.VERSION_CODES.KITKAT_WATCH;
import static android.view.Display.FLAG_PRESENTATION;
import static android.view.Display.FLAG_PRIVATE;
import static android.view.Display.FLAG_SECURE;
import static android.view.Display.FLAG_SUPPORTS_PROTECTED_BUFFERS;
import static android.view.Display.STATE_DOZE;
import static android.view.Display.STATE_DOZE_SUSPEND;
import static android.view.Display.STATE_OFF;
import static android.view.Display.STATE_ON;
import static android.view.Display.STATE_UNKNOWN;
import static android.view.Surface.ROTATION_0;
import static android.view.Surface.ROTATION_180;
import static android.view.Surface.ROTATION_270;
import static android.view.Surface.ROTATION_90;
import static org.assertj.android.internal.IntegerUtils.buildBitMaskString;
import static org.assertj.android.internal.IntegerUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Display} instances. */
public class DisplayAssert extends AbstractAssert<DisplayAssert, Display> {
  public DisplayAssert(Display actual) {
    super(actual, DisplayAssert.class);
  }

  public DisplayAssert hasDisplayId(int id) {
    isNotNull();
    int actualId = actual.getDisplayId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected ID <%s> but was <%s>", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  @TargetApi(JELLY_BEAN_MR1)
  public DisplayAssert hasFlag(int flag) {
    isNotNull();
    assertThat(actual.getFlags() & flag) //
        .overridingErrorMessage("Expected flag <%s> but was not present", flag) //
        .isNotZero();
    return this;
  }

  @TargetApi(JELLY_BEAN_MR1)
  public DisplayAssert hasFlags(@DisplayFlags int flags) {
    isNotNull();
    int actualFlags = actual.getFlags();
    //noinspection ResourceType
    assertThat(actualFlags) //
        .overridingErrorMessage("Expected flags <%s> but was <%s>", flagsToString(flags),
            flagsToString(actualFlags)) //
        .isEqualTo(flags);
    return this;
  }

  public DisplayAssert hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.getHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  @TargetApi(JELLY_BEAN_MR1)
  public DisplayAssert hasName(String name) {
    isNotNull();
    String actualName = actual.getName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected name <%s> but was <%s>", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public DisplayAssert hasOrientation(@SurfaceRotation int orientation) {
    isNotNull();
    int actualOrientation = actual.getOrientation();
    //noinspection ResourceType
    assertThat(actualOrientation) //
        .overridingErrorMessage("Expected orientation <%s> but was <%s>",
            orientationToString(orientation), orientationToString(actualOrientation)) //
        .isEqualTo(orientation);
    return this;
  }

  public DisplayAssert isPortrait() {
    isNotNull();
    int actualOrientation = actual.getOrientation();
    //noinspection ResourceType
    assertThat(actualOrientation) //
        .overridingErrorMessage("Expected orientation <%s> or <%s>, but was <%s>",
            orientationToString(ROTATION_0), orientationToString(ROTATION_180),
            orientationToString(actualOrientation)) //
        .isIn(ROTATION_0, ROTATION_180);
    return this;
  }

  public DisplayAssert isLandscape() {
    isNotNull();
    int actualOrientation = actual.getOrientation();
    //noinspection ResourceType
    assertThat(actualOrientation) //
        .overridingErrorMessage("Expected orientation <%s> or <%s>, but was <%s>",
            orientationToString(ROTATION_270), orientationToString(ROTATION_90),
            orientationToString(actualOrientation)) //
        .isIn(ROTATION_270, ROTATION_90);
    return this;
  }

  public DisplayAssert hasPixelFormat(@DisplayPixelFormat int format) {
    isNotNull();
    int actualFormat = actual.getPixelFormat();
    //noinspection ResourceType
    assertThat(actualFormat) //
        .overridingErrorMessage("Expected pixel format <%s> but was <%s>",
            pixelFormatToString(format), pixelFormatToString(actualFormat)) //
        .isEqualTo(format);
    return this;
  }

  @TargetApi(JELLY_BEAN_MR1)
  public DisplayAssert hasRealSize(int width, int height) {
    isNotNull();
    Point actualSize = new Point();
    actual.getRealSize(actualSize);
    assertThat(actualSize.x) //
        .overridingErrorMessage("Expected real size of <%s, %s> but was <%s, %s>", width, height,
            actualSize.x, actualSize.y) //
        .isEqualTo(width);
    assertThat(actualSize.y) //
        .overridingErrorMessage("Expected real size of <%s, %s> but was <%s, %s>", width, height,
            actualSize.x, actualSize.y) //
        .isEqualTo(height);
    return this;
  }

  public DisplayAssert hasRefreshRate(float rate) {
    isNotNull();
    float actualRate = actual.getRefreshRate();
    assertThat(actualRate) //
        .overridingErrorMessage("Expected refresh rate <%s> but was <%s>", rate, actualRate) //
        .isEqualTo(rate);
    return this;
  }

  @TargetApi(FROYO)
  public DisplayAssert hasRotation(int rotation) {
    isNotNull();
    int actualRotation = actual.getRotation();
    assertThat(actualRotation) //
        .overridingErrorMessage("Expected rotation <%s> but was <%s>", rotation, actualRotation) //
        .isEqualTo(rotation);
    return this;
  }

  @TargetApi(HONEYCOMB_MR2)
  public DisplayAssert hasSize(int width, int height) {
    isNotNull();
    Point actualSize = new Point();
    actual.getSize(actualSize);
    assertThat(actualSize.x) //
        .overridingErrorMessage("Expected size of <%s, %s> but was <%s, %s>", width, height,
            actualSize.x, actualSize.y) //
        .isEqualTo(width);
    assertThat(actualSize.y) //
        .overridingErrorMessage("Expected size of <%s, %s> but was <%s, %s>", width, height,
            actualSize.x, actualSize.y) //
        .isEqualTo(height);
    return this;
  }

  @TargetApi(KITKAT_WATCH)
  public DisplayAssert hasState(@DisplayState int state) {
    isNotNull();
    //noinspection ResourceType
    assertThat(actual.getState()) //
        .overridingErrorMessage("Expected state <%s> but was <%s>", stateToString(state),
            stateToString(actual.getState())) //
        .isEqualTo(state);
    return this;
  }

  public DisplayAssert hasWidth(int width) {
    isNotNull();
    int actualWidth = actual.getWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected width <%s> but was <%s>", width, actualWidth) //
        .isEqualTo(width);
    return this;
  }

  @TargetApi(JELLY_BEAN_MR1)
  public DisplayAssert isValid() {
    isNotNull();
    assertThat(actual.isValid()) //
        .overridingErrorMessage("Expected valid but was not valid") //
        .isTrue();
    return this;
  }

  @TargetApi(JELLY_BEAN_MR1)
  public DisplayAssert isNotValid() {
    isNotNull();
    assertThat(actual.isValid()) //
        .overridingErrorMessage("Expected invalid but was valid") //
        .isFalse();
    return this;
  }

  public static String orientationToString(@SurfaceRotation int orientation) {
    return buildNamedValueString(orientation)
        .value(ROTATION_0, "portrait (0)")
        .value(ROTATION_90, "landscape (90)")
        .value(ROTATION_180, "inverted portrait (180)")
        .value(ROTATION_270, "inverted landscape (270)")
        .get();
  }

  @TargetApi(KITKAT_WATCH)
  public static String stateToString(@DisplayState int state) {
    return buildNamedValueString(state)
        .value(STATE_DOZE, "dozing")
        .value(STATE_DOZE_SUSPEND, "doze suspend")
        .value(STATE_OFF, "off")
        .value(STATE_ON, "on")
        .value(STATE_UNKNOWN, "unknown")
        .get();
  }

  public static String flagsToString(@DisplayFlags int flags) {
    return buildBitMaskString(flags) //
        .flag(FLAG_PRESENTATION, "presentation")
        .flag(FLAG_PRIVATE, "private")
        .flag(FLAG_SECURE, "secure")
        .flag(FLAG_SUPPORTS_PROTECTED_BUFFERS, "supports_protected_buffers")
        .get();
  }

  public static String pixelFormatToString(@DisplayPixelFormat int format) {
    return buildNamedValueString(format)
        .value(UNKNOWN, "unknown")
        .value(TRANSLUCENT, "translucent")
        .value(TRANSPARENT, "transparent")
        .value(OPAQUE, "opaque")
        .value(RGBA_8888, "rgba_8888")
        .value(RGBX_8888, "rgbx_8888")
        .value(RGB_888, "rgb_888")
        .value(RGB_565, "rgb_565")
        .value(RGBA_5551, "rgba_5551")
        .value(RGBA_4444, "rgba_4444")
        .value(A_8, "a_8")
        .value(L_8, "l_8")
        .value(LA_88, "la_88")
        .value(RGB_332, "rgb_332")
        .value(YCbCr_422_SP, "ycbcr_422_sp")
        .value(YCbCr_420_SP, "ycbcr_420_sp")
        .value(YCbCr_422_I, "ycbcr_422_i")
        .value(JPEG, "jpeg")
        .get();
  }
}
