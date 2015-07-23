package org.assertj.android.design.api.widget;

import android.support.design.widget.Snackbar;
import android.view.View;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Snackbar} instances. */
public class SnackbarAssert extends AbstractAssert<SnackbarAssert, Snackbar> {
  public SnackbarAssert(Snackbar actual) {
    super(actual, SnackbarAssert.class);
  }

  public SnackbarAssert hasDuration(int duration) {
    isNotNull();
    int actualDuration = actual.getDuration();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected duration <%s> but was <%s>.", duration, actualDuration) //
        .isEqualTo(duration);
    return this;
  }

  public SnackbarAssert hasView(View view) {
    isNotNull();
    View actualView = actual.getView();
    assertThat(actualView) //
        .overridingErrorMessage("Expected view <%s> but was <%s>.", view, actualView) //
        .isSameAs(view);
    return this;
  }
}
