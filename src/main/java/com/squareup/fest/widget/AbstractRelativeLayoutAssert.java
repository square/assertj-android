package com.squareup.fest.widget;

import android.widget.RelativeLayout;
import com.squareup.fest.view.AbstractViewGroupAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractRelativeLayoutAssert<S extends AbstractRelativeLayoutAssert<S, A>, A extends RelativeLayout>
    extends AbstractViewGroupAssert<S, A> {
  protected AbstractRelativeLayoutAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasGravity(int gravity) {
    isNotNull();
    int actualGravity = actual.getGravity();
    assertThat(actualGravity) //
        .overridingErrorMessage("Expected gravity <%s> but was <%s>.", gravity, actualGravity) //
        .isEqualTo(gravity);
    return myself;
  }
}
