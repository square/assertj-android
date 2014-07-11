// Copyright 2013 Square, Inc.
package org.assertj.android.api.graphics;

import android.annotation.TargetApi;
import android.graphics.YuvImage;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.FROYO;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link YuvImage} instances. */
@TargetApi(FROYO)
public class YuvImageAssert extends AbstractAssert<YuvImageAssert, YuvImage> {
  public YuvImageAssert(YuvImage actual) {
    super(actual, YuvImageAssert.class);
  }

  public YuvImageAssert hasHeight(int height) {
    isNotNull();
    int actualHeight = actual.getHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected height <%s> but was <%s>.", height, actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public YuvImageAssert hasWidth(int width) {
    isNotNull();
    int actualWidth = actual.getWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected width <%s> but was <%s>.", width, actualWidth) //
        .isEqualTo(width);
    return this;
  }

  public YuvImageAssert hasYuvFormat(int format) {
    isNotNull();
    int actualFormat = actual.getYuvFormat();
    assertThat(actualFormat) //
        .overridingErrorMessage("Expected YUV format <%s> but was <%s>.", format, actualFormat) //
        .isEqualTo(format);
    return this;
  }
}
