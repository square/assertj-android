// Copyright 2012 Square, Inc.
package com.squareup.fest.widget;

import android.widget.Adapter;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link Adapter} instances. */
public class AdapterAssert extends AbstractAssert<AdapterAssert, Adapter> {
  public AdapterAssert(Adapter actual) {
    super(actual, AdapterAssert.class);
  }

  public AdapterAssert hasSize(int size) {
    isNotNull();
    int actualSize = actual.getCount();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }

  public AdapterAssert hasViewTypeCount(int count) {
    isNotNull();
    int actualCount = actual.getViewTypeCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected <%s> view types but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public AdapterAssert isEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected to be empty but was not empty.") //
        .isTrue();
    return this;
  }

  public AdapterAssert isNotEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected to be not empty but was empty.") //
        .isFalse();
    return this;
  }
}
