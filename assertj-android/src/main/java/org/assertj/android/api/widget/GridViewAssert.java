// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.widget.GridView;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static android.widget.GridView.NO_STRETCH;
import static android.widget.GridView.STRETCH_COLUMN_WIDTH;
import static android.widget.GridView.STRETCH_SPACING;
import static android.widget.GridView.STRETCH_SPACING_UNIFORM;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link GridView} instances. */
public class GridViewAssert extends AbstractAbsListViewAssert<GridViewAssert, GridView> {
  public GridViewAssert(GridView actual) {
    super(actual, GridViewAssert.class);
  }

  @TargetApi(JELLY_BEAN)
  public GridViewAssert hasColumnWidth(int width) {
    isNotNull();
    int actualWidth = actual.getColumnWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected column width <%s> but was <%s>.", width, actualWidth) //
        .isEqualTo(width);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public GridViewAssert hasGravity(int gravity) {
    isNotNull();
    int actualGravity = actual.getGravity();
    assertThat(actualGravity) //
        .overridingErrorMessage("Expected gravity <%s> but was <%s>.", gravity, actualGravity) //
        .isEqualTo(gravity);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public GridViewAssert hasHorizontalSpacing(int spacing) {
    isNotNull();
    int actualSpacing = actual.getHorizontalSpacing();
    assertThat(actualSpacing) //
        .overridingErrorMessage("Expected horizontal spacing <%s> but was <%s>.", spacing,
            actualSpacing) //
        .isEqualTo(spacing);
    return this;
  }

  @TargetApi(HONEYCOMB)
  public GridViewAssert hasColumnCount(int count) {
    isNotNull();
    int actualCount = actual.getNumColumns();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected column count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public GridViewAssert hasRequestedColumnWidth(int width) {
    isNotNull();
    int actualWidth = actual.getRequestedColumnWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected requested column width <%s> but was <%s>.", width,
            actualWidth) //
        .isEqualTo(width);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public GridViewAssert hasRequestedHorizontalSpacing(int spacing) {
    isNotNull();
    int actualSpacing = actual.getRequestedHorizontalSpacing();
    assertThat(actualSpacing) //
        .overridingErrorMessage("Expected requested horizontal spacing <%s> but was <%s>.", spacing,
            actualSpacing) //
        .isEqualTo(spacing);
    return this;
  }

  public GridViewAssert hasStretchMode(int mode) {
    isNotNull();
    int actualMode = actual.getStretchMode();
    assertThat(actualMode) //
        .overridingErrorMessage("Expected stretch mode <%s> but was <%s>.",
            stretchModeToString(mode), stretchModeToString(actualMode)) //
        .isEqualTo(mode);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public GridViewAssert hasVerticalSpacing(int spacing) {
    isNotNull();
    int actualSpacing = actual.getVerticalSpacing();
    assertThat(actualSpacing) //
        .overridingErrorMessage("Expected vertical spacing <%s> but was <%s>.", spacing,
            actualSpacing) //
        .isEqualTo(spacing);
    return this;
  }

  private static String stretchModeToString(int mode) {
    switch (mode) {
      case NO_STRETCH:
        return "noStretch";
      case STRETCH_SPACING:
        return "stretchSpacing";
      case STRETCH_SPACING_UNIFORM:
        return "stretchSpacingUniform";
      case STRETCH_COLUMN_WIDTH:
        return "stretchColumnWidth";
      default:
        throw new IllegalArgumentException("Unknown stretch mode: " + mode);
    }
  }
}
