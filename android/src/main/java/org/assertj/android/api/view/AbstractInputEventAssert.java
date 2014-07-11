package org.assertj.android.api.view;

import android.annotation.TargetApi;
import android.view.InputEvent;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.GINGERBREAD;
import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(GINGERBREAD)
public abstract class AbstractInputEventAssert<S extends AbstractInputEventAssert<S, A>, A extends InputEvent>
    extends AbstractAssert<S, A> {
  protected AbstractInputEventAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasDeviceId(int id) {
    isNotNull();
    int actualId = actual.getDeviceId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected device ID <%s> but was <%s>", id, actualId) //
        .isEqualTo(id);
    return myself;
  }

  @TargetApi(JELLY_BEAN)
  public S hasEventTime(long time) {
    isNotNull();
    long actualTime = actual.getEventTime();
    assertThat(actualTime) //
        .overridingErrorMessage("Expected time <%s> but was <%s>", time, actualTime) //
        .isEqualTo(time);
    return myself;
  }

  public S hasSource(int source) {
    isNotNull();
    int actualSource = actual.getSource();
    assertThat(actualSource) //
        .overridingErrorMessage("Expected source <%s> but was <%s>", source, actualSource) //
        .isEqualTo(source);
    return myself;
  }
}
