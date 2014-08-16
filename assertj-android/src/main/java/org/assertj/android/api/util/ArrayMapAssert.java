package org.assertj.android.api.util;

import android.annotation.TargetApi;
import android.util.ArrayMap;
import org.assertj.core.api.AbstractMapAssert;

import static android.os.Build.VERSION_CODES.KITKAT;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(KITKAT)
public class ArrayMapAssert<K, V>
    extends AbstractMapAssert<ArrayMapAssert<K, V>, ArrayMap<K, V>, K, V> {
  protected ArrayMapAssert(ArrayMap actual) {
    super(actual, ArrayMapAssert.class);
  }

  public ArrayMapAssert<K, V> hasKeyAt(int index, K key) {
    isNotNull();
    K actualKey = actual.keyAt(index);
    assertThat(actualKey) //
        .overridingErrorMessage("Expected key <%s> at index <%s> but was <%s>.", key, actualKey,
            index) //
        .isEqualTo(key);
    return this;
  }

  public ArrayMapAssert<K, V> hasValueAt(int index, V value) {
    isNotNull();
    V actualValue = actual.valueAt(index);
    assertThat(actualValue) //
        .overridingErrorMessage("Expected value <%s> but was <%s> at index <%s>.", value,
            actualValue, index) //
        .isEqualTo(value);
    return this;
  }
}
