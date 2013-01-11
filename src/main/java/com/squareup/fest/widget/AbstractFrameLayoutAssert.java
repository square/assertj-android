package com.squareup.fest.widget;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.squareup.fest.view.AbstractViewGroupAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractFrameLayoutAssert<S extends AbstractFrameLayoutAssert<S, A>, A extends FrameLayout>
    extends AbstractViewGroupAssert<S, A> {
  protected AbstractFrameLayoutAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasForeground(Drawable drawable) {
    isNotNull();
    Drawable actualDrawable = actual.getForeground();
    assertThat(actualDrawable) //
        .overridingErrorMessage("Expected foreground drawable <%s> but was <%s>", drawable,
            actualDrawable) //
        .isSameAs(drawable);
    return myself;
  }

  public S hasForegroundGravity(int gravity) {
    isNotNull();
    int actualGravity = actual.getForegroundGravity();
    assertThat(actualGravity) //
        .overridingErrorMessage("Expected foreground gravity <%s> but was <%s>.", gravity,
            actualGravity) //
        .isEqualTo(gravity);
    return myself;
  }

  public S isMeasuringAllChildren() {
    isNotNull();
    assertThat(actual.getMeasureAllChildren()) //
        .overridingErrorMessage("Expected to be measuring all children but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotMeasuringAllChildren() {
    isNotNull();
    assertThat(actual.getMeasureAllChildren()) //
        .overridingErrorMessage("Expected to not be measuring all children but was.") //
        .isFalse();
    return myself;
  }

  public S isDelayingChildPressedState() {
    isNotNull();
    assertThat(actual.shouldDelayChildPressedState()) //
        .overridingErrorMessage("Epxected to be delaying child pressed state but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotDelayingChildPressedState() {
    isNotNull();
    assertThat(actual.shouldDelayChildPressedState()) //
        .overridingErrorMessage("Expected to not be delaying child pressed state but was.") //
        .isFalse();
    return myself;
  }
}
