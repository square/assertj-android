// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.widget.Adapter;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

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

  public S hasItem(Object expected, int index) {
    isNotNull();

    assertThat(actual.getCount())
        .overridingErrorMessage("Index %s is out of bounds. The adapter holds %s items.",
            index, actual.getCount())
        .isGreaterThan(index);

    final Object actualItem = actual.getItem(index);
    assertThat(actualItem)
        .overridingErrorMessage("Expected item at index %s to be <%s> but was <%s>.", index,
            expected, actualItem)
        .isEqualTo(expected);

    return myself;
  }

  public S doesNotHaveItem(Object notExpected, int index) {
    isNotNull();

    assertThat(actual.getCount())
        .overridingErrorMessage("Index %s is out of bounds. The adapter holds %s items.",
            index, actual.getCount())
        .isGreaterThan(index);

    final Object actualItem = actual.getItem(index);
    assertThat(actualItem)
        .overridingErrorMessage("Expected item at index %s not to be <%s> but it was.", index,
            notExpected, actualItem)
        .isNotEqualTo(notExpected);

    return myself;
  }
}
