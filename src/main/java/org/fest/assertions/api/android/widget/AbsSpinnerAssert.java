// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.widget;

import android.widget.AbsSpinner;

/**
 * Assertions for {@link AbsSpinner} instances.
 * <p/>
 * This class if final. To extend use {@link AbstractAbsSpinnerAssert}.
 */
public final class AbsSpinnerAssert extends AbstractAbsSpinnerAssert<AbsSpinnerAssert, AbsSpinner> {
  public AbsSpinnerAssert(AbsSpinner actual) {
    super(actual, AbsSpinnerAssert.class);
  }
}
