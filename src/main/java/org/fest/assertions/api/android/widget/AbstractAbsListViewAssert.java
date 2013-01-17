package org.fest.assertions.api.android.widget;

import android.widget.AbsListView;

import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractAbsListViewAssert<S extends AbstractAbsListViewAssert<S, A>, A extends AbsListView>
    extends AbstractAdapterViewAssert<S, A> {
  public AbstractAbsListViewAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasCheckedItemsCount(int count) {
    isNotNull();
    int actualCount = actual.getCheckedItemCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected <%s> checked items but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return myself;
  }

  public S containsItemIds(long... itemIds) {
    isNotNull();
    assertThat(actual.getCheckedItemIds()).contains(itemIds);
    return myself;
  }

  public S hasCheckedItemPosition(int position) {
    isNotNull();
    assertThat(actual.getCheckedItemPosition()).isEqualTo(position);
    return myself;
  }

  public S containsCheckedItemPositions(int... positions) {
    isNotNull();
    // TODO? assertThat(actual.getCheckedItemPositions()).contains(positions);
    return myself;
  }
}
