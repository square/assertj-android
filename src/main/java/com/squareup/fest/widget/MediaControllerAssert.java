// Copyright 2013 Square, Inc.
package com.squareup.fest.widget;

import android.widget.MediaController;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link MediaController} instances. */
public class MediaControllerAssert
    extends AbstractFrameLayoutAssert<MediaControllerAssert, MediaController> {
  public MediaControllerAssert(MediaController actual) {
    super(actual, MediaControllerAssert.class);
  }

  public MediaControllerAssert isShowing() {
    isNotNull();
    assertThat(actual.isShowing()) //
        .overridingErrorMessage("Expected to be showing but was not.") //
        .isTrue();
    return this;
  }

  public MediaControllerAssert isNotShowing() {
    isNotNull();
    assertThat(actual.isShowing()) //
        .overridingErrorMessage("Expected to not be showing but was.") //
        .isFalse();
    return this;
  }
}
