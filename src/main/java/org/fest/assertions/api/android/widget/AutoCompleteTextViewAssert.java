// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.widget;

import android.graphics.drawable.Drawable;
import android.widget.AutoCompleteTextView;
import android.widget.ListAdapter;

import static org.fest.assertions.api.Assertions.assertThat;

public class AutoCompleteTextViewAssert
    extends AbstractTextViewAssert<AutoCompleteTextViewAssert, AutoCompleteTextView> {
  public AutoCompleteTextViewAssert(AutoCompleteTextView actual) {
    super(actual, AutoCompleteTextViewAssert.class);
  }

  public AutoCompleteTextViewAssert hasEnoughToFilter() {
    isNotNull();
    assertThat(actual.enoughToFilter()) //
        .overridingErrorMessage("Expected to have enough to filter but did not.") //
        .isTrue();
    return this;
  }

  public AutoCompleteTextViewAssert hasAdapter(ListAdapter adapter) {
    isNotNull();
    ListAdapter actualAdapter = actual.getAdapter();
    assertThat(actualAdapter) //
        .overridingErrorMessage("Expected adapter <%s> but was <%s>.", adapter, actualAdapter) //
        .isSameAs(adapter);
    return this;
  }

  public AutoCompleteTextViewAssert hasCompletionHint(CharSequence hint) {
    isNotNull();
    CharSequence actualHint = actual.getCompletionHint();
    assertThat(actualHint) //
        .overridingErrorMessage("Expected completion hint <%s> but was <%s>.", hint, actualHint) //
        .isEqualTo(hint);
    return this;
  }

  public AutoCompleteTextViewAssert hasDropDownAnchor(int id) {
    isNotNull();
    int actualId = actual.getDropDownAnchor();
    assertThat(actualId) //
        .overridingErrorMessage("Expected drop-down anchor ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public AutoCompleteTextViewAssert hasDropDownBackground(Drawable background) {
    isNotNull();
    Drawable actualBackground = actual.getDropDownBackground();
    assertThat(actualBackground) //
        .overridingErrorMessage("Expected drop-down background <%s> but was <%s>.", background,
            actualBackground) //
        .isSameAs(background);
    return this;
  }

  public AutoCompleteTextViewAssert hasDropDownHeight(int height) {
    isNotNull();
    int actualHeight = actual.getDropDownHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected drop-down height <%s> but was <%s>.", height,
            actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public AutoCompleteTextViewAssert hasDropDownHorizontalOffset(int offset) {
    isNotNull();
    int actualOffset = actual.getDropDownHorizontalOffset();
    assertThat(actualOffset) //
        .overridingErrorMessage("Expected drop-down horizontal offset <%s> but was <%s>.", offset,
            actualOffset) //
        .isEqualTo(offset);
    return this;
  }

  public AutoCompleteTextViewAssert hasDropDownVerticalOffset(int offset) {
    isNotNull();
    int actualOffset = actual.getDropDownVerticalOffset();
    assertThat(actualOffset) //
        .overridingErrorMessage("Expected drop-down vertical offset <%s> but was <%s>.", offset,
            actualOffset) //
        .isEqualTo(offset);
    return this;
  }

  public AutoCompleteTextViewAssert hasDropDownWidth(int width) {
    isNotNull();
    int actualWidth = actual.getDropDownWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected drop-down width <%s> but was <%s>.", width,
            actualWidth) //
        .isEqualTo(width);
    return this;
  }

  public AutoCompleteTextViewAssert hasListSelection(int position) {
    isNotNull();
    int actualPosition = actual.getListSelection();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected list selection position <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return this;
  }

  public AutoCompleteTextViewAssert hasThreshold(int threshold) {
    isNotNull();
    int actualThreshold = actual.getThreshold();
    assertThat(actualThreshold) //
        .overridingErrorMessage("Expected threshold <%s> but was <%s>.", threshold,
            actualThreshold) //
        .isEqualTo(threshold);
    return this;
  }

  public AutoCompleteTextViewAssert isPerformingCompletion() {
    isNotNull();
    assertThat(actual.isPerformingCompletion()) //
        .overridingErrorMessage("Expected to be performing completion but was not.") //
        .isTrue();
    return this;
  }

  public AutoCompleteTextViewAssert isNotPerformingCompletion() {
    isNotNull();
    assertThat(actual.isPerformingCompletion()) //
        .overridingErrorMessage("Expected to not be performing completion but was.") //
        .isFalse();
    return this;
  }

  public AutoCompleteTextViewAssert isShowingPopup() {
    isNotNull();
    assertThat(actual.isPopupShowing()) //
        .overridingErrorMessage("Expected popup to be showing but was not showing.") //
        .isTrue();
    return this;
  }

  public AutoCompleteTextViewAssert isNotShowingPopup() {
    isNotNull();
    assertThat(actual.isPopupShowing()) //
        .overridingErrorMessage("Expected popup to not be showing but was showing.") //
        .isFalse();
    return this;
  }
}
