// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.preference;

import android.preference.SwitchPreference;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link SwitchPreference} instances. */
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

  public SwitchPreferenceAssert hasSwitchTextOn(CharSequence text) {
    isNotNull();
    CharSequence actualText = actual.getSwitchTextOn();
    assertThat(actualText) //
        .overridingErrorMessage("Expected switch on text <%s> but was <%s>.", text, actualText) //
        .isEqualTo(text);
    return this;
  }
}
