package org.assertj.android.api.app;

import android.app.Activity;
import android.app.Instrumentation;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Instrumentation.ActivityMonitor} instances. */
public class InstrumentationActivityMonitorAssert
    extends AbstractAssert<InstrumentationActivityMonitorAssert, Instrumentation.ActivityMonitor> {
  public InstrumentationActivityMonitorAssert(Instrumentation.ActivityMonitor actual) {
    super(actual, InstrumentationActivityMonitorAssert.class);
  }

  public InstrumentationActivityMonitorAssert hasHits(int hits) {
    isNotNull();
    int actualHits = actual.getHits();
    assertThat(actualHits) //
        .overridingErrorMessage("Expected hits <%s> but was <%s>.", hits, actualHits) //
        .isEqualTo(hits);
    return this;
  }

  public InstrumentationActivityMonitorAssert hasLastActivity(Activity activity) {
    isNotNull();
    Activity actualActivity = actual.getLastActivity();
    assertThat(actualActivity) //
        .overridingErrorMessage("Expected last activity <%s> but was <%s>.", activity,
            actualActivity) //
        .isSameAs(activity);
    return this;
  }
}
