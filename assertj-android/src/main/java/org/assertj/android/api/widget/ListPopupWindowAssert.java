// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.widget.ListPopupWindow.INPUT_METHOD_FROM_FOCUSABLE;
import static android.widget.ListPopupWindow.INPUT_METHOD_NEEDED;
import static android.widget.ListPopupWindow.INPUT_METHOD_NOT_NEEDED;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link ListPopupWindow} instances. */
@TargetApi(HONEYCOMB)
public class ListPopupWindowAssert extends AbstractAssert<ListPopupWindowAssert, ListPopupWindow> {
  public ListPopupWindowAssert(ListPopupWindow actual) {
    super(actual, ListPopupWindowAssert.class);
  }

  public ListPopupWindowAssert hasAnchorView(View view) {
    isNotNull();
    View actualView = actual.getAnchorView();
    assertThat(actualView) //
        .overridingErrorMessage("Expected anchor view <%s> but was <%s>.", view, actualView) //
        .isSameAs(view);
    return this;
  }

  public ListPopupWindowAssert hasAnimationStyle(int style) {
    isNotNull();
    int actualStyle = actual.getAnimationStyle();
    assertThat(actualStyle) //
        .overridingErrorMessage("Expected animation style <%s> but was <%s>.", style,
            actualStyle) //
        .isEqualTo(style);
    return this;
  }

  public ListPopupWindowAssert hasBackground(Drawable background) {
    isNotNull();
    Drawable actualBackground = actual.getBackground();
    assertThat(actualBackground) //
        .overridingErrorMessage("Expected background <%s> but was <%s>.", background,
            actualBackground) //
        .isSameAs(background);
    return this;
  }

  public ListPopupWindowAssert hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.getHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>.", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public ListPopupWindowAssert hasHorizontalOffset(int offset) {
    isNotNull();
    int actualOffset = actual.getHorizontalOffset();
    assertThat(actualOffset) //
        .overridingErrorMessage("Expected horizontal offset <%s> but was <%s>.", offset,
            actualOffset) //
        .isEqualTo(offset);
    return this;
  }

  public ListPopupWindowAssert hasInputMethodMode(int mode) {
    isNotNull();
    int actualMode = actual.getInputMethodMode();
    assertThat(actualMode) //
        .overridingErrorMessage("Expected input method mode <%s> but was <%s>.",
            inputMethodModeToString(mode), inputMethodModeToString(actualMode)) //
        .isEqualTo(mode);
    return this;
  }

  public ListPopupWindowAssert hasListView(ListView view) {
    isNotNull();
    ListView actualView = actual.getListView();
    assertThat(actualView) //
        .overridingErrorMessage("Expected ListView <%s> but was <%s>.", view, actualView) //
        .isSameAs(view);
    return this;
  }

  public ListPopupWindowAssert hasPromptPosition(int position) {
    isNotNull();
    int actualPosition = actual.getPromptPosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected prompt position <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return this;
  }

  public ListPopupWindowAssert hasSelectedItem(Object item) {
    isNotNull();
    Object actualItem = actual.getSelectedItem();
    assertThat(actualItem) //
        .overridingErrorMessage("Expected selected item <%s> but was <%s>.", item, actualItem) //
        .isEqualTo(item);
    return this;
  }

  public ListPopupWindowAssert hasSelectedItemId(long id) {
    isNotNull();
    long actualId = actual.getSelectedItemId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected selected item ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public ListPopupWindowAssert hasSelectedItemPosition(int position) {
    isNotNull();
    int actualPosition = actual.getSelectedItemPosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected selected item position <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return this;
  }

  public ListPopupWindowAssert hasSelectedItemView(View view) {
    isNotNull();
    View actualView = actual.getSelectedView();
    assertThat(actualView) //
        .overridingErrorMessage("Expected selected item view <%s> but was <%s>.", view,
            actualView) //
        .isSameAs(view);
    return this;
  }

  public ListPopupWindowAssert hasSoftInputMode(int mode) {
    isNotNull();
    int actualMode = actual.getSoftInputMode();
    assertThat(actualMode) //
        .overridingErrorMessage("Expected soft input mode <%s> but was <%s>.", mode, actualMode) //
        .isEqualTo(mode);
    return this;
  }

  public ListPopupWindowAssert hasVerticalOffset(int offset) {
    isNotNull();
    int actualOffset = actual.getVerticalOffset();
    assertThat(actualOffset) //
        .overridingErrorMessage("Expected vertical offset <%s> but was <%s>.", offset,
            actualOffset) //
        .isEqualTo(offset);
    return this;
  }

  public ListPopupWindowAssert hasWidth(int width) {
    isNotNull();
    int actualWidth = actual.getWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected width <%s> but was <%s>.", width, actualWidth) //
        .isEqualTo(width);
    return this;
  }

  public ListPopupWindowAssert isModal() {
    isNotNull();
    assertThat(actual.isModal()) //
        .overridingErrorMessage("Expected to be modal but was not.") //
        .isTrue();
    return this;
  }

  public ListPopupWindowAssert isNotModal() {
    isNotNull();
    assertThat(actual.isModal()) //
        .overridingErrorMessage("Expected to not be modal but was.") //
        .isFalse();
    return this;
  }

  public ListPopupWindowAssert isShowing() {
    isNotNull();
    assertThat(actual.isShowing()) //
        .overridingErrorMessage("Expected to be showing but was not.") //
        .isTrue();
    return this;
  }

  public ListPopupWindowAssert isNotShowing() {
    isNotNull();
    assertThat(actual.isShowing()) //
        .overridingErrorMessage("Expected to not be showing but was.") //
        .isFalse();
    return this;
  }

  private static String inputMethodModeToString(int mode) {
    switch (mode) {
      case INPUT_METHOD_FROM_FOCUSABLE:
        return "fromFocusable";
      case INPUT_METHOD_NEEDED:
        return "needed";
      case INPUT_METHOD_NOT_NEEDED:
        return "notNeeded";
      default:
        throw new IllegalArgumentException("Unknown input method mode: " + mode);
    }
  }
}
