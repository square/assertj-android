// Copyright 2013 Square, Inc.
package org.assertj.android.api.graphics;

import android.graphics.PathMeasure;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link PathMeasure} instances. */
public class PathMeasureAssert extends AbstractAssert<PathMeasureAssert, PathMeasure> {
  public PathMeasureAssert(PathMeasure actual) {
    super(actual, PathMeasureAssert.class);
  }

  public PathMeasureAssert hasLength(float length) {
    isNotNull();
    float actualLength = actual.getLength();
    assertThat(actualLength) //
        .overridingErrorMessage("Expected length <%s> but was <%s>.", length, actualLength) //
        .isEqualTo(length);
    return this;
  }

  public PathMeasureAssert isClosed() {
    isNotNull();
    assertThat(actual.isClosed()) //
        .overridingErrorMessage("Expected to be closed but was not.") //
        .isTrue();
    return this;
  }

  public PathMeasureAssert isNotClosed() {
    isNotNull();
    assertThat(actual.isClosed()) //
        .overridingErrorMessage("Expected to not be closed but was.") //
        .isFalse();
    return this;
  }
}
