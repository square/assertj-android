// Copyright 2013 Square, Inc.
package org.assertj.android.api.gesture;

import android.gesture.GestureLibrary;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link GestureLibrary} instances. */
public class GestureLibraryAssert extends AbstractAssert<GestureLibraryAssert, GestureLibrary> {
  public GestureLibraryAssert(GestureLibrary actual) {
    super(actual, GestureLibraryAssert.class);
  }

  public GestureLibraryAssert hasOrientationStyle(int style) {
    isNotNull();
    int actualStyle = actual.getOrientationStyle();
    assertThat(actualStyle) //
        .overridingErrorMessage("Expected orientation style <%s> but was <%s>.", style,
            actualStyle) //
        .isEqualTo(style);
    return this;
  }

  public GestureLibraryAssert hasSequenceType(int type) {
    isNotNull();
    int actualType = actual.getSequenceType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected sequence type <%s> but was <%s>.", type, actualType) //
        .isEqualTo(type);
    return this;
  }

  public GestureLibraryAssert isReadOnly() {
    isNotNull();
    assertThat(actual.isReadOnly()) //
        .overridingErrorMessage("Expected to be read only but was not.") //
        .isTrue();
    return this;
  }

  public GestureLibraryAssert isNotReadOnly() {
    isNotNull();
    assertThat(actual.isReadOnly()) //
        .overridingErrorMessage("Expected to not be read only but was not.") //
        .isFalse();
    return this;
  }
}
