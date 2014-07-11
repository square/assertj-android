// Copyright 2013 Square, Inc.
package org.assertj.android.api.graphics;

import android.graphics.Movie;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Movie} instances. */
public class MovieAssert extends AbstractAssert<MovieAssert, Movie> {
  public MovieAssert(Movie actual) {
    super(actual, MovieAssert.class);
  }

  public MovieAssert hasDuration(int duration) {
    isNotNull();
    int actualDuration = actual.duration();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected duration <%s> but was <%s>.", duration, actualDuration) //
        .isEqualTo(duration);
    return this;
  }

  public MovieAssert hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.height();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>.", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public MovieAssert isOpaque() {
    isNotNull();
    assertThat(actual.isOpaque()) //
        .overridingErrorMessage("Expected to be opaque but was not.") //
        .isTrue();
    return this;
  }

  public MovieAssert isNotOpaque() {
    isNotNull();
    assertThat(actual.isOpaque()) //
        .overridingErrorMessage("Expected to not be opaque but was.") //
        .isFalse();
    return this;
  }

  public MovieAssert hasWidth(int width) {
    isNotNull();
    int actualHeight = actual.width();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected width <%s> but was <%s>.", width, actualHeight) //
        .isEqualTo(width);
    return this;
  }
}
