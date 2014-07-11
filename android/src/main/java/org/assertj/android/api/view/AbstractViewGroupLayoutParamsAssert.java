package org.assertj.android.api.view;

import android.view.ViewGroup;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractViewGroupLayoutParamsAssert<S extends AbstractViewGroupLayoutParamsAssert<S, A>, A extends ViewGroup.LayoutParams>
    extends AbstractAssert<S, A> {
  protected AbstractViewGroupLayoutParamsAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.height;
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>", height, actualHeight) //
        .isEqualTo(height);
    return myself;
  }

  public S hasWidth(int width) {
    isNotNull();
    int actualWidth = actual.width;
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected width <%s> but was <%s>", width, actualWidth) //
        .isEqualTo(width);
    return myself;
  }
}
