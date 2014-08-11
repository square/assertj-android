package org.assertj.android.api.widget;

import android.annotation.TargetApi;
import android.widget.AbsListView;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.os.Build.VERSION_CODES.KITKAT;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractAbsListViewAssert<S extends AbstractAbsListViewAssert<S, A>, A extends AbsListView>
    extends AbstractAdapterViewAssert<S, A> {
  public AbstractAbsListViewAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  @TargetApi(HONEYCOMB)
  public S hasCheckedItemsCount(int count) {
    isNotNull();
    int actualCount = actual.getCheckedItemCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected <%s> checked items but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return myself;
  }

  @TargetApi(HONEYCOMB)
  public S containsItemIds(long... itemIds) {
    isNotNull();
    assertThat(actual.getCheckedItemIds()).contains(itemIds);
    return myself;
  }

  @TargetApi(HONEYCOMB)
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

  @TargetApi(KITKAT)
  public S canScrollList(int direction) {
    isNotNull();
    assertThat(actual.canScrollList(direction)) //
        .overridingErrorMessage("Expected to be able to scroll <%s> but cannot.",
            scrollDirectionToString(direction)) //
        .isTrue();
    return myself;
  }

  static String scrollDirectionToString(int direction) {
    if (direction == 0) {
      throw new IllegalArgumentException("direction must be positive or negative");
    } else if (direction < 0) {
      return "up";
    } else {
      return "down";
    }
  }
}
