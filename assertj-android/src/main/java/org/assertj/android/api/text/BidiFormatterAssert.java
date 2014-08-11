package org.assertj.android.api.text;

import android.annotation.TargetApi;
import android.text.BidiFormatter;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR2;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(JELLY_BEAN_MR2)
public class BidiFormatterAssert extends AbstractAssert<BidiFormatterAssert, BidiFormatter> {
  public BidiFormatterAssert(BidiFormatter actual) {
    super(actual, BidiFormatterAssert.class);
  }

  public BidiFormatterAssert hasRtlContext() {
    isNotNull();
    assertThat(actual.isRtlContext()) //
        .overridingErrorMessage("Expected RTL context but was not.") //
        .isTrue();
    return this;
  }

  public BidiFormatterAssert doesNotHaveRtlContext() {
    isNotNull();
    assertThat(actual.isRtlContext()) //
        .overridingErrorMessage("Expected not to be RTL context but was.") //
        .isFalse();
    return this;
  }
}
