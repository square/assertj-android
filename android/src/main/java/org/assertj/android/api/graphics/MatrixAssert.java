// Copyright 2013 Square, Inc.
package org.assertj.android.api.graphics;

import android.graphics.Matrix;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Matrix} instances. */
public class MatrixAssert extends AbstractAssert<MatrixAssert, Matrix> {
  public  MatrixAssert(Matrix actual) {
    super(actual, MatrixAssert.class);
  }

  public MatrixAssert isIdentity() {
    isNotNull();
    assertThat(actual.isIdentity()) //
        .overridingErrorMessage("Expected to be identity matrix but was not.") //
        .isTrue();
    return this;
  }

  public MatrixAssert isNotIdentity() {
    isNotNull();
    assertThat(actual.isIdentity()) //
        .overridingErrorMessage("Expected to not be identity matrix but was.") //
        .isTrue();
    return this;
  }
}
