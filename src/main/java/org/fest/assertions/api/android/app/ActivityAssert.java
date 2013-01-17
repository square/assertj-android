package org.fest.assertions.api.android.app;

import android.app.Activity;

/**
 * Assertions for {@link Activity} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractActivityAssert}.
 */
public final class ActivityAssert extends AbstractActivityAssert<ActivityAssert, Activity> {
  public ActivityAssert(Activity actual) {
    super(actual, ActivityAssert.class);
  }
}
