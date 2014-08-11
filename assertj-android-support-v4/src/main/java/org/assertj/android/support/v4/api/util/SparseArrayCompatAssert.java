package org.assertj.android.support.v4.api.util;

import android.support.v4.util.SparseArrayCompat;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link SparseArrayCompat} instances. */
public class SparseArrayCompatAssert<E>
    extends AbstractAssert<SparseArrayCompatAssert<E>, SparseArrayCompat<E>> {
  public SparseArrayCompatAssert(SparseArrayCompat<E> actual) {
    super(actual, SparseArrayCompatAssert.class);
  }

  public SparseArrayCompatAssert<E> hasKey(int key) {
    isNotNull();
    assertThat(actual.indexOfKey(key)) //
        .overridingErrorMessage("Expected key <%s> to be present but was not present.", key) //
        .isGreaterThanOrEqualTo(0);
    return this;
  }

  public SparseArrayCompatAssert<E> hasSize(int size) {
    isNotNull();
    int actualSize = actual.size();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }
}
