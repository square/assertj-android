// Copyright 2013 Square, Inc.
package org.assertj.android.api.preference;

import android.annotation.TargetApi;
import android.preference.TwoStatePreference;

import static android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(ICE_CREAM_SANDWICH)
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

  public S hasSummaryOff(int resId) {
    isNotNull();
    return hasSummaryOff(actual.getContext().getString(resId));
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

  public S hasSummaryOn(int resId) {
    isNotNull();
    return hasSummaryOn(actual.getContext().getString(resId));
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
