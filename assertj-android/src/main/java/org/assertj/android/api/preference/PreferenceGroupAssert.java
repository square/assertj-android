// Copyright 2013 Square, Inc.
package org.assertj.android.api.preference;

import android.preference.PreferenceGroup;

/**
 * Assertions for {@link PreferenceGroup} instances.
 * <p>
 * This class is final. To extend use {@link AbstractPreferenceGroupAssert}.
 */
public final class PreferenceGroupAssert
    extends AbstractPreferenceGroupAssert<PreferenceGroupAssert, PreferenceGroup> {
  public PreferenceGroupAssert(PreferenceGroup actual) {
    super(actual, PreferenceGroupAssert.class);
  }
}
