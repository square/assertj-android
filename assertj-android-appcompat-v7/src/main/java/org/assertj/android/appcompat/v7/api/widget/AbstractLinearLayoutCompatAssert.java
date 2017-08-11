package org.assertj.android.appcompat.v7.api.widget;

import android.annotation.TargetApi;
import android.support.v7.widget.LinearLayoutCompat;
import org.assertj.android.api.view.AbstractViewGroupAssert;
import org.assertj.android.api.widget.LinearLayoutOrientation;
import org.assertj.android.api.widget.LinearLayoutShowDividers;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH;
import static android.widget.LinearLayout.HORIZONTAL;
import static android.widget.LinearLayout.SHOW_DIVIDER_BEGINNING;
import static android.widget.LinearLayout.SHOW_DIVIDER_END;
import static android.widget.LinearLayout.SHOW_DIVIDER_MIDDLE;
import static android.widget.LinearLayout.VERTICAL;
import static org.assertj.android.internal.BitmaskUtils.buildBitMaskString;
import static org.assertj.android.internal.BitmaskUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractLinearLayoutCompatAssert<S extends AbstractLinearLayoutCompatAssert<S, A>, A extends LinearLayoutCompat>
    extends AbstractViewGroupAssert<S, A> {
  protected AbstractLinearLayoutCompatAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  @TargetApi(ICE_CREAM_SANDWICH)
  public S hasDividerPadding(int padding) {
    isNotNull();
    int actualPadding = actual.getDividerPadding();
    assertThat(actualPadding) //
        .overridingErrorMessage("Expected divider padding <%s> but was <%s>.", padding,
            actualPadding) //
        .isEqualTo(padding);
    return myself;
  }

  public S hasOrientation(@LinearLayoutOrientation int orientation) {
    isNotNull();
    int actualOrientation = actual.getOrientation();
    //noinspection ResourceType
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

  @TargetApi(HONEYCOMB)
  public S hasShowDividers(@LinearLayoutShowDividers int dividers) {
    isNotNull();
    int actualDividers = actual.getShowDividers();
    //noinspection ResourceType
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

  @TargetApi(HONEYCOMB)
  public S isMeasuringWithLargestChild() {
    isNotNull();
    assertThat(actual.isMeasureWithLargestChildEnabled()) //
        .overridingErrorMessage("Expected to be measuring with largest child but was not.") //
        .isTrue();
    return myself;
  }

  @TargetApi(HONEYCOMB)
  public S isNotMeasuringWithLargestChild() {
    isNotNull();
    assertThat(actual.isMeasureWithLargestChildEnabled()) //
        .overridingErrorMessage("Expected to not be measuring with largest child but was.") //
        .isFalse();
    return myself;
  }

  @TargetApi(HONEYCOMB)
  public static String showDividerToString(@LinearLayoutShowDividers int dividers) {
    return buildBitMaskString(dividers) //
        .flag(SHOW_DIVIDER_BEGINNING, "beginning")
        .flag(SHOW_DIVIDER_MIDDLE, "middle")
        .flag(SHOW_DIVIDER_END, "end")
        .get();
  }

  public static String orientationToString(@LinearLayoutOrientation int orientation) {
    return buildNamedValueString(orientation).value(HORIZONTAL, "horizontal")
        .value(VERTICAL, "vertical")
        .get();
  }
}
