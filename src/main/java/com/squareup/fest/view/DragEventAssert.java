package com.squareup.fest.view;

import android.view.DragEvent;
import org.fest.assertions.api.AbstractAssert;

import static android.view.DragEvent.ACTION_DRAG_ENDED;
import static android.view.DragEvent.ACTION_DRAG_ENTERED;
import static android.view.DragEvent.ACTION_DRAG_EXITED;
import static android.view.DragEvent.ACTION_DRAG_LOCATION;
import static android.view.DragEvent.ACTION_DRAG_STARTED;
import static android.view.DragEvent.ACTION_DROP;
import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link DragEvent} instances. */
public class DragEventAssert extends AbstractAssert<DragEventAssert, DragEvent> {
  public DragEventAssert(DragEvent actual) {
    super(actual, DragEventAssert.class);
  }

  public DragEventAssert hasAction(int action) {
    isNotNull();
    int actualAction = actual.getAction();
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

  private static String dragEventActionToString(int action) {
    switch (action) {
      case ACTION_DRAG_ENDED:
        return "drag ended";
      case ACTION_DRAG_ENTERED:
        return "drag entered";
      case ACTION_DRAG_EXITED:
        return "drag exited";
      case ACTION_DRAG_LOCATION:
        return "drag location";
      case ACTION_DRAG_STARTED:
        return "drag started";
      case ACTION_DROP:
        return "drop";
      default:
        throw new IllegalArgumentException("Unknown drag event action: " + action);
    }
  }
}
