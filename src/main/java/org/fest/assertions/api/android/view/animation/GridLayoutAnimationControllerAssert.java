// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.view.animation;

import android.view.animation.GridLayoutAnimationController;
import org.fest.assertions.api.android.Utils;
import java.util.ArrayList;
import java.util.List;

import static android.view.animation.GridLayoutAnimationController.DIRECTION_BOTTOM_TO_TOP;
import static android.view.animation.GridLayoutAnimationController.DIRECTION_HORIZONTAL_MASK;
import static android.view.animation.GridLayoutAnimationController.DIRECTION_RIGHT_TO_LEFT;
import static android.view.animation.GridLayoutAnimationController.DIRECTION_VERTICAL_MASK;
import static android.view.animation.GridLayoutAnimationController.PRIORITY_COLUMN;
import static android.view.animation.GridLayoutAnimationController.PRIORITY_NONE;
import static android.view.animation.GridLayoutAnimationController.PRIORITY_ROW;
import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link GridLayoutAnimationController} instances. */
public class GridLayoutAnimationControllerAssert extends
    AbstractLayoutAnimationControllerAssert<GridLayoutAnimationControllerAssert, GridLayoutAnimationController> {
  public GridLayoutAnimationControllerAssert(GridLayoutAnimationController actual) {
    super(actual, GridLayoutAnimationControllerAssert.class);
  }

  public GridLayoutAnimationControllerAssert hasColumnDelay(float delay) {
    isNotNull();
    float actualDelay = actual.getColumnDelay();
    assertThat(actualDelay) //
        .overridingErrorMessage("Expected column delay <%s> but was <%s>.", delay, actualDelay) //
        .isEqualTo(delay);
    return this;
  }

  public GridLayoutAnimationControllerAssert hasDirection(int direction) {
    isNotNull();
    int actualDirection = actual.getDirection();
    assertThat(actualDirection) //
        .overridingErrorMessage("Expected direction <%s> but was <%s>.",
            directionToString(direction), directionToString(actualDirection)) //
        .isEqualTo(direction);
    return this;
  }

  public GridLayoutAnimationControllerAssert hasDirectionPriority(int priority) {
    isNotNull();
    int actualPriotiy = actual.getDirectionPriority();
    assertThat(actualPriotiy) //
        .overridingErrorMessage("Expected direction priority <%s> but was <%s>.",
            directionPriorityToString(priority), directionPriorityToString(actualPriotiy)) //
        .isEqualTo(priority);
    return this;
  }

  public GridLayoutAnimationControllerAssert hasRowDelay(float delay) {
    isNotNull();
    float actualDelay = actual.getRowDelay();
    assertThat(actualDelay) //
        .overridingErrorMessage("Expected row delay <%s> but was <%s>.", delay, actualDelay) //
        .isEqualTo(delay);
    return this;
  }

  private static String directionToString(int direction) {
    List<String> parts = new ArrayList<String>();
    int horizontal = direction & DIRECTION_HORIZONTAL_MASK;
    int vertical = direction & DIRECTION_VERTICAL_MASK;
    if ((horizontal & DIRECTION_RIGHT_TO_LEFT) != 0) {
      parts.add("rightToLeft");
    } else {
      parts.add("leftToRight");
    }
    if ((vertical & DIRECTION_BOTTOM_TO_TOP) != 0) {
      parts.add("bottomToTop");
    } else {
      parts.add("topToBottom");
    }
    return Utils.join(parts);
  }

  private static String directionPriorityToString(int priority) {
    switch (priority) {
      case PRIORITY_NONE:
        return "none";
      case PRIORITY_COLUMN:
        return "column";
      case PRIORITY_ROW:
        return "row";
      default:
        throw new IllegalArgumentException("Unknown priority: " + priority);
    }
  }
}
