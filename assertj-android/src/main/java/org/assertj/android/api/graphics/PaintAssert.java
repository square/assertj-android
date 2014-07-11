// Copyright 2013 Square, Inc.
package org.assertj.android.api.graphics;

import android.graphics.Paint;

/**
 * Assertions for {@link PaintAssert} instances.
 * <p>
 * This class is final. To extend use {@link AbstractPaintAssert}.
 */
public final class PaintAssert extends AbstractPaintAssert<PaintAssert, Paint> {
  public PaintAssert(Paint actual) {
    super(actual, PaintAssert.class);
  }
}
