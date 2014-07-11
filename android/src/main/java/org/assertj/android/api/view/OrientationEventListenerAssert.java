package org.assertj.android.api.view;

import android.view.OrientationEventListener;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link OrientationEventListener} instances. */
public class OrientationEventListenerAssert
    extends AbstractAssert<OrientationEventListenerAssert, OrientationEventListener> {
  public OrientationEventListenerAssert(OrientationEventListener actual) {
    super(actual, OrientationEventListenerAssert.class);
  }

  public OrientationEventListenerAssert isDetectingOrientation() {
    isNotNull();
    assertThat(actual.canDetectOrientation()) //
        .overridingErrorMessage("Expected to be able to detect orientation but could not.") //
        .isTrue();
    return this;
  }

  public OrientationEventListenerAssert isNotDetectingOrientation() {
    isNotNull();
    assertThat(actual.canDetectOrientation()) //
        .overridingErrorMessage("Expected to not be able to detect orientation but could.") //
        .isFalse();
    return this;
  }
}
