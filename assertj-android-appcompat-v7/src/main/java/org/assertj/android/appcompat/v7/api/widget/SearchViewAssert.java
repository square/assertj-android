// Copyright 2013 Square, Inc.
package org.assertj.android.appcompat.v7.api.widget;

import android.support.v4.widget.CursorAdapter;
import android.support.v7.widget.SearchView;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link SearchView} instances. */
public class SearchViewAssert extends AbstractLinearLayoutCompatAssert<SearchViewAssert, SearchView> {
  public SearchViewAssert(SearchView actual) {
    super(actual, SearchViewAssert.class);
  }

  public SearchViewAssert hasImeOptions(int options) {
    isNotNull();
    int actualOptions = actual.getImeOptions();
    assertThat(actualOptions) //
        .overridingErrorMessage("Expected IME options <%s> but was <%s>.", options,
            actualOptions) //
        .isEqualTo(options);
    return this;
  }

  public SearchViewAssert hasInputType(int type) {
    isNotNull();
    int actualType = actual.getInputType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected input type <%s> but was <%s>.", type, actualType) //
        .isEqualTo(type);
    return this;
  }

  public SearchViewAssert hasMaximumWidth(int width) {
    isNotNull();
    int actualWidth = actual.getMaxWidth();
    assertThat(actualWidth) //
        .overridingErrorMessage("Expected maximum width <%s> but was <%s>.", width, actualWidth) //
        .isEqualTo(width);
    return this;
  }

  public SearchViewAssert hasQuery(CharSequence query) {
    isNotNull();
    CharSequence actualQuery = actual.getQuery();
    assertThat(actualQuery) //
        .overridingErrorMessage("Expected query <%s> but was <%s>.", query, actualQuery) //
        .isEqualTo(query);
    return this;
  }

  public SearchViewAssert hasQueryHint(CharSequence hint) {
    isNotNull();
    CharSequence actualHint = actual.getQueryHint();
    assertThat(actualHint) //
        .overridingErrorMessage("Expected query hint <%s> but was <%s>.", hint, actualHint) //
        .isEqualTo(hint);
    return this;
  }

  public SearchViewAssert hasQueryHint(int resId) {
    isNotNull();
    return hasQueryHint(actual.getContext().getString(resId));
  }

  public SearchViewAssert hasSuggestionsAdapter(CursorAdapter adapter) {
    isNotNull();
    CursorAdapter actualAdapter = actual.getSuggestionsAdapter();
    assertThat(actualAdapter) //
        .overridingErrorMessage("Expected suggestions adapter <%s> but was <%s>.", adapter,
            actualAdapter) //
        .isSameAs(adapter);
    return this;
  }

  public SearchViewAssert isIconifiedByDefault() {
    isNotNull();
    assertThat(actual.isIconfiedByDefault()) //
        .overridingErrorMessage("Expected to be iconified by default but was not.") //
        .isTrue();
    return this;
  }

  public SearchViewAssert isNotIconifiedByDefault() {
    isNotNull();
    assertThat(actual.isIconfiedByDefault()) //
        .overridingErrorMessage("Expected to not be iconified by default but was not.") //
        .isFalse();
    return this;
  }

  public SearchViewAssert isIconified() {
    isNotNull();
    assertThat(actual.isIconified()) //
        .overridingErrorMessage("Expected to be iconified but was not.") //
        .isTrue();
    return this;
  }

  public SearchViewAssert isNotIconified() {
    isNotNull();
    assertThat(actual.isIconified()) //
        .overridingErrorMessage("Expected to not be iconified but was not.") //
        .isFalse();
    return this;
  }

  public SearchViewAssert isQueryRefinementEnabled() {
    isNotNull();
    assertThat(actual.isQueryRefinementEnabled()) //
        .overridingErrorMessage("Expected query refinement to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public SearchViewAssert isQueryRefinementDisabled() {
    isNotNull();
    assertThat(actual.isQueryRefinementEnabled()) //
        .overridingErrorMessage("Expected query refinement to be disabled but was enabled.") //
        .isFalse();
    return this;
  }

  public SearchViewAssert isSubmitButtonEnabled() {
    isNotNull();
    assertThat(actual.isSubmitButtonEnabled()) //
        .overridingErrorMessage("Expected submit button to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public SearchViewAssert isSubmitButtonDisabled() {
    isNotNull();
    assertThat(actual.isSubmitButtonEnabled()) //
        .overridingErrorMessage("Expected submit button to be disabled but was enabled.") //
        .isFalse();
    return this;
  }
}
