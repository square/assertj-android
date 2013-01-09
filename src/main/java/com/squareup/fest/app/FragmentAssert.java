package com.squareup.fest.app;

import android.app.Fragment;

public final class FragmentAssert extends AbstractFragmentAssert<FragmentAssert, Fragment> {
  public FragmentAssert(Fragment actual) {
    super(actual, FragmentAssert.class);
  }
}
