package org.assertj.android.design.api.widget;

import android.support.design.widget.TextInputLayout;
import org.assertj.android.api.widget.AbstractLinearLayoutAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link TextInputLayout} instances. */
public class TextInputLayoutAssert extends AbstractLinearLayoutAssert<TextInputLayoutAssert, TextInputLayout> {
  public TextInputLayoutAssert(TextInputLayout actual) {
    super(actual, TextInputLayoutAssert.class);
  }

  public TextInputLayoutAssert hasError(CharSequence error) {
    isNotNull();
    CharSequence actualError = actual.getError();

    assertThat(actualError) //
        .overridingErrorMessage("Expected error '<%s>' but was '<%s>'.", error, actualError) //
        .isEqualTo(error);
    return this;
  }
}
