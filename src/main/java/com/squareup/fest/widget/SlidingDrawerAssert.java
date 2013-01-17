// Copyright 2013 Square, Inc.
package com.squareup.fest.widget;

import android.view.View;
import android.widget.SlidingDrawer;
import com.squareup.fest.view.AbstractViewGroupAssert;

import static com.squareup.fest.Assertions.assertThat;

/** Assertions for {@link SlidingDrawer} instances. */
public class SlidingDrawerAssert
    extends AbstractViewGroupAssert<SlidingDrawerAssert, SlidingDrawer> {
  public SlidingDrawerAssert(SlidingDrawer actual) {
    super(actual, SlidingDrawerAssert.class);
  }

  public SlidingDrawerAssert hasContent(View view) {
    isNotNull();
    View actualView = actual.getContent();
    assertThat(actualView) //
        .overridingErrorMessage("Expected content <%s> but was <%s>.", view, actualView) //
        .isSameAs(view);
    return this;
  }

  public SlidingDrawerAssert hasHandle(View view) {
    isNotNull();
    View actualView = actual.getHandle();
    assertThat(actualView) //
        .overridingErrorMessage("Expected handle <%s> but was <%s>.", view, actualView) //
        .isSameAs(view);
    return this;
  }

  public SlidingDrawerAssert isMoving() {
    isNotNull();
    assertThat(actual.isMoving()) //
        .overridingErrorMessage("Expected to be moving but was not.") //
        .isTrue();
    return this;
  }

  public SlidingDrawerAssert isNotMoving() {
    isNotNull();
    assertThat(actual.isMoving()) //
        .overridingErrorMessage("Expected to not be moving but was.") //
        .isFalse();
    return this;
  }

  public SlidingDrawerAssert isOpened() {
    isNotNull();
    assertThat(actual.isMoving()) //
        .overridingErrorMessage("Expected to be opened but was closed.") //
        .isTrue();
    return this;
  }

  public SlidingDrawerAssert isClosed() {
    isNotNull();
    assertThat(actual.isMoving()) //
        .overridingErrorMessage("Expected to be closed but was open.") //
        .isFalse();
    return this;
  }
}
