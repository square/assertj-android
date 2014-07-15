// Copyright 2013 Square, Inc.
package org.assertj.android.api.os;

import android.annotation.TargetApi;
import android.os.PowerManager;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

import static android.os.Build.VERSION_CODES.KITKAT_WATCH;

/** Assertions for {@link PowerManager} instances. */
public class PowerManagerAssert extends AbstractAssert<PowerManagerAssert, PowerManager> {
  public PowerManagerAssert(PowerManager actual) {
    super(actual, PowerManagerAssert.class);
  }

  public PowerManagerAssert isScreenOn() {
    isNotNull();
    Assertions.assertThat(actual.isScreenOn()) //
        .overridingErrorMessage("Expected screen to be on but was off.") //
        .isTrue();
    return this;
  }

  public PowerManagerAssert isScreenOff() {
    isNotNull();
    Assertions.assertThat(actual.isScreenOn()) //
        .overridingErrorMessage("Expected screen to be off but was on.") //
        .isFalse();
    return this;
  }

  @TargetApi(KITKAT_WATCH)
  public PowerManagerAssert isInteractive() {
    isNotNull();
    Assertions.assertThat(actual.isInteractive()) //
        .overridingErrorMessage("Expected screen to interactive but was not interactive.") //
        .isTrue();
    return this;
  }

  @TargetApi(KITKAT_WATCH)
  public PowerManagerAssert isNotInteractive() {
    isNotNull();
    Assertions.assertThat(actual.isInteractive()) //
        .overridingErrorMessage("Expected screen to not be interactive but was interactive.") //
        .isFalse();
    return this;
  }
}
