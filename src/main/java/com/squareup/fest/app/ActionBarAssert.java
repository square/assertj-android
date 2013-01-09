package com.squareup.fest.app;

import android.app.ActionBar;
import org.fest.assertions.api.AbstractAssert;

import static android.app.ActionBar.DISPLAY_HOME_AS_UP;
import static android.app.ActionBar.DISPLAY_SHOW_CUSTOM;
import static android.app.ActionBar.DISPLAY_SHOW_HOME;
import static android.app.ActionBar.DISPLAY_SHOW_TITLE;
import static android.app.ActionBar.DISPLAY_USE_LOGO;
import static android.app.ActionBar.NAVIGATION_MODE_LIST;
import static android.app.ActionBar.NAVIGATION_MODE_STANDARD;
import static android.app.ActionBar.NAVIGATION_MODE_TABS;
import static org.fest.assertions.api.Assertions.assertThat;

public class ActionBarAssert extends AbstractAssert<ActionBarAssert, ActionBar> {
  public ActionBarAssert(ActionBar actual) {
    super(actual, ActionBarAssert.class);
  }

  public ActionBarAssert hasDisplayOption(int option) {
    isNotNull();
    assertThat(actual.getDisplayOptions() & option) //
        .overridingErrorMessage("Expected display option <%s> but was not present",
            displayOptionToString(option)) //
        .isNotZero();
    return this;
  }

  public ActionBarAssert hasDisplayOptions(int options) {
    isNotNull();
    final int actualOptions = actual.getDisplayOptions();
    assertThat(actualOptions) //
        .overridingErrorMessage("Expected display options <%s> but was <%s>", options,
            actualOptions) //
        .isEqualTo(options);
    return this;
  }

  public ActionBarAssert hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.getHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public ActionBarAssert hasNavigationItemCount(int count) {
    isNotNull();
    int actualCount = actual.getNavigationItemCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected count <%s> but was <%s>", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public ActionBarAssert hasNavigationMode(int mode) {
    isNotNull();
    int actualMode = actual.getNavigationMode();
    assertThat(actualMode) //
        .overridingErrorMessage("Expected mode <%s> but was <%s>", navigationModeToString(mode),
            navigationModeToString(actualMode)) //
        .isEqualTo(mode);
    return this;
  }

  public ActionBarAssert hasSelectedNavigationIndex(int index) {
    isNotNull();
    int actualIndex = actual.getSelectedNavigationIndex();
    assertThat(actualIndex) //
        .overridingErrorMessage("Expected selected index <%s> but was <%s>", index, actualIndex) //
        .isEqualTo(index);
    return this;
  }

  public ActionBarAssert hasSubtitle(CharSequence subtitle) {
    isNotNull();
    assertThat(actual.getSubtitle()).isEqualTo(subtitle);
    return this;
  }

  public ActionBarAssert hasSubtitle(int resId) {
    return hasSubtitle(actual.getThemedContext().getString(resId));
  }

  public ActionBarAssert hasTabCount(int count) {
    isNotNull();
    int actualCount = actual.getTabCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected tab count of <%s> but was <%s>", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public ActionBarAssert hasTitle(CharSequence title) {
    isNotNull();
    assertThat(actual.getTitle()).isEqualTo(title);
    return this;
  }

  public ActionBarAssert hasTitle(int resId) {
    return hasTitle(actual.getThemedContext().getString(resId));
  }

  public ActionBarAssert isShowing() {
    isNotNull();
    assertThat(actual.isShowing()) //
        .overridingErrorMessage("Expected showing but was not showing") //
        .isTrue();
    return this;
  }

  public ActionBarAssert isNotShowing() {
    isNotNull();
    assertThat(actual.isShowing()) //
        .overridingErrorMessage("Expected not showing but was showing") //
        .isFalse();
    return this;
  }

  public static String navigationModeToString(int mode) {
    switch (mode) {
      case NAVIGATION_MODE_LIST:
        return "list";
      case NAVIGATION_MODE_STANDARD:
        return "standard";
      case NAVIGATION_MODE_TABS:
        return "tabs";
      default:
        throw new IllegalArgumentException("Unknown navigation mode: " + mode);
    }
  }

  public static String displayOptionToString(int option) {
    switch (option) {
      case DISPLAY_HOME_AS_UP:
        return "homeAsUp";
      case DISPLAY_SHOW_CUSTOM:
        return "showCustom";
      case DISPLAY_SHOW_HOME:
        return "showHome";
      case DISPLAY_SHOW_TITLE:
        return "showTitle";
      case DISPLAY_USE_LOGO:
        return "useLogo";
      default:
        throw new IllegalArgumentException("Unknown display option: " + option);
    }
  }
}
