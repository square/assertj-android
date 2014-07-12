package org.assertj.android.api.view;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.Display;
import org.assertj.android.api.util.BitMaskStringBuilder;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.FROYO;
import static android.os.Build.VERSION_CODES.HONEYCOMB_MR2;
import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static android.os.Build.VERSION_CODES.KITKAT_WATCH;
import static android.view.Display.FLAG_PRESENTATION;
import static android.view.Display.FLAG_PRIVATE;
import static android.view.Display.FLAG_SECURE;
import static android.view.Display.FLAG_SUPPORTS_PROTECTED_BUFFERS;
import static android.view.Display.STATE_DOZING;
import static android.view.Display.STATE_OFF;
import static android.view.Display.STATE_ON;
import static android.view.Display.STATE_UNKNOWN;
import static android.view.Surface.ROTATION_0;
import static android.view.Surface.ROTATION_180;
import static android.view.Surface.ROTATION_270;
import static android.view.Surface.ROTATION_90;
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
        .isEqualTo(actualId);
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
  public DisplayAssert hasFlags(int flags) {
    isNotNull();
    int actualFlags = actual.getFlags();
    assertThat(actualFlags) //
        .overridingErrorMessage("Expected flags <%s> but was <%s>", flagsToStr(flags),
            flagsToStr(actualFlags)) //
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

  public DisplayAssert hasOrientation(int orientation) {
    isNotNull();
    int actualOrientation = actual.getOrientation();
    assertThat(actualOrientation) //
        .overridingErrorMessage("Expected orientation <%s> but was <%s>",
            orientationToString(orientation), orientationToString(actualOrientation)) //
        .isEqualTo(orientation);
    return this;
  }

  public DisplayAssert isPortrait() {
    isNotNull();
    int actualOrientation = actual.getOrientation();
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
    assertThat(actualOrientation) //
        .overridingErrorMessage("Expected orientation <%s> or <%s>, but was <%s>",
            orientationToString(ROTATION_270), orientationToString(ROTATION_90),
            orientationToString(actualOrientation)) //
        .isIn(ROTATION_270, ROTATION_90);
    return this;
  }

  public DisplayAssert hasPixelFormat(int format) {
    isNotNull();
    int actualFormat = actual.getPixelFormat();
    // TODO convert to string names
    assertThat(actualFormat) //
        .overridingErrorMessage("Expected pixel format <%s> but was <%s>", format, actualFormat) //
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
  public DisplayAssert hasState(int state) {
    isNotNull();
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

  private static String orientationToString(int orientation) {
    switch (orientation) {
      case ROTATION_0:
        return "portrait";
      case ROTATION_90:
        return "landscape";
      case ROTATION_180:
        return "inverted portrait";
      case ROTATION_270:
        return "inverted landscape";
      default:
        throw new IllegalArgumentException("Unknown orientation: " + orientation);
    }
  }

  @TargetApi(KITKAT_WATCH)
  private static String stateToString(int state) {
    switch (state) {
      case STATE_DOZING:
        return "dozing";
      case STATE_OFF:
        return "off";
      case STATE_ON:
        return "on";
      case STATE_UNKNOWN:
        return "unknown";
      default:
        throw new IllegalArgumentException("Unknown state: " + state);
    }
  }

  private static String flagsToStr(int flags) {
    return new BitMaskStringBuilder(flags) //
        .flag(FLAG_PRESENTATION, "presentation")
        .flag(FLAG_PRIVATE, "private")
        .flag(FLAG_SECURE, "secure")
        .flag(FLAG_SUPPORTS_PROTECTED_BUFFERS, "supports_protected_buffers")
        .get();
  }
}
