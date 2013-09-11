package org.fest.assertions.api.android.widget;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import org.fest.assertions.api.android.view.AbstractViewAssert;
import java.util.regex.Pattern;

import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractTextViewAssert<S extends AbstractTextViewAssert<S, A>, A extends TextView>
    extends AbstractViewAssert<S, A> {
  protected AbstractTextViewAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasAutoLinkMask(int mask) {
    isNotNull();
    int actualMask = actual.getAutoLinkMask();
    assertThat(actualMask) //
        .overridingErrorMessage("Expected auto-link mask <%s> but was <%s>.", mask, actualMask) //
        .isEqualTo(mask);
    return myself;
  }

  public S hasCompoundDrawablePadding(int padding) {
    isNotNull();
    int actualPadding = actual.getCompoundDrawablePadding();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected compound drawable padding <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  public S hasCompoundPaddingBottom(int padding) {
    isNotNull();
    int actualPadding = actual.getCompoundPaddingBottom();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected compound drawable bottom padding <%s> but was <%s>.",
            padding, actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  // TODO API 17
  //public S hasCompoundPaddingEnd(int padding) {
  //  isNotNull();
  //  int actualPadding = actual.getCompoundPaddingEnd();
  //  assertThat(actualPadding) //
  //      .overridingErrorMessage("Expected compound drawable end padding <%s> but was <%s>.",
  //          padding, actualPadding) //
  //      .isEqualTo(padding);
  //  return myself;
  //}

  public S hasCompoundPaddingLeft(int padding) {
    isNotNull();
    int actualPadding = actual.getCompoundPaddingLeft();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected compound drawable left padding <%s> but was <%s>.",
            padding, actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  public S hasCompoundPaddingRight(int padding) {
    isNotNull();
    int actualPadding = actual.getCompoundPaddingRight();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected compound drawable right padding <%s> but was <%s>.",
            padding, actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  // TODO API 17
  //public S hasCompoundPaddingStart(int padding) {
  //  isNotNull();
  //  int actualPadding = actual.getCompoundPaddingStart();
  //  assertThat(actualPadding) //
  //      .overridingErrorMessage("Expected compound drawable start padding <%s> but was <%s>.",
  //          padding, actualPadding) //
  //      .isEqualTo(padding);
  //  return myself;
  //}

  public S hasCompoundPaddingTop(int padding) {
    isNotNull();
    int actualPadding = actual.getCompoundPaddingTop();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected compound drawable top padding <%s> but was <%s>.",
            padding, actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  public S hasCurrentHintTextColor(int color) {
    isNotNull();
    int actualColor = actual.getCurrentHintTextColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected current hint text color <%s> but was <%s>.",
            Integer.toHexString(color), Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return myself;
  }

  public S hasCurrentTextColor(int color) {
    isNotNull();
    int actualColor = actual.getCurrentTextColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected current text color <%s> but was <%s>.",
            Integer.toHexString(color), Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return myself;
  }

  public S hasEllipsize(TextUtils.TruncateAt truncation) {
    isNotNull();
    TextUtils.TruncateAt actualTruncation = actual.getEllipsize();
    assertThat(actualTruncation) //
        .overridingErrorMessage("Expected ellipsize <%s> but was <%s>.",
            truncateAtToString(truncation), truncateAtToString(actualTruncation)) //
        .isEqualTo(truncation);
    return myself;
  }

  public S hasError() {
    isNotNull();
    assertThat(actual.getError()) //
        .overridingErrorMessage("Expected error but had none.") //
        .isNotNull();
    return myself;
  }

  public S hasNoError() {
    isNotNull();
    assertThat(actual.getError()) //
        .overridingErrorMessage("Expected no error but had one.") //
        .isNull();
    return myself;
  }

  public S hasError(CharSequence error) {
    isNotNull();
    CharSequence actualError = actual.getError();
    assertThat(actualError) //
        .overridingErrorMessage("Expected error <%s> but was <%s>.", error, actualError) //
        .isEqualTo(error);
    return myself;
  }

  public S hasError(int resId) {
    isNotNull();
    return hasError(actual.getContext().getString(resId));
  }

  public S hasExtendedPaddingBottom(int padding) {
    isNotNull();
    int actualPadding = actual.getExtendedPaddingBottom();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected extended bottom padding <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  public S hasExtendedPaddingTop(int padding) {
    isNotNull();
    int actualPadding = actual.getExtendedPaddingTop();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected extended top padding <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  public S hasFreezesText(boolean freezes) {
    isNotNull();
    boolean actualFreezes = actual.getFreezesText();
    assertThat(actualFreezes) //
        .overridingErrorMessage("Expected freezes text <%s> but was <%s>.", freezes,
            actualFreezes) //
        .isEqualTo(freezes);
    return myself;
  }

  public S hasGravity(int gravity) {
    isNotNull();
    int actualGravity = actual.getGravity();
    // TODO tostring the flags for output
    assertThat(actualGravity) //
        .overridingErrorMessage("Expected gravity <%s> but was <%s>.", gravity, actualGravity) //
        .isEqualTo(gravity);
    return myself;
  }

  public S hasHighlightColor(int color) {
    isNotNull();
    int actualColor = actual.getHighlightColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected highlight color <%s> but was <%s>.",
            Integer.toHexString(color), Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return myself;
  }

  public S hasHint(CharSequence hint) {
    isNotNull();
    CharSequence actualHint = actual.getHint();
    assertThat(actualHint) //
        .overridingErrorMessage("Expected hint <%s> but was <%s>.", hint, actualHint) //
        .isEqualTo(hint);
    return myself;
  }

  public S hasHint(int resId) {
    isNotNull();
    return hasHint(actual.getContext().getString(resId));
  }

  public S hasImeActionId(int id) {
    isNotNull();
    int actualId = actual.getImeActionId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected IME action ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return myself;
  }

  public S hasImeActionLabel(CharSequence label) {
    isNotNull();
    CharSequence actualLabel = actual.getImeActionLabel();
    assertThat(actualLabel) //
        .overridingErrorMessage("Expected IME action label <%s> but was <%s>.", label,
            actualLabel) //
        .isEqualTo(label);
    return myself;
  }

  public S hasImeActionLabel(int resId) {
    isNotNull();
    return hasImeActionLabel(actual.getContext().getString(resId));
  }

  public S hasImeOptions(int options) {
    isNotNull();
    int actualOptions = actual.getImeOptions();
    assertThat(actualOptions) //
        // TODO tostring flags values
        .overridingErrorMessage("Expected IME options <%s> but was <%s>.", options,
            actualOptions) //
        .isEqualTo(options);
    return myself;
  }

  public S isIncludingFontPadding() {
    isNotNull();
    assertThat(actual.getIncludeFontPadding()) //
        .overridingErrorMessage("Expected to be including font padding but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotIncludingFontPadding() {
    isNotNull();
    assertThat(actual.getIncludeFontPadding()) //
        .overridingErrorMessage("Expected to not be including font padding but was.") //
        .isFalse();
    return myself;
  }

  public S hasInputType(int type) {
    isNotNull();
    int actualType = actual.getInputType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected input type <%s> but was <%s>.", type, actualType) //
        .isEqualTo(type);
    return myself;
  }

  public S hasLineCount(int count) {
    isNotNull();
    int actualCount = actual.getLineCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected line count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return myself;
  }

  public S hasLineHeight(int height) {
    isNotNull();
    int actualHeight = actual.getLineHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected line height <%s> but was <%s>.", height, actualHeight) //
        .isEqualTo(height);
    return myself;
  }

  public S hasLineSpacingExtra(float extra) {
    isNotNull();
    float actualExtra = actual.getLineSpacingExtra();
    assertThat(actualExtra) //
        .overridingErrorMessage("Expected line spacing extra <%s> but was <%s>.", extra,
            actualExtra) //
        .isEqualTo(extra);
    return myself;
  }

  public S hasLineSpacingMultiplier(float multiplier) {
    isNotNull();
    float actualMultiplier = actual.getLineSpacingMultiplier();
    assertThat(actualMultiplier) //
        .overridingErrorMessage("Expected line spacing multiplier <%s> but was <%s>.", multiplier,
            actualMultiplier) //
        .isEqualTo(multiplier);
    return myself;
  }

  public S hasMarqueeRepeatLimit(int limit) {
    isNotNull();
    int actualLimit = actual.getMarqueeRepeatLimit();
    assertThat(actualLimit) //
        .overridingErrorMessage("Expected marquee repeat limit <%s> but was <%s>.", limit,
            actualLimit) //
        .isEqualTo(limit);
    return myself;
  }

  public S hasMaxEms(int ems) {
    isNotNull();
    int actualEms = actual.getMaxEms();
    assertThat(actualEms) //
        .overridingErrorMessage("Expected maximum EMs <%s> but was <%s>.", ems, actualEms) //
        .isEqualTo(ems);
    return myself;
  }

  public S hasMaxHeight(int height) {
    isNotNull();
    int actualHeight = actual.getMaxHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected maximum height <%s> but was <%s>.", height,
            actualHeight) //
        .isEqualTo(height);
    return myself;
  }

  public S hasMaxLines(int lines) {
    isNotNull();
    int actualLines = actual.getMaxLines();
    assertThat(actualLines) //
        .overridingErrorMessage("Expected maximum lines <%s> but was <%s>.", lines, actualLines) //
        .isEqualTo(lines);
    return myself;
  }

  public S hasMaxWidth(int ems) {
    isNotNull();
    int actualWidth = actual.getMaxWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected maximum width <%s> but was <%s>.", ems, actualWidth) //
        .isEqualTo(ems);
    return myself;
  }

  public S hasMinEms(int ems) {
    isNotNull();
    int actualEms = actual.getMinEms();
    assertThat(actualEms) //
        .overridingErrorMessage("Expected minimum EMs <%s> but was <%s>.", ems, actualEms) //
        .isEqualTo(ems);
    return myself;
  }

  public S hasMinHeight(int height) {
    isNotNull();
    int actualHeight = actual.getMinHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected minimum height <%s> but was <%s>.", height,
            actualHeight) //
        .isEqualTo(height);
    return myself;
  }

  public S hasMinLines(int lines) {
    isNotNull();
    int actualLines = actual.getMinLines();
    assertThat(actualLines) //
        .overridingErrorMessage("Expected minimum lines <%s> but was <%s>.", lines, actualLines) //
        .isEqualTo(lines);
    return myself;
  }

  public S hasMinWidth(int ems) {
    isNotNull();
    int actualWidth = actual.getMinWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected minimum width <%s> but was <%s>.", ems, actualWidth) //
        .isEqualTo(ems);
    return myself;
  }

  public S hasPaintFlags(int flags) {
    isNotNull();
    int actualFlags = actual.getPaintFlags();
    assertThat(actualFlags) //
        .overridingErrorMessage("Expected paint flags <%s> but was <%s>.", flags, actualFlags) //
        .isEqualTo(flags);
    return myself;
  }

  public S hasSelectionEnd(int position) {
    isNotNull();
    int actualPosition = actual.getSelectionEnd();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected selection end <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return myself;
  }

  public S hasSelectionStart(int position) {
    isNotNull();
    int actualPosition = actual.getSelectionStart();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected selection start <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return myself;
  }

  public S hasShadowColor(int color) {
    isNotNull();
    int actualColor = actual.getShadowColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected shadow color <%s> but was <%s>.",
            Integer.toHexString(color), Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return myself;
  }

  public S hasShadowDx(float dx) {
    isNotNull();
    float actualDx = actual.getShadowDx();
    assertThat(actualDx) //
        .overridingErrorMessage("Expected shadow DX <%s> but was <%s>.", dx, actualDx) //
        .isEqualTo(dx);
    return myself;
  }

  public S hasShadowDy(float dy) {
    isNotNull();
    float actualDy = actual.getShadowDy();
    assertThat(actualDy) //
        .overridingErrorMessage("Expected shadow DY <%s> but was <%s>.", dy, actualDy) //
        .isEqualTo(dy);
    return myself;
  }

  public S hasShadowRadius(float radius) {
    isNotNull();
    float actualRadius = actual.getShadowRadius();
    assertThat(actualRadius) //
        .overridingErrorMessage("Expected shadow radius <%s> but was <%s>.", radius,
            actualRadius) //
        .isEqualTo(radius);
    return myself;
  }

  public S hasText(CharSequence text) {
    isNotNull();
    CharSequence actualText = actual.getText();
    assertThat(actualText) //
        .overridingErrorMessage("Expected text <%s> but was <%s>.", text, actualText) //
        .isEqualTo(text);
    return myself;
  }

  public S hasText(int resId) {
    isNotNull();
    return hasText(actual.getContext().getString(resId));
  }

  public S hasTextString(String text) {
    isNotNull();
    String actualText = actual.getText().toString();
    assertThat(actualText) //
        .overridingErrorMessage("Expected text string <%s> but was <%s>.", text, actualText) //
        .isEqualTo(text);
    return myself;
  }

  public S hasTextString(int resId) {
    isNotNull();
    return hasTextString(actual.getContext().getString(resId));
  }

  public S isEmpty() {
    isNotNull();
    return hasTextString("");
  }

  public S isNotEmpty() {
    isNotNull();
    CharSequence text = actual.getText();
    assertThat(text) //
        .overridingErrorMessage("Expected empty text but was <%s>.", text) //
        .isNotEqualTo("");
    return myself;
  }

  public S matches(Pattern pattern) {
    isNotNull();
    String text = actual.getText().toString();
    assertThat(pattern.matcher(text).matches())
        .overridingErrorMessage("Expected text <%s> to match <%s>, but did not.", text,
            pattern.pattern())
        .isTrue();
    return myself;
  }

  public S doesNotMatch(Pattern pattern) {
    isNotNull();
    String text = actual.getText().toString();
    assertThat(pattern.matcher(text).matches())
        .overridingErrorMessage("Expected text <%s> to not match <%s>, but did.", text,
            pattern.pattern())
        .isFalse();
    return myself;
  }

  public S containsText(String sequence) {
    isNotNull();
    assertThat(actual.getText().toString()).contains(sequence);
    return myself;
  }

  public S containsText(int resId) {
    isNotNull();
    return containsText(actual.getContext().getString(resId));
  }

  public S doesNotContainText(String sequence) {
    isNotNull();
    assertThat(actual.getText().toString()).doesNotContain(sequence);
    return myself;
  }

  public S doesNotContainText(int resId) {
    isNotNull();
    return doesNotContainText(actual.getContext().getString(resId));
  }

  public S startsWithText(String sequence) {
    isNotNull();
    String text = actual.getText().toString();
    assertThat(text.startsWith(sequence)) //
        .overridingErrorMessage("Expected text <%s> to start with <%s> but did not.", text,
            sequence) //
        .isTrue();
    return myself;
  }

  public S startsWithText(int resId) {
    isNotNull();
    return startsWithText(actual.getContext().getString(resId));
  }

  public S doesNotStartWithText(String sequence) {
    isNotNull();
    String text = actual.getText().toString();
    assertThat(text.startsWith(sequence)) //
        .overridingErrorMessage("Expected text <%s> to not start with <%s> but did.", text,
            sequence) //
        .isFalse();
    return myself;
  }

  public S doesNotStartWithText(int resId) {
    isNotNull();
    return doesNotStartWithText(actual.getContext().getString(resId));
  }

  public S endsWithText(String sequence) {
    isNotNull();
    String text = actual.getText().toString();
    assertThat(text.startsWith(sequence)) //
        .overridingErrorMessage("Expected text <%s> to end with <%s> but did not.", text,
            sequence) //
        .isTrue();
    return myself;
  }

  public S endsWithText(int resId) {
    isNotNull();
    return endsWithText(actual.getContext().getString(resId));
  }

  public S doesNotEndWithText(String sequence) {
    isNotNull();
    String text = actual.getText().toString();
    assertThat(text.startsWith(sequence)) //
        .overridingErrorMessage("Expected text <%s> to not end with <%s> but did.", text,
            sequence) //
        .isFalse();
    return myself;
  }

  public S doesNotEndWithText(int resId) {
    isNotNull();
    return doesNotEndWithText(actual.getContext().getString(resId));
  }

  // TODO API 17
  //public S hasTextLocale(Locale locale) {
  //  isNotNull();
  //  Locale actualLocale = actual.getTextLocale();
  //  assertThat(actualLocale) //
  //      .overridingErrorMessage("Expected text locale <%s> but was <%s>.", locale, actualLocale) //
  //      .isEqualTo(locale);
  //  return myself;
  //}

  public S hasTextScaleX(float scale) {
    isNotNull();
    float actualScale = actual.getTextScaleX();
    assertThat(actualScale) //
        .overridingErrorMessage("Expected text X scale <%s> but was <%s>.", scale, actualScale) //
        .isEqualTo(scale);
    return myself;
  }

  public S hasTextSize(float size) {
    isNotNull();
    float actualSize = actual.getTextSize();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected text size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return myself;
  }

  public S hasTotalPaddingBottom(int padding) {
    isNotNull();
    int actualPadding = actual.getTotalPaddingBottom();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected total bottom padding <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  // TODO API 17
  //public S hasTotalPaddingEnd(int padding) {
  //  isNotNull();
  //  int actualPadding = actual.getTotalPaddingEnd();
  //  assertThat(actualPadding) //
  //      .overridingErrorMessage("Expected total end padding <%s> but was <%s>.", padding,
  //          actualPadding) //
  //      .isEqualTo(padding);
  //  return myself;
  //}

  public S hasTotalPaddingLeft(int padding) {
    isNotNull();
    int actualPadding = actual.getTotalPaddingLeft();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected total left padding <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  public S hasTotalPaddingRight(int padding) {
    isNotNull();
    int actualPadding = actual.getTotalPaddingRight();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected total right padding <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  // TODO API 17
  //public S hasTotalPaddingStart(int padding) {
  //  isNotNull();
  //  int actualPadding = actual.getTotalPaddingStart();
  //  assertThat(actualPadding) //
  //      .overridingErrorMessage("Expected total start padding <%s> but was <%s>.", padding,
  //          actualPadding) //
  //      .isEqualTo(padding);
  //  return myself;
  //}

  public S hasTotalPaddingTop(int padding) {
    isNotNull();
    int actualPadding = actual.getTotalPaddingTop();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected total top padding <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  public S hasTypeface(Typeface typeface) {
    isNotNull();
    Typeface actualTypeface = actual.getTypeface();
    assertThat(actualTypeface) //
        .overridingErrorMessage("Expected typeface <%s> but was <%s>.", typeface, actualTypeface) //
        .isSameAs(typeface);
    return myself;
  }

  public S isCursorVisible() {
    isNotNull();
    assertThat(actual.isCursorVisible()) //
        .overridingErrorMessage("Expected cursor to be visible but was not visible.") //
        .isTrue();
    return myself;
  }

  public S isCursorNotVisible() {
    isNotNull();
    assertThat(actual.isCursorVisible()) //
        .overridingErrorMessage("Expected cursor to not be visible but was visible.") //
        .isFalse();
    return myself;
  }

  public S hasSelectableText() {
    isNotNull();
    assertThat(actual.isTextSelectable()) //
        .overridingErrorMessage("Expected text to be selectable but was not.") //
        .isTrue();
    return myself;
  }

  public S hasUnselectableText() {
    isNotNull();
    assertThat(actual.isTextSelectable()) //
        .overridingErrorMessage("Expected text to not be selectable but was.") //
        .isFalse();
    return myself;
  }

  public S hasLength(int length) {
    isNotNull();
    int actualLength = actual.length();
    assertThat(actualLength) //
        .overridingErrorMessage("Expected length <%s> but was <%s>.", length, actualLength) //
        .isEqualTo(length);
    return myself;
  }

  public S isInputMethodTarget() {
    isNotNull();
    assertThat(actual.isInputMethodTarget()) //
        .overridingErrorMessage("Expected to be the input method target but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotInputMethodTarget() {
    isNotNull();
    assertThat(actual.isInputMethodTarget()) //
        .overridingErrorMessage("Expected to not be the input method target but was.") //
        .isFalse();
    return myself;
  }

  private static String truncateAtToString(TextUtils.TruncateAt truncation) {
    switch (truncation) {
      case END:
        return "end";
      case MARQUEE:
        return "marquee";
      case MIDDLE:
        return "middle";
      case START:
        return "start";
      default:
        throw new IllegalArgumentException("Unknown truncation: " + truncation);
    }
  }
}
