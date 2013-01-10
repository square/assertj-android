package com.squareup.fest.view;

import android.view.TextureView;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link TextureView} instances. */
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
