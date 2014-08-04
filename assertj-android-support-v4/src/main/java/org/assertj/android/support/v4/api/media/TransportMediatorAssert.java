package org.assertj.android.support.v4.api.media;

import android.support.v4.media.TransportMediator;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.android.internal.IntegerUtils.buildBitMaskString;
import static org.assertj.core.api.Assertions.assertThat;

public class TransportMediatorAssert extends AbstractAssert<TransportMediatorAssert, TransportMediator> {
  public TransportMediatorAssert(TransportMediator actual) {
    super(actual, TransportMediatorAssert.class);
  }

  public TransportMediatorAssert hasBufferPercentage(int percentage) {
    isNotNull();
    int actualPercentage = actual.getBufferPercentage();
    assertThat(actualPercentage) //
        .overridingErrorMessage("Expected buffer position <%s> but was <%s>.", percentage,
            actualPercentage) //
        .isEqualTo(percentage);
    return this;
  }

  public TransportMediatorAssert hasCurrentPosition(long position) {
    isNotNull();
    long actualCurrentPosition = actual.getCurrentPosition();
    assertThat(actualCurrentPosition) //
        .overridingErrorMessage("Expected current position <%s> but was <%s>.", position,
            actualCurrentPosition) //
        .isEqualTo(position);
    return this;
  }

  public TransportMediatorAssert hasDuration(long duration) {
    isNotNull();
    long actualDuration = actual.getDuration();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected duration <%s> but was <%s>.", duration, actualDuration) //
        .isEqualTo(duration);
    return this;
  }

  public TransportMediatorAssert hasTransportControlFlags(int flags) {
    isNotNull();
    int actualFlags = actual.getTransportControlFlags();
    assertThat(actualFlags) //
        .overridingErrorMessage("Expected control flags <%s> but was <%s>.",
            controlFlagsToString(flags), controlFlagsToString(actualFlags)) //
        .isEqualTo(flags);
    return this;
  }

  public TransportMediatorAssert isPlaying() {
    isNotNull();
    assertThat(actual.isPlaying()) //
        .overridingErrorMessage("Expected to be playing but was not.") //
        .isTrue();
    return this;
  }

  public TransportMediatorAssert isNotPlaying() {
    isNotNull();
    assertThat(actual.isPlaying()) //
        .overridingErrorMessage("Expected to not be playing but was.") //
        .isFalse();
    return this;
  }

  public static String controlFlagsToString(int flags) {
    return buildBitMaskString(flags) //
        .flag(TransportMediator.FLAG_KEY_MEDIA_FAST_FORWARD, "fast_forward")
        .flag(TransportMediator.FLAG_KEY_MEDIA_NEXT, "next")
        .flag(TransportMediator.FLAG_KEY_MEDIA_PAUSE, "pause")
        .flag(TransportMediator.FLAG_KEY_MEDIA_PLAY, "play")
        .flag(TransportMediator.FLAG_KEY_MEDIA_PLAY_PAUSE, "play_pause")
        .flag(TransportMediator.FLAG_KEY_MEDIA_PREVIOUS, "previous")
        .flag(TransportMediator.FLAG_KEY_MEDIA_REWIND, "rewind")
        .flag(TransportMediator.FLAG_KEY_MEDIA_STOP, "stop")
        .get();
  }
}
