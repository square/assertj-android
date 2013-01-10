package com.squareup.fest.app;

import android.app.Fragment;

/**
 * Assertions for {@link Fragment} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractFragmentAssert}.
 */
public final class FragmentAssert extends AbstractFragmentAssert<FragmentAssert, Fragment> {
  public FragmentAssert(Fragment actual) {
    super(actual, FragmentAssert.class);
  }
}
