// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.preference;

import android.preference.ListPreference;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link ListPreference} instances. */
public class ListPreferenceAssert
    extends AbstractDialogPreferenceAssert<ListPreferenceAssert, ListPreference> {
  public ListPreferenceAssert(ListPreference actual) {
    super(actual, ListPreferenceAssert.class);
  }

  public ListPreferenceAssert hasEntries(CharSequence... entries) {
    isNotNull();
    CharSequence[] actualEntries = actual.getEntries();
    assertThat(actualEntries) //
        .overridingErrorMessage("Expected entries <%s> but was <%s>.", entries, actualEntries) //
        .isEqualTo(entries);
    return this;
  }

  public ListPreferenceAssert hasEntry(CharSequence entry) {
    isNotNull();
    CharSequence actualEntry = actual.getEntry();
    assertThat(actualEntry) //
        .overridingErrorMessage("Expected entry <%s> but was <%s>.", entry, actualEntry) //
        .isEqualTo(entry);
    return this;
  }

  public ListPreferenceAssert hasEntry(int resId) {
    isNotNull();
    return hasEntry(actual.getContext().getString(resId));
  }

  public ListPreferenceAssert hasEntryValues(CharSequence... values) {
    isNotNull();
    CharSequence[] actualValues = actual.getEntryValues();
    assertThat(actualValues) //
        .overridingErrorMessage("Expected entry values <%s> but was <%s>.", values, actualValues) //
        .isEqualTo(values);
    return this;
  }

  public ListPreferenceAssert hasValue(String value) {
    isNotNull();
    String actualValue = actual.getValue();
    assertThat(actualValue) //
        .overridingErrorMessage("Expected value <%s> but was <%s>.", value, actualValue) //
        .isEqualTo(value);
    return this;
  }
}
