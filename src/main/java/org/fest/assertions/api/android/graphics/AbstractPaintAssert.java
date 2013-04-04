// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.graphics;

import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rasterizer;
import android.graphics.Shader;
import android.graphics.Typeface;
import org.fest.assertions.api.AbstractAssert;
import org.fest.assertions.api.android.util.BitMaskStringBuilder;

import static android.graphics.Paint.ANTI_ALIAS_FLAG;
import static android.graphics.Paint.DEV_KERN_TEXT_FLAG;
import static android.graphics.Paint.DITHER_FLAG;
import static android.graphics.Paint.FAKE_BOLD_TEXT_FLAG;
import static android.graphics.Paint.FILTER_BITMAP_FLAG;
import static android.graphics.Paint.LINEAR_TEXT_FLAG;
import static android.graphics.Paint.STRIKE_THRU_TEXT_FLAG;
import static android.graphics.Paint.SUBPIXEL_TEXT_FLAG;
import static android.graphics.Paint.UNDERLINE_TEXT_FLAG;
import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractPaintAssert<S extends AbstractPaintAssert<S, A>, A extends Paint>
    extends AbstractAssert<S, A> {
  protected AbstractPaintAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasAscent(float ascent) {
    isNotNull();
    float actualAscent = actual.ascent();
    assertThat(actualAscent) //
        .overridingErrorMessage("Expected ascent <%s> but was <%s>.", ascent, actualAscent) //
        .isEqualTo(ascent);
    return myself;
  }

  public S hasDescent(float descent) {
    isNotNull();
    float actualDescent = actual.descent();
    assertThat(actualDescent) //
        .overridingErrorMessage("Expected descent <%s> but was <%s>.", descent, actualDescent) //
        .isEqualTo(descent);
    return myself;
  }

  public S hasAlpha(int alpha) {
    isNotNull();
    int actualAlpha = actual.getAlpha();
    assertThat(actualAlpha) //
        .overridingErrorMessage("Expected alpha <%s> but was <%s>.", alpha, actualAlpha) //
        .isEqualTo(alpha);
    return myself;
  }

  public S hasColor(int color) {
    isNotNull();
    int actualColor = actual.getColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected color <%s> but was <%s>.", Integer.toHexString(color),
            Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return myself;
  }

  public S hasFlags(int flags) {
    isNotNull();
    int actualFlags = actual.getFlags();
    assertThat(actualFlags) //
        .overridingErrorMessage("Expected flags <%s> but was <%s>.", flagsToString(flags),
            flagsToString(actualFlags)) //
        .isEqualTo(flags);
    return myself;
  }

  public S hasFontSpacing(float spacing) {
    isNotNull();
    float actualSpacing = actual.getFontSpacing();
    assertThat(actualSpacing) //
        .overridingErrorMessage("Expected font spacing <%s> but was <%s>.", spacing,
            actualSpacing) //
        .isEqualTo(spacing);
    return myself;
  }

  public S hasHinting(int hinting) {
    isNotNull();
    int actualHinting = actual.getHinting();
    assertThat(actualHinting) //
        .overridingErrorMessage("Expected hinting <%s> but was <%s>.", hinting, actualHinting) //
        .isEqualTo(hinting);
    return myself;
  }

  public S hasMaskFilter(MaskFilter filter) {
    isNotNull();
    MaskFilter actualFilter = actual.getMaskFilter();
    assertThat(actualFilter) //
        .overridingErrorMessage("Expected mask filter <%s> but was <%s>.", filter, actualFilter) //
        .isSameAs(filter);
    return myself;
  }

  public S hasPathEffect(PathEffect effect) {
    isNotNull();
    PathEffect actualEffect = actual.getPathEffect();
    assertThat(actualEffect) //
        .overridingErrorMessage("Expected path effect <%s> but was <%s>.", effect, actualEffect) //
        .isSameAs(effect);
    return myself;
  }

  public S hasRasterizer(Rasterizer rasterizer) {
    isNotNull();
    Rasterizer actualRasterizer = actual.getRasterizer();
    assertThat(actualRasterizer) //
        .overridingErrorMessage("Expected rasterizer <%s> but was <%s>.", rasterizer,
            actualRasterizer) //
        .isSameAs(rasterizer);
    return myself;
  }

  public S hasShader(Shader shader) {
    isNotNull();
    Shader actualShader = actual.getShader();
    assertThat(actualShader) //
        .overridingErrorMessage("Expected shader <%s> but was <%s>.", shader, actualShader) //
        .isSameAs(shader);
    return myself;
  }

  public S hasStrokeCap(Paint.Cap cap) {
    isNotNull();
    Paint.Cap actualCap = actual.getStrokeCap();
    assertThat(actualCap) //
        .overridingErrorMessage("Expected stroke cap <%s> but was <%s>.", cap, actualCap) //
        .isEqualTo(cap);
    return myself;
  }

  public S hasStrokeJoin(Paint.Join join) {
    isNotNull();
    Paint.Join actualJoin = actual.getStrokeJoin();
    assertThat(actualJoin) //
        .overridingErrorMessage("Expected stroke join <%s> but was <%s>.", join, actualJoin) //
        .isEqualTo(join);
    return myself;
  }

  public S hasStrokeMiter(float miter) {
    isNotNull();
    float actualMiter = actual.getStrokeMiter();
    assertThat(actualMiter) //
        .overridingErrorMessage("Expected stroke miter <%s> but was <%s>.", miter, actualMiter) //
        .isEqualTo(miter);
    return myself;
  }

  public S hasStrokeWidth(float width) {
    isNotNull();
    float actualWidth = actual.getStrokeWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected stroke width <%s> but was <%s>.", width, actualWidth) //
        .isEqualTo(width);
    return myself;
  }

  public S hasStyle(Paint.Style style) {
    isNotNull();
    Paint.Style actualStyle = actual.getStyle();
    assertThat(actualStyle) //
        .overridingErrorMessage("Expected style <%s> but was <%s>.", style, actualStyle) //
        .isEqualTo(style);
    return myself;
  }

  public S hasTextAlign(Paint.Align align) {
    isNotNull();
    Paint.Align actualAlign = actual.getTextAlign();
    assertThat(actualAlign) //
        .overridingErrorMessage("Expected text align <%s> but was <%s>.", align, actualAlign) //
        .isEqualTo(align);
    return myself;
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

  public S hasTextSkewX(float skew) {
    isNotNull();
    float actualSkew = actual.getTextSkewX();
    assertThat(actualSkew) //
        .overridingErrorMessage("Expected text X skew <%s> but was <%s>.", skew, actualSkew) //
        .isEqualTo(skew);
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

  public S isAntiAliased() {
    isNotNull();
    assertThat(actual.isAntiAlias()) //
        .overridingErrorMessage("Expected to be anti-aliased but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotAntiAliased() {
    isNotNull();
    assertThat(actual.isAntiAlias()) //
        .overridingErrorMessage("Expected to not be anti-aliased but was.") //
        .isFalse();
    return myself;
  }

  public S isDithering() {
    isNotNull();
    assertThat(actual.isDither()) //
        .overridingErrorMessage("Expected to be dithering but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotDithering() {
    isNotNull();
    assertThat(actual.isDither()) //
        .overridingErrorMessage("Expected to not be dithering but was.") //
        .isFalse();
    return myself;
  }

  public S isFakingBoldText() {
    isNotNull();
    assertThat(actual.isFakeBoldText()) //
        .overridingErrorMessage("Expected to not be faking bold text but was.") //
        .isTrue();
    return myself;
  }

  public S isNotFakingBoldText() {
    isNotNull();
    assertThat(actual.isFakeBoldText()) //
        .overridingErrorMessage("Expected to not be faking bold text but was.") //
        .isFalse();
    return myself;
  }

  public S isStrikingThroughText() {
    isNotNull();
    assertThat(actual.isStrikeThruText()) //
        .overridingErrorMessage("Expected to be striking through text but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotStrikingThroughText() {
    isNotNull();
    assertThat(actual.isStrikeThruText()) //
        .overridingErrorMessage("Expected to be striking through text but was not.") //
        .isFalse();
    return myself;
  }

  public S isSubpixelText() {
    isNotNull();
    assertThat(actual.isSubpixelText()) //
        .overridingErrorMessage("Expected to have subpixel text but did not.") //
        .isTrue();
    return myself;
  }

  public S isNotSubpixelText() {
    isNotNull();
    assertThat(actual.isSubpixelText()) //
        .overridingErrorMessage("Expected to not have subpixel text but did.") //
        .isFalse();
    return myself;
  }

  public S isUnderliningText() {
    isNotNull();
    assertThat(actual.isUnderlineText()) //
        .overridingErrorMessage("Expected to be underlining text but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotUnderliningText() {
    isNotNull();
    assertThat(actual.isUnderlineText()) //
        .overridingErrorMessage("Expected to not be underlining text but was.") //
        .isFalse();
    return myself;
  }

  private static String flagsToString(int flags) {
    return new BitMaskStringBuilder(flags) //
        .flag(ANTI_ALIAS_FLAG, "antiAlias")
        .flag(DEV_KERN_TEXT_FLAG, "devKern")
        .flag(DITHER_FLAG, "dither")
        .flag(FAKE_BOLD_TEXT_FLAG, "fakeBold")
        .flag(FILTER_BITMAP_FLAG, "filterBitmap")
        .flag(LINEAR_TEXT_FLAG, "linearText")
        .flag(STRIKE_THRU_TEXT_FLAG, "strikeThrough")
        .flag(SUBPIXEL_TEXT_FLAG, "subpixelText")
        .flag(UNDERLINE_TEXT_FLAG, "underline")
        .get();
  }
}
