// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import org.assertj.core.api.Assertions;

import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static org.assertj.core.api.Assertions.assertThat;

public class CheckedTextViewAssert
    extends AbstractTextViewAssert<CheckedTextViewAssert, CheckedTextView> {
  public CheckedTextViewAssert(CheckedTextView actual) {
    super(actual, CheckedTextViewAssert.class);
  }

  @TargetApi(JELLY_BEAN)
  public CheckedTextViewAssert hasCheckMarkDrawable(Drawable drawable) {
    isNotNull();
    Drawable actualDrawable = actual.getCheckMarkDrawable();
    Assertions.assertThat(actualDrawable) //
        .overridingErrorMessage("Expected check mark drawable <%s> but was <%s>.", drawable,
            actualDrawable) //
        .isSameAs(drawable);
    return this;
  }

  public CheckedTextViewAssert isChecked() {
    isNotNull();
    assertThat(actual.isChecked()) //
        .overridingErrorMessage("Expected checked but was not checked.") //
        .isTrue();
    return this;
  }

  public CheckedTextViewAssert isNotChecked() {
    isNotNull();
    assertThat(actual.isChecked()) //
        .overridingErrorMessage("Expected not checked but was checked.") //
        .isFalse();
    return this;
  }
}
