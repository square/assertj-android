// Copyright 2014 Square, Inc.
//
// This class is generated. Do not modify directly!
package org.assertj.android.appcompat.v7.api;

/** Assertions for testing Android classes. */
@SuppressWarnings("deprecation")
public final class Assertions {
  public static org.assertj.android.appcompat.v7.api.app.ActionBarAssert assertThat(
      android.support.v7.app.ActionBar actual) {
    return new org.assertj.android.appcompat.v7.api.app.ActionBarAssert(actual);
  }

  public static org.assertj.android.appcompat.v7.api.view.ActionModeAssert assertThat(
      android.support.v7.view.ActionMode actual) {
    return new org.assertj.android.appcompat.v7.api.view.ActionModeAssert(actual);
  }

  public static org.assertj.android.appcompat.v7.api.widget.SearchViewAssert assertThat(
      android.support.v7.widget.SearchView actual) {
    return new org.assertj.android.appcompat.v7.api.widget.SearchViewAssert(actual);
  }

  private Assertions() {
    throw new AssertionError("No instances.");
  }
}
