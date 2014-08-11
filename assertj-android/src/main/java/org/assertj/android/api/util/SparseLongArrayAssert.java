package org.assertj.android.api.util;

import android.annotation.TargetApi;
import android.util.SparseLongArray;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR2;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link SparseLongArray} instances. */
@TargetApi(JELLY_BEAN_MR2)
public class SparseLongArrayAssert extends AbstractAssert<SparseLongArrayAssert, SparseLongArray> {
  public SparseLongArrayAssert(SparseLongArray actual) {
    super(actual, SparseLongArrayAssert.class);
  }

  public SparseLongArrayAssert hasKey(int key) {
    isNotNull();
    assertThat(actual.indexOfKey(key)) //
        .overridingErrorMessage("Expected key <%s> to be present but was not.", key) //
        .isGreaterThanOrEqualTo(0);
    return this;
  }

  public SparseLongArrayAssert doesNotHaveKey(int key) {
    isNotNull();
    assertThat(actual.indexOfKey(key)) //
        .overridingErrorMessage("Expected key <%s> to not be present but was.") //
        .isLessThan(0);
    return this;
  }

  public SparseLongArrayAssert hasSize(int size) {
    isNotNull();
    int actualSize = actual.size();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }
}
