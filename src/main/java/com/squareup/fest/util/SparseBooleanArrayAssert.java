package com.squareup.fest.util;

import android.util.SparseBooleanArray;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public class SparseBooleanArrayAssert
    extends AbstractAssert<SparseBooleanArrayAssert, SparseBooleanArray> {
  public SparseBooleanArrayAssert(SparseBooleanArray actual) {
    super(actual, SparseBooleanArrayAssert.class);
  }

  public SparseBooleanArrayAssert keyIsTrue(int key) {
    isNotNull();
    assertThat(actual.get(key)).isTrue();
    return this;
  }

  public SparseBooleanArrayAssert keyIsFalse(int key) {
    isNotNull();
    assertThat(actual.get(key)).isFalse();
    return this;
  }

  public SparseBooleanArrayAssert hasSize(int size) {
    isNotNull();
    int actualSize = actual.size();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected size <%s> but was <%s>", size, actualSize) //
        .isEqualTo(size);
    return this;
  }
}
