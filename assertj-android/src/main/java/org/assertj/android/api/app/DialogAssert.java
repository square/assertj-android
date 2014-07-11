package org.assertj.android.api.app;

import android.app.Dialog;

/**
 * Assertions for {@link Dialog} instances.
 * <p>
 * This class is final. To extend use {@link AbstractDialogAssert}.
 */
public final class DialogAssert extends AbstractDialogAssert<DialogAssert, Dialog> {
  public DialogAssert(Dialog actual) {
    super(actual, DialogAssert.class);
  }
}
