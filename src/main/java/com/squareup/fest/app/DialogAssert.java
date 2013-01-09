package com.squareup.fest.app;

import android.app.Dialog;

public final class DialogAssert extends AbstractDialogAssert<DialogAssert, Dialog> {
  public DialogAssert(Dialog actual) {
    super(actual, DialogAssert.class);
  }
}
