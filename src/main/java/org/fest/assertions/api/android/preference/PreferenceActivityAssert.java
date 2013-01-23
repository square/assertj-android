// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.preference;

import android.preference.PreferenceActivity;
import org.fest.assertions.api.android.app.AbstractListActivityAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link PreferenceActivity} instances. */
public class PreferenceActivityAssert
    extends AbstractListActivityAssert<PreferenceActivityAssert, PreferenceActivity> {
  public PreferenceActivityAssert(PreferenceActivity actual) {
    super(actual, PreferenceActivityAssert.class);
  }

  public PreferenceActivityAssert hasHeaders() {
    isNotNull();
    assertThat(actual.hasHeaders()) //
        .overridingErrorMessage("Expected to have headers but did not.") //
        .isTrue();
    return this;
  }

  public PreferenceActivityAssert hasNoHeaders() {
    isNotNull();
    assertThat(actual.hasHeaders()) //
        .overridingErrorMessage("Expected to not have headers but did.") //
        .isFalse();
    return this;
  }

  public PreferenceActivityAssert isMultiPane() {
    isNotNull();
    assertThat(actual.isMultiPane()) //
        .overridingErrorMessage("Expected to be multi-pane but was not.") //
        .isTrue();
    return this;
  }

  public PreferenceActivityAssert isNotMultiPane() {
    isNotNull();
    assertThat(actual.isMultiPane()) //
        .overridingErrorMessage("Expected to not be multi-pane but was.") //
        .isFalse();
    return this;
  }
}
