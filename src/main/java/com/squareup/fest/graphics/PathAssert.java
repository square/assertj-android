// Copyright 2013 Square, Inc.
package com.squareup.fest.graphics;

import android.graphics.Path;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link Path} instances. */
public class PathAssert extends AbstractAssert<PathAssert, Path> {
  public PathAssert(Path actual) {
    super(actual, PaintAssert.class);
  }

  public PathAssert hasFillType(Path.FillType type) {
    isNotNull();
    Path.FillType actualType = actual.getFillType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected fill type <%s> but was <%s>.", type, actualType) //
        .isEqualTo(type);
    return this;
  }

  public PathAssert isEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected to be empty but was not.") //
        .isTrue();
    return this;
  }

  public PathAssert isNotEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected to not be empty but was.") //
        .isFalse();
    return this;
  }
}
