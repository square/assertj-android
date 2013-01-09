// Copyright 2012 Square, Inc.
package com.squareup.fest.widget;

import android.widget.Adapter;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public class AdapterAssert extends AbstractAssert<AdapterAssert, Adapter> {
  public AdapterAssert(Adapter actual) {
    super(actual, AdapterAssert.class);
  }

  public AdapterAssert hasSize(int size) {
    isNotNull();
    assertThat(actual.getCount()).isEqualTo(size);
    return this;
  }

  public AdapterAssert hasViewTypes(int size) {
    isNotNull();
    assertThat(actual.getViewTypeCount()).isEqualTo(size);
    return this;
  }

  public AdapterAssert isEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected adapter to be empty but was not empty") //
        .isTrue();
    return this;
  }

  public AdapterAssert isNotEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected adapter to be not empty but was empty") //
        .isFalse();
    return this;
  }
}
