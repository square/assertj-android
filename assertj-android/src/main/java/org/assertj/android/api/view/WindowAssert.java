package org.assertj.android.api.view;

import android.annotation.TargetApi;
import android.view.View;
import android.view.Window;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.view.Window.FEATURE_ACTION_BAR;
import static android.view.Window.FEATURE_ACTION_BAR_OVERLAY;
import static android.view.Window.FEATURE_ACTION_MODE_OVERLAY;
import static android.view.Window.FEATURE_CONTEXT_MENU;
import static android.view.Window.FEATURE_CUSTOM_TITLE;
import static android.view.Window.FEATURE_INDETERMINATE_PROGRESS;
import static android.view.Window.FEATURE_LEFT_ICON;
import static android.view.Window.FEATURE_NO_TITLE;
import static android.view.Window.FEATURE_OPTIONS_PANEL;
import static android.view.Window.FEATURE_PROGRESS;
import static android.view.Window.FEATURE_RIGHT_ICON;
import static android.view.Window.FEATURE_SWIPE_TO_DISMISS;
import static org.assertj.android.internal.BitmaskUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Window} instances. */
public class WindowAssert extends AbstractAssert<WindowAssert, Window> {
  public WindowAssert(Window actual) {
    super(actual, WindowAssert.class);
  }

  public WindowAssert hasCurrentFocus(View view) {
    isNotNull();
    View actualView = actual.getCurrentFocus();
    assertThat(actualView) //
        .overridingErrorMessage("Expected current focused view <%s> but was <%s>.", view,
            actualView) //
        .isSameAs(view);
    return this;
  }

  public WindowAssert hasChildren() {
    isNotNull();
    assertThat(actual.hasChildren()) //
        .overridingErrorMessage("Expected children but had no children.") //
        .isTrue();
    return this;
  }

  public WindowAssert hasNoChildren() {
    isNotNull();
    assertThat(actual.hasChildren()) //
        .overridingErrorMessage("Expected no children but had children.") //
        .isFalse();
    return this;
  }

  @TargetApi(HONEYCOMB)
  public WindowAssert hasFeature(@WindowFeature int feature) {
    isNotNull();
    //noinspection ResourceType
    assertThat(actual.hasFeature(feature)) //
        .overridingErrorMessage("Expected feature <%s> but was not present.",
            featureToString(feature)) //
        .isTrue();
    return this;
  }

  public WindowAssert isActive() {
    isNotNull();
    assertThat(actual.isActive()) //
        .overridingErrorMessage("Expected to be active but was not active.") //
        .isTrue();
    return this;
  }

  public WindowAssert isNotActive() {
    isNotNull();
    assertThat(actual.isActive()) //
        .overridingErrorMessage("Expected to not be active but was active.") //
        .isFalse();
    return this;
  }

  public WindowAssert isFloating() {
    isNotNull();
    assertThat(actual.isFloating()) //
        .overridingErrorMessage("Expected to be floating but was not floating.") //
        .isTrue();
    return this;
  }

  public WindowAssert isNotFloating() {
    isNotNull();
    assertThat(actual.isFloating()) //
        .overridingErrorMessage("Expected to not be floating but was floating.") //
        .isFalse();
    return this;
  }

  public static String featureToString(@WindowFeature int feature) {
    return buildNamedValueString(feature)
        .value(FEATURE_ACTION_BAR, "actionBar")
        .value(FEATURE_ACTION_BAR_OVERLAY, "actionBarOverlay")
        .value(FEATURE_ACTION_MODE_OVERLAY, "actionModeOverlay")
        .value(FEATURE_CONTEXT_MENU, "contextMenu")
        .value(FEATURE_CUSTOM_TITLE, "customTitle")
        .value(FEATURE_INDETERMINATE_PROGRESS, "indeterminateProgress")
        .value(FEATURE_LEFT_ICON, "leftIcon")
        .value(FEATURE_NO_TITLE, "noTitle")
        .value(FEATURE_OPTIONS_PANEL, "optionalPanel")
        .value(FEATURE_PROGRESS, "progress")
        .value(FEATURE_RIGHT_ICON, "rightIcon")
        .value(FEATURE_SWIPE_TO_DISMISS, "swipeToDismiss")
        .get();
  }
}
