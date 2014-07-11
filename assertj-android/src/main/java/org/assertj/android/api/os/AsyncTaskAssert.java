// Copyright 2013 Square, Inc.
package org.assertj.android.api.os;

import android.os.AsyncTask;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link AsyncTask} instances. */
public class AsyncTaskAssert extends AbstractAssert<AsyncTaskAssert, AsyncTask> {
  public AsyncTaskAssert(AsyncTask actual) {
    super(actual, AsyncTaskAssert.class);
  }

  public AsyncTaskAssert hasStatus(AsyncTask.Status status) {
    isNotNull();
    AsyncTask.Status actualStatus = actual.getStatus();
    assertThat(actualStatus) //
        .overridingErrorMessage("Expected status <%s> but was <%s>.", status, actualStatus) //
        .isEqualTo(status);
    return this;
  }

  public AsyncTaskAssert isCancelled() {
    isNotNull();
    assertThat(actual.isCancelled()) //
        .overridingErrorMessage("Expected to be cancelled but was not.") //
        .isTrue();
    return this;
  }

  public AsyncTaskAssert isNotCancelled() {
    isNotNull();
    assertThat(actual.isCancelled()) //
        .overridingErrorMessage("Expected to not be cancelled but was.") //
        .isFalse();
    return this;
  }
}
