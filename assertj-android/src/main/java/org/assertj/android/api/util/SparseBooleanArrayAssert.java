package org.assertj.android.api.util;

import android.util.SparseBooleanArray;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link SparseBooleanArray} instances. */
public class SparseBooleanArrayAssert
    extends AbstractAssert<SparseBooleanArrayAssert, SparseBooleanArray> {
  public SparseBooleanArrayAssert(SparseBooleanArray actual) {
    super(actual, SparseBooleanArrayAssert.class);
  }

  public SparseBooleanArrayAssert keyIsTrue(int key) {
    isNotNull();
    assertThat(actual.get(key)) //
        .overridingErrorMessage("Expected key %s to be true but was false.", key) //
        .isTrue();
    return this;
  }

  public SparseBooleanArrayAssert keyIsFalse(int key) {
    isNotNull();
    assertThat(actual.get(key)) //
        .overridingErrorMessage("Expected key %s to be false but was true.", key) //
        .isFalse();
    return this;
  }

  public SparseBooleanArrayAssert hasKey(int key) {
    isNotNull();
    assertThat(actual.indexOfKey(key)) //
        .overridingErrorMessage("Expected key <%s> to be present but was not.") //
        .isGreaterThanOrEqualTo(0);
    return this;
  }

  public SparseBooleanArrayAssert doesNotHaveKey(int key) {
    isNotNull();
    assertThat(actual.indexOfKey(key)) //
        .overridingErrorMessage("Expected key <%s> to not be present but was.") //
        .isLessThan(0);
    return this;
  }

  public SparseBooleanArrayAssert hasSize(int size) {
    isNotNull();
    int actualSize = actual.size();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }
}
