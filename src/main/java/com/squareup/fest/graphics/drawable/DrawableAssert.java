// Copyright 2013 Square, Inc.
package com.squareup.fest.graphics.drawable;

import android.graphics.drawable.Drawable;

/**
 * Assertions for {@link Drawable} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractDrawableAssert}.
 */
public final class DrawableAssert extends AbstractDrawableAssert<DrawableAssert, Drawable> {
  public DrawableAssert(Drawable actual) {
    super(actual, DrawableAssert.class);
  }
}
