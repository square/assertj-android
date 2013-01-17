// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.widget;

import android.widget.TabWidget;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link TabWidget} instances. */
public class TabWidgetAssert extends AbstractLinearLayoutAssert<TabWidgetAssert, TabWidget> {
  public TabWidgetAssert(TabWidget actual) {
    super(actual, TabWidgetAssert.class);
  }

  public TabWidgetAssert hasTabCount(int count) {
    isNotNull();
    int actualCount = actual.getTabCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected tab count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public TabWidgetAssert isStripEnabled() {
    isNotNull();
    assertThat(actual.isStripEnabled()) //
        .overridingErrorMessage("Expected strip to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public TabWidgetAssert isStripDisabled() {
    isNotNull();
    assertThat(actual.isStripEnabled()) //
        .overridingErrorMessage("Expected strip to be disabled but was enabled.") //
        .isFalse();
    return this;
  }
}
