// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.preference;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.preference.DialogPreference;

import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractDialogPreferenceAssert<S extends AbstractDialogPreferenceAssert<S, A>, A extends DialogPreference>
    extends AbstractPreferenceAssert<S, A> {
  protected AbstractDialogPreferenceAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasDialog(Dialog dialog) {
    isNotNull();
    Dialog actualDialog = actual.getDialog();
    assertThat(actualDialog) //
        .overridingErrorMessage("Expected dialog <%s> but was <%s>.", dialog, actualDialog) //
        .isSameAs(dialog);
    return myself;
  }

  public S hasDialogIcon(Drawable icon) {
    isNotNull();
    Drawable actualIcon = actual.getIcon();
    assertThat(actualIcon) //
        .overridingErrorMessage("Expected dialog icon <%s> but was <%s>.", icon, actualIcon) //
        .isSameAs(icon);
    return myself;
  }

  public S hasDialogLayoutResource(int resource) {
    isNotNull();
    int actualResource = actual.getDialogLayoutResource();
    assertThat(actualResource) //
        .overridingErrorMessage("Expected dialog layout resource <%s> but was <%s>.", resource,
            actualResource) //
        .isEqualTo(resource);
    return myself;
  }

  public S hasDialogMessage(CharSequence message) {
    isNotNull();
    CharSequence actualMessage = actual.getDialogMessage();
    assertThat(actualMessage) //
        .overridingErrorMessage("Expected dialog message <%s> but was <%s>.", message,
            actualMessage) //
        .isEqualTo(message);
    return myself;
  }

  public S hasDialogMessage(int resId) {
    isNotNull();
    return hasDialogMessage(actual.getContext().getString(resId));
  }

  public S hasDialogTitle(CharSequence title) {
    isNotNull();
    CharSequence actualTitle = actual.getDialogTitle();
    assertThat(actualTitle) //
        .overridingErrorMessage("Expected dialog title <%s> but was <%s>.", title, actualTitle) //
        .isEqualTo(title);
    return myself;
  }

  public S hasDialogTitle(int resId) {
    isNotNull();
    return hasDialogTitle(actual.getContext().getString(resId));
  }

  public S hasNegativeButtonText(CharSequence text) {
    isNotNull();
    CharSequence actualText = actual.getNegativeButtonText();
    assertThat(actualText) //
        .overridingErrorMessage("Expected negative button text <%s> but was <%s>.", text,
            actualText) //
        .isEqualTo(text);
    return myself;
  }

  public S hasNegativeButtonText(int resId) {
    isNotNull();
    return hasNegativeButtonText(actual.getContext().getString(resId));
  }

  public S hasPositiveButtonText(CharSequence text) {
    isNotNull();
    CharSequence actualText = actual.getPositiveButtonText();
    assertThat(actualText) //
        .overridingErrorMessage("Expected positive button text <%s> but was <%s>.", text,
            actualText) //
        .isEqualTo(text);
    return myself;
  }

  public S hasPositiveButtonText(int resId) {
    isNotNull();
    return hasPositiveButtonText(actual.getContext().getString(resId));
  }
}
