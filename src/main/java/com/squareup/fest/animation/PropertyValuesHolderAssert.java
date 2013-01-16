// Copyright 2013 Square, Inc.
package com.squareup.fest.animation;

import android.animation.PropertyValuesHolder;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link PropertyValuesHolder} instances. */
public class PropertyValuesHolderAssert
    extends AbstractAssert<PropertyValuesHolderAssert, PropertyValuesHolder> {
  public PropertyValuesHolderAssert(PropertyValuesHolder actual) {
    super(actual, PropertyValuesHolderAssert.class);
  }

  public PropertyValuesHolderAssert hasPropertyName(String name) {
    isNotNull();
    String actualName = actual.getPropertyName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected property name <%s> but was <%s>.", name, actualName) //
        .isEqualTo(name);
    return this;
  }
}
