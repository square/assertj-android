// Copyright 2013 Square, Inc.
package org.assertj.android.support.v4.api.view;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import org.assertj.android.api.view.AbstractViewGroupAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link ViewPager} instances. */
public class ViewPagerAssert extends AbstractViewGroupAssert<ViewPagerAssert, ViewPager> {
  public ViewPagerAssert(ViewPager actual) {
    super(actual, ViewPagerAssert.class);
  }

  public ViewPagerAssert hasAdapter(PagerAdapter adapter) {
    isNotNull();
    PagerAdapter actualAdapter = actual.getAdapter();
    assertThat(actualAdapter) //
        .overridingErrorMessage("Expected adapter <%s> but was <%s>.", adapter, actualAdapter) //
        .isSameAs(adapter);
    return this;
  }

  public ViewPagerAssert hasCurrentItem(int index) {
    isNotNull();
    int actualIndex = actual.getCurrentItem();
    assertThat(actualIndex) //
        .overridingErrorMessage("Expected current item <%s> but was <%s>.", index, actualIndex) //
        .isEqualTo(index);
    return this;
  }

  public ViewPagerAssert hasOffscreenPageLimit(int limit) {
    isNotNull();
    int actualLimit = actual.getOffscreenPageLimit();
    assertThat(actualLimit) //
        .overridingErrorMessage("Expected offscreen page limit <%s> but was <%s>.", limit, actualLimit) //
        .isEqualTo(limit);
    return this;
  }

  public ViewPagerAssert hasPageMargin(int margin) {
    isNotNull();
    int actualMargin = actual.getPageMargin();
    assertThat(actualMargin) //
        .overridingErrorMessage("Expected page margin <%s> but was <%s>.", margin, actualMargin) //
        .isEqualTo(margin);
    return this;
  }

  public ViewPagerAssert isFakeDragging() {
    isNotNull();
    assertThat(actual.isFakeDragging()) //
        .overridingErrorMessage("Expected to be fake dragging but was not.") //
        .isTrue();
    return this;
  }

  public ViewPagerAssert isNotFakeDragging() {
    isNotNull();
    assertThat(actual.isFakeDragging()) //
        .overridingErrorMessage("Expected to not be fake dragging but was.") //
        .isFalse();
    return this;
  }
}
