// Copyright 2013 Square, Inc.
package com.squareup.fest.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link AccessibilityNodeInfo} instances. */
public class AccessibilityNodeInfoAssert
    extends AbstractAssert<AccessibilityNodeInfoAssert, AccessibilityNodeInfo> {
  public AccessibilityNodeInfoAssert(AccessibilityNodeInfo actual) {
    super(actual, AccessibilityNodeInfoAssert.class);
  }

  public AccessibilityNodeInfoAssert hasActions(int actions) {
    isNotNull();
    int actualActions = actual.getActions();
    assertThat(actualActions) //
        .overridingErrorMessage("Expected actions <%s> but was <%s>.", actions, actualActions) //
        .isEqualTo(actions);
    return this;
  }

  public AccessibilityNodeInfoAssert hasChildCount(int count) {
    isNotNull();
    int actualCount = actual.getChildCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected child count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public AccessibilityNodeInfoAssert hasClassName(CharSequence name) {
    isNotNull();
    CharSequence actualName = actual.getClassName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected class name <%s> but was <%s>.", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public AccessibilityNodeInfoAssert hasContentDescription(CharSequence description) {
    isNotNull();
    CharSequence actualDescription = actual.getContentDescription();
    assertThat(actualDescription) //
        .overridingErrorMessage("Expected content description <%s> but was <%s>.", description,
            actualDescription) //
        .isEqualTo(description);
    return this;
  }

  public AccessibilityNodeInfoAssert hasMovementGranularities(int granularities) {
    isNotNull();
    int actualGranularities = actual.getMovementGranularities();
    assertThat(actualGranularities) //
        .overridingErrorMessage("Expected movement granularities <%s> but was <%s>.", granularities,
            actualGranularities) //
        .isEqualTo(granularities);
    return this;
  }

  public AccessibilityNodeInfoAssert hasPackageName(CharSequence name) {
    isNotNull();
    CharSequence actualName = actual.getPackageName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected package name <%s> but was <%s>.", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public AccessibilityNodeInfoAssert hasText(CharSequence text) {
    isNotNull();
    CharSequence actualText = actual.getText();
    assertThat(actualText) //
        .overridingErrorMessage("Expected text <%s> but was <%s>.", text, actualText) //
        .isEqualTo(text);
    return this;
  }

  public AccessibilityNodeInfoAssert hasWindowId(int id) {
    isNotNull();
    int actualId = actual.getWindowId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected window ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public AccessibilityNodeInfoAssert isAccessibilityFocused() {
    isNotNull();
    assertThat(actual.isAccessibilityFocused()) //
        .overridingErrorMessage("Expected to be accessibility focused but was not.") //
        .isTrue();
    return this;
  }

  public AccessibilityNodeInfoAssert isNotAccessibilityFocused() {
    isNotNull();
    assertThat(actual.isAccessibilityFocused()) //
        .overridingErrorMessage("Expected to not be accessibility focused but was.") //
        .isFalse();
    return this;
  }

  public AccessibilityNodeInfoAssert isCheckable() {
    isNotNull();
    assertThat(actual.isCheckable()) //
        .overridingErrorMessage("Expected to be checkable but was not.") //
        .isTrue();
    return this;
  }

  public AccessibilityNodeInfoAssert isNotCheckable() {
    isNotNull();
    assertThat(actual.isCheckable()) //
        .overridingErrorMessage("Expected to not be checkable but was.") //
        .isFalse();
    return this;
  }

  public AccessibilityNodeInfoAssert isChecked() {
    isNotNull();
    assertThat(actual.isChecked()) //
        .overridingErrorMessage("Expected to be checked but was not.") //
        .isTrue();
    return this;
  }

  public AccessibilityNodeInfoAssert isNotChecked() {
    isNotNull();
    assertThat(actual.isChecked()) //
        .overridingErrorMessage("Expected to not be checked but was.") //
        .isFalse();
    return this;
  }

  public AccessibilityNodeInfoAssert isClickable() {
    isNotNull();
    assertThat(actual.isClickable()) //
        .overridingErrorMessage("Expected to be clickable but was not.") //
        .isTrue();
    return this;
  }

  public AccessibilityNodeInfoAssert isNotClickable() {
    isNotNull();
    assertThat(actual.isClickable()) //
        .overridingErrorMessage("Expected to not be clickable but was.") //
        .isFalse();
    return this;
  }

  public AccessibilityNodeInfoAssert isEnabled() {
    isNotNull();
    assertThat(actual.isEnabled()) //
        .overridingErrorMessage("Expected to be enabled but was not.") //
        .isTrue();
    return this;
  }

  public AccessibilityNodeInfoAssert isNotEnabled() {
    isNotNull();
    assertThat(actual.isEnabled()) //
        .overridingErrorMessage("Expected to not be enabled but was.") //
        .isFalse();
    return this;
  }

  public AccessibilityNodeInfoAssert isFocusable() {
    isNotNull();
    assertThat(actual.isFocusable()) //
        .overridingErrorMessage("Expected to be focusable but was not.") //
        .isTrue();
    return this;
  }

  public AccessibilityNodeInfoAssert isNotFocusable() {
    isNotNull();
    assertThat(actual.isFocusable()) //
        .overridingErrorMessage("Expected to not be focusable but was.") //
        .isFalse();
    return this;
  }

  public AccessibilityNodeInfoAssert isFocused() {
    isNotNull();
    assertThat(actual.isFocused()) //
        .overridingErrorMessage("Expected to be focused but was not.") //
        .isTrue();
    return this;
  }

  public AccessibilityNodeInfoAssert isNotFocused() {
    isNotNull();
    assertThat(actual.isFocused()) //
        .overridingErrorMessage("Expected to not be focused but was.") //
        .isFalse();
    return this;
  }

  public AccessibilityNodeInfoAssert isLongClickable() {
    isNotNull();
    assertThat(actual.isLongClickable()) //
        .overridingErrorMessage("Expected to be long-clickable but was not.") //
        .isTrue();
    return this;
  }

  public AccessibilityNodeInfoAssert isNotLongClickable() {
    isNotNull();
    assertThat(actual.isLongClickable()) //
        .overridingErrorMessage("Expected to not be long-clickable but was.") //
        .isFalse();
    return this;
  }

  public AccessibilityNodeInfoAssert isPassword() {
    isNotNull();
    assertThat(actual.isPassword()) //
        .overridingErrorMessage("Expected to be password but was not.") //
        .isTrue();
    return this;
  }

  public AccessibilityNodeInfoAssert isNotPassword() {
    isNotNull();
    assertThat(actual.isPassword()) //
        .overridingErrorMessage("Expected to not be password but was.") //
        .isFalse();
    return this;
  }

  public AccessibilityNodeInfoAssert isScrollable() {
    isNotNull();
    assertThat(actual.isScrollable()) //
        .overridingErrorMessage("Expected to be scrollable but was not.") //
        .isTrue();
    return this;
  }

  public AccessibilityNodeInfoAssert isNotScrollable() {
    isNotNull();
    assertThat(actual.isScrollable()) //
        .overridingErrorMessage("Expected to not be scrollable but was.") //
        .isFalse();
    return this;
  }

  public AccessibilityNodeInfoAssert isSelected() {
    isNotNull();
    assertThat(actual.isSelected()) //
        .overridingErrorMessage("Expected to be selected but was not.") //
        .isTrue();
    return this;
  }

  public AccessibilityNodeInfoAssert isNotSelected() {
    isNotNull();
    assertThat(actual.isSelected()) //
        .overridingErrorMessage("Expected to not be selected but was.") //
        .isFalse();
    return this;
  }

  public AccessibilityNodeInfoAssert isVisibleToUser() {
    isNotNull();
    assertThat(actual.isVisibleToUser()) //
        .overridingErrorMessage("Expected to be visible to user but was not.") //
        .isTrue();
    return this;
  }

  public AccessibilityNodeInfoAssert isNotVisibleToUser() {
    isNotNull();
    assertThat(actual.isVisibleToUser()) //
        .overridingErrorMessage("Expected to not be visible to user but was.") //
        .isFalse();
    return this;
  }
}
