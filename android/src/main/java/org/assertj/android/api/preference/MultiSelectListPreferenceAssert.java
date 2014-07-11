// Copyright 2013 Square, Inc.
package org.assertj.android.api.preference;

import android.annotation.TargetApi;
import android.preference.MultiSelectListPreference;
import java.util.Set;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link MultiSelectListPreference} instances. */
@TargetApi(HONEYCOMB)
public class MultiSelectListPreferenceAssert extends
    AbstractDialogPreferenceAssert<MultiSelectListPreferenceAssert, MultiSelectListPreference> {
  public MultiSelectListPreferenceAssert(MultiSelectListPreference actual) {
    super(actual, MultiSelectListPreferenceAssert.class);
  }

  public MultiSelectListPreferenceAssert hasEntries(CharSequence... entries) {
    isNotNull();
    CharSequence[] actualEntries = actual.getEntries();
    assertThat(actualEntries) //
        .overridingErrorMessage("Expected entries <%s> but was <%s>.", entries, actualEntries) //
        .isEqualTo(entries);
    return this;
  }

  public MultiSelectListPreferenceAssert hasEntryValues(CharSequence... values) {
    isNotNull();
    CharSequence[] actualValues = actual.getEntryValues();
    assertThat(actualValues) //
        .overridingErrorMessage("Expected entry values <%s> but was <%s>.", values, actualValues) //
        .isEqualTo(values);
    return this;
  }

  public MultiSelectListPreferenceAssert hasValues(String... values) {
    isNotNull();
    Set<String> actualValues = actual.getValues();
    assertThat(actualValues) //
        .overridingErrorMessage("Expected values <%s> but was <%s>.", values, actualValues) //
        .containsOnly(values);
    return this;
  }
}
