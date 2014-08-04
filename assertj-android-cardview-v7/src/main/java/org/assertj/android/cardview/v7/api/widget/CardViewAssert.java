package org.assertj.android.cardview.v7.api.widget;

import android.support.v7.widget.CardView;

import org.assertj.android.api.view.AbstractViewGroupAssert;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Assertions for {@link CardView} instances.
 */
public class CardViewAssert extends AbstractViewGroupAssert<CardViewAssert, CardView> {
  public CardViewAssert(CardView actual) {
    super(actual, CardViewAssert.class);
  }

  public CardViewAssert hasRadius(int radius) {
    isNotNull();
    float actualRadius = actual.getRadius();
    assertThat(actualRadius) //
            .overridingErrorMessage("Expected radius <%s> but was <%s>", radius, actualRadius) //
            .isEqualTo(radius);
    return this;
  }
}
