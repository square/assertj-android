// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.widget.DatePicker;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static org.assertj.core.api.Assertions.assertThat;

public class DatePickerAssert extends AbstractFrameLayoutAssert<DatePickerAssert, DatePicker> {
  public DatePickerAssert(DatePicker actual) {
    super(actual, DatePickerAssert.class);
  }

  @TargetApi(HONEYCOMB)
  public DatePickerAssert isShowingCalendarView() {
    isNotNull();
    assertThat(actual.getCalendarViewShown()) //
        .overridingErrorMessage("Expected calendar view to be showing but was not.") //
        .isTrue();
    return this;
  }

  @TargetApi(HONEYCOMB)
  public DatePickerAssert isNotShowingCalendarView() {
    isNotNull();
    assertThat(actual.getCalendarViewShown()) //
        .overridingErrorMessage("Expected calendar view to not be showing but was.") //
        .isFalse();
    return this;
  }

  public DatePickerAssert hasDayOfMonth(int day) {
    isNotNull();
    int actualDay = actual.getDayOfMonth();
    assertThat(actualDay) //
        .overridingErrorMessage("Expected day of month <%s> but was <%s>.", day, actualDay) //
        .isEqualTo(day);
    return this;
  }

  @TargetApi(HONEYCOMB)
  public DatePickerAssert hasMaxDate(long date) {
    isNotNull();
    long actualDate = actual.getMaxDate();
    assertThat(actualDate) //
        .overridingErrorMessage("Expected max date <%s> but was <%s>.", date, actualDate) //
        .isEqualTo(date);
    return this;
  }

  @TargetApi(HONEYCOMB)
  public DatePickerAssert hasMinDate(long date) {
    isNotNull();
    long actualDate = actual.getMinDate();
    assertThat(actualDate) //
        .overridingErrorMessage("Expected min date <%s> but was <%s>.", date, actualDate) //
        .isEqualTo(date);
    return this;
  }

  public DatePickerAssert hasMonth(int month) {
    isNotNull();
    int actualMonth = actual.getMonth();
    assertThat(actualMonth) //
        .overridingErrorMessage("Expected month <%s> but was <%s>.", month, actualMonth) //
        .isEqualTo(month);
    return this;
  }

  @TargetApi(HONEYCOMB)
  public DatePickerAssert isShowingSpinners() {
    isNotNull();
    assertThat(actual.getSpinnersShown()) //
        .overridingErrorMessage("Expected to be showing spinners but was not.") //
        .isTrue();
    return this;
  }

  @TargetApi(HONEYCOMB)
  public DatePickerAssert isNotShowingSpinners() {
    isNotNull();
    assertThat(actual.getSpinnersShown()) //
        .overridingErrorMessage("Expected to not be showing spinners but was.") //
        .isFalse();
    return this;
  }

  public DatePickerAssert hasYear(int year) {
    isNotNull();
    int actualYear = actual.getYear();
    assertThat(actualYear) //
        .overridingErrorMessage("Expected year <%s> but was <%s>.", year, actualYear) //
        .isEqualTo(year);
    return this;
  }
}
