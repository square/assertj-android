// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.preference;

import android.preference.CheckBoxPreference;

/** Assertions for {@link CheckBoxPreference} instances. */
public class CheckBoxPreferenceAssert
    extends AbstractTwoStatePreference<CheckBoxPreferenceAssert, CheckBoxPreference> {
  /* Since TwoStatePreference is ICS+ this class allows CheckBoxPreference asserts on pre-ICS. */
  public CheckBoxPreferenceAssert(CheckBoxPreference actual) {
    super(actual, CheckBoxPreferenceAssert.class);
  }
}
