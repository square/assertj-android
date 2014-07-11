package org.assertj.android.api.util;

import android.annotation.TargetApi;
import android.util.Property;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Property} instances. */
@TargetApi(ICE_CREAM_SANDWICH)
public class PropertyAssert<T, V> extends AbstractAssert<PropertyAssert<T, V>, Property<T, V>> {
  public PropertyAssert(Property<T, V> actual) {
    super(actual, PropertyAssert.class);
  }

  public PropertyAssert<T, V> hasName(String name) {
    isNotNull();
    String actualName = actual.getName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected name <%s> but was <%s>", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public PropertyAssert<T, V> hasType(Class<?> type) {
    isNotNull();
    Class actualType = actual.getType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected type <%s> but was <%s>", type, actualType) //
        .isEqualTo(type);
    return this;
  }

  public PropertyAssert<T, V> isReadOnly() {
    isNotNull();
    assertThat(actual.isReadOnly()) //
        .overridingErrorMessage("Expected read only but was not read only.") //
        .isTrue();
    return this;
  }

  public PropertyAssert<T, V> isNotReadOnly() {
    isNotNull();
    assertThat(actual.isReadOnly()) //
        .overridingErrorMessage("Expected not read only but was read only.") //
        .isFalse();
    return this;
  }
}
