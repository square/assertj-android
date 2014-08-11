package org.assertj.android.support.v4.api.util;

import android.support.v4.util.LongSparseArray;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

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
