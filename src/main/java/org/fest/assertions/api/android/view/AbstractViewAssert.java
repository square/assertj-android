package org.fest.assertions.api.android.view;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;
import org.fest.assertions.api.AbstractAssert;

import static android.view.View.GONE;
import static android.view.View.INVISIBLE;
import static android.view.View.OVER_SCROLL_ALWAYS;
import static android.view.View.OVER_SCROLL_IF_CONTENT_SCROLLS;
import static android.view.View.OVER_SCROLL_NEVER;
import static android.view.View.SCROLLBARS_INSIDE_INSET;
import static android.view.View.SCROLLBARS_INSIDE_OVERLAY;
import static android.view.View.SCROLLBARS_OUTSIDE_INSET;
import static android.view.View.SCROLLBARS_OUTSIDE_OVERLAY;
import static android.view.View.SCROLLBAR_POSITION_DEFAULT;
import static android.view.View.SCROLLBAR_POSITION_LEFT;
import static android.view.View.SCROLLBAR_POSITION_RIGHT;
import static android.view.View.VISIBLE;
import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractViewAssert<S extends AbstractViewAssert<S, A>, A extends View>
    extends AbstractAssert<S, A> {
  protected AbstractViewAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasAlpha(float alpha) {
    isNotNull();
    float actualAlpha = actual.getAlpha();
    assertThat(actualAlpha) //
        .overridingErrorMessage("Expected alpha <%s> but was <%s>", alpha, actualAlpha) //
        .isEqualTo(alpha);
    return myself;
  }

  public S hasAnimation(Animation animation) {
    isNotNull();
    Animation actualAnimation = actual.getAnimation();
    assertThat(actualAnimation) //
        .overridingErrorMessage("Expected animation <%s> but was <%s>", animation,
            actualAnimation) //
        .isSameAs(animation);
    return myself;
  }

  public S hasBackground(Drawable background) {
    isNotNull();
    Drawable actualDrawable = actual.getBackground();
    assertThat(actualDrawable) //
        .overridingErrorMessage("Expected background <%s> but was <%s>", background,
            actualDrawable) //
        .isSameAs(background);
    return myself;
  }

  public S hasBaseline(int baseline) {
    isNotNull();
    int actualBaseline = actual.getBaseline();
    assertThat(actualBaseline) //
        .overridingErrorMessage("Expected baseline <%s> but was <%s>", baseline, actualBaseline) //
        .isEqualTo(baseline);
    return myself;
  }

  public S hasBottom(int bottom) {
    isNotNull();
    int actualBottom = actual.getBottom();
    assertThat(actualBottom) //
        .overridingErrorMessage("Expected bottom <%s> but was <%s>", bottom, actualBottom) //
        .isEqualTo(bottom);
    return myself;
  }

  public S hasContentDescription(CharSequence contentDescription) {
    isNotNull();
    CharSequence actualContentDescription = actual.getContentDescription();
    assertThat(actualContentDescription) //
        .overridingErrorMessage("Expected content description <%s> but was <%s>",
            contentDescription, actualContentDescription) //
        .isEqualTo(contentDescription);
    return myself;
  }

  public S hasContentDescription(int resId) {
    isNotNull();
    return hasContentDescription(actual.getContext().getString(resId));
  }

  public S hasDrawingCacheBackgroundColor(int color) {
    isNotNull();
    int actualColor = actual.getDrawingCacheBackgroundColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected drawing cache background color <%s> but was <%s>",
            Integer.toHexString(color), Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return myself;
  }

  public S hasDrawingCacheQuality(int quality) {
    isNotNull();
    int actualQuality = actual.getDrawingCacheQuality();
    assertThat(actualQuality) //
        .overridingErrorMessage("Expected drawing cache quality <%s> but was <%s>", quality,
            actualQuality) //
        .isEqualTo(quality);
    return myself;
  }

  public S hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.getHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>", height, actualHeight) //
        .isEqualTo(height);
    return myself;
  }

  public S hasHorizontalFadingEdgeLength(int length) {
    isNotNull();
    int actualLength = actual.getHorizontalFadingEdgeLength();
    assertThat(actualLength) //
        .overridingErrorMessage("Expected horizontal fading edge length <%s> but was <%s>", length,
            actualLength) //
        .isEqualTo(length);
    return myself;
  }

  public S hasId(int id) {
    isNotNull();
    int actualId = actual.getId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected ID <%s> but was <%s>", Integer.toHexString(id),
            Integer.toHexString(actualId)) //
        .isEqualTo(id);
    return myself;
  }

  // TODO API 17
  //public S isImportantForVisibility() {
  //  isNotNull();
  //  assertThat(actual.getImportantForVisibility()) //
  //      .overridingErrorMessage("Expected to be important for visibility but was not") //
  //      .isTrue();
  //  return myself;
  //}
  //
  //public S isNotImportantForVisibility() {
  //  isNotNull();
  //  assertThat(actual.getImportantForVisibility()) //
  //      .overridingErrorMessage("Expected to not be important for visibility but was") //
  //      .isFalse();
  //  return myself;
  //}

  public S isKeepingScreenOn() {
    isNotNull();
    assertThat(actual.getKeepScreenOn()) //
        .overridingErrorMessage("Expected to be keeping screen on but was not") //
        .isTrue();
    return myself;
  }

  public S isNotKeepingScreenOn() {
    isNotNull();
    assertThat(actual.getKeepScreenOn()) //
        .overridingErrorMessage("Expected to not be keeping screen on but was") //
        .isFalse();
    return myself;
  }

  // TODO API 17
  //public S hasLabelFor(int id) {
  //  isNotNull();
  //  int actualId = actual.getLabelFor();
  //  assertThat(actualId) //
  //      .overridingErrorMessage("Expected to have label for ID <%s> but was <%s>", id,
  //          actualId) //
  //      .isEqualTo(id);
  //  return myself;
  //}

  public S hasLayerType(int type) {
    isNotNull();
    int actualType = actual.getLayerType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected layer type <%s> but was <%s>", layerTypeToString(type),
            layerTypeToString(actualType)) //
        .isEqualTo(type);
    return myself;
  }

  // TODO API 17
  //public S hasLayoutDirection(int direction) {
  //  isNotNull();
  //  int actualDirection = actual.getLayoutDirection();
  //  assertThat(actualDirection) //
  //      .overridingErrorMessage("Expected layout direction <%s> but was <%s>",
  //          layoutDirectionToString(direction), layoutDirectionToString(actualDirection)) //
  //      .isEqualTo(direction);
  //  return myself;
  //}

  public S hasLeft(int left) {
    isNotNull();
    int actualLeft = actual.getLeft();
    assertThat(actualLeft) //
        .overridingErrorMessage("Expected left <%s> but was <%s>", left, actualLeft) //
        .isEqualTo(left);
    return myself;
  }

  public S hasMeasuredHeight(int height) {
    isNotNull();
    int actualHeight = actual.getMeasuredHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected measured height <%s> but was <%s>", height,
            actualHeight) //
        .isEqualTo(height);
    return myself;
  }

  public S hasMeasuredHeightAndState(int heightAndState) {
    isNotNull();
    int actualHeightAndState = actual.getMeasuredHeightAndState();
    assertThat(actualHeightAndState) //
        .overridingErrorMessage("Expected measured height and state <%s> but was <%s>",
            heightAndState, actualHeightAndState) //
        .isEqualTo(heightAndState);
    return myself;
  }

  public S hasMeasuredState(int state) {
    isNotNull();
    int actualState = actual.getMeasuredState();
    assertThat(actualState) //
        .overridingErrorMessage("Expected measured state <%s> but was <%s>", state, actualState) //
        .isEqualTo(state);
    return myself;
  }

  public S hasMeasuredWidth(int width) {
    isNotNull();
    int actualWidth = actual.getMeasuredWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected measured width <%s> but was <%s>", width, actualWidth) //
        .isEqualTo(width);
    return myself;
  }

  public S hasMeasuredWidthAndState(int widthAndState) {
    isNotNull();
    int actualWidthAndState = actual.getMeasuredWidthAndState();
    assertThat(actualWidthAndState) //
        .overridingErrorMessage("Expected measured width and state <%s> but was <%s>",
            widthAndState, actualWidthAndState) //
        .isEqualTo(widthAndState);
    return myself;
  }

  public S hasMinimumHeight(int height) {
    isNotNull();
    int actualHeight = actual.getMinimumHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected minimum height <%s> but was <%s>", height,
            actualHeight) //
        .isEqualTo(height);
    return myself;
  }

  public S hasMinimumWidth(int width) {
    isNotNull();
    int actualWidth = actual.getMinimumWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected minimum width <%s> but was <%s>", width, actualWidth) //
        .isEqualTo(width);
    return myself;
  }

  public S hasNextFocusDownId(int id) {
    isNotNull();
    int actualId = actual.getNextFocusDownId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected next focus down ID <%s> but was <%s>", id, actualId) //
        .isEqualTo(id);
    return myself;
  }

  public S hasNextFocusForwardId(int id) {
    isNotNull();
    int actualId = actual.getNextFocusForwardId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected next focus forward ID <%s> but was <%s>", id, actualId) //
        .isEqualTo(id);
    return myself;
  }

  public S hasNextFocusLeftId(int id) {
    isNotNull();
    int actualId = actual.getNextFocusLeftId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected next focus left ID <%s> but was <%s>", id, actualId) //
        .isEqualTo(id);
    return myself;
  }

  public S hasNextFocusRightId(int id) {
    isNotNull();
    int actualId = actual.getNextFocusRightId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected next focus right ID <%s> but was <%s>", id, actualId) //
        .isEqualTo(id);
    return myself;
  }

  public S hasNextFocusUpId(int id) {
    isNotNull();
    int actualId = actual.getNextFocusUpId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected next focus up ID <%s> but was <%s>", id, actualId) //
        .isEqualTo(id);
    return myself;
  }

  public S hasOverScrollMode(int mode) {
    isNotNull();
    int actualMode = actual.getOverScrollMode();
    assertThat(actualMode) //
        .overridingErrorMessage("Expected over scroll mode <%s> but was <%s>",
            overScrollModeToString(mode), overScrollModeToString(actualMode)) //
        .isEqualTo(mode);
    return myself;
  }

  public S hasPaddingBottom(int padding) {
    isNotNull();
    int actualPadding = actual.getPaddingBottom();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected padding bottom <%s> but was <%s>", padding,
            actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  // TODO API 17
  //public S hasPaddingEnd(int padding) {
  //  isNotNull();
  //  int actualPadding = actual.getPaddingEnd();
  //  assertThat(actualPadding) //
  //      .overridingErrorMessage("Expected padding end <%s> but was <%s>", padding,
  //          actualPadding) //
  //      .isEqualTo(padding);
  //  return myself;
  //}

  public S hasPaddingLeft(int padding) {
    isNotNull();
    int actualPadding = actual.getPaddingLeft();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected padding left <%s> but was <%s>", padding,
            actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  public S hasPaddingRight(int padding) {
    isNotNull();
    int actualPadding = actual.getPaddingRight();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected padding right <%s> but was <%s>", padding,
            actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  // TODO API 17
  //public S hasPaddingStart(int padding) {
  //  isNotNull();
  //  int actualPadding = actual.getPaddingStart();
  //  assertThat(actualPadding) //
  //      .overridingErrorMessage("Expected padding start <%s> but was <%s>", padding,
  //          actualPadding) //
  //      .isEqualTo(padding);
  //  return myself;
  //}

  public S hasPaddingTop(int padding) {
    isNotNull();
    int actualPadding = actual.getPaddingTop();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected padding top <%s> but was <%s>", padding, actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  public S hasParent(ViewParent parent) {
    isNotNull();
    ViewParent actualParent = actual.getParent();
    assertThat(actualParent) //
        .overridingErrorMessage("Expected parent <%s> but was <%s>", parent, actualParent) //
        .isSameAs(parent);
    return myself;
  }

  public S hasParentForAccessibility(ViewParent parent) {
    isNotNull();
    ViewParent actualParent = actual.getParentForAccessibility();
    assertThat(actualParent) //
        .overridingErrorMessage("Expected parent for accessibility <%s> but was <%s>", parent,
            actualParent) //
        .isSameAs(parent);
    return myself;
  }

  public S hasPivoxX(float pivotX) {
    isNotNull();
    float actualPivotX = actual.getPivotX();
    assertThat(actualPivotX) //
        .overridingErrorMessage("Expected x pivot <%s> but was <%s>", pivotX, actualPivotX) //
        .isEqualTo(pivotX);
    return myself;
  }

  public S hasPivotY(float pivotY) {
    isNotNull();
    float actualPivotY = actual.getPivotY();
    assertThat(actualPivotY) //
        .overridingErrorMessage("Expected y pivot <s> but was <%s>", pivotY, actualPivotY) //
        .isEqualTo(pivotY);
    return myself;
  }

  public S hasRight(int right) {
    isNotNull();
    int actualRight = actual.getRight();
    assertThat(actualRight) //
        .overridingErrorMessage("Expected right <%s> but was <%s>", right, actualRight) //
        .isEqualTo(right);
    return myself;
  }

  public S hasRootView(View view) {
    isNotNull();
    View actualView = actual.getRootView();
    assertThat(actualView) //
        .overridingErrorMessage("Expected root view <%s> but was <%s>", view, actualView) //
        .isSameAs(view);
    return myself;
  }

  public S hasRotation(float rotation) {
    isNotNull();
    float actualRotation = actual.getRotation();
    assertThat(actualRotation) //
        .overridingErrorMessage("Expected rotation <%s> but was <%s>", rotation, actualRotation) //
        .isSameAs(rotation);
    return myself;
  }

  public S hasRotationX(float rotation) {
    isNotNull();
    float actualRotation = actual.getRotationX();
    assertThat(actualRotation) //
        .overridingErrorMessage("Expected x rotation <%s> but was <%s>", rotation,
            actualRotation) //
        .isSameAs(rotation);
    return myself;
  }

  public S hasRotationY(float rotation) {
    isNotNull();
    float actualRotation = actual.getRotationY();
    assertThat(actualRotation) //
        .overridingErrorMessage("Expected y rotation <%s> but was <%s>", rotation,
            actualRotation) //
        .isSameAs(rotation);
    return myself;
  }

  public S hasScaleX(float scale) {
    isNotNull();
    float actualScale = actual.getScaleX();
    assertThat(actualScale) //
        .overridingErrorMessage("Expected x scale <%s> but was <%s>", scale, actualScale) //
        .isSameAs(scale);
    return myself;
  }

  public S hasScaleY(float scale) {
    isNotNull();
    float actualScale = actual.getScaleY();
    assertThat(actualScale) //
        .overridingErrorMessage("Expected y scale <%s> but was <%s>", scale, actualScale) //
        .isSameAs(scale);
    return myself;
  }

  public S hasScrollBarDefaultDelayBeforeFade(int fade) {
    isNotNull();
    int actualFade = actual.getScrollBarDefaultDelayBeforeFade();
    assertThat(actualFade) //
        .overridingErrorMessage("Expected scroll bar default delay before fade <%s> but was <%s>",
            fade, actualFade) //
        .isEqualTo(fade);
    return myself;
  }

  public S hasScrollBarFadeDuration(int fade) {
    isNotNull();
    int actualFade = actual.getScrollBarFadeDuration();
    assertThat(actualFade) //
        .overridingErrorMessage("Expected scroll bar fade duration <%s> but was <%s>", fade,
            actualFade) //
        .isEqualTo(fade);
    return myself;
  }

  public S hasScrollBarSize(int size) {
    isNotNull();
    int actualSize = actual.getScrollBarSize();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected scroll bar size <%s> but was <%s>", size, actualSize) //
        .isEqualTo(size);
    return myself;
  }

  public S hasScrollBarStyle(int style) {
    isNotNull();
    int actualStyle = actual.getScrollBarStyle();
    assertThat(actualStyle) //
        .overridingErrorMessage("Expected scroll bar style <%s> but was <%s>",
            scrollBarStyleToString(style), scrollBarStyleToString(actualStyle)) //
        .isEqualTo(style);
    return myself;
  }

  public S hasScrollX(int scroll) {
    isNotNull();
    int actualScroll = actual.getScrollX();
    assertThat(actualScroll) //
        .overridingErrorMessage("Expected x scroll <%s> but was <%s>", scroll, actualScroll) //
        .isEqualTo(scroll);
    return myself;
  }

  public S hasScrollY(int scroll) {
    isNotNull();
    int actualScroll = actual.getScrollY();
    assertThat(actualScroll) //
        .overridingErrorMessage("Expected y scroll <%s> but was <%s>", scroll, actualScroll) //
        .isEqualTo(scroll);
    return myself;
  }

  public S hasSolidColor(int color) {
    isNotNull();
    int actualColor = actual.getSolidColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected solid color <%s> but was <%s>",
            Integer.toHexString(color), Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return myself;
  }

  public S hasSystemUiVisibility(int visibility) {
    isNotNull();
    int actualVisibility = actual.getSystemUiVisibility();
    assertThat(actualVisibility) //
        .overridingErrorMessage("Expected system UI visibility <%s> but was <%s>", visibility,
            actualVisibility) //
        .isEqualTo(visibility);
    return myself;
  }

  public S hasTag(int key, Object tag) {
    isNotNull();
    Object actualTag = actual.getTag(key);
    assertThat(actualTag) //
        .overridingErrorMessage("Expected tag <%s> at key %s but was <%s>", tag, key, actualTag) //
        .isSameAs(tag);
    return myself;
  }

  public S hasTag(Object tag) {
    isNotNull();
    Object actualTag = actual.getTag();
    assertThat(actualTag) //
        .overridingErrorMessage("Expected tag <%s> but was <%s>", tag, actualTag) //
        .isSameAs(tag);
    return myself;
  }

  // TODO API 17
  //public S hasTextAlignment(int alignment) {
  //  isNotNull();
  //  int actualAlignment = actual.getTextAlignment();
  //  assertThat(actualAlignment) //
  //      // TODO use tostring helper
  //      .overridingErrorMessage("Expected text alignment <%s> but was <%s>", alignment,
  //          actualAlignment) //
  //      .isEqualTo(alignment);
  //  return myself;
  //}
  //
  //public S hasTextDirection(int direction) {
  //  isNotNull();
  //  int actualDirection = actual.getTextDirection();
  //  assertThat(actualDirection) //
  //      // TODO use tostring helper
  //      .overridingErrorMessage("Expected text direction <%s> but was <%s>", direction,
  //          actualDirection) //
  //      .isEqualTo(direction);
  //  return myself;
  //}

  public S hasTop(int top) {
    isNotNull();
    int actualTop = actual.getTop();
    assertThat(actualTop) //
        .overridingErrorMessage("Expected top <%s> but was <%s>", top, actualTop) //
        .isEqualTo(top);
    return myself;
  }

  public S hasTranslationX(float translation) {
    isNotNull();
    float actualTranslation = actual.getTranslationX();
    assertThat(actualTranslation) //
        .overridingErrorMessage("Expected x translation <%s> but was <%s>", translation,
            actualTranslation) //
        .isEqualTo(translation);
    return myself;
  }

  public S hasTranslationY(float translation) {
    isNotNull();
    float actualTranslation = actual.getTranslationY();
    assertThat(actualTranslation) //
        .overridingErrorMessage("Expected y translation <%s> but was <%s>", translation,
            actualTranslation) //
        .isEqualTo(translation);
    return myself;
  }

  public S hasVerticalFadingEdgeLength(int length) {
    isNotNull();
    int actualLength = actual.getVerticalFadingEdgeLength();
    assertThat(actualLength) //
        .overridingErrorMessage("Expected vertical fading edge length <%s> but was <%s>", length,
            actualLength) //
        .isEqualTo(length);
    return myself;
  }

  public S hasVerticalScrollbarPosition(int position) {
    isNotNull();
    int actualPosition = actual.getVerticalScrollbarPosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected vertical scroll bar position <%s> but was <%s>",
            verticalScrollBarPositionToString(position),
            verticalScrollBarPositionToString(actualPosition)) //
        .isEqualTo(position);
    return myself;
  }

  public S hasVerticalScrollbarWidth(int width) {
    isNotNull();
    int actualWidth = actual.getVerticalScrollbarWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected vertical scroll bar width <%s> but was <%s>", width,
            actualWidth) //
        .isEqualTo(width);
    return myself;
  }

  public S hasVisibility(int visibility) {
    isNotNull();
    int actualVisibility = actual.getVisibility();
    assertThat(actualVisibility) //
        .overridingErrorMessage("Expected visibility <%s> but was <%s>.",
            visibilityToString(visibility), visibilityToString(actualVisibility)) //
        .isEqualTo(visibility);
    return myself;
  }

  public S isVisible() {
    isNotNull();
    int actualVisibility = actual.getVisibility();
    assertThat(actualVisibility) //
        .overridingErrorMessage("Expected to be visible but was %s",
            visibilityToString(actualVisibility)) //
        .isEqualTo(VISIBLE);
    return myself;
  }

  public S isNotVisible() {
    isNotNull();
    int actualVisibility = actual.getVisibility();
    assertThat(actualVisibility) //
        .overridingErrorMessage("Expected to be not visible but was visible") //
        .isNotEqualTo(VISIBLE);
    return myself;
  }

  public S isInvisible() {
    isNotNull();
    int actualVisibility = actual.getVisibility();
    assertThat(actualVisibility) //
        .overridingErrorMessage("Expected to be invisible but was %s",
            visibilityToString(actualVisibility)) //
        .isEqualTo(INVISIBLE);
    return myself;
  }

  public S isNotInvisible() {
    isNotNull();
    int actualVisibility = actual.getVisibility();
    assertThat(actualVisibility) //
        .overridingErrorMessage("Expected to be not invisible but was invisible") //
        .isNotEqualTo(INVISIBLE);
    return myself;
  }

  public S isGone() {
    isNotNull();
    int actualVisibility = actual.getVisibility();
    assertThat(actualVisibility) //
        .overridingErrorMessage("Expected to be gone but was %s",
            visibilityToString(actualVisibility)) //
        .isEqualTo(GONE);
    return myself;
  }

  public S isNotGone() {
    isNotNull();
    int actualVisibility = actual.getVisibility();
    assertThat(actualVisibility) //
        .overridingErrorMessage("Expected to be not gone but was gone") //
        .isNotEqualTo(GONE);
    return myself;
  }

  public S hasWidth(int width) {
    isNotNull();
    int actualWidth = actual.getWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected width <%s> but was <%s>") //
        .isEqualTo(width);
    return myself;
  }

  public S hasWindowVisiblity(int visibility) {
    isNotNull();
    int actualVisibility = actual.getWindowVisibility();
    assertThat(actualVisibility) //
        .overridingErrorMessage("Expected window visibility <%s> but was <%s>",
            visibilityToString(visibility), visibilityToString(actualVisibility)) //
        .isEqualTo(visibility);
    return myself;
  }

  public S hasX(float x) {
    isNotNull();
    float actualX = actual.getX();
    assertThat(actualX) //
        .overridingErrorMessage("Expected x <%s> but was <%s>", x, actualX) //
        .isEqualTo(x);
    return myself;
  }

  public S hasY(float y) {
    isNotNull();
    float actualY = actual.getY();
    assertThat(actualY) //
        .overridingErrorMessage("Expected y <%s> but was <%s>", y, actualY) //
        .isEqualTo(y);
    return myself;
  }

  public S hasFocus() {
    isNotNull();
    assertThat(actual.hasFocus()) //
        .overridingErrorMessage("Expected to have focus but was not focused") //
        .isTrue();
    return myself;
  }

  public S hasNoFocus() {
    isNotNull();
    assertThat(actual.hasFocus()) //
        .overridingErrorMessage("Expected to not have focus but was focused") //
        .isFalse();
    return myself;
  }

  public S hasFocusable() {
    isNotNull();
    assertThat(actual.hasFocusable()) //
        .overridingErrorMessage("Expected to have focusable but was not") //
        .isTrue();
    return myself;
  }

  public S isInFocusedWindow() {
    isNotNull();
    assertThat(actual.hasWindowFocus()) //
        .overridingErrorMessage("Expected to be in a focused window but was not") //
        .isTrue();
    return myself;
  }

  public S isNotInFocusedWindow() {
    isNotNull();
    assertThat(actual.hasWindowFocus()) //
        .overridingErrorMessage("Expected to not be in a focused window but was") //
        .isFalse();
    return myself;
  }

  public S isActivated() {
    isNotNull();
    assertThat(actual.isActivated()) //
        .overridingErrorMessage("Expected to be activated but was not") //
        .isTrue();
    return myself;
  }

  public S isNotActivated() {
    isNotNull();
    assertThat(actual.isActivated()) //
        .overridingErrorMessage("Expected to not be activated but was") //
        .isFalse();
    return myself;
  }

  public S isClickable() {
    isNotNull();
    assertThat(actual.isClickable()) //
        .overridingErrorMessage("Expected to be clickable but was not") //
        .isTrue();
    return myself;
  }

  public S isNotClickable() {
    isNotNull();
    assertThat(actual.isClickable()) //
        .overridingErrorMessage("Expected to not be clickable but was") //
        .isFalse();
    return myself;
  }

  public S isDirty() {
    isNotNull();
    assertThat(actual.isDirty()) //
        .overridingErrorMessage("Expected to be dirty but was not") //
        .isTrue();
    return myself;
  }

  public S isNotDirty() {
    isNotNull();
    assertThat(actual.isDirty()) //
        .overridingErrorMessage("Expected to not be dirty but was") //
        .isFalse();
    return myself;
  }

  public S isUsingDrawingCache() {
    isNotNull();
    assertThat(actual.isDrawingCacheEnabled()) //
        .overridingErrorMessage("Expected to use drawing cache but was not") //
        .isTrue();
    return myself;
  }

  public S isNotUsingDrawingCache() {
    isNotNull();
    assertThat(actual.isDrawingCacheEnabled()) //
        .overridingErrorMessage("Expected to not be using drawing cache but was") //
        .isFalse();
    return myself;
  }

  public S isDuplicatingParentState() {
    isNotNull();
    assertThat(actual.isDuplicateParentStateEnabled()) //
        .overridingErrorMessage("Expected to be duplicating parent state but was not") //
        .isTrue();
    return myself;
  }

  public S isNotDuplicatingParentState() {
    isNotNull();
    assertThat(actual.isDuplicateParentStateEnabled()) //
        .overridingErrorMessage("Expected to not be duplicated parent state but was") //
        .isFalse();
    return myself;
  }

  public S isEnabled() {
    isNotNull();
    assertThat(actual.isEnabled()) //
        .overridingErrorMessage("Expected to be enabled but was disabled") //
        .isTrue();
    return myself;
  }

  public S isDisabled() {
    isNotNull();
    assertThat(actual.isEnabled()) //
        .overridingErrorMessage("Expected to be disabled but was enabled") //
        .isFalse();
    return myself;
  }

  public S isFocusable() {
    isNotNull();
    assertThat(actual.isFocusable()) //
        .overridingErrorMessage("Expected to be focusable but was not") //
        .isTrue();
    return myself;
  }

  public S isNotFocuseable() {
    isNotNull();
    assertThat(actual.isFocusable()) //
        .overridingErrorMessage("Expected to not be focusable but was") //
        .isFalse();
    return myself;
  }

  public S isFocusableInTouchMode() {
    isNotNull();
    assertThat(actual.isFocusableInTouchMode()) //
        .overridingErrorMessage("Expected to be focusable in touch mode but was not") //
        .isTrue();
    return myself;
  }

  public S isNotFocusableInTouchMode() {
    isNotNull();
    assertThat(actual.isFocusableInTouchMode()) //
        .overridingErrorMessage("Expected to not be focusable in touch mode but was") //
        .isFalse();
    return myself;
  }

  public S isFocused() {
    isNotNull();
    assertThat(actual.isFocused()) //
        .overridingErrorMessage("Expected to be focused but was not") //
        .isTrue();
    return myself;
  }

  public S isNotFocused() {
    isNotNull();
    assertThat(actual.isFocused()) //
        .overridingErrorMessage("Expected to not be focused but was") //
        .isFalse();
    return myself;
  }

  public S hasHapticFeedbackEnabled() {
    isNotNull();
    assertThat(actual.isHapticFeedbackEnabled()) //
        .overridingErrorMessage("Expected to have haptic feedback enabled but was disabled") //
        .isTrue();
    return myself;
  }

  public S hasHapticFeedbackDisabled() {
    isNotNull();
    assertThat(actual.isHapticFeedbackEnabled()) //
        .overridingErrorMessage("Expected to have haptic feedback disabled but was enabled") //
        .isFalse();
    return myself;
  }

  public S isHardwareAccelerated() {
    isNotNull();
    assertThat(actual.isHardwareAccelerated()) //
        .overridingErrorMessage("Expected to be hardware accelerated but was not") //
        .isTrue();
    return myself;
  }

  public S isNotHardwareAccelerated() {
    isNotNull();
    assertThat(actual.isHardwareAccelerated()) //
        .overridingErrorMessage("Expected to not be hardware accelerated but was") //
        .isFalse();
    return myself;
  }

  public S hasHorizontalFadingEdgesEnabled() {
    isNotNull();
    assertThat(actual.isHorizontalFadingEdgeEnabled()) //
        .overridingErrorMessage("Expected to be fading horizontal edges but was not") //
        .isTrue();
    return myself;
  }

  public S hasHorizontalFadingEdgesDisabled() {
    isNotNull();
    assertThat(actual.isHorizontalFadingEdgeEnabled()) //
        .overridingErrorMessage("Expected to not be fading horizontal edges but was") //
        .isFalse();
    return myself;
  }

  public S hasHorizontalScrollbarEnabled() {
    isNotNull();
    assertThat(actual.isHorizontalScrollBarEnabled()) //
        .overridingErrorMessage(
            "Expected to have horizontal scroll bar enabled but was disabled") //
        .isTrue();
    return myself;
  }

  public S hasHorizontalScrollbarDisabled() {
    isNotNull();
    assertThat(actual.isHorizontalScrollBarEnabled()) //
        .overridingErrorMessage(
            "Expected to have horizontal scroll bar disabled but was enabled") //
        .isFalse();
    return myself;
  }

  public S isHovered() {
    isNotNull();
    assertThat(actual.isHovered()) //
        .overridingErrorMessage("Expected to be hovered but was not") //
        .isTrue();
    return myself;
  }

  public S isNotHovered() {
    isNotNull();
    assertThat(actual.isHovered()) //
        .overridingErrorMessage("Expected to not be hoevered but was") //
        .isFalse();
    return myself;
  }

  public S isInEditMode() {
    isNotNull();
    assertThat(actual.isInEditMode()) //
        .overridingErrorMessage("Expected to be in edit mode but was not") //
        .isTrue();
    return myself;
  }

  public S isNotInEditMode() {
    isNotNull();
    assertThat(actual.isInEditMode()) //
        .overridingErrorMessage("Expected to not be in edit mode but was") //
        .isFalse();
    return myself;
  }

  public S isInTouchMode() {
    isNotNull();
    assertThat(actual.isInTouchMode()) //
        .overridingErrorMessage("Expected to be in touch mode but was not") //
        .isTrue();
    return myself;
  }

  public S isNotInTouchMode() {
    isNotNull();
    assertThat(actual.isInTouchMode()) //
        .overridingErrorMessage("Expected to not be in touch mode but was") //
        .isFalse();
    return myself;
  }

  public S hasLayoutRequested() {
    isNotNull();
    assertThat(actual.isLayoutRequested()) //
        .overridingErrorMessage("Expected to have layout requested but was not") //
        .isTrue();
    return myself;
  }

  public S hasNoLayoutRequested() {
    isNotNull();
    assertThat(actual.isLayoutRequested()) //
        .overridingErrorMessage("Expected to not have layout requested but had") //
        .isFalse();
    return myself;
  }

  public S isLongClickable() {
    isNotNull();
    assertThat(actual.isLongClickable()) //
        .overridingErrorMessage("Expected to be long-clickable but was not") //
        .isTrue();
    return myself;
  }

  public S isNotLongClickable() {
    isNotNull();
    assertThat(actual.isLongClickable()) //
        .overridingErrorMessage("Expected to not be long-clickable but was") //
        .isFalse();
    return myself;
  }

  public S isOpaque() {
    isNotNull();
    assertThat(actual.isOpaque()) //
        .overridingErrorMessage("Expected to be opaque but was not") //
        .isTrue();
    return myself;
  }

  public S isNotOpaque() {
    isNotNull();
    assertThat(actual.isOpaque()) //
        .overridingErrorMessage("Expected to not be opaque but was") //
        .isFalse();
    return myself;
  }

  public S isPressed() {
    isNotNull();
    assertThat(actual.isPressed()) //
        .overridingErrorMessage("Expected to be pressed but was not") //
        .isTrue();
    return myself;
  }

  public S isNotPressed() {
    isNotNull();
    assertThat(actual.isPressed()) //
        .overridingErrorMessage("Expected to not be pressed but was") //
        .isFalse();
    return myself;
  }

  public S hasSaveEnabled() {
    isNotNull();
    assertThat(actual.isSaveEnabled()) //
        .overridingErrorMessage("Expected to have save enabled but was disabled") //
        .isTrue();
    return myself;
  }

  public S hasSaveDisabled() {
    isNotNull();
    assertThat(actual.isSaveEnabled()) //
        .overridingErrorMessage("Expected to have save disabled but was enabled") //
        .isFalse();
    return myself;
  }

  public S hasSaveFromParentEnabled() {
    isNotNull();
    assertThat(actual.isSaveFromParentEnabled()) //
        .overridingErrorMessage("Expected to have save from parent enabled but was disabled") //
        .isTrue();
    return myself;
  }

  public S hasSaveFromParentDisabled() {
    isNotNull();
    assertThat(actual.isSaveFromParentEnabled()) //
        .overridingErrorMessage("Expected to have save from parent disabled but was enabled") //
        .isFalse();
    return myself;
  }

  public S isScrollContainer() {
    isNotNull();
    assertThat(actual.isScrollContainer()) //
        .overridingErrorMessage("Expected to be a scroll container but was not") //
        .isTrue();
    return myself;
  }

  public S isNotScrollContainer() {
    isNotNull();
    assertThat(actual.isScrollContainer()) //
        .overridingErrorMessage("Expected to not be a scroll container but was") //
        .isFalse();
    return myself;
  }

  public S hasScrollbarFadingEnabled() {
    isNotNull();
    assertThat(actual.isScrollbarFadingEnabled()) //
        .overridingErrorMessage("Expected to have scroll bar fading enabled but was disabled") //
        .isTrue();
    return myself;
  }

  public S hasScrollbarFadingDisabled() {
    isNotNull();
    assertThat(actual.isScrollbarFadingEnabled()) //
        .overridingErrorMessage("Expected to have scroll bar fading disabled but was enabled") //
        .isFalse();
    return myself;
  }

  public S isSelected() {
    isNotNull();
    assertThat(actual.isSelected()) //
        .overridingErrorMessage("Expected to be selected but was not") //
        .isTrue();
    return myself;
  }

  public S isNotSelected() {
    isNotNull();
    assertThat(actual.isSelected()) //
        .overridingErrorMessage("Expected to not be selected but was") //
        .isFalse();
    return myself;
  }

  public S isShown() {
    isNotNull();
    assertThat(actual.isShown()) //
        .overridingErrorMessage("Expected to be shown but was not") //
        .isTrue();
    return myself;
  }

  public S isNotShown() {
    isNotNull();
    assertThat(actual.isShown()) //
        .overridingErrorMessage("Expected to not be shown but was") //
        .isFalse();
    return myself;
  }

  public S hasSoundEffectsEnabled() {
    isNotNull();
    assertThat(actual.isSoundEffectsEnabled()) //
        .overridingErrorMessage("Expected sound effects to be enabled but was disabled") //
        .isTrue();
    return myself;
  }

  public S hasSoundEffectsDisabled() {
    isNotNull();
    assertThat(actual.isSaveFromParentEnabled()) //
        .overridingErrorMessage("Expected sound effects to be disabled but was enabled") //
        .isFalse();
    return myself;
  }

  public S hasVerticalFadingEdgeEnabled() {
    isNotNull();
    assertThat(actual.isVerticalFadingEdgeEnabled()) //
        .overridingErrorMessage("Expected to have vertical fading edge enabled but was disabled") //
        .isTrue();
    return myself;
  }

  public S hasVerticalFadingEdgeDisabled() {
    isNotNull();
    assertThat(actual.isVerticalFadingEdgeEnabled()) //
        .overridingErrorMessage("Expected to have vertical fading edge disabled but was enabled") //
        .isFalse();
    return myself;
  }

  public S hasVerticalScrollBarEnabled() {
    isNotNull();
    assertThat(actual.isVerticalScrollBarEnabled()) //
        .overridingErrorMessage("Expected to have vertical scroll bar enabled but was disabled") //
        .isTrue();
    return myself;
  }

  public S hasVerticalScrollBarDisabled() {
    isNotNull();
    assertThat(actual.isVerticalScrollBarEnabled()) //
        .overridingErrorMessage("Expected to have vertical scroll bar disabled but was enabled") //
        .isFalse();
    return myself;
  }

  private static String visibilityToString(int visibility) {
    switch (visibility) {
      case VISIBLE:
        return "visible";
      case INVISIBLE:
        return "invisible";
      case GONE:
        return "gone";
      default:
        throw new IllegalArgumentException("Unknown view visibility: " + visibility);
    }
  }

  private static String layerTypeToString(int type) {
    switch (type) {
      case View.LAYER_TYPE_NONE:
        return "none";
      case View.LAYER_TYPE_SOFTWARE:
        return "software";
      case View.LAYER_TYPE_HARDWARE:
        return "hardware";
      default:
        throw new IllegalArgumentException("Unknown layer type: " + type);
    }
  }

  // TODO API 17
  //private static String layoutDirectionToString(int direction) {
  //  switch (direction) {
  //    case LAYOUT_DIRECTION_RTL:
  //      return "rtl";
  //    case LAYOUT_DIRECTION_LTR:
  //      return "ltr";
  //    default:
  //      throw new IllegalArgumentException("Unknown layout direction: " + direction);
  //  }
  //}

  private static String overScrollModeToString(int mode) {
    switch (mode) {
      case OVER_SCROLL_ALWAYS:
        return "always";
      case OVER_SCROLL_IF_CONTENT_SCROLLS:
        return "ifContentScrolls";
      case OVER_SCROLL_NEVER:
        return "never";
      default:
        throw new IllegalArgumentException("Unknown over scroll mode: " + mode);
    }
  }

  private static String scrollBarStyleToString(int style) {
    switch (style) {
      case SCROLLBARS_INSIDE_INSET:
        return "insideInset";
      case SCROLLBARS_INSIDE_OVERLAY:
        return "insideOverlay";
      case SCROLLBARS_OUTSIDE_INSET:
        return "outsideInset";
      case SCROLLBARS_OUTSIDE_OVERLAY:
        return "outsideOverlay";
      default:
        throw new IllegalArgumentException("Unknown scroll bar style: " + style);
    }
  }

  private static String verticalScrollBarPositionToString(int position) {
    switch (position) {
      case SCROLLBAR_POSITION_DEFAULT:
        return "default";
      case SCROLLBAR_POSITION_LEFT:
        return "left";
      case SCROLLBAR_POSITION_RIGHT:
        return "right";
      default:
        throw new IllegalArgumentException("Unknown vertical scroll bar position: " + position);
    }
  }
}
