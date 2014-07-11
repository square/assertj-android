package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.widget.RelativeLayout;
import org.assertj.android.api.view.AbstractViewGroupAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractRelativeLayoutAssert<S extends AbstractRelativeLayoutAssert<S, A>, A extends RelativeLayout>
    extends AbstractViewGroupAssert<S, A> {
  protected AbstractRelativeLayoutAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  @TargetApi(JELLY_BEAN)
  public S hasGravity(int gravity) {
    isNotNull();
    int actualGravity = actual.getGravity();
    assertThat(actualGravity) //
        .overridingErrorMessage("Expected gravity <%s> but was <%s>.", gravity, actualGravity) //
        .isEqualTo(gravity);
    return myself;
  }
}
