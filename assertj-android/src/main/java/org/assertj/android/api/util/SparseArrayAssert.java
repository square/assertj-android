package org.assertj.android.api.util;

import android.util.SparseArray;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link SparseArray} instances. */
public class SparseArrayAssert<E> extends AbstractAssert<SparseArrayAssert<E>, SparseArray<E>> {
  public SparseArrayAssert(SparseArray<E> actual) {
    super(actual, SparseArrayAssert.class);
  }

  public SparseArrayAssert<E> hasKey(int key) {
    isNotNull();
    assertThat(actual.get(key)) //
        .overridingErrorMessage("Expected key <%s> to be present but was not present.", key) //
        .isNotNull();
    return this;
  }

  public SparseArrayAssert<E> hasSize(int size) {
    isNotNull();
    int actualSize = actual.size();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }
}
