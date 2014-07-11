// Copyright 2013 Square, Inc.
package org.assertj.android.api.preference;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.preference.Preference;
import android.preference.PreferenceManager;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractPreferenceAssert<S extends AbstractPreferenceAssert<S, A>, A extends Preference>
    extends AbstractAssert<S, A> {
  protected AbstractPreferenceAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasContext(Context context) {
    isNotNull();
    Context actualContext = actual.getContext();
    assertThat(actualContext) //
        .overridingErrorMessage("Expected context <%s> but was <%s>.", context, actualContext) //
        .isSameAs(context);
    return myself;
  }

  public S hasDependency(String dependency) {
    isNotNull();
    String actualDependency = actual.getDependency();
    assertThat(actualDependency) //
        .overridingErrorMessage("Expected dependency <%s> but was <%s>.", dependency,
            actualDependency) //
        .isEqualTo(dependency);
    return myself;
  }

  @TargetApi(HONEYCOMB)
  public S hasFragment(String fragment) {
    isNotNull();
    String actualFragment = actual.getFragment();
    assertThat(actualFragment) //
        .overridingErrorMessage("Expected fragment <%s> but was <%s>.", fragment, actualFragment) //
        .isEqualTo(fragment);
    return myself;
  }

  @TargetApi(HONEYCOMB)
  public S hasIcon(Drawable icon) {
    isNotNull();
    Drawable actualIcon = actual.getIcon();
    assertThat(actualIcon) //
        .overridingErrorMessage("Expected icon <%s> but was <%s>.", icon, actualIcon) //
        .isSameAs(icon);
    return myself;
  }

  public S hasIntent(Intent intent) {
    isNotNull();
    Intent actualIntent = actual.getIntent();
    assertThat(actualIntent) //
        .overridingErrorMessage("Expected intent <%s> but was <%s>.", intent, actualIntent) //
        .isEqualTo(intent);
    return myself;
  }

  public S hasKey(String key) {
    isNotNull();
    String actualKey = actual.getKey();
    assertThat(actualKey) //
        .overridingErrorMessage("Expected key <%s> but was <%s>.", key, actualKey) //
        .isEqualTo(key);
    return myself;
  }

  public S hasLayoutResource(int resource) {
    isNotNull();
    int actualResource = actual.getLayoutResource();
    assertThat(actualResource) //
        .overridingErrorMessage("Expected layout resource ID <%s> but was <%s>.", resource,
            actualResource) //
        .isEqualTo(resource);
    return myself;
  }

  public S hasPreferenceChangeListener(Preference.OnPreferenceChangeListener listener) {
    isNotNull();
    Preference.OnPreferenceChangeListener actualListener = actual.getOnPreferenceChangeListener();
    assertThat(actualListener) //
        .overridingErrorMessage("Expected preference change listener <%s> but was <%s>.", listener,
            actualListener) //
        .isSameAs(listener);
    return myself;
  }

  public S hasPreferenceClickListener(Preference.OnPreferenceClickListener listener) {
    isNotNull();
    Preference.OnPreferenceClickListener actualListener = actual.getOnPreferenceClickListener();
    assertThat(actualListener) //
        .overridingErrorMessage("Expected preference click listener <%s> but was <%s>.", listener,
            actualListener) //
        .isSameAs(listener);
    return myself;
  }

  public S hasOrder(int order) {
    isNotNull();
    int actualOrder = actual.getOrder();
    assertThat(actualOrder) //
        .overridingErrorMessage("Expected order <%s> but was <%s>.", order, actualOrder) //
        .isEqualTo(order);
    return myself;
  }

  public S hasPreferenceManager(PreferenceManager manager) {
    isNotNull();
    PreferenceManager actualManager = actual.getPreferenceManager();
    assertThat(actualManager) //
        .overridingErrorMessage("Expected preference manager <%s> but was <%s>.", manager,
            actualManager) //
        .isSameAs(manager);
    return myself;
  }

  public S hasSharedPreferences(SharedPreferences preferences) {
    isNotNull();
    SharedPreferences actualPreferences = actual.getSharedPreferences();
    assertThat(actualPreferences) //
        .overridingErrorMessage("Expected shared preferences <%s> but was <%s>.", preferences,
            actualPreferences) //
        .isSameAs(preferences);
    return myself;
  }

  public S hasSummary(CharSequence summary) {
    isNotNull();
    CharSequence actualSummary = actual.getSummary();
    assertThat(actualSummary) //
        .overridingErrorMessage("Expected summary <%s> but was <%s>.", summary, actualSummary) //
        .isEqualTo(summary);
    return myself;
  }

  public S hasSummary(int resId) {
    isNotNull();
    return hasSummary(actual.getContext().getString(resId));
  }

  public S hasTitle(CharSequence title) {
    isNotNull();
    CharSequence actualTitle = actual.getTitle();
    assertThat(actualTitle) //
        .overridingErrorMessage("Expected title <%s> but was <%s>.", title, actualTitle) //
        .isEqualTo(title);
    return myself;
  }

  public S hasTitle(int resId) {
    isNotNull();
    return hasTitle(actual.getContext().getString(resId));
  }

  @TargetApi(ICE_CREAM_SANDWICH)
  public S hasTitleResource(int resource) {
    isNotNull();
    int actualResource = actual.getTitleRes();
    assertThat(actualResource) //
        .overridingErrorMessage("Expected title resource <%s> but was <%s>.", resource,
            actualResource) //
        .isEqualTo(resource);
    return myself;
  }

  public S hasWidgetLayoutResource(int resource) {
    isNotNull();
    int actualResource = actual.getWidgetLayoutResource();
    assertThat(actualResource) //
        .overridingErrorMessage("Expected widget layout resource <%s> but was <%s>.", resource,
            actualResource) //
        .isEqualTo(resource);
    return myself;
  }

  public S hasKey() {
    isNotNull();
    assertThat(actual.hasKey()) //
        .overridingErrorMessage("Expected to have valid key but was invalid.") //
        .isTrue();
    return myself;
  }

  public S isEnabled() {
    isNotNull();
    assertThat(actual.isEnabled()) //
        .overridingErrorMessage("Expected to be enabled but was disabled.") //
        .isTrue();
    return myself;
  }

  public S isDisabled() {
    isNotNull();
    assertThat(actual.isEnabled()) //
        .overridingErrorMessage("Expected to be disabled but was enabled.") //
        .isFalse();
    return myself;
  }

  public S isPersistent() {
    isNotNull();
    assertThat(actual.isPersistent()) //
        .overridingErrorMessage("Expected to be persistent but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotPersistent() {
    isNotNull();
    assertThat(actual.isPersistent()) //
        .overridingErrorMessage("Expected to not be persistent but was.") //
        .isFalse();
    return myself;
  }

  public S isSelectable() {
    isNotNull();
    assertThat(actual.isSelectable()) //
        .overridingErrorMessage("Expected to be selectable but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotSelectable() {
    isNotNull();
    assertThat(actual.isSelectable()) //
        .overridingErrorMessage("Expected to not be selectable but was.") //
        .isFalse();
    return myself;
  }
}
