package org.assertj.android.api.view;

import android.view.ViewTreeObserver;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.AbstractAssert;

/** Assertions for {@link ViewTreeObserver} instances. */
public class ViewTreeObserverAssert
    extends AbstractAssert<ViewTreeObserverAssert, ViewTreeObserver> {
  public ViewTreeObserverAssert(ViewTreeObserver actual) {
    super(actual, ViewTreeObserverAssert.class);
  }

  public ViewTreeObserverAssert isAlive() {
    isNotNull();
    Assertions.assertThat(actual.isAlive()) //
        .overridingErrorMessage("Expected to be alive but was not alive.") //
        .isTrue();
    return this;
  }

  public ViewTreeObserverAssert isNotAlive() {
    isNotNull();
    Assertions.assertThat(actual.isAlive()) //
        .overridingErrorMessage("Expected to not be alive but was alive.") //
        .isFalse();
    return this;
  }
}
