// Copyright 2013 Square, Inc.
package org.assertj.android.api.view.animation;

import android.view.animation.GridLayoutAnimationController;
import java.util.ArrayList;
import java.util.List;
import org.assertj.core.util.Strings;

import static android.view.animation.GridLayoutAnimationController.DIRECTION_BOTTOM_TO_TOP;
import static android.view.animation.GridLayoutAnimationController.DIRECTION_HORIZONTAL_MASK;
import static android.view.animation.GridLayoutAnimationController.DIRECTION_RIGHT_TO_LEFT;
import static android.view.animation.GridLayoutAnimationController.DIRECTION_VERTICAL_MASK;
import static android.view.animation.GridLayoutAnimationController.PRIORITY_COLUMN;
import static android.view.animation.GridLayoutAnimationController.PRIORITY_NONE;
import static android.view.animation.GridLayoutAnimationController.PRIORITY_ROW;
import static org.assertj.android.internal.IntegerUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

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

  public GridLayoutAnimationControllerAssert hasDirection(@GridLayoutAnimationControllerDirection int direction) {
    isNotNull();
    int actualDirection = actual.getDirection();
    //noinspection ResourceType
    assertThat(actualDirection) //
        .overridingErrorMessage("Expected direction <%s> but was <%s>.",
            directionToString(direction), directionToString(actualDirection)) //
        .isEqualTo(direction);
    return this;
  }

  public GridLayoutAnimationControllerAssert hasDirectionPriority(@GridLayoutAnimationControllerDirectionPriority int priority) {
    isNotNull();
    int actualPriority = actual.getDirectionPriority();
    //noinspection ResourceType
    assertThat(actualPriority) //
        .overridingErrorMessage("Expected direction priority <%s> but was <%s>.",
            directionPriorityToString(priority), directionPriorityToString(actualPriority)) //
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

  private static String directionToString(@GridLayoutAnimationControllerDirection int direction) {
    List<String> parts = new ArrayList<>();
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
    return Strings.join(parts).with(", ");
  }

  public static String directionPriorityToString(@GridLayoutAnimationControllerDirectionPriority int priority) {
    return buildNamedValueString(priority)
        .value(PRIORITY_NONE, "none")
        .value(PRIORITY_COLUMN, "column")
        .value(PRIORITY_ROW, "row")
        .get();
  }
}
