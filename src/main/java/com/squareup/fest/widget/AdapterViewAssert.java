package com.squareup.fest.widget;

import android.widget.AdapterView;

/**
 * Assertions for {@link AdapterView} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractAdapterViewAssert}.
 */
public final class AdapterViewAssert
    extends AbstractAdapterViewAssert<AdapterViewAssert, AdapterView> {
  public AdapterViewAssert(AdapterView actual) {
    super(actual, AdapterViewAssert.class);
  }
}
