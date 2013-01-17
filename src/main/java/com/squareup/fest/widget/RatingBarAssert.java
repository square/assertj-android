// Copyright 2013 Square, Inc.
package com.squareup.fest.widget;

import android.widget.RatingBar;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link RatingBar} instances. */
public class RatingBarAssert extends AbstractAbsSeekBarAssert<RatingBarAssert, RatingBar> {
  public RatingBarAssert(RatingBar actual) {
    super(actual, RatingBarAssert.class);
  }

  public RatingBarAssert hasStarCount(int count) {
    isNotNull();
    int actualCount = actual.getNumStars();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected star count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public RatingBarAssert hasRating(float rating) {
    isNotNull();
    float actualRating = actual.getRating();
    assertThat(actualRating) //
        .overridingErrorMessage("Expected rating <%s> but was <%s>.", rating, actualRating) //
        .isEqualTo(rating);
    return this;
  }

  public RatingBarAssert hasStepSize(float size) {
    isNotNull();
    float actualSize = actual.getStepSize();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected step size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }

  public RatingBarAssert isIndicator() {
    isNotNull();
    assertThat(actual.isIndicator()) //
        .overridingErrorMessage("Expected to be indicator but was not.") //
        .isTrue();
    return this;
  }

  public RatingBarAssert isNotIndicator() {
    isNotNull();
    assertThat(actual.isIndicator()) //
        .overridingErrorMessage("Expected to not be indicator but was.") //
        .isFalse();
    return this;
  }
}
