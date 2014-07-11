// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.view.View;
import android.widget.TabHost;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link TabHost} instances. */
public class TabHostAssert extends AbstractFrameLayoutAssert<TabHostAssert, TabHost> {
  public TabHostAssert(TabHost actual) {
    super(actual, TabHostAssert.class);
  }

  public TabHostAssert hasCurrentTab(int tab) {
    isNotNull();
    int actualTab = actual.getCurrentTab();
    assertThat(actualTab) //
        .overridingErrorMessage("Expected current tab <%s> but was <%s>.", tab, actualTab) //
        .isEqualTo(tab);
    return this;
  }

  public TabHostAssert hasCurrentTabTag(String tag) {
    isNotNull();
    String actualTag = actual.getCurrentTabTag();
    assertThat(actualTag) //
        .overridingErrorMessage("Expected current tab tag <%s> but was <%s>.", tag, actualTag) //
        .isEqualTo(tag);
    return this;
  }

  public TabHostAssert hasCurrentTabView(View view) {
    isNotNull();
    View actualView = actual.getCurrentTabView();
    assertThat(actualView) //
        .overridingErrorMessage("Expected current tab view <%s> but was <%s>.", view, actualView) //
        .isSameAs(view);
    return this;
  }

  public TabHostAssert hasCurrentView(View view) {
    isNotNull();
    View actualView = actual.getCurrentView();
    assertThat(actualView) //
        .overridingErrorMessage("Expected current view <%s> but was <%s>.", view, actualView) //
        .isSameAs(view);
    return this;
  }
}
