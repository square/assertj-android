// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.preference;

import android.app.Dialog;
import android.preference.PreferenceScreen;
import android.widget.ListAdapter;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link PreferenceScreen} instances. */
public class PreferenceScreenAssert
    extends AbstractPreferenceGroupAssert<PreferenceScreenAssert, PreferenceScreen> {
  public PreferenceScreenAssert(PreferenceScreen actual) {
    super(actual, PreferenceScreenAssert.class);
  }

  public PreferenceScreenAssert hasDialog(Dialog dialog) {
    isNotNull();
    Dialog actualDialog = actual.getDialog();
    assertThat(actualDialog) //
        .overridingErrorMessage("Expected dialog <%s> but was <%s>.", dialog, actualDialog) //
        .isSameAs(dialog);
    return this;
  }

  public PreferenceScreenAssert hasRootAdapter(ListAdapter adapter) {
    isNotNull();
    ListAdapter actualAdapter = actual.getRootAdapter();
    assertThat(actualAdapter) //
        .overridingErrorMessage("Expected root adapter <%s> but was <%s>.", adapter,
            actualAdapter) //
        .isSameAs(adapter);
    return this;
  }
}

