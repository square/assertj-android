// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link AccessibilityEvent} instances. */
public class AccessibilityEventAssert
    extends AbstractAccessibilityRecordAssert<AccessibilityEventAssert, AccessibilityEvent> {
  public AccessibilityEventAssert(AccessibilityEvent actual) {
    super(actual, AccessibilityEventAssert.class);
  }

  public AccessibilityEventAssert hasAction(int action) {
    isNotNull();
    int actualAction = actual.getAction();
    assertThat(actualAction) //
        .overridingErrorMessage("Expected action <%s> but was <%s>.", action, actualAction) //
        .isEqualTo(action);
    return this;
  }

  public AccessibilityEventAssert hasEventTime(long time) {
    isNotNull();
    long actualTime = actual.getEventTime();
    assertThat(actualTime) //
        .overridingErrorMessage("Expected event time <%s> but was <%s>.", time, actualTime) //
        .isEqualTo(time);
    return this;
  }

  public AccessibilityEventAssert hasEventType(int type) {
    isNotNull();
    int actualType = actual.getEventType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected event type <%s> but was <%s>.", type, actualType) //
        .isEqualTo(type);
    return this;
  }

  public AccessibilityEventAssert hasMovementGranularity(int granularity) {
    isNotNull();
    int actualGranularity = actual.getMovementGranularity();
    assertThat(actualGranularity) //
        .overridingErrorMessage("Expected movement granularity <%s> but was <%s>.", granularity,
            actualGranularity) //
        .isEqualTo(granularity);
    return this;
  }

  public AccessibilityEventAssert hasPackageName(CharSequence name) {
    isNotNull();
    CharSequence actualName = actual.getPackageName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected package name <%s> but was <%s>.", name, actualName) //
        .isEqualTo(name);
    return this;
  }
}
