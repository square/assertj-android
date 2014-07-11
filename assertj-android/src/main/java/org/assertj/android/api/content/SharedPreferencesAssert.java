package org.assertj.android.api.content;

import android.content.SharedPreferences;

/**
 * Assertions for {@link android.content.SharedPreferences} instances.
 * <p>
 * This class is final. To extend use {@link AbstractSharedPreferencesAssert}.
 */
public final class SharedPreferencesAssert extends
    AbstractSharedPreferencesAssert<SharedPreferencesAssert, SharedPreferences> {
  public SharedPreferencesAssert(SharedPreferences actual) {
    super(actual, SharedPreferencesAssert.class);
  }
}