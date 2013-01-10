package com.squareup.fest.view;

import android.view.OrientationEventListener;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link OrientationEventListener} instances. */
public class OrientationEventListenerAsserts
    extends AbstractAssert<OrientationEventListenerAsserts, OrientationEventListener> {
  public OrientationEventListenerAsserts(OrientationEventListener actual) {
    super(actual, OrientationEventListenerAsserts.class);
  }

  public OrientationEventListenerAsserts isDetectingOrientation() {
    isNotNull();
    assertThat(actual.canDetectOrientation()) //
        .overridingErrorMessage("Expected to be able to detect orientation but could not.") //
        .isTrue();
    return this;
  }

  public OrientationEventListenerAsserts isNotDetectingOrientation() {
    isNotNull();
    assertThat(actual.canDetectOrientation()) //
        .overridingErrorMessage("Expected to not be able to detect orientation but could.") //
        .isFalse();
    return this;
  }
}
