// Copyright 2013 Square, Inc.
package com.squareup.fest.widget;

import android.view.View;
import android.widget.Toast;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link Toast} instances. */
public class ToastAssert extends AbstractAssert<ToastAssert, Toast> {
  public ToastAssert(Toast actual) {
    super(actual, ToastAssert.class);
  }

  public ToastAssert hasDuration(int duration) {
    isNotNull();
    int actualDuration = actual.getDuration();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected duration <%s> but was <%s>.", duration, actualDuration) //
        .isEqualTo(duration);
    return this;
  }

  public ToastAssert hasGravity(int gravity) {
    isNotNull();
    int actualGravity = actual.getGravity();
    assertThat(actualGravity) //
        .overridingErrorMessage("Expected gravity <%s> but was <%s>.", gravity, actualGravity) //
        .isEqualTo(actualGravity);
    return this;
  }

  public ToastAssert hasHorizontalMargin(float margin) {
    isNotNull();
    float actualMargin = actual.getHorizontalMargin();
    assertThat(actualMargin) //
        .overridingErrorMessage("Expected horizontal margin <%s> but was <%s>.", margin,
            actualMargin) //
        .isEqualTo(margin);
    return this;
  }

  public ToastAssert hasVerticalMargin(float margin) {
    isNotNull();
    float actualMargin = actual.getVerticalMargin();
    assertThat(actualMargin) //
        .overridingErrorMessage("Expected vertical margin <%s> but was <%s>.", margin,
            actualMargin) //
        .isEqualTo(margin);
    return this;
  }

  public ToastAssert hasView(View view) {
    isNotNull();
    View actualView = actual.getView();
    assertThat(actualView) //
        .overridingErrorMessage("Expected view <%s> but was <%s>.", view, actualView) //
        .isSameAs(view);
    return this;
  }

  public ToastAssert hasXOffset(int offset) {
    isNotNull();
    int actualOffset = actual.getXOffset();
    assertThat(actualOffset) //
        .overridingErrorMessage("Expected X offset <%s> but was <%s>.", offset, actualOffset) //
        .isEqualTo(offset);
    return this;
  }

  public ToastAssert hasYOffset(int offset) {
    isNotNull();
    int actualOffset = actual.getYOffset();
    assertThat(actualOffset) //
        .overridingErrorMessage("Expected Y offset <%s> but was <%s>.", offset, actualOffset) //
        .isEqualTo(offset);
    return this;
  }
}
