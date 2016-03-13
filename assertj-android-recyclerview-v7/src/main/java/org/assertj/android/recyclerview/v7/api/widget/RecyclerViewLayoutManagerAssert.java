package org.assertj.android.recyclerview.v7.api.widget;

import android.support.v7.widget.RecyclerView;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.android.api.view.AbstractViewAssert.layoutDirectionToString;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link RecyclerView.LayoutManager} instances. */
public class RecyclerViewLayoutManagerAssert
    extends AbstractAssert<RecyclerViewLayoutManagerAssert, RecyclerView.LayoutManager> {
  public RecyclerViewLayoutManagerAssert(RecyclerView.LayoutManager actual) {
    super(actual, RecyclerViewLayoutManagerAssert.class);
  }

  public RecyclerViewLayoutManagerAssert supportsPredictiveItemAnimations() {
    isNotNull();
    assertThat(actual.supportsPredictiveItemAnimations()) //
        .overridingErrorMessage("Expected to support predictive item animations but did not.") //
        .isTrue();
    return this;
  }

  public RecyclerViewLayoutManagerAssert doesNotSupportPredictiveItemAnimations() {
    isNotNull();
    assertThat(actual.supportsPredictiveItemAnimations()) //
        .overridingErrorMessage("Expected to not support predictive item animations but did.") //
        .isFalse();
    return this;
  }

  public RecyclerViewLayoutManagerAssert canScrollHorizontally() {
    isNotNull();
    assertThat(actual.canScrollHorizontally()) //
        .overridingErrorMessage("Expected to be able to scroll horizontally but can not.") //
        .isTrue();
    return this;
  }

  public RecyclerViewLayoutManagerAssert canNotScrollHorizontally() {
    isNotNull();
    assertThat(actual.canScrollHorizontally()) //
        .overridingErrorMessage("Expected to not be able to scroll horizontally but can.") //
        .isFalse();
    return this;
  }

  public RecyclerViewLayoutManagerAssert canScrollVertically() {
    isNotNull();
    assertThat(actual.canScrollVertically()) //
        .overridingErrorMessage("Expected to be able to scroll vertically but can not.") //
        .isTrue();
    return this;
  }

  public RecyclerViewLayoutManagerAssert canNotScrollVertically() {
    isNotNull();
    assertThat(actual.canScrollVertically()) //
        .overridingErrorMessage("Expected to not be able to scroll horizontally but can.") //
        .isFalse();
    return this;
  }

  public RecyclerViewLayoutManagerAssert isSmoothScrolling() {
    isNotNull();
    assertThat(actual.isSmoothScrolling()) //
        .overridingErrorMessage("Expected to be smooth scrolling but was not.") //
        .isTrue();
    return this;
  }

  public RecyclerViewLayoutManagerAssert isNotSmoothScrolling() {
    isNotNull();
    assertThat(actual.isSmoothScrolling()) //
        .overridingErrorMessage("Expected to not be smooth scrolling but was.") //
        .isFalse();
    return this;
  }

  public RecyclerViewLayoutManagerAssert hasLayoutDirection(int direction) {
    isNotNull();
    int actualDirection = actual.getLayoutDirection();
    assertThat(actualDirection) //
        .overridingErrorMessage("Expected layout direction <%s> but was <%s>.",
            layoutDirectionToString(direction), layoutDirectionToString(actualDirection)) //
        .isEqualTo(direction);
    return this;
  }

  public RecyclerViewLayoutManagerAssert hasChildCount(int count) {
    isNotNull();
    int actualCount = actual.getChildCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected child count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public RecyclerViewLayoutManagerAssert hasWidth(int width) {
    isNotNull();
    int actualWidth = actual.getWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected width <%s> but was <%s>.", width, actualWidth) //
        .isEqualTo(width);
    return this;
  }

  public RecyclerViewLayoutManagerAssert hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.getHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>.", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public RecyclerViewLayoutManagerAssert hasPaddingLeft(int padding) {
    isNotNull();
    int actualPadding = actual.getPaddingLeft();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected padding left <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return this;
  }

  public RecyclerViewLayoutManagerAssert hasPaddingTop(int padding) {
    isNotNull();
    int actualPadding = actual.getPaddingTop();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected padding top <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return this;
  }

  public RecyclerViewLayoutManagerAssert hasPaddingRight(int padding) {
    isNotNull();
    int actualPadding = actual.getPaddingRight();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected padding right <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return this;
  }

  public RecyclerViewLayoutManagerAssert hasPaddingBottom(int padding) {
    isNotNull();
    int actualPadding = actual.getPaddingBottom();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected padding bottom <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return this;
  }

  public RecyclerViewLayoutManagerAssert hasPaddingStart(int padding) {
    isNotNull();
    int actualPadding = actual.getPaddingStart();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected padding start <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return this;
  }

  public RecyclerViewLayoutManagerAssert hasPaddingEnd(int padding) {
    isNotNull();
    int actualPadding = actual.getPaddingEnd();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected padding end <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return this;
  }

  public RecyclerViewLayoutManagerAssert isFocused() {
    isNotNull();
    assertThat(actual.isFocused()) //
        .overridingErrorMessage("Expected to be focused but was not.") //
        .isTrue();
    return this;
  }

  public RecyclerViewLayoutManagerAssert isNotFocused() {
    isNotNull();
    assertThat(actual.isFocused()) //
        .overridingErrorMessage("Expected to not be focused but was.") //
        .isFalse();
    return this;
  }

  public RecyclerViewLayoutManagerAssert hasFocus() {
    isNotNull();
    assertThat(actual.hasFocus()) //
        .overridingErrorMessage("Expected to have focus but did not.") //
        .isTrue();
    return this;
  }

  public RecyclerViewLayoutManagerAssert doesNotHaveFocus() {
    isNotNull();
    assertThat(actual.hasFocus()) //
        .overridingErrorMessage("Expected to not have focus but did.") //
        .isFalse();
    return this;
  }

  public RecyclerViewLayoutManagerAssert hasItemCount(int count) {
    isNotNull();
    int actualCount = actual.getItemCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected item count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public RecyclerViewLayoutManagerAssert hasMinimumWidth(int width) {
    isNotNull();
    int actualWidth = actual.getMinimumWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected minimum width <%s> but was <%s>.", width, actualWidth) //
        .isEqualTo(actualWidth);
    return this;
  }

  public RecyclerViewLayoutManagerAssert hasMinimumHeight(int height) {
    isNotNull();
    int actualHeight = actual.getMinimumWidth();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected minimum height <%s> but was <%s>.", height,
            actualHeight) //
        .isEqualTo(actualHeight);
    return this;
  }
}
