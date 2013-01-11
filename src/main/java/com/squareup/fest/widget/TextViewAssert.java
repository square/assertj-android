package com.squareup.fest.widget;

import android.widget.TextView;

/**
 * Assertions for {@link TextView} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractTextViewAssert}.
 */
public final class TextViewAssert extends AbstractTextViewAssert<TextViewAssert, TextView> {
  public TextViewAssert(TextView actual) {
    super(actual, TextViewAssert.class);
  }
}
