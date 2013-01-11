package com.squareup.fest.widget;

import android.view.View;
import android.widget.AdapterView;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractAdapterViewAssert<S extends AbstractAdapterViewAssert<S, A>, A extends AdapterView>
    extends AbstractAssert<S, A> {
  protected AbstractAdapterViewAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasCount(int count) {
    isNotNull();
    int actualCount = actual.getCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return myself;
  }

  public S hasFirstVisiblePosition(int position) {
    isNotNull();
    int actualPosition = actual.getFirstVisiblePosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected first visible position <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return myself;
  }

  public S hasItemAtPosition(int position, Object item) {
    isNotNull();
    Object actualItem = actual.getItemAtPosition(position);
    assertThat(actualItem) //
        .overridingErrorMessage("Expected item <%s> at position %s but was <%s>.", item, position,
            actualItem) //
        .isEqualTo(item);
    return myself;
  }

  public S hasItemIdAtPosition(int position, long id) {
    isNotNull();
    long actualId = actual.getItemIdAtPosition(position);
    assertThat(actualId) //
        .overridingErrorMessage("Expected item ID <%s> at position %s but was <%s>.", id, position,
            actualId) //
        .isEqualTo(id);
    return myself;
  }

  public S hasLastVisiblePosition(int position) {
    isNotNull();
    int actualPosition = actual.getLastVisiblePosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected last visible position <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return myself;
  }

  public S hasPositionForView(View view, int position) {
    isNotNull();
    int actualPosition = actual.getPositionForView(view);
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected position <%s> for view %s but was <%s>.", position, view,
            actualPosition) //
        .isEqualTo(position);
    return myself;
  }

  public S hasSelectedItem(Object item) {
    isNotNull();
    Object actualItem = actual.getSelectedItem();
    assertThat(actualItem) //
        .overridingErrorMessage("Expected selected item <%s> but was <%s>.", item, actualItem) //
        .isEqualTo(item);
    return myself;
  }

  public S hasSelectedItemId(long id) {
    isNotNull();
    long actualId = actual.getSelectedItemId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected selected item ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return myself;
  }

  public S hasSelectedItemPosition(int position) {
    isNotNull();
    int actualPosition = actual.getSelectedItemPosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected selected item position <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return myself;
  }

  public S hasSelectedView(View view) {
    isNotNull();
    View actualView = actual.getSelectedView();
    assertThat(actualView) //
        .overridingErrorMessage("Expected selected view <%s> but was <%s>", view, actualView) //
        .isSameAs(view);
    return myself;
  }
}
