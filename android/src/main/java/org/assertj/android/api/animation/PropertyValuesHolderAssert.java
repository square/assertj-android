// Copyright 2013 Square, Inc.
package org.assertj.android.api.animation;

import android.animation.PropertyValuesHolder;
import android.annotation.TargetApi;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link PropertyValuesHolder} instances. */
@TargetApi(HONEYCOMB)
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
