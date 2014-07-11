// Copyright 2013 Square, Inc.
package org.assertj.android.api.preference;

import android.preference.PreferenceGroup;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractPreferenceGroupAssert<S extends AbstractPreferenceGroupAssert<S, A>, A extends PreferenceGroup>
    extends AbstractPreferenceAssert<S, A> {
  protected AbstractPreferenceGroupAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasPreferenceCount(int count) {
    isNotNull();
    int actualCount = actual.getPreferenceCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected preference count <%s> but was <%s>.", count,
            actualCount) //
        .isEqualTo(count);
    return myself;
  }

  public S isOrderingAsAdded() {
    isNotNull();
    assertThat(actual.isOrderingAsAdded()) //
        .overridingErrorMessage("Expected to be ordering as added but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotOrderingAsAdded() {
    isNotNull();
    assertThat(actual.isOrderingAsAdded()) //
        .overridingErrorMessage("Expected to not be ordering as added but was.") //
        .isFalse();
    return myself;
  }
}
