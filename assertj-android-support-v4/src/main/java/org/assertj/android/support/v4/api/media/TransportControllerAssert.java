package org.assertj.android.support.v4.api.media;

import android.support.v4.media.TransportController;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.android.support.v4.api.media.TransportMediatorAssert.controlFlagsToString;
import static org.assertj.core.api.Assertions.assertThat;

public class TransportControllerAssert
    extends AbstractAssert<TransportControllerAssert, TransportController> {
  public TransportControllerAssert(TransportController actual) {
    super(actual, TransportControllerAssert.class);
  }

  public TransportControllerAssert hasBufferPercentage(int percentage) {
    isNotNull();
    int actualPercentage = actual.getBufferPercentage();
    assertThat(actualPercentage) //
        .overridingErrorMessage("Expected buffer position <%s> but was <%s>.", percentage,
            actualPercentage) //
        .isEqualTo(percentage);
    return this;
  }

  public TransportControllerAssert hasCurrentPosition(long position) {
    isNotNull();
    long actualCurrentPosition = actual.getCurrentPosition();
    assertThat(actualCurrentPosition) //
        .overridingErrorMessage("Expected current position <%s> but was <%s>.", position,
            actualCurrentPosition) //
        .isEqualTo(position);
    return this;
  }

  public TransportControllerAssert hasDuration(long duration) {
    isNotNull();
    long actualDuration = actual.getDuration();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected duration <%s> but was <%s>.", duration, actualDuration) //
        .isEqualTo(duration);
    return this;
  }

  public TransportControllerAssert hasTransportControlFlags(int flags) {
    isNotNull();
    int actualFlags = actual.getTransportControlFlags();
    assertThat(actualFlags) //
        .overridingErrorMessage("Expected control flags <%s> but was <%s>.",
            controlFlagsToString(flags), controlFlagsToString(actualFlags)) //
        .isEqualTo(flags);
    return this;
  }

  public TransportControllerAssert isPlaying() {
    isNotNull();
    assertThat(actual.isPlaying()) //
        .overridingErrorMessage("Expected to be playing but was not.") //
        .isTrue();
    return this;
  }

  public TransportControllerAssert isNotPlaying() {
    isNotNull();
    assertThat(actual.isPlaying()) //
        .overridingErrorMessage("Expected to not be playing but was.") //
        .isFalse();
    return this;
  }
}
