// Copyright 2013 Square, Inc.
package org.assertj.android.api.preference;

import android.preference.Preference;

/**
 * Assertions for {@link Preference} instances.
 * <p>
 * This class is final. To extend use {@link AbstractPreferenceAssert}.
 */
public final class PreferenceAssert extends AbstractPreferenceAssert<PreferenceAssert, Preference> {
  public PreferenceAssert(Preference actual) {
    super(actual, PreferenceAssert.class);
  }
}
