package org.assertj.android.api.content;

import android.annotation.TargetApi;
import android.content.AsyncTaskLoader;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link AsyncTaskLoader} instances. */
@TargetApi(HONEYCOMB)
public class AsyncTaskLoaderAssert
    extends AbstractLoaderAssert<AsyncTaskLoaderAssert, AsyncTaskLoader> {
  public AsyncTaskLoaderAssert(AsyncTaskLoader actual) {
    super(actual, AsyncTaskLoaderAssert.class);
  }

  @TargetApi(JELLY_BEAN)
  public AsyncTaskLoaderAssert hasLoadInBackgroundCancelled() {
    isNotNull();
    assertThat(actual.isLoadInBackgroundCanceled()) //
        .overridingErrorMessage("Expected load in background cancelled but was not cancelled.") //
        .isTrue();
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public AsyncTaskLoaderAssert hasLoadInBackgroundNotCancelled() {
    isNotNull();
    assertThat(actual.isLoadInBackgroundCanceled()) //
        .overridingErrorMessage("Expected load in background not cancelled but was cancelled.") //
        .isFalse();
    return this;
  }
}
