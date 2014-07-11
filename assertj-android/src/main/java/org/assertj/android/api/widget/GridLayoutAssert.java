package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.widget.GridLayout;
import org.assertj.android.api.view.AbstractViewGroupAssert;

import static android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH;
import static android.widget.GridLayout.ALIGN_BOUNDS;
import static android.widget.GridLayout.ALIGN_MARGINS;
import static android.widget.GridLayout.HORIZONTAL;
import static android.widget.GridLayout.VERTICAL;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link GridLayout} instances. */
@TargetApi(ICE_CREAM_SANDWICH)
public class GridLayoutAssert extends AbstractViewGroupAssert<GridLayoutAssert, GridLayout> {
  public GridLayoutAssert(GridLayout actual) {
    super(actual, GridLayoutAssert.class);
  }

  public GridLayoutAssert hasAlignmentMode(int mode) {
    isNotNull();
    int actualMode = actual.getAlignmentMode();
    assertThat(actualMode) //
        .overridingErrorMessage("Expected alignment mode <%s> but was <%s>.",
            alignmentModeToString(mode), alignmentModeToString(actualMode)) //
        .isEqualTo(mode);
    return this;
  }

  public GridLayoutAssert hasColumnCount(int count) {
    isNotNull();
    int actualCount = actual.getColumnCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected column count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public GridLayoutAssert hasOrientation(int orientation) {
    isNotNull();
    int actualOrientation = actual.getOrientation();
    assertThat(actualOrientation) //
        .overridingErrorMessage("Expected orientation <%s> but was <%s>.",
            orientationToString(orientation), orientationToString(actualOrientation)) //
        .isEqualTo(orientation);
    return this;
  }

  public GridLayoutAssert isVertical() {
    return hasOrientation(VERTICAL);
  }

  public GridLayoutAssert isHorizontal() {
    return hasOrientation(HORIZONTAL);
  }

  public GridLayoutAssert hasRowCount(int count) {
    isNotNull();
    int actualCount = actual.getRowCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected row count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public GridLayoutAssert isUsingDefaultMargins() {
    isNotNull();
    assertThat(actual.getUseDefaultMargins()) //
        .overridingErrorMessage("Expected to be using default margins but was not.") //
        .isTrue();
    return this;
  }

  public GridLayoutAssert isNotUsingDefaultMargins() {
    isNotNull();
    assertThat(actual.getUseDefaultMargins()) //
        .overridingErrorMessage("Expected to not be using default margins but was.") //
        .isFalse();
    return this;
  }

  public GridLayoutAssert isPreservingColumnOrder() {
    isNotNull();
    assertThat(actual.isColumnOrderPreserved()) //
        .overridingErrorMessage("Expected to be preserving column order but was not.") //
        .isTrue();
    return this;
  }

  public GridLayoutAssert isNotPreservingColumnOrder() {
    isNotNull();
    assertThat(actual.isColumnOrderPreserved()) //
        .overridingErrorMessage("Expected to not be preserving column order but was.") //
        .isFalse();
    return this;
  }

  public GridLayoutAssert isPreservingRowOrder() {
    isNotNull();
    assertThat(actual.isRowOrderPreserved()) //
        .overridingErrorMessage("Expected to be preserving row order but was not.") //
        .isTrue();
    return this;
  }

  public GridLayoutAssert isNotPreservingRowOrder() {
    isNotNull();
    assertThat(actual.isRowOrderPreserved()) //
        .overridingErrorMessage("Expected to not be preserving row order but was.") //
        .isFalse();
    return this;
  }

  private static String alignmentModeToString(int mode) {
    switch (mode) {
      case ALIGN_BOUNDS:
        return "alignBounds";
      case ALIGN_MARGINS:
        return "alignMargins";
      default:
        throw new IllegalArgumentException("Unknown alignment mode: " + mode);
    }
  }

  private static String orientationToString(int orientation) {
    switch (orientation) {
      case HORIZONTAL:
        return "horizontal";
      case VERTICAL:
        return "vertical";
      default:
        throw new IllegalArgumentException("Unknown orientation: " + orientation);
    }
  }
}
