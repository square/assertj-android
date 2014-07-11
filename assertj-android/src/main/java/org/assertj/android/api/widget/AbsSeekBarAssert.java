// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.widget.AbsSeekBar;

/**
 * Assertions for {@link AbsSeekBar} instances.
 * <p>
 * This class is final. To extend use {@link AbstractAbsSeekBarAssert}.
 */
public final class AbsSeekBarAssert extends AbstractAbsSeekBarAssert<AbsSeekBarAssert, AbsSeekBar> {
  public AbsSeekBarAssert(AbsSeekBar actual) {
    super(actual, AbsSeekBarAssert.class);
  }
}
