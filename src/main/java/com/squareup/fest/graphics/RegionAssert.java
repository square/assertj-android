// Copyright 2013 Square, Inc.
package com.squareup.fest.graphics;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link Region} instances. */
public class RegionAssert extends AbstractAssert<RegionAssert, Region> {
  public RegionAssert(Region actual) {
    super(actual, RectAssert.class);
  }

  public RegionAssert hasBoundaryPath(Path path) {
    isNotNull();
    Path actualPath = actual.getBoundaryPath();
    assertThat(actualPath) //
        .overridingErrorMessage("Expected boundary path <%s> but was <%s>.", path, actualPath) //
        .isEqualTo(path);
    return this;
  }

  public RegionAssert hasBounds(Rect bounds) {
    isNotNull();
    Rect actualBounds = actual.getBounds();
    assertThat(actualBounds) //
        .overridingErrorMessage("Expected bounds <%s> but was <%s>.", bounds, actualBounds) //
        .isEqualTo(bounds);
    return this;
  }

  public RegionAssert isComplex() {
    isNotNull();
    assertThat(actual.isComplex()) //
        .overridingErrorMessage("Expected to be complex but was not.") //
        .isTrue();
    return this;
  }

  public RegionAssert isNotComplex() {
    isNotNull();
    assertThat(actual.isComplex()) //
        .overridingErrorMessage("Expected to not be complex but was.") //
        .isFalse();
    return this;
  }

  public RegionAssert isEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected to be empty but was not.") //
        .isTrue();
    return this;
  }

  public RegionAssert isNotEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected to not be empty but was.") //
        .isFalse();
    return this;
  }

  public RegionAssert isRect() {
    isNotNull();
    assertThat(actual.isRect()) //
        .overridingErrorMessage("Expected to be a rectangle but was not.") //
        .isTrue();
    return this;
  }

  public RegionAssert isNotRect() {
    isNotNull();
    assertThat(actual.isRect()) //
        .overridingErrorMessage("Expected to not be a rectangle but was.") //
        .isTrue();
    return this;
  }
}
