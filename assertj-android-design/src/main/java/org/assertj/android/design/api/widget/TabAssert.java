package org.assertj.android.design.api.widget;

import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link TabLayout.Tab} instances. */
public class TabAssert extends AbstractAssert<TabAssert, TabLayout.Tab> {
  public TabAssert(TabLayout.Tab actual) {
    super(actual, TabAssert.class);
  }

  public TabAssert hasContentDescription(CharSequence contentDescription) {
    isNotNull();
    CharSequence actualContentDescription = actual.getContentDescription();
    assertThat(actualContentDescription) //
        .overridingErrorMessage("Expected content description <%s> but was <%s>",
            contentDescription, actualContentDescription) //
        .isEqualTo(contentDescription);
    return myself;
  }

  public TabAssert hasIcon(Drawable icon) {
    isNotNull();
    Drawable actualIcon = actual.getIcon();
    assertThat(actualIcon) //
        .overridingErrorMessage("Expected icon <%s> but was <%s>.", icon, actualIcon) //
        .isSameAs(icon);
    return this;
  }

  public TabAssert hasPosition(int position) {
    isNotNull();
    int actualPosition = actual.getPosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected position <%s> but was <%s>.", position, actualPosition) //
        .isEqualTo(position);
    return myself;
  }

  public TabAssert hasText(CharSequence text) {
    isNotNull();
    CharSequence actualText = actual.getText();
    assertThat(actualText) //
        .overridingErrorMessage("Expected text <%s> but was <%s>.", text, actualText) //
        .isEqualTo(text);
    return myself;
  }
}
