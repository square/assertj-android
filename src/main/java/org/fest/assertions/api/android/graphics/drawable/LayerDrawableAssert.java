// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.graphics.drawable;

import android.graphics.drawable.LayerDrawable;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link LayerDrawable} instances. */
public class LayerDrawableAssert
    extends AbstractDrawableAssert<LayerDrawableAssert, LayerDrawable> {
  public LayerDrawableAssert(LayerDrawable actual) {
    super(actual, LayerDrawableAssert.class);
  }

  public LayerDrawableAssert hasLayerCount(int count) {
    isNotNull();
    int actualCount = actual.getNumberOfLayers();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected layer count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }
}
