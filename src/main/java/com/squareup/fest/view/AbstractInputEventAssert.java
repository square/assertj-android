package com.squareup.fest.view;

import android.view.InputEvent;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractInputEventAssert<S extends AbstractInputEventAssert<S, A>, A extends InputEvent>
    extends AbstractAssert<S, A> {
  protected AbstractInputEventAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasDeviceId(int id) {
    isNotNull();
    int actualId = actual.getDeviceId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected event device ID <%s> but was <%s>", id, actualId) //
        .isEqualTo(id);
    return myself;
  }

  public S hasEventTime(long time) {
    isNotNull();
    long actualTime = actual.getEventTime();
    assertThat(actualTime) //
        .overridingErrorMessage("Expected event time <%s> but was <%s>", time, actualTime) //
        .isEqualTo(time);
    return myself;
  }

  public S hasSource(int source) {
    isNotNull();
    int actualSource = actual.getSource();
    assertThat(actualSource) //
        .overridingErrorMessage("Expected event source <%s> but was <%s>", source, actualSource) //
        .isEqualTo(source);
    return myself;
  }
}
