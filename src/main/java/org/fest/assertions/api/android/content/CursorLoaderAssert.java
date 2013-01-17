package org.fest.assertions.api.android.content;

import android.content.CursorLoader;
import android.net.Uri;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link CursorLoader} instances. */
public class CursorLoaderAssert extends AbstractLoaderAssert<CursorLoaderAssert, CursorLoader> {
  public CursorLoaderAssert(CursorLoader actual) {
    super(actual, CursorLoaderAssert.class);
  }

  public CursorLoaderAssert hasProjection(String... projection) {
    isNotNull();
    assertThat(actual.getProjection()).isEqualTo(projection);
    return this;
  }

  public CursorLoaderAssert projectionContains(String... projection) {
    isNotNull();
    assertThat(actual.getProjection()).contains(projection);
    return this;
  }

  public CursorLoaderAssert hasSelection(String selection) {
    isNotNull();
    String actualSelection = actual.getSelection();
    assertThat(actualSelection) //
        .overridingErrorMessage("Expected cursor selection <%s> but was <%s>.", selection,
            actualSelection) //
        .isEqualTo(selection);
    return this;
  }

  public CursorLoaderAssert hasSelectionArgs(String... selectionArgs) {
    isNotNull();
    assertThat(actual.getSelectionArgs()).isEqualTo(selectionArgs);
    return this;
  }

  public CursorLoaderAssert containsSelectionArgs(String... selectionArgs) {
    isNotNull();
    assertThat(actual.getSelectionArgs()).contains(selectionArgs);
    return this;
  }

  public CursorLoaderAssert hasSortOrder(String sortOrder) {
    isNotNull();
    String actualSortOrder = actual.getSortOrder();
    assertThat(actualSortOrder) //
        .overridingErrorMessage("Expected cursor sort order <%s> but was <%s>.", sortOrder,
            actualSortOrder) //
        .isEqualTo(sortOrder);
    return this;
  }

  public CursorLoaderAssert hasUri(Uri uri) {
    isNotNull();
    Uri actualUri = actual.getUri();
    assertThat(actualUri) //
        .overridingErrorMessage("Expected cursor URI <%s> but was <%s>.", uri, actualUri) //
        .isEqualTo(uri);
    return this;
  }
}
