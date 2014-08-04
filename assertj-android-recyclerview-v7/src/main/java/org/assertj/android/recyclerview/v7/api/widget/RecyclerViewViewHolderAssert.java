package org.assertj.android.recyclerview.v7.api.widget;

import android.support.v7.widget.RecyclerView;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link RecyclerView.ViewHolder} instances. */
public class RecyclerViewViewHolderAssert
    extends AbstractAssert<RecyclerViewViewHolderAssert, RecyclerView.ViewHolder> {
  public RecyclerViewViewHolderAssert(RecyclerView.ViewHolder actual) {
    super(actual, RecyclerViewViewHolderAssert.class);
  }

  public RecyclerViewViewHolderAssert hasPosition(int position) {
    isNotNull();
    int actualPosition = actual.getPosition();
    assertThat(actualPosition).overridingErrorMessage("Expected position <%s> but was <%s>.",
        position, actualPosition) //
        .isEqualTo(position);
    return this;
  }

  public RecyclerViewViewHolderAssert hasItemId(long itemId) {
    isNotNull();
    long actualItemId = actual.getItemId();
    assertThat(actualItemId) //
        .overridingErrorMessage("Expected item ID <%s> but was <%s>.", itemId, actualItemId) //
        .isEqualTo(itemId);
    return this;
  }

  public RecyclerViewViewHolderAssert hasItemViewType(int itemViewType) {
    isNotNull();
    int actualItemViewType = actual.getItemViewType();
    assertThat(actualItemViewType) //
        .overridingErrorMessage("Expected item view type <%s> but was <%s>.", itemViewType,
            actualItemViewType) //
        .isEqualTo(itemViewType);
    return this;
  }

  public RecyclerViewViewHolderAssert isRecyclable() {
    isNotNull();
    assertThat(actual.isRecyclable()) //
        .overridingErrorMessage("Expected to be recyclable but was not.") //
        .isTrue();
    return this;
  }

  public RecyclerViewViewHolderAssert isNotRecyclable() {
    isNotNull();
    assertThat(actual.isRecyclable()) //
        .overridingErrorMessage("Expected to not be recyclable but was.") //
        .isFalse();
    return this;
  }
}
