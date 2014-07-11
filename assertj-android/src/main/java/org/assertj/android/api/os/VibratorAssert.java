// Copyright 2013 Square, Inc.
package org.assertj.android.api.os;

import android.annotation.TargetApi;
import android.os.Vibrator;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

import static android.os.Build.VERSION_CODES.HONEYCOMB;

/** Assertions for {@link Vibrator} instances. Buzz buzz. */
public class VibratorAssert extends AbstractAssert<VibratorAssert, Vibrator> {
  public VibratorAssert(Vibrator actual) {
    super(actual, VibratorAssert.class);
  }

  @TargetApi(HONEYCOMB)
  public VibratorAssert hasVibrator() {
    isNotNull();
    Assertions.assertThat(actual.hasVibrator()) //
        .overridingErrorMessage("Expected to have vibrator but did not.") //
        .isTrue();
    return this;
  }

  @TargetApi(HONEYCOMB)
  public VibratorAssert hasNoVibrator() {
    isNotNull();
    Assertions.assertThat(actual.hasVibrator()) //
        .overridingErrorMessage("Expected to not have vibrator but did.") //
        .isFalse();
    return this;
  }
}
