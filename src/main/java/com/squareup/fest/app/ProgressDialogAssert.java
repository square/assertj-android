package com.squareup.fest.app;

import android.app.ProgressDialog;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link ProgressDialog} instances. */
public class ProgressDialogAssert
    extends AbstractDialogAssert<ProgressDialogAssert, ProgressDialog> {
  public ProgressDialogAssert(ProgressDialog actual) {
    super(actual, ProgressDialogAssert.class);
  }

  public ProgressDialogAssert hasMax(int max) {
    isNotNull();
    int actualMax = actual.getMax();
    assertThat(actualMax) //
        .overridingErrorMessage("Expected max <%s> but was <%s>.", max, actualMax) //
        .isEqualTo(max);
    return this;
  }

  public ProgressDialogAssert hasProgress(int progress) {
    isNotNull();
    int actualProgress = actual.getProgress();
    assertThat(actualProgress) //
        .overridingErrorMessage("Expected progress <%s> but was <%s>.", progress, actualProgress) //
        .isEqualTo(progress);
    return this;
  }

  public ProgressDialogAssert hasSecondaryProgress(int progress) {
    isNotNull();
    int actualProgress = actual.getSecondaryProgress();
    assertThat(actualProgress) //
        .overridingErrorMessage("Expected secondary progress <%s> but was <%s>.", progress,
            actualProgress) //
        .isEqualTo(progress);
    return this;
  }

  public ProgressDialogAssert isIndeterminate() {
    isNotNull();
    assertThat(actual.isIndeterminate()) //
        .overridingErrorMessage("Expected to be indeterminate but was determinate.") //
        .isTrue();
    return this;
  }

  public ProgressDialogAssert isDeterminate() {
    isNotNull();
    assertThat(actual.isIndeterminate()) //
        .overridingErrorMessage("Expected to be determinate but was indeterminate.") //
        .isFalse();
    return this;
  }
}
