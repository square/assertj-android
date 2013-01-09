package com.squareup.fest.util;

import android.util.SparseIntArray;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public class SparseIntArrayAssert extends AbstractAssert<SparseIntArrayAssert, SparseIntArray> {
  public SparseIntArrayAssert(SparseIntArray actual) {
    super(actual, SparseIntArrayAssert.class);
  }

  public SparseIntArrayAssert hasKey(int key) {
    isNotNull();
    assertThat(actual.get(key)) //
        .overridingErrorMessage("Expected key <%s> but was not present.", key) //
        .isNotNull();
    return this;
  }

  public SparseIntArrayAssert hasSize(int size) {
    isNotNull();
    int actualSize = actual.size();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected size <%s> but was <%s>", size, actualSize) //
        .isEqualTo(size);
    return this;
  }
}
