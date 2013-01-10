package com.squareup.fest.view;

import android.view.ViewStub;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link ViewStub} instances. */
public class ViewStubAssert extends AbstractViewAssert<ViewStubAssert, ViewStub> {
  public ViewStubAssert(ViewStub actual) {
    super(actual, ViewStubAssert.class);
  }

  public ViewStubAssert hasInflatedId(int id) {
    isNotNull();
    int actualId = actual.getInflatedId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected view stub inflated ID <%s> but was <%s>", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public ViewStubAssert hasLayoutResource(int resId) {
    isNotNull();
    int actualResId = actual.getLayoutResource();
    assertThat(actualResId) //
        .overridingErrorMessage("Expected view stub layout resource <%s> but was <%s>", resId,
            actualResId) //
        .isEqualTo(resId);
    return this;
  }
}
