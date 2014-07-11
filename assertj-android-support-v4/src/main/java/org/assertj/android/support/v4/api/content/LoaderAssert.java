// Copyright 2013 Square, Inc.
package org.assertj.android.support.v4.api.content;

import android.support.v4.content.Loader;

/**
 * Assertions for {@link Loader} instances.
 * <p>
 * This class is final. To extend use {@link AbstractLoaderAssert}.
 */
public final class LoaderAssert extends AbstractLoaderAssert<LoaderAssert, Loader> {
  public LoaderAssert(Loader actual) {
    super(actual, LoaderAssert.class);
  }
}
