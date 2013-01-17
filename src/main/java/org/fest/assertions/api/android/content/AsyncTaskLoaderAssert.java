package org.fest.assertions.api.android.content;

import android.content.AsyncTaskLoader;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link AsyncTaskLoader} instances. */
public class AsyncTaskLoaderAssert
    extends AbstractLoaderAssert<AsyncTaskLoaderAssert, AsyncTaskLoader> {
  public AsyncTaskLoaderAssert(AsyncTaskLoader actual) {
    super(actual, AsyncTaskLoaderAssert.class);
  }

  public AsyncTaskLoaderAssert hasLoadInBackgroundCancelled() {
    isNotNull();
    assertThat(actual.isLoadInBackgroundCanceled()) //
        .overridingErrorMessage("Expected load in background cancelled but was not cancelled.") //
        .isTrue();
    return this;
  }

  public AsyncTaskLoaderAssert hasLoadInBackgroundNotCancelled() {
    isNotNull();
    assertThat(actual.isLoadInBackgroundCanceled()) //
        .overridingErrorMessage("Expected load in background not cancelled but was cancelled.") //
        .isFalse();
    return this;
  }
}
