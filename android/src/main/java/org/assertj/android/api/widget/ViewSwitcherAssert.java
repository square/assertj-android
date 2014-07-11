// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.view.View;
import android.widget.ViewSwitcher;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link ViewSwitcher} instances. */
public class ViewSwitcherAssert
    extends AbstractViewAnimatorAssert<ViewSwitcherAssert, ViewSwitcher> {
  public ViewSwitcherAssert(ViewSwitcher actual) {
    super(actual, ViewSwitcherAssert.class);
  }

  public ViewSwitcherAssert hasNextView(View view) {
    isNotNull();
    View actualView = actual.getNextView();
    assertThat(actualView) //
        .overridingErrorMessage("Expected next view <%s> but was <%s>.", view, actualView) //
        .isSameAs(view);
    return this;
  }
}
