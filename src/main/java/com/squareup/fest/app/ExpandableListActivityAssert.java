package com.squareup.fest.app;

import android.app.ExpandableListActivity;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link ExpandableListActivity} instances. */
public class ExpandableListActivityAssert
    extends AbstractActivityAssert<ExpandableListActivityAssert, ExpandableListActivity> {
  public ExpandableListActivityAssert(ExpandableListActivity actual) {
    super(actual, ExpandableListActivityAssert.class);
  }

  protected ExpandableListActivityAssert hasSelectedId(long id) {
    isNotNull();
    long actualId = actual.getSelectedId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected selected ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public ExpandableListActivityAssert hasSelectedPosition(long position) {
    isNotNull();
    long actualPosition = actual.getSelectedPosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected selected position <%s> bus was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return this;
  }
}
