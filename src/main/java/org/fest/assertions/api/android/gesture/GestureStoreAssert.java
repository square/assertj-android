// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.gesture;

import android.gesture.GestureStore;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link GestureStore} instances. */
public class GestureStoreAssert extends AbstractAssert<GestureStoreAssert, GestureStore> {
  public GestureStoreAssert(GestureStore actual) {
    super(actual, GestureStoreAssert.class);
  }

  public GestureStoreAssert hasOrientationStyle(int style) {
    isNotNull();
    int actualStyle = actual.getOrientationStyle();
    assertThat(actualStyle) //
        .overridingErrorMessage("Expected orientation style <%s> but was <%s>.", style,
            actualStyle) //
        .isEqualTo(style);
    return this;
  }

  public GestureStoreAssert hasSequenceType(int type) {
    isNotNull();
    int actualType = actual.getSequenceType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected sequence type <%s> but was <%s>.", type, actualType) //
        .isEqualTo(type);
    return this;
  }

  public GestureStoreAssert hasChanged() {
    isNotNull();
    assertThat(actual.hasChanged()) //
        .overridingErrorMessage("Expected to be changed but was not.") //
        .isTrue();
    return this;
  }

  public GestureStoreAssert hasNotChanged() {
    isNotNull();
    assertThat(actual.hasChanged()) //
        .overridingErrorMessage("Expected to not be changed but was.") //
        .isFalse();
    return this;
  }
}
