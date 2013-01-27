package org.fest.assertions.api.android.widget;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import org.fest.assertions.api.AbstractAssert;

import static android.widget.LinearLayout.HORIZONTAL;
import static android.widget.LinearLayout.SHOW_DIVIDER_BEGINNING;
import static android.widget.LinearLayout.SHOW_DIVIDER_END;
import static android.widget.LinearLayout.SHOW_DIVIDER_MIDDLE;
import static android.widget.LinearLayout.VERTICAL;
import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractLinearLayoutAssert<S extends AbstractLinearLayoutAssert<S, A>, A extends LinearLayout>
    extends AbstractAssert<S, A> {
  protected AbstractLinearLayoutAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasBaseline(int baseline) {
    isNotNull();
    int actualBaseline = actual.getBaseline();
    assertThat(actualBaseline) //
        .overridingErrorMessage("Expected baseline <%s> but was <%s>.", baseline, actualBaseline) //
        .isEqualTo(baseline);
    return myself;
  }

  public S hasDividerPadding(int padding) {
    isNotNull();
    int actualPadding = actual.getDividerPadding();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected divider padding <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  public S hasOrientation(int orientation) {
    isNotNull();
    int actualOrientation = actual.getOrientation();
    assertThat(actualOrientation) //
        .overridingErrorMessage("Expected orientation <%s> but was <%s>.",
            orientationToString(orientation), orientationToString(actualOrientation)) //
        .isEqualTo(orientation);
    return myself;
  }

  public S isVertical() {
    return hasOrientation(VERTICAL);
  }

  public S isHorizontal() {
    return hasOrientation(HORIZONTAL);
  }

  public S hasShowDividers(int dividers) {
    isNotNull();
    int actualDividers = actual.getShowDividers();
    assertThat(actualDividers) //
        .overridingErrorMessage("Expected showing dividers <%s> but was <%s>.",
            showDividerToString(dividers), showDividerToString(actualDividers)) //
        .isEqualTo(dividers);
    return myself;
  }

  public S hasWeightSum(float sum) {
    isNotNull();
    float actualSum = actual.getWeightSum();
    assertThat(actualSum) //
        .overridingErrorMessage("Expected weight sum <%s> but was <%s>.", sum, actualSum) //
        .isEqualTo(sum);
    return myself;
  }

  public S isBaselineAligned() {
    isNotNull();
    assertThat(actual.isBaselineAligned()) //
        .overridingErrorMessage("Expected to be baseline aligned but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotBaselineAligned() {
    isNotNull();
    assertThat(actual.isBaselineAligned()) //
        .overridingErrorMessage("Expected to not be baseline aligned but was.") //
        .isFalse();
    return myself;
  }

  public S isMeasuringWithLargestChild() {
    isNotNull();
    assertThat(actual.isMeasureWithLargestChildEnabled()) //
        .overridingErrorMessage("Expected to be measuring with largest child but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotMeasuringWithLargestChild() {
    isNotNull();
    assertThat(actual.isMeasureWithLargestChildEnabled()) //
        .overridingErrorMessage("Expected to not be measuring with largest child but was.") //
        .isFalse();
    return myself;
  }

  static String showDividerToString(int dividers) {
    if (dividers == 0) {
      return "none";
    }
    List<String> parts = new ArrayList<String>();
    if ((dividers & SHOW_DIVIDER_BEGINNING) != 0) {
      parts.add("beginning");
    }
    if ((dividers & SHOW_DIVIDER_MIDDLE) != 0) {
      parts.add("middle");
    }
    if ((dividers & SHOW_DIVIDER_END) != 0) {
      parts.add("end");
    }
    return TextUtils.join(", ", parts);
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
