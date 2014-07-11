// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.widget.AbsSeekBar;

import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractAbsSeekBarAssert<S extends AbstractAbsSeekBarAssert<S, A>, A extends AbsSeekBar>
    extends AbstractProgressBarAssert<S, A> {
  protected AbstractAbsSeekBarAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasKeyProgressIncrement(int increment) {
    isNotNull();
    int actualIncrement = actual.getKeyProgressIncrement();
    assertThat(actualIncrement) //
        .overridingErrorMessage("Expected key progress increment <%s> but was <%s>.", increment,
            actualIncrement) //
        .isEqualTo(increment);
    return myself;
  }

  @TargetApi(JELLY_BEAN)
  public S hasThumb(Drawable drawable) {
    isNotNull();
    Drawable actualDrawable = actual.getThumb();
    assertThat(actualDrawable) //
        .overridingErrorMessage("Expected thumb <%s> but was <%s>.", drawable, actualDrawable) //
        .isSameAs(drawable);
    return myself;
  }

  public S hasThumbOffset(int offset) {
    isNotNull();
    int actualOffset = actual.getThumbOffset();
    assertThat(actualOffset) //
        .overridingErrorMessage("Expected thumb offset <%s> but was <%s>.", offset, actualOffset) //
        .isEqualTo(offset);
    return myself;
  }
}
