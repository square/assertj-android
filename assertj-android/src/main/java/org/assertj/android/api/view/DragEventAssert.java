package org.assertj.android.api.view;

import android.annotation.TargetApi;
import android.view.DragEvent;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.view.DragEvent.ACTION_DRAG_ENDED;
import static android.view.DragEvent.ACTION_DRAG_ENTERED;
import static android.view.DragEvent.ACTION_DRAG_EXITED;
import static android.view.DragEvent.ACTION_DRAG_LOCATION;
import static android.view.DragEvent.ACTION_DRAG_STARTED;
import static android.view.DragEvent.ACTION_DROP;
import static org.assertj.android.internal.IntegerUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link DragEvent} instances. */
@TargetApi(HONEYCOMB)
public class DragEventAssert extends AbstractAssert<DragEventAssert, DragEvent> {
  public DragEventAssert(DragEvent actual) {
    super(actual, DragEventAssert.class);
  }

  public DragEventAssert hasAction(@DragEventAction int action) {
    isNotNull();
    int actualAction = actual.getAction();
    //noinspection ResourceType
    assertThat(actualAction) //
        .overridingErrorMessage("Expected action <%s> but was <%s>",
            dragEventActionToString(action), dragEventActionToString(actualAction)) //
        .isEqualTo(action);
    return this;
  }

  public DragEventAssert hasLocalState(Object localState) {
    isNotNull();
    Object actualLocalState = actual.getLocalState();
    assertThat(actualLocalState) //
        .overridingErrorMessage("Expected local state <%s> but was <%s>", localState,
            actualLocalState) //
        .isEqualTo(localState);
    return this;
  }

  public DragEventAssert hasSuccessfulResult() {
    isNotNull();
    assertThat(actual.getResult()) //
        .overridingErrorMessage("Expected successful result but was unsuccessful") //
        .isTrue();
    return this;
  }

  public DragEventAssert hasUnsuccessfulResult() {
    isNotNull();
    assertThat(actual.getResult()) //
        .overridingErrorMessage("Expected unsuccessful result but was successful") //
        .isFalse();
    return this;
  }

  public DragEventAssert hasX(float x) {
    isNotNull();
    float actualX = actual.getX();
    assertThat(actualX) //
        .overridingErrorMessage("Expected X <%s> but was <%s>", x, actualX) //
        .isEqualTo(x);
    return this;
  }

  public DragEventAssert hasY(float y) {
    isNotNull();
    float actualY = actual.getY();
    assertThat(actualY) //
        .overridingErrorMessage("Expected Y <%s> but was <%s>", y, actualY) //
        .isEqualTo(y);
    return this;
  }

  public static String dragEventActionToString(@DragEventAction int action) {
    return buildNamedValueString(action)
        .value(ACTION_DRAG_ENDED, "drag ended")
        .value(ACTION_DRAG_ENTERED, "drag entered")
        .value(ACTION_DRAG_EXITED, "drag exited")
        .value(ACTION_DRAG_LOCATION, "drag location")
        .value(ACTION_DRAG_STARTED, "drag started")
        .value(ACTION_DROP, "drop")
        .get();
  }
}
