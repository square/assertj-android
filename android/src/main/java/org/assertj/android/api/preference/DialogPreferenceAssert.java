// Copyright 2013 Square, Inc.
package org.assertj.android.api.preference;

import android.preference.DialogPreference;

/**
 * Assertions for {@link DialogPreference} instances.
 * <p>
 * This class is final. To extend use {@link AbstractDialogPreferenceAssert}.
 */
public final class DialogPreferenceAssert
    extends AbstractDialogPreferenceAssert<DialogPreferenceAssert, DialogPreference> {
  public DialogPreferenceAssert(DialogPreference actual) {
    super(actual, DialogPreferenceAssert.class);
  }
}
