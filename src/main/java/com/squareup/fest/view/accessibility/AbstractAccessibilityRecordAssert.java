// Copyright 2013 Square, Inc.
package com.squareup.fest.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractAccessibilityRecordAssert<S extends AbstractAccessibilityRecordAssert<S, A>, A extends AccessibilityRecord>
    extends AbstractAssert<S, A> {
  protected AbstractAccessibilityRecordAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public AbstractAccessibilityRecordAssert hasAddedCount(int count) {
    isNotNull();
    int actualCount = actual.getAddedCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected added count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public AbstractAccessibilityRecordAssert hasBeforeText(CharSequence text) {
    isNotNull();
    CharSequence actualText = actual.getBeforeText();
    assertThat(actualText) //
        .overridingErrorMessage("Expected before text <%s> but was <%s>.", text, actualText) //
        .isEqualTo(text);
    return this;
  }

  public AbstractAccessibilityRecordAssert hasClassName(CharSequence name) {
    isNotNull();
    CharSequence actualName = actual.getClassName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected class name <%s> but was <%s>.", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public AbstractAccessibilityRecordAssert hasContentDescription(CharSequence description) {
    isNotNull();
    CharSequence actualDescription = actual.getContentDescription();
    assertThat(actualDescription) //
        .overridingErrorMessage("Expected content description <%s> but was <%s>.", description,
            actualDescription) //
        .isEqualTo(description);
    return this;
  }

  public AbstractAccessibilityRecordAssert hasCurrentItemIndex(int index) {
    isNotNull();
    int actualIndex = actual.getCurrentItemIndex();
    assertThat(actualIndex) //
        .overridingErrorMessage("Expected current item index <%s> but was <%s>.", index,
            actualIndex) //
        .isEqualTo(index);
    return this;
  }

  public AbstractAccessibilityRecordAssert hasFromIndex(int index) {
    isNotNull();
    int actualIndex = actual.getFromIndex();
    assertThat(actualIndex) //
        .overridingErrorMessage("Expected from index <%s> but was <%s>.", index, actualIndex) //
        .isEqualTo(index);
    return this;
  }

  public AbstractAccessibilityRecordAssert hasItemCount(int count) {
    isNotNull();
    int actualCount = actual.getItemCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected item count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public AbstractAccessibilityRecordAssert hasMaximumScrollX(int scroll) {
    isNotNull();
    int actualScroll = actual.getMaxScrollX();
    assertThat(actualScroll) //
        .overridingErrorMessage("Expected maximum X scroll <%s> but was <%s>.", scroll,
            actualScroll) //
        .isEqualTo(scroll);
    return this;
  }

  public AbstractAccessibilityRecordAssert hasMaximumScrollY(int scroll) {
    isNotNull();
    int actualScroll = actual.getMaxScrollY();
    assertThat(actualScroll) //
        .overridingErrorMessage("Expected maximum Y scroll <%s> but was <%s>.", scroll,
            actualScroll) //
        .isEqualTo(scroll);
    return this;
  }

  public AbstractAccessibilityRecordAssert hasRemovedCount(int count) {
    isNotNull();
    int actualCount = actual.getRemovedCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected remove count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public AbstractAccessibilityRecordAssert hasScrollX(int scroll) {
    isNotNull();
    int actualScroll = actual.getScrollX();
    assertThat(actualScroll) //
        .overridingErrorMessage("Expected X scroll <%s> but was <%s>.", scroll, actualScroll) //
        .isEqualTo(scroll);
    return this;
  }

  public AbstractAccessibilityRecordAssert hasScrollY(int scroll) {
    isNotNull();
    int actualScroll = actual.getScrollY();
    assertThat(actualScroll) //
        .overridingErrorMessage("Expected maximum Y scroll <%s> but was <%s>.", scroll,
            actualScroll) //
        .isEqualTo(scroll);
    return this;
  }

  public AbstractAccessibilityRecordAssert hasSource(AccessibilityNodeInfo info) {
    isNotNull();
    AccessibilityNodeInfo actualInfo = actual.getSource();
    assertThat(actualInfo) //
        .overridingErrorMessage("Expected source <%s> but was <%s>.", info, actualInfo) //
        .isSameAs(info);
    return this;
  }

  public AbstractAccessibilityRecordAssert hasText(List<CharSequence> text) {
    isNotNull();
    List<CharSequence> actualText = actual.getText();
    assertThat(actualText) //
        .overridingErrorMessage("Expected text <%s> but was <%s>.", text, actualText) //
        .isEqualTo(text);
    return this;
  }

  public AbstractAccessibilityRecordAssert hasToIndex(int index) {
    isNotNull();
    int actualIndex = actual.getToIndex();
    assertThat(actualIndex) //
        .overridingErrorMessage("Expected to index <%s> but was <%s>.", index, actualIndex) //
        .isEqualTo(index);
    return this;
  }

  public AbstractAccessibilityRecordAssert hasWindowId(int id) {
    isNotNull();
    int actualId = actual.getWindowId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected window ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public AbstractAccessibilityRecordAssert isChecked() {
    isNotNull();
    assertThat(actual.isChecked()) //
        .overridingErrorMessage("Expected to be checked but was not.") //
        .isTrue();
    return this;
  }

  public AbstractAccessibilityRecordAssert isNotChecked() {
    isNotNull();
    assertThat(actual.isChecked()) //
        .overridingErrorMessage("Expected to not be checked but was.") //
        .isFalse();
    return this;
  }

  public AbstractAccessibilityRecordAssert isEnabled() {
    isNotNull();
    assertThat(actual.isEnabled()) //
        .overridingErrorMessage("Expected to be enabled but was not.") //
        .isTrue();
    return this;
  }

  public AbstractAccessibilityRecordAssert isNotEnabled() {
    isNotNull();
    assertThat(actual.isEnabled()) //
        .overridingErrorMessage("Expected to not be enabled but was.") //
        .isFalse();
    return this;
  }

  public AbstractAccessibilityRecordAssert isFullScreen() {
    isNotNull();
    assertThat(actual.isFullScreen()) //
        .overridingErrorMessage("Expected to be full screen but was not.") //
        .isTrue();
    return this;
  }

  public AbstractAccessibilityRecordAssert isNotFullScreen() {
    isNotNull();
    assertThat(actual.isFullScreen()) //
        .overridingErrorMessage("Expected to not be full screen but was.") //
        .isFalse();
    return this;
  }

  public AbstractAccessibilityRecordAssert isPassword() {
    isNotNull();
    assertThat(actual.isPassword()) //
        .overridingErrorMessage("Expected to be password but was not.") //
        .isTrue();
    return this;
  }

  public AbstractAccessibilityRecordAssert isNotPassword() {
    isNotNull();
    assertThat(actual.isPassword()) //
        .overridingErrorMessage("Expected to not be password but was.") //
        .isFalse();
    return this;
  }

  public AbstractAccessibilityRecordAssert isScrollable() {
    isNotNull();
    assertThat(actual.isScrollable()) //
        .overridingErrorMessage("Expected to be scrollable but was not.") //
        .isTrue();
    return this;
  }

  public AbstractAccessibilityRecordAssert isNotScrollable() {
    isNotNull();
    assertThat(actual.isScrollable()) //
        .overridingErrorMessage("Expected to not be scrollable but was.") //
        .isFalse();
    return this;
  }
}
