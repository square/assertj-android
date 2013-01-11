package com.squareup.fest.widget;

import android.widget.TableLayout;

import static org.fest.assertions.api.Assertions.assertThat;

public class TableLayoutAssert extends AbstractLinearLayoutAssert<TableLayoutAssert, TableLayout> {
  public TableLayoutAssert(TableLayout actual) {
    super(actual, TableLayoutAssert.class);
  }

  public TableLayoutAssert isCollapsedColumn(int index) {
    isNotNull();
    assertThat(actual.isColumnCollapsed(index)) //
        .overridingErrorMessage("Expected column %s to be collapsed but was not.", index) //
        .isTrue();
    return this;
  }

  public TableLayoutAssert isNotCollapsedColumn(int index) {
    isNotNull();
    assertThat(actual.isColumnCollapsed(index)) //
        .overridingErrorMessage("Expected column %s to not be collapsed but was.", index) //
        .isFalse();
    return this;
  }

  public TableLayoutAssert isShrinkableColumn(int index) {
    isNotNull();
    assertThat(actual.isColumnShrinkable(index)) //
        .overridingErrorMessage("Expected column %s to be shrinkable but was not.", index) //
        .isTrue();
    return this;
  }

  public TableLayoutAssert isNotShrinkableColumn(int index) {
    isNotNull();
    assertThat(actual.isColumnShrinkable(index)) //
        .overridingErrorMessage("Expected column %s to not be shrinkable but was.", index) //
        .isFalse();
    return this;
  }

  public TableLayoutAssert isStretchableColumn(int index) {
    isNotNull();
    assertThat(actual.isColumnStretchable(index)) //
        .overridingErrorMessage("Expected column %s to be stretchable but was not.") //
        .isTrue();
    return this;
  }

  public TableLayoutAssert isNotStretchableColumn(int index) {
    isNotNull();
    assertThat(actual.isColumnStretchable(index)) //
        .overridingErrorMessage("Expected column %s to not be stretchable but was.") //
        .isFalse();
    return this;
  }
}
