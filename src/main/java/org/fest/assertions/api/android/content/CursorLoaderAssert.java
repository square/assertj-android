package org.fest.assertions.api.android.content;

import android.content.CursorLoader;
import android.net.Uri;

import java.util.Arrays;

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

  public CursorLoaderAssert doesNotHaveProjection() {
    isNotNull();
    String[] projection = actual.getProjection();
    assertThat(projection)
        .overridingErrorMessage("Expected no projection but was <%s>.", Arrays.toString(projection))
        .isNullOrEmpty();
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

  public CursorLoaderAssert doesNotHaveSelection() {
    isNotNull();
    String selection = actual.getSelection();
    assertThat(selection)
        .overridingErrorMessage("Expected no selection but was <%s>.", selection)
        .isNullOrEmpty();
    return this;
  }

  public CursorLoaderAssert hasSelectionArgs(String... selectionArgs) {
    isNotNull();
    assertThat(actual.getSelectionArgs()).isEqualTo(selectionArgs);
    return this;
  }

  public CursorLoaderAssert doesNotHaveSelectionArgs() {
    isNotNull();
    String[] selectionArgs = actual.getSelectionArgs();
    assertThat(selectionArgs)
        .overridingErrorMessage("Excpected no selection arguments but was <%s>.", Arrays.toString(selectionArgs))
        .isNullOrEmpty();
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

  public CursorLoaderAssert doesNotHaveSortOrder() {
    isNotNull();
    String sortOrder = actual.getSortOrder();
    assertThat(sortOrder)
        .overridingErrorMessage("Expected no sort order but was <%s>.", sortOrder)
        .isNullOrEmpty();
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
