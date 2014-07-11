// Copyright 2013 Square, Inc.
package org.assertj.android.api.util;

import android.util.AttributeSet;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link AttributeSet} instances. */
public class AttributeSetAssert extends AbstractAssert<AttributeSetAssert, AttributeSet> {
  public AttributeSetAssert(AttributeSet actual) {
    super(actual, AttributeSetAssert.class);
  }

  public AttributeSetAssert hasAttributeCount(int count) {
    isNotNull();
    int actualCount = actual.getAttributeCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected attribute count <%s> but was <%s>.", count,
            actualCount) //
        .isEqualTo(count);
    return this;
  }

  public AttributeSetAssert hasClassAttribute(String value) {
    isNotNull();
    String actualValue = actual.getClassAttribute();
    assertThat(actualValue) //
        .overridingErrorMessage("Expected class attribute value <%s> but was <%s>.", value,
            actualValue) //
        .isEqualTo(value);
    return this;
  }

  public AttributeSetAssert hasIdAttribute(String value) {
    isNotNull();
    String actualValue = actual.getIdAttribute();
    assertThat(actualValue) //
        .overridingErrorMessage("Exepcted ID attribute value <%s> but was <%s>.", value,
            actualValue) //
        .isEqualTo(value);
    return this;
  }

  public AttributeSetAssert hasPositionDescription(String position) {
    isNotNull();
    String actualPosition = actual.getPositionDescription();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected position description <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return this;
  }

  public AttributeSetAssert hasStyleAttribute(int value) {
    isNotNull();
    int actualValue = actual.getStyleAttribute();
    assertThat(actualValue) //
        .overridingErrorMessage("Expected style attribute value <%s> but was <%s>.", value,
            actualValue) //
        .isEqualTo(value);
    return this;
  }
}
