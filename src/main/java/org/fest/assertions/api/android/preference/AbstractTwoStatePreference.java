// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.preference;

import android.preference.TwoStatePreference;

import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractTwoStatePreference<S extends AbstractTwoStatePreference<S, A>, A extends TwoStatePreference>
    extends AbstractPreferenceAssert<S, A> {
  protected AbstractTwoStatePreference(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasSummaryOff(CharSequence summary) {
    isNotNull();
    CharSequence actualSummary = actual.getSummaryOff();
    assertThat(actualSummary) //
        .overridingErrorMessage("Expected off summary <%s> but was <%s>.", summary,
            actualSummary) //
        .isEqualTo(summary);
    return myself;
  }

  public S hasSummaryOn(CharSequence summary) {
    isNotNull();
    CharSequence actualSummary = actual.getSummaryOn();
    assertThat(actualSummary) //
        .overridingErrorMessage("Expected on summary <%s> but was <%s>.", summary,
            actualSummary) //
        .isEqualTo(summary);
    return myself;
  }

  public S isChecked() {
    isNotNull();
    assertThat(actual.isChecked()) //
        .overridingErrorMessage("Expected to be checked but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotChecked() {
    isNotNull();
    assertThat(actual.isChecked()) //
        .overridingErrorMessage("Expected to not be checked but was.") //
        .isFalse();
    return myself;
  }
}
