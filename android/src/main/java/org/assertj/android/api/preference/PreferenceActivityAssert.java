// Copyright 2013 Square, Inc.
package org.assertj.android.api.preference;

import android.annotation.TargetApi;
import android.preference.PreferenceActivity;
import org.assertj.android.api.app.AbstractListActivityAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link PreferenceActivity} instances. */
public class PreferenceActivityAssert
    extends AbstractListActivityAssert<PreferenceActivityAssert, PreferenceActivity> {
  public PreferenceActivityAssert(PreferenceActivity actual) {
    super(actual, PreferenceActivityAssert.class);
  }

  @TargetApi(HONEYCOMB)
  public PreferenceActivityAssert hasHeaders() {
    isNotNull();
    assertThat(actual.hasHeaders()) //
        .overridingErrorMessage("Expected to have headers but did not.") //
        .isTrue();
    return this;
  }

  @TargetApi(HONEYCOMB)
  public PreferenceActivityAssert hasNoHeaders() {
    isNotNull();
    assertThat(actual.hasHeaders()) //
        .overridingErrorMessage("Expected to not have headers but did.") //
        .isFalse();
    return this;
  }

  @TargetApi(HONEYCOMB)
  public PreferenceActivityAssert isMultiPane() {
    isNotNull();
    assertThat(actual.isMultiPane()) //
        .overridingErrorMessage("Expected to be multi-pane but was not.") //
        .isTrue();
    return this;
  }

  @TargetApi(HONEYCOMB)
  public PreferenceActivityAssert isNotMultiPane() {
    isNotNull();
    assertThat(actual.isMultiPane()) //
        .overridingErrorMessage("Expected to not be multi-pane but was.") //
        .isFalse();
    return this;
  }
}
