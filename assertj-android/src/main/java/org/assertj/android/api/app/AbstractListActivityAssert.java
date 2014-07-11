// Copyright 2013 Square, Inc.
package org.assertj.android.api.app;

import android.app.ListActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractListActivityAssert<S extends AbstractListActivityAssert<S, A>, A extends ListActivity>
    extends AbstractActivityAssert<S, A> {
  protected AbstractListActivityAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasListAdapter(ListAdapter adapter) {
    isNotNull();
    ListAdapter actualAdapter = actual.getListAdapter();
    assertThat(actualAdapter) //
        .overridingErrorMessage("Expected list adapter <%s> but was <%s>.", adapter,
            actualAdapter) //
        .isSameAs(adapter);
    return myself;
  }

  public S hasListView(ListView listView) {
    isNotNull();
    ListView actualListView = actual.getListView();
    assertThat(actualListView) //
        .overridingErrorMessage("Expected list view <%s> but was <%s>.", listView,
            actualListView) //
        .isSameAs(listView);
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
}
