package com.squareup.fest.util;

import android.util.Property;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link Property} instances. */
public class PropertyAssert extends AbstractAssert<PropertyAssert, Property> {
  public PropertyAssert(Property actual) {
    super(actual, PropertyAssert.class);
  }

  public PropertyAssert isName(String name) {
    isNotNull();
    String actualName = actual.getName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected name <%s> but was <%s>", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public PropertyAssert isType(Class<?> type) {
    isNotNull();
    Class actualType = actual.getType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected type <%s> but was <%s>", type, actualType) //
        .isEqualTo(type);
    return this;
  }

  public PropertyAssert isReadOnly() {
    isNotNull();
    assertThat(actual.isReadOnly()) //
        .overridingErrorMessage("Expected read only but was not read only.") //
        .isTrue();
    return this;
  }

  public PropertyAssert isNotReadOnly() {
    isNotNull();
    assertThat(actual.isReadOnly()) //
        .overridingErrorMessage("Expected not read only but was read only.") //
        .isFalse();
    return this;
  }
}
