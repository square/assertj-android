package org.assertj.android.api.view;

import android.annotation.TargetApi;
import android.view.TextureView;

import static android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link TextureView} instances. */
@TargetApi(ICE_CREAM_SANDWICH)
public class TextureViewAssert extends AbstractViewAssert<TextureViewAssert, TextureView> {
  public TextureViewAssert(TextureView actual) {
    super(actual, TextureViewAssert.class);
  }

  public TextureViewAssert isAvailable() {
    isNotNull();
    assertThat(actual.isAvailable()) //
        .overridingErrorMessage("Expected to be available but was not available.") //
        .isTrue();
    return this;
  }

  public TextureViewAssert isNotAvailable() {
    isNotNull();
    assertThat(actual.isAvailable()) //
        .overridingErrorMessage("Expected to not be available but was available.") //
        .isFalse();
    return this;
  }
}
