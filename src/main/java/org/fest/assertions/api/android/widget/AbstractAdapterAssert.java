// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.widget;

import android.widget.Adapter;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractAdapterAssert<S extends AbstractAdapterAssert<S, A>, A extends Adapter>
    extends AbstractAssert<S, A> {
  protected AbstractAdapterAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasCount(int count) {
    isNotNull();
    int actualCount = actual.getCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return myself;
  }

  public S hasViewTypeCount(int count) {
    isNotNull();
    int actualCount = actual.getViewTypeCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected view type count <%s> but was <%s>.", count,
            actualCount) //
        .isEqualTo(count);
    return myself;
  }

  public S hasStableIds() {
    isNotNull();
    assertThat(actual.hasStableIds()) //
        .overridingErrorMessage("Expected to have stable IDs but did not.") //
        .isTrue();
    return myself;
  }

  public S hasUnstableIds() {
    isNotNull();
    assertThat(actual.hasStableIds()) //
        .overridingErrorMessage("Expected to not have stable IDs but.") //
        .isFalse();
    return myself;
  }

  public S isEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected to be empty but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected to not be empty but was.") //
        .isFalse();
    return myself;
  }
}
