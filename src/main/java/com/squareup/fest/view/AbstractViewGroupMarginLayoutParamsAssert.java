package com.squareup.fest.view;

import android.view.ViewGroup;

import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractViewGroupMarginLayoutParamsAssert<S extends AbstractViewGroupMarginLayoutParamsAssert<S, A>, A extends ViewGroup.MarginLayoutParams>
    extends AbstractViewGroupLayoutParamsAssert<S, A> {
  protected AbstractViewGroupMarginLayoutParamsAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasBottomMargin(int margin) {
    isNotNull();
    int actualMargin = actual.bottomMargin;
    assertThat(actualMargin) //
        .overridingErrorMessage("Expected bottom margin <%s> but was <%s>", margin, actualMargin) //
        .isEqualTo(margin);
    return myself;
  }

  public S hasLeftMargin(int margin) {
    isNotNull();
    int actualMargin = actual.leftMargin;
    assertThat(actualMargin) //
        .overridingErrorMessage("Expected left margin <%s> but was <%s>", margin, actualMargin) //
        .isEqualTo(margin);
    return myself;
  }

  public S hasRightMargin(int margin) {
    isNotNull();
    int actualMargin = actual.rightMargin;
    assertThat(actualMargin) //
        .overridingErrorMessage("Expected right margin <%s> but was <%s>", margin, actualMargin) //
        .isEqualTo(margin);
    return myself;
  }

  public S hasTopMargin(int margin) {
    isNotNull();
    int actualMargin = actual.topMargin;
    assertThat(actualMargin) //
        .overridingErrorMessage("Expected top margin <%s> but was <%s>", margin, actualMargin) //
        .isEqualTo(margin);
    return myself;
  }
}
