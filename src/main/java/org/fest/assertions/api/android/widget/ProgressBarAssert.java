// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.widget;

import android.widget.ProgressBar;

/**
 * Assertions for {@link ProgressBar} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractProgressBarAssert}.
 */
public final class ProgressBarAssert
    extends AbstractProgressBarAssert<ProgressBarAssert, ProgressBar> {
  public ProgressBarAssert(ProgressBar actual) {
    super(actual, ProgressBarAssert.class);
  }
}
