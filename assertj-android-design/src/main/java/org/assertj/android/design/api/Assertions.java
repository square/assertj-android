// Copyright 2015 Square, Inc.
//
// This class is generated. Do not modify directly!
package org.assertj.android.design.api;

/** Assertions for testing Android classes. */
@SuppressWarnings("deprecation")
public final class Assertions {
  public static org.assertj.android.design.api.widget.NavigationViewAssert assertThat(
      android.support.design.widget.NavigationView actual) {
    return new org.assertj.android.design.api.widget.NavigationViewAssert(actual);
  }

  public static org.assertj.android.design.api.widget.SnackbarAssert assertThat(
      android.support.design.widget.Snackbar actual) {
    return new org.assertj.android.design.api.widget.SnackbarAssert(actual);
  }

  public static org.assertj.android.design.api.widget.TabAssert assertThat(
      android.support.design.widget.TabLayout.Tab actual) {
    return new org.assertj.android.design.api.widget.TabAssert(actual);
  }

  public static org.assertj.android.design.api.widget.TabLayoutAssert assertThat(
      android.support.design.widget.TabLayout actual) {
    return new org.assertj.android.design.api.widget.TabLayoutAssert(actual);
  }

  private Assertions() {
    throw new AssertionError("No instances.");
  }
}
