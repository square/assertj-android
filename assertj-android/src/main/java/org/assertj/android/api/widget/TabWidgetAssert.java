// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.widget.TabWidget;

import static android.os.Build.VERSION_CODES.FROYO;
import static org.assertj.core.api.Assertions.assertThat;

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

  @TargetApi(FROYO)
  public TabWidgetAssert isStripEnabled() {
    isNotNull();
    assertThat(actual.isStripEnabled()) //
        .overridingErrorMessage("Expected strip to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  @TargetApi(FROYO)
  public TabWidgetAssert isStripDisabled() {
    isNotNull();
    assertThat(actual.isStripEnabled()) //
        .overridingErrorMessage("Expected strip to be disabled but was enabled.") //
        .isFalse();
    return this;
  }
}
