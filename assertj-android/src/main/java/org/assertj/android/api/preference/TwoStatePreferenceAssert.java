// Copyright 2013 Square, Inc.
package org.assertj.android.api.preference;

import android.preference.TwoStatePreference;

/**
 * Assertions for {@link TwoStatePreference} instances.
 * <p>
 * This class is final. To extend use {@link AbstractTwoStatePreference}.
 */
public final class TwoStatePreferenceAssert
    extends AbstractTwoStatePreference<TwoStatePreferenceAssert, TwoStatePreference> {
  public TwoStatePreferenceAssert(TwoStatePreference actual) {
    super(actual, TwoStatePreferenceAssert.class);
  }
}
