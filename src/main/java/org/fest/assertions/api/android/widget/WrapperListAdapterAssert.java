// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.widget;

import android.widget.WrapperListAdapter;

/**
 * Assertions for {@link WrapperListAdapter} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractWrapperListAdapterAssert}.
 */
public final class WrapperListAdapterAssert
    extends AbstractWrapperListAdapterAssert<WrapperListAdapterAssert, WrapperListAdapter> {
  public WrapperListAdapterAssert(WrapperListAdapter actual) {
    super(actual, WrapperListAdapterAssert.class);
  }
}
