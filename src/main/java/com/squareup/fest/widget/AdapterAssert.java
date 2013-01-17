// Copyright 2012 Square, Inc.
package com.squareup.fest.widget;

import android.widget.Adapter;

/**
 * Assertions for {@link Adapter} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractAdapterAssert}.
 */
public final class AdapterAssert extends AbstractAdapterAssert<AdapterAssert, Adapter> {
  public AdapterAssert(Adapter actual) {
    super(actual, AdapterAssert.class);
  }
}
