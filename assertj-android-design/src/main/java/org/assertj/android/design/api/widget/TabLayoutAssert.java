package org.assertj.android.design.api.widget;

import android.support.design.widget.TabLayout;
import org.assertj.android.api.widget.AbstractHorizontalScrollViewAssert;

import static org.assertj.android.internal.IntegerUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link TabLayout} instances. */
public class TabLayoutAssert extends
    AbstractHorizontalScrollViewAssert<TabLayoutAssert, TabLayout> {
  public TabLayoutAssert(TabLayout actual) {
    super(actual, TabLayoutAssert.class);
  }

  public TabLayoutAssert hasTabCount(int count) {
    isNotNull();
    int actualCount = actual.getTabCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected tab count of <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public TabLayoutAssert hasTabGravity(@TabGravity int gravity) {
    isNotNull();
    int actualGravity = actual.getTabGravity();
    //noinspection ResourceType
    assertThat(actualGravity) //
        .overridingErrorMessage("Expected tab gravity of <%s> but was <%s>.",
            gravityToString(gravity), gravityToString(actualGravity)) //
        .isEqualTo(gravity);
    return this;
  }

  public TabLayoutAssert hasTabMode(@TabMode int mode) {
    isNotNull();
    int actualMode = actual.getTabMode();
    //noinspection ResourceType
    assertThat(actualMode) //
        .overridingErrorMessage("Expected tab mode of <%s> but was <%s>.", modeToString(mode),
            modeToString(actualMode)) //
        .isEqualTo(mode);
    return this;
  }

  public TabLayoutAssert hasFixedTabs() {
    return hasTabMode(TabLayout.MODE_FIXED);
  }

  public TabLayoutAssert hasScrollingTabs() {
    return hasTabMode(TabLayout.MODE_SCROLLABLE);
  }

  public static String gravityToString(@TabGravity int gravity) {
    return buildNamedValueString(gravity).value(TabLayout.GRAVITY_CENTER, "center")
        .value(TabLayout.GRAVITY_FILL, "fill")
        .get();
  }

  public static String modeToString(@TabMode int mode) {
    return buildNamedValueString(mode).value(TabLayout.MODE_FIXED, "fixed")
        .value(TabLayout.MODE_SCROLLABLE, "scrollable")
        .get();
  }
}
