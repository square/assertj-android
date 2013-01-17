package org.fest.assertions.api.android.app;

import android.app.LocalActivityManager;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link LocalActivityManager} instances. */
public class LocalActivityManagerAssert extends AbstractAssert<LocalActivityManagerAssert, LocalActivityManager> {
  public LocalActivityManagerAssert(LocalActivityManager actual) {
    super(actual, LocalActivityManagerAssert.class);
  }

  public LocalActivityManagerAssert hasActivity(String id) {
    isNotNull();
    assertThat(actual.getActivity(id))
        .overridingErrorMessage("Expected activity with ID <%s> but was not present.", id)
        .isNotNull();
    return this;
  }
}
