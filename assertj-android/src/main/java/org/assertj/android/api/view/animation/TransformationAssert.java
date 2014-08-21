// Copyright 2013 Square, Inc.
package org.assertj.android.api.view.animation;

import android.graphics.Matrix;
import android.view.animation.Transformation;
import org.assertj.core.api.AbstractAssert;

import static android.view.animation.Transformation.TYPE_ALPHA;
import static android.view.animation.Transformation.TYPE_BOTH;
import static android.view.animation.Transformation.TYPE_IDENTITY;
import static android.view.animation.Transformation.TYPE_MATRIX;
import static org.assertj.android.internal.IntegerUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

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

  public TransformationAssert hasTransformationType(@TransformationType int type) {
    isNotNull();
    int actualType = actual.getTransformationType();
    //noinspection ResourceType
    assertThat(actualType) //
        .overridingErrorMessage("Expected transformation type <%s> but was <%s>.",
            transformationTypeToString(type), transformationTypeToString(actualType)) //
        .isEqualTo(type);
    return this;
  }

  public static String transformationTypeToString(@TransformationType int type) {
    return buildNamedValueString(type)
        .value(TYPE_ALPHA, "alpha")
        .value(TYPE_BOTH, "both")
        .value(TYPE_IDENTITY, "identity")
        .value(TYPE_MATRIX, "matrix")
        .get();
  }
}
