// Copyright 2013 Square, Inc.
package org.assertj.android.api.preference;

import android.annotation.TargetApi;
import android.preference.SwitchPreference;

import static android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link SwitchPreference} instances. */
@TargetApi(ICE_CREAM_SANDWICH)
public class SwitchPreferenceAssert
    extends AbstractTwoStatePreference<SwitchPreferenceAssert, SwitchPreference> {
  public SwitchPreferenceAssert(SwitchPreference actual) {
    super(actual, SwitchPreferenceAssert.class);
  }

  public SwitchPreferenceAssert hasSwitchTextOff(CharSequence text) {
    isNotNull();
    CharSequence actualText = actual.getSwitchTextOff();
    assertThat(actualText) //
        .overridingErrorMessage("Expected switch off text <%s> but was <%s>.", text, actualText) //
        .isEqualTo(text);
    return this;
  }

  public SwitchPreferenceAssert hasSwitchTextOff(int resId) {
    isNotNull();
    return hasSwitchTextOff(actual.getContext().getString(resId));
  }

  public SwitchPreferenceAssert hasSwitchTextOn(CharSequence text) {
    isNotNull();
    CharSequence actualText = actual.getSwitchTextOn();
    assertThat(actualText) //
        .overridingErrorMessage("Expected switch on text <%s> but was <%s>.", text, actualText) //
        .isEqualTo(text);
    return this;
  }

  public SwitchPreferenceAssert hasSwitchTextOn(int resId) {
    isNotNull();
    return hasSwitchTextOn(actual.getContext().getString(resId));
  }
}
