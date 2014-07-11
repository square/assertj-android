// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.widget.CalendarView;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(HONEYCOMB)
public class CalendarViewAssert
    extends AbstractFrameLayoutAssert<CalendarViewAssert, CalendarView> {
  public CalendarViewAssert(CalendarView actual) {
    super(actual, CalendarViewAssert.class);
  }

  public CalendarViewAssert hasDate(long date) {
    isNotNull();
    long actualDate = actual.getDate();
    assertThat(actualDate) //
        .overridingErrorMessage("Expected date <%s> but was <%s>.", date, actualDate) //
        .isEqualTo(date);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public CalendarViewAssert hasDateTextAppearance(int resId) {
    isNotNull();
    int actualResId = actual.getDateTextAppearance();
    assertThat(actualResId) //
        .overridingErrorMessage("Expected date text appearance resource ID <%s> but was <%s>.",
            resId, actualResId) //
        .isEqualTo(resId);
    return this;
  }

  public CalendarViewAssert hasFirstDayOfWeek(int day) {
    isNotNull();
    int actualDay = actual.getFirstDayOfWeek();
    assertThat(actualDay) //
        .overridingErrorMessage("Expected first day of week <%s> but was <%s>.", day, actualDay) //
        .isEqualTo(day);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public CalendarViewAssert hasFocusedMonthDateColor(int color) {
    isNotNull();
    int actualColor = actual.getFocusedMonthDateColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected focused month date color <%s> but was <%s>.",
            Integer.toHexString(color), Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return this;
  }

  public CalendarViewAssert hasMaxDate(long date) {
    isNotNull();
    long actualDate = actual.getMaxDate();
    assertThat(actualDate) //
        .overridingErrorMessage("Expected max date <%s> but was <%s>.", date, actualDate) //
        .isEqualTo(date);
    return this;
  }

  public CalendarViewAssert hasMinDate(long date) {
    isNotNull();
    long actualDate = actual.getMinDate();
    assertThat(actualDate) //
        .overridingErrorMessage("Expected min date <%s> but was <%s>.", date, actualDate) //
        .isEqualTo(date);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public CalendarViewAssert hasSelectedDateVerticalBar(Drawable drawable) {
    isNotNull();
    Drawable actualDrawable = actual.getSelectedDateVerticalBar();
    assertThat(actualDrawable) //
        .overridingErrorMessage("Expected selected date vertical bar <%s> but was <%s>.", drawable,
            actualDrawable) //
        .isSameAs(drawable);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public CalendarViewAssert hasSelectedWeekBackgroundColor(int color) {
    isNotNull();
    int actualColor = actual.getSelectedWeekBackgroundColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected selected week background color <%s> but was <%s>.",
            Integer.toHexString(color), Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return this;
  }

  public CalendarViewAssert isShowingWeekNumber() {
    isNotNull();
    assertThat(actual.getShowWeekNumber()) //
        .overridingErrorMessage("Expected to be showing week number but was not.") //
        .isTrue();
    return this;
  }

  public CalendarViewAssert isNotShowingWeekNumber() {
    isNotNull();
    assertThat(actual.getShowWeekNumber()) //
        .overridingErrorMessage("Expected to not be showing week number but was.") //
        .isFalse();
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public CalendarViewAssert hasShownWeekCount(int count) {
    isNotNull();
    int actualCount = actual.getShownWeekCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected shown week count <%s> but was <%s>.", count,
            actualCount) //
        .isEqualTo(count);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public CalendarViewAssert hasUnfocusedMonthDateColor(int color) {
    isNotNull();
    int actualColor = actual.getUnfocusedMonthDateColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected unfocused month date color <%s> but was <%s>.",
            Integer.toHexString(color), Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public CalendarViewAssert hasWeekDayTextAppearance(int resId) {
    isNotNull();
    int actualResId = actual.getWeekDayTextAppearance();
    assertThat(actualResId) //
        .overridingErrorMessage("Expected week day text appearance res ID <%s> but was <%s>.",
            resId, actualResId) //
        .isEqualTo(resId);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public CalendarViewAssert hasWeekNumberColor(int color) {
    isNotNull();
    int actualColor = actual.getWeekNumberColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected week number color <%s> but was <%s>.",
            Integer.toHexString(color), Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public CalendarViewAssert hasWeekSeparatorLineColor(int color) {
    isNotNull();
    int actualColor = actual.getWeekSeparatorLineColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected week separator line color <%s> but was <%s>.",
            Integer.toHexString(color), Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return this;
  }
}
