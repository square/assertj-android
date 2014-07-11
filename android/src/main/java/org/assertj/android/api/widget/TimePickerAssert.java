// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.widget.TimePicker;

import static org.assertj.core.api.Assertions.assertThat;

public class TimePickerAssert extends AbstractFrameLayoutAssert<TimePickerAssert, TimePicker> {
  public TimePickerAssert(TimePicker actual) {
    super(actual, TimePickerAssert.class);
  }

  public TimePickerAssert hasCurrentHour(Integer hour) {
    isNotNull();
    Integer actualHour = actual.getCurrentHour();
    assertThat(actualHour) //
        .overridingErrorMessage("Expected current hour <%s> but was <%s>.", hour, actualHour) //
        .isEqualTo(hour);
    return this;
  }

  public TimePickerAssert hasCurrentMinute(Integer minute) {
    isNotNull();
    Integer actualMinute = actual.getCurrentMinute();
    assertThat(actualMinute) //
        .overridingErrorMessage("Expected current minute <%s> but was <%s>.", minute,
            actualMinute) //
        .isEqualTo(minute);
    return this;
  }

  public TimePickerAssert isIn24HourView() {
    isNotNull();
    assertThat(actual.is24HourView()) //
        .overridingErrorMessage("Expected to be in 24 hour view but was not.") //
        .isTrue();
    return this;
  }

  public TimePickerAssert isNotIn24HourView() {
    isNotNull();
    assertThat(actual.is24HourView()) //
        .overridingErrorMessage("Expected to not be in 24 hour view but was.") //
        .isFalse();
    return this;
  }
}
