package com.squareup.fest.util;

import android.util.LongSparseArray;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link LongSparseArray} instances. */
public class LongSparseArrayAssert extends AbstractAssert<LongSparseArrayAssert, LongSparseArray> {
  public LongSparseArrayAssert(LongSparseArray actual) {
    super(actual, LongSparseArrayAssert.class);
  }

  public LongSparseArrayAssert hasKey(int key) {
    isNotNull();
    assertThat(actual.get(key)) //
        .overridingErrorMessage("Expected key <%s> to be present but was not present.", key) //
        .isNotNull();
    return this;
  }

  public LongSparseArrayAssert hasSize(int size) {
    isNotNull();
    int actualSize = actual.size();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }
}
