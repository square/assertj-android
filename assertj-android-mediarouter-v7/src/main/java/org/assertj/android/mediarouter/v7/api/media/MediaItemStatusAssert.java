package org.assertj.android.mediarouter.v7.api.media;

import android.support.v7.media.MediaItemStatus;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class MediaItemStatusAssert extends AbstractAssert<MediaItemStatusAssert, MediaItemStatus> {
  public MediaItemStatusAssert(MediaItemStatus actual) {
    super(actual, MediaItemStatusAssert.class);
  }

  public MediaItemStatusAssert hasContentDuration(long duration) {
    isNotNull();
    long actualDuration = actual.getContentDuration();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected content duration <%s> but was <%s>.", duration,
            actualDuration) //
        .isEqualTo(duration);
    return this;
  }

  public MediaItemStatusAssert hasContentPosition(long position) {
    isNotNull();
    long actualPosition = actual.getContentPosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected content position <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return this;
  }

  public MediaItemStatusAssert hasPlaybackState(int state) {
    isNotNull();
    int actualState = actual.getPlaybackState();
    assertThat(actualState) //
        .overridingErrorMessage("Expected playback state <%s> but was <%s>.",
            playbackStateToString(state), playbackStateToString(actualState)) //
        .isEqualTo(state);
    return this;
  }

  public MediaItemStatusAssert hasTimestamp(long timestamp) {
    isNotNull();
    long actualTimestamp = actual.getTimestamp();
    assertThat(actualTimestamp) //
        .overridingErrorMessage("Expected timestamp <%s> but was <%s>.", timestamp, actualTimestamp)
        .isEqualTo(timestamp);
    return this;
  }

  private static String playbackStateToString(int playbackState) {
    switch (playbackState) {
      case MediaItemStatus.PLAYBACK_STATE_BUFFERING:
        return "buffering";
      case MediaItemStatus.PLAYBACK_STATE_CANCELED:
        return "canceled";
      case MediaItemStatus.PLAYBACK_STATE_ERROR:
        return "error";
      case MediaItemStatus.PLAYBACK_STATE_FINISHED:
        return "finished";
      case MediaItemStatus.PLAYBACK_STATE_INVALIDATED:
        return "invalidated";
      case MediaItemStatus.PLAYBACK_STATE_PAUSED:
        return "paused";
      case MediaItemStatus.PLAYBACK_STATE_PENDING:
        return "pending";
      case MediaItemStatus.PLAYBACK_STATE_PLAYING:
        return "playing";
      default:
        throw new IllegalArgumentException("Unknown playback state: " + playbackState);
    }
  }
}
