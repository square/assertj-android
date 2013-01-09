package com.squareup.fest.view;

import android.graphics.Point;
import android.view.Display;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public class DisplayAssert extends AbstractAssert<DisplayAssert, Display> {
  public DisplayAssert(Display actual) {
    super(actual, DisplayAssert.class);
  }

  public DisplayAssert hasDisplayId(int id) {
    isNotNull();
    int actualId = actual.getDisplayId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected display ID <%s> but was <%s>", id, actualId) //
        .isEqualTo(actualId);
    return this;
  }

  // TODO API 17
  //public DisplayAssert hasFlag(int flag) {
  //  isNotNull();
  //  assertThat(actual.getFlags() & flag) //
  //      .overridingErrorMessage("Expected flag <%s> but was not present", flag) //
  //      .isNotZero();
  //  return this;
  //}
  //
  //public DisplayAssert hasFlags(int flags) {
  //  isNotNull();
  //  int actualFlags = actual.getFlags();
  //  assertThat(actualFlags) //
  //      .overridingErrorMessage("Expected flags <%s> but was <%s>", flag, actualFlags) //
  //      .isEqualTo(flags);
  //  return this;
  //}

  public DisplayAssert hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.getHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected display height <%s> but was <%s>", height,
            actualHeight) //
        .isEqualTo(height);
    return this;
  }

  // TODO API 17
  //public DisplayAssert hasName(String name) {
  //  isNotNull();
  //  String actualName = actual.getName();
  //  assertThat(actualName) //
  //      .overridingErrorMessage("Expected display name <%s> but was <%s>", name, actualName) //
  //      .isEqualTo(name);
  //  return this;
  //}

  public DisplayAssert hasOrientation(int orientation) {
    isNotNull();
    int actualOrientation = actual.getOrientation();
    // TODO convert to string names
    assertThat(actualOrientation) //
        .overridingErrorMessage("Expected display orientation <%s> but was <%s>", orientation,
            actualOrientation) //
        .isEqualTo(orientation);
    return this;
  }

  public DisplayAssert hasPixelFormat(int format) {
    isNotNull();
    int actualFormat = actual.getPixelFormat();
    // TODO convert to string names
    assertThat(actualFormat) //
        .overridingErrorMessage("Expected display pixel format <%s> but was <%s>", format,
            actualFormat) //
        .isEqualTo(format);
    return this;
  }

  // TODO API 17
  //public DisplayAssert hasRealSize(int width, int height) {
  //  isNotNull();
  //  Point actualSize = new Point();
  //  actual.getRealSize(actualSize);
  //  assertThat(actualSize.x) //
  //      .overridingErrorMessage("Expected display real size of <%s, %s> but was <%s, %s>", width,
  //          height, actualSize.x, actualSize.y) //
  //      .isEqualTo(width);
  //  assertThat(actualSize.y) //
  //      .overridingErrorMessage("Expected display real size of <%s, %s> but was <%s, %s>", width,
  //          height, actualSize.x, actualSize.y) //
  //      .isEqualTo(height);
  //  return this;
  //}

  public DisplayAssert hasRefreshRate(float rate) {
    isNotNull();
    float actualRate = actual.getRefreshRate();
    assertThat(actualRate) //
        .overridingErrorMessage("Expected display refresh rate <%s> but was <%s>", rate,
            actualRate) //
        .isEqualTo(rate);
    return this;
  }

  public DisplayAssert hasRotation(int rotation) {
    isNotNull();
    int actualRotation = actual.getRotation();
    assertThat(actualRotation) //
        .overridingErrorMessage("Expected display rotation <%s> but was <%s>", rotation,
            actualRotation) //
        .isEqualTo(rotation);
    return this;
  }

  public DisplayAssert hasSize(int width, int height) {
    isNotNull();
    Point actualSize = new Point();
    actual.getSize(actualSize);
    assertThat(actualSize.x) //
        .overridingErrorMessage("Expected display size of <%s, %s> but was <%s, %s>", width, height,
            actualSize.x, actualSize.y) //
        .isEqualTo(width);
    assertThat(actualSize.y) //
        .overridingErrorMessage("Expected display size of <%s, %s> but was <%s, %s>", width, height,
            actualSize.x, actualSize.y) //
        .isEqualTo(height);
    return this;
  }

  public DisplayAssert hasWidth(int width) {
    isNotNull();
    int actualWidth = actual.getWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected display width <%s> but was <%s>", width, actualWidth) //
        .isEqualTo(width);
    return this;
  }

  // TODO API 17
  //public DisplayAssert isValid() {
  //  isNotNull();
  //  assertThat(actual.isValid()) //
  //      .overridingErrorMessage("Expected valid display but was not valid") //
  //      .isTrue();
  //  return this;
  //}
  //
  //public DisplayAssert isNotValid() {
  //  isNotNull();
  //  assertThat(actual.isValid()) //
  //      .overridingErrorMessage("Expected invalid display but was valid") //
  //      .isFalse();
  //  return this;
  //}
}
