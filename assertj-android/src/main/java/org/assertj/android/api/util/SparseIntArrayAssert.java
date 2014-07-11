package org.assertj.android.api.util;

import android.util.SparseIntArray;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link SparseIntArray} instances. */
public class SparseIntArrayAssert extends AbstractAssert<SparseIntArrayAssert, SparseIntArray> {
  public SparseIntArrayAssert(SparseIntArray actual) {
    super(actual, SparseIntArrayAssert.class);
  }

  public SparseIntArrayAssert hasKey(int key) {
    isNotNull();
    assertThat(actual.get(key)) //
        .overridingErrorMessage("Expected key <%s> to be present but was not present.", key) //
        .isNotNull();
    return this;
  }

  public SparseIntArrayAssert hasSize(int size) {
    isNotNull();
    int actualSize = actual.size();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }
}
