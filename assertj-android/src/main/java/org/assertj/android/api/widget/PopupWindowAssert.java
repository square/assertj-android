// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static org.assertj.android.internal.IntegerUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link PopupWindow} instances. */
public class PopupWindowAssert extends AbstractAssert<PopupWindowAssert, PopupWindow> {
  public PopupWindowAssert(PopupWindow actual) {
    super(actual, PopupWindowAssert.class);
  }

  public PopupWindowAssert hasAnimationStyle(int style) {
    isNotNull();
    int actualStyle = actual.getAnimationStyle();
    assertThat(actualStyle) //
        .overridingErrorMessage("Expected animation style <%s> but was <%s>.", style,
            actualStyle) //
        .isEqualTo(style);
    return this;
  }

  public PopupWindowAssert hasBackground(Drawable background) {
    isNotNull();
    Drawable actualBackground = actual.getBackground();
    assertThat(actualBackground) //
        .overridingErrorMessage("Expected background <%s> but was <%s>.", background,
            actualBackground) //
        .isSameAs(background);
    return this;
  }

  public PopupWindowAssert hasContentView(View view) {
    isNotNull();
    View actualView = actual.getContentView();
    assertThat(actualView) //
        .overridingErrorMessage("Expected content view <%s> but was <%s>.", view, actualView) //
        .isSameAs(view);
    return this;
  }

  public PopupWindowAssert hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.getHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>.", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public PopupWindowAssert hasInputMethodMode(int mode) {
    isNotNull();
    int actualMode = actual.getInputMethodMode();
    assertThat(actualMode) //
        .overridingErrorMessage("Expected input method mode <%s> but was <%s>.",
            inputMethodModeToString(mode), inputMethodModeToString(actualMode)) //
        .isEqualTo(mode);
    return this;
  }

  public PopupWindowAssert hasSoftInputMode(int mode) {
    isNotNull();
    int actualMode = actual.getSoftInputMode();
    assertThat(actualMode) //
        .overridingErrorMessage("Expected soft input mode <%s> but was <%s>.", mode, actualMode) //
        .isEqualTo(mode);
    return this;
  }

  public PopupWindowAssert hasWidth(int width) {
    isNotNull();
    int actualWidth = actual.getWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected width <%s> but was <%s>.", width, actualWidth) //
        .isEqualTo(width);
    return this;
  }

  public PopupWindowAssert isAboveAnchor() {
    isNotNull();
    assertThat(actual.isAboveAnchor()) //
        .overridingErrorMessage("Expected to be above anchor but was not.") //
        .isTrue();
    return this;
  }

  public PopupWindowAssert isNotAboveAnchor() {
    isNotNull();
    assertThat(actual.isAboveAnchor()) //
        .overridingErrorMessage("Expected to not be above anchor but was.") //
        .isFalse();
    return this;
  }

  public PopupWindowAssert isClippingEnabled() {
    isNotNull();
    assertThat(actual.isClippingEnabled()) //
        .overridingErrorMessage("Expected clipping to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public PopupWindowAssert isClippingDisabled() {
    isNotNull();
    assertThat(actual.isClippingEnabled()) //
        .overridingErrorMessage("Expected clipping to be disabled but was enabled.") //
        .isFalse();
    return this;
  }

  public PopupWindowAssert isFocusable() {
    isNotNull();
    assertThat(actual.isFocusable()) //
        .overridingErrorMessage("Expected to be focusable but was not.") //
        .isTrue();
    return this;
  }

  public PopupWindowAssert isNotFocusable() {
    isNotNull();
    assertThat(actual.isFocusable()) //
        .overridingErrorMessage("Expected to not be focusable but was.") //
        .isFalse();
    return this;
  }

  public PopupWindowAssert isTouchableOutside() {
    isNotNull();
    assertThat(actual.isOutsideTouchable()) //
        .overridingErrorMessage("Expected to be touchable outside but was not.") //
        .isTrue();
    return this;
  }

  public PopupWindowAssert isNotTouchableOutside() {
    isNotNull();
    assertThat(actual.isOutsideTouchable()) //
        .overridingErrorMessage("Expected to not be touchable outside but was.") //
        .isTrue();
    return this;
  }

  public PopupWindowAssert isShowing() {
    isNotNull();
    assertThat(actual.isShowing()) //
        .overridingErrorMessage("Expected to be showing but was not.") //
        .isTrue();
    return this;
  }

  public PopupWindowAssert isNotShowing() {
    isNotNull();
    assertThat(actual.isShowing()) //
        .overridingErrorMessage("Expected to not be showing but was.") //
        .isFalse();
    return this;
  }

  @TargetApi(HONEYCOMB)
  public PopupWindowAssert isSplitTouchEnabled() {
    isNotNull();
    assertThat(actual.isSplitTouchEnabled()) //
        .overridingErrorMessage("Expected split touch to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  @TargetApi(HONEYCOMB)
  public PopupWindowAssert isSplitTouchDisabled() {
    isNotNull();
    assertThat(actual.isSplitTouchEnabled()) //
        .overridingErrorMessage("Expected split touch to be disabled but was enabled.") //
        .isFalse();
    return this;
  }

  public PopupWindowAssert isTouchable() {
    isNotNull();
    assertThat(actual.isTouchable()) //
        .overridingErrorMessage("Expected to be touchable but was not.") //
        .isTrue();
    return this;
  }

  public PopupWindowAssert isNotTouchable() {
    isNotNull();
    assertThat(actual.isTouchable()) //
        .overridingErrorMessage("Expected to not be touchable but was.") //
        .isFalse();
    return this;
  }

  public static String inputMethodModeToString(int mode) {
    return buildNamedValueString(mode)
        .value(PopupWindow.INPUT_METHOD_FROM_FOCUSABLE, "fromFocusable")
        .value(PopupWindow.INPUT_METHOD_NEEDED, "needed")
        .value(PopupWindow.INPUT_METHOD_NOT_NEEDED, "notNeeded")
        .get();
  }
}
