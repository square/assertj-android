// Copyright 2013 Square, Inc.
package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.widget.ListView;

import static android.os.Build.VERSION_CODES.KITKAT;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Assertions for {@link ListView} instances.
 * <p>
 * This class is final. To extend use {@link AbstractListViewAssert}.
 */
public final class ListViewAssert extends AbstractListViewAssert<ListViewAssert, ListView> {
  public ListViewAssert(ListView actual) {
    super(actual, ListViewAssert.class);
  }

  @TargetApi(KITKAT)
  public ListViewAssert hasFooterDividersEnabled() {
    isNotNull();
    assertThat(actual.areFooterDividersEnabled()) //
        .overridingErrorMessage("Expected to have footer dividers enabled but were not.") //
        .isTrue();
    return this;
  }

  @TargetApi(KITKAT)
  public ListViewAssert hasFooterDividersDisabled() {
    isNotNull();
    assertThat(actual.areFooterDividersEnabled()) //
        .overridingErrorMessage("Expected to have footer dividers disabled but were not.") //
        .isFalse();
    return this;
  }

  @TargetApi(KITKAT)
  public ListViewAssert hasHeaderDividersEnabled() {
    isNotNull();
    assertThat(actual.areHeaderDividersEnabled()) //
        .overridingErrorMessage("Expected to have header dividers enabled but were not.") //
        .isTrue();
    return this;
  }

  @TargetApi(KITKAT)
  public ListViewAssert hasHeaderDividersDisabled() {
    isNotNull();
    assertThat(actual.areHeaderDividersEnabled()) //
        .overridingErrorMessage("Expected to have header dividers disabled but were not.") //
        .isFalse();
    return this;
  }
}
