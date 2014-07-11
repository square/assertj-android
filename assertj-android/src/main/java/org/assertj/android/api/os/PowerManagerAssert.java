// Copyright 2013 Square, Inc.
package org.assertj.android.api.os;

import android.os.PowerManager;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.AbstractAssert;

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
}
