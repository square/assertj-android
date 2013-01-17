package org.fest.assertions.api.android.app;

import android.app.LoaderManager;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link LoaderManager} instances. */
public class LoaderManagerAssert extends AbstractAssert<LoaderManagerAssert, LoaderManager> {
  public LoaderManagerAssert(LoaderManager actual) {
    super(actual, LoaderManagerAssert.class);
  }

  public LoaderManagerAssert hasLoader(int id) {
    isNotNull();
    assertThat(actual.getLoader(id))
        .overridingErrorMessage("Expected loader with ID <%s> but was not present.", id)
        .isNotNull();
    return this;
  }
}
