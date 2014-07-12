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
  public WindowAssert hasFeature(int feature) {
    isNotNull();
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

  public static String featureToString(int feature) {
    switch (feature) {
      case FEATURE_ACTION_BAR:
        return "actionBar";
      case FEATURE_ACTION_BAR_OVERLAY:
        return "actionBarOverlay";
      case FEATURE_ACTION_MODE_OVERLAY:
        return "actionModeOverlay";
      case FEATURE_CONTEXT_MENU:
        return "contextMenu";
      case FEATURE_CUSTOM_TITLE:
        return "customTitle";
      case FEATURE_INDETERMINATE_PROGRESS:
        return "indeterminateProgress";
      case FEATURE_LEFT_ICON:
        return "leftIcon";
      case FEATURE_NO_TITLE:
        return "noIcon";
      case FEATURE_OPTIONS_PANEL:
        return "optionsPanel";
      case FEATURE_PROGRESS:
        return "progress";
      case FEATURE_RIGHT_ICON:
        return "rightIcon";
      case FEATURE_SWIPE_TO_DISMISS:
        return "swipeToDismiss";
      default:
        throw new IllegalArgumentException("Unknown window feature: " + feature);
    }
  }
}
