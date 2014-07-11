package org.assertj.android.api.app;

import android.app.Instrumentation;
import android.content.Intent;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Instrumentation.ActivityResult} instances. */
public class InstrumentationActivityResultAssert
    extends AbstractAssert<InstrumentationActivityResultAssert, Instrumentation.ActivityResult> {
  public InstrumentationActivityResultAssert(Instrumentation.ActivityResult actual) {
    super(actual, InstrumentationActivityResultAssert.class);
  }

  public InstrumentationActivityResultAssert hasResultCode(int code) {
    isNotNull();
    int actualCode = actual.getResultCode();
    assertThat(actualCode) //
        .overridingErrorMessage("Expected result code <%s> but was <%s>.", code, actualCode) //
        .isEqualTo(code);
    return this;
  }

  public InstrumentationActivityResultAssert hasResultData(Intent intent) {
    isNotNull();
    Intent actualIntent = actual.getResultData();
    assertThat(actualIntent) //
        .overridingErrorMessage("Expected result data <%s> but was <%s>.", intent, actualIntent) //
        .isEqualTo(intent);
    return this;
  }
}
