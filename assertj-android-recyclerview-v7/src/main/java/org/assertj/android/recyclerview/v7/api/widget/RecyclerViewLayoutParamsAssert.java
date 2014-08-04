package org.assertj.android.recyclerview.v7.api.widget;

import android.support.v7.widget.RecyclerView;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link RecyclerView.LayoutParams} instances. */
public class RecyclerViewLayoutParamsAssert
    extends AbstractAssert<RecyclerViewLayoutParamsAssert, RecyclerView.LayoutParams> {
  public RecyclerViewLayoutParamsAssert(RecyclerView.LayoutParams actual) {
    super(actual, RecyclerViewLayoutParamsAssert.class);
  }

  public RecyclerViewLayoutParamsAssert viewNeedsUpdate() {
    isNotNull();
    assertThat(actual.viewNeedsUpdate()) //
        .overridingErrorMessage("Expected to need update but did not.") //
        .isTrue();
    return this;
  }

  public RecyclerViewLayoutParamsAssert viewDoesNotNeedUpdate() {
    isNotNull();
    assertThat(actual.viewNeedsUpdate()) //
        .overridingErrorMessage("Expected to not need update but did.") //
        .isFalse();
    return this;
  }

  public RecyclerViewLayoutParamsAssert isViewInvalid() {
    isNotNull();
    assertThat(actual.isViewInvalid()) //
        .overridingErrorMessage("Expected to have invalid view but did not.") //
        .isTrue();
    return this;
  }

  public RecyclerViewLayoutParamsAssert isViewValid() {
    isNotNull();
    assertThat(actual.isViewInvalid()) //
        .overridingErrorMessage("Expected to not have invalid view but did.") //
        .isFalse();
    return this;
  }

  public RecyclerViewLayoutParamsAssert isItemRemoved() {
    isNotNull();
    assertThat(actual.isItemRemoved()) //
        .overridingErrorMessage("Expected to have item removed but did not.") //
        .isTrue();
    return this;
  }

  public RecyclerViewLayoutParamsAssert isItemNotRemoved() {
    isNotNull();
    assertThat(actual.isItemRemoved()) //
        .overridingErrorMessage("Expected to not have item removed but did.") //
        .isFalse();
    return this;
  }

  public RecyclerViewLayoutParamsAssert hasViewPosition(int position) {
    isNotNull();
    int actualPosition = actual.getViewPosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected to have view position <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return this;
  }
}
