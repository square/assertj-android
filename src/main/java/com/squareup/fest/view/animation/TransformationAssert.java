// Copyright 2013 Square, Inc.
package com.squareup.fest.view.animation;

import android.graphics.Matrix;
import android.view.animation.Transformation;
import org.fest.assertions.api.AbstractAssert;

import static android.view.animation.Transformation.TYPE_ALPHA;
import static android.view.animation.Transformation.TYPE_BOTH;
import static android.view.animation.Transformation.TYPE_IDENTITY;
import static android.view.animation.Transformation.TYPE_MATRIX;
import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link Transformation} instances. */
public class TransformationAssert extends AbstractAssert<TransformationAssert, Transformation> {
  public TransformationAssert(Transformation actual) {
    super(actual, TransformationAssert.class);
  }

  public TransformationAssert hasAlpha(float alpha) {
    isNotNull();
    float actualAlpha = actual.getAlpha();
    assertThat(actualAlpha) //
        .overridingErrorMessage("Expected alpha <%s> but was <%s>.", alpha, actualAlpha) //
        .isEqualTo(alpha);
    return this;
  }

  public TransformationAssert hasMatrix(Matrix matrix) {
    isNotNull();
    Matrix actualMatrix = actual.getMatrix();
    assertThat(actualMatrix) //
        .overridingErrorMessage("Expected matrix <%s> but was <%s>.", matrix, actualMatrix) //
        .isEqualTo(matrix);
    return this;
  }

  public TransformationAssert hasTransformationType(int type) {
    isNotNull();
    int actualType = actual.getTransformationType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected transformation type <%s> but was <%s>.",
            transformationTypeToString(type), transformationTypeToString(actualType)) //
        .isEqualTo(type);
    return this;
  }

  private static String transformationTypeToString(int type) {
    // TODO http://android-review.googlesource.com/49980
    //switch (type) {
    //  case TYPE_ALPHA:
    //    return "alpha";
    //  case TYPE_BOTH:
    //    return "both";
    //  case TYPE_IDENTITY:
    //    return "identity";
    //  case TYPE_MATRIX:
    //    return "matrix";
    //  default:
    //    throw new IllegalArgumentException("Unknown transformation type: " + type);
    //}
    if (type == TYPE_ALPHA) {
      return "alpha";
    } else if (type == TYPE_BOTH) {
      return "both";
    } else if (type == TYPE_IDENTITY) {
      return "identity";
    } else if (type == TYPE_MATRIX) {
      return "matrix";
    } else {
      throw new IllegalArgumentException("Unknown transformation type: " + type);
    }
  }
}
