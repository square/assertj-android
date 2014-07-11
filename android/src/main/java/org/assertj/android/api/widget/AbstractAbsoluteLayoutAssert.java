package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.widget.AbsoluteLayout;
import org.assertj.android.api.view.AbstractViewGroupAssert;

import static android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractAbsoluteLayoutAssert<S extends AbstractAbsoluteLayoutAssert<S, A>, A extends AbsoluteLayout>
    extends AbstractViewGroupAssert<S, A> {
  protected AbstractAbsoluteLayoutAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  @TargetApi(ICE_CREAM_SANDWICH)
  public S isDelayingChildPressedState() {
    isNotNull();
    assertThat(actual.shouldDelayChildPressedState()) //
        .overridingErrorMessage("Epxected to be delaying child pressed state but was not.") //
        .isTrue();
    return myself;
  }

  @TargetApi(ICE_CREAM_SANDWICH)
  public S isNotDelayingChildPressedState() {
    isNotNull();
    assertThat(actual.shouldDelayChildPressedState()) //
        .overridingErrorMessage("Expected to not be delaying child pressed state but was.") //
        .isFalse();
    return myself;
  }
}
