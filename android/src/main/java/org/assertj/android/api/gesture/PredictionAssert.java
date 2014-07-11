// Copyright 2013 Square, Inc.
package org.assertj.android.api.gesture;

import android.gesture.Prediction;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Prediction} instances. */
public class PredictionAssert extends AbstractAssert<PredictionAssert, Prediction> {
  public PredictionAssert(Prediction actual) {
    super(actual, PredictionAssert.class);
  }

  public PredictionAssert hasName(String name) {
    isNotNull();
    String actualName = actual.name;
    assertThat(actualName) //
        .overridingErrorMessage("Expected name <%s> but was <%s>.", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public PredictionAssert hasScore(double score) {
    isNotNull();
    double actualScore = actual.score;
    assertThat(actualScore) //
        .overridingErrorMessage("Expected score <%s> but was <%s>.", score, actualScore) //
        .isEqualTo(score);
    return this;
  }
}
