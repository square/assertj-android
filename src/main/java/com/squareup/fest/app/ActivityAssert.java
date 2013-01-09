package com.squareup.fest.app;

import android.app.Activity;

public final class ActivityAssert extends AbstractActivityAssert<ActivityAssert, Activity> {
  public ActivityAssert(Activity actual) {
    super(actual, ActivityAssert.class);
  }
}
