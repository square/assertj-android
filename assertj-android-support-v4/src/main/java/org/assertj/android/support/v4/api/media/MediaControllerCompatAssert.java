package org.assertj.android.support.v4.api.media;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.android.internal.BitmaskUtils.buildBitMaskString;
import static org.assertj.core.api.Assertions.assertThat;

public class MediaControllerCompatAssert
    extends AbstractAssert<MediaControllerCompatAssert, MediaControllerCompat> {
  public MediaControllerCompatAssert(MediaControllerCompat actual) {
    super(actual, MediaControllerCompatAssert.class);
  }

  public MediaControllerCompatAssert hasBufferPosition(long position) {
    isNotNull();
    long actualPosition = actual.getPlaybackState().getBufferedPosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected buffer position <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return this;
  }

  public MediaControllerCompatAssert hasPosition(long position) {
    isNotNull();
    long actualPosition = actual.getPlaybackState().getPosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected position <%s> but was <%s>.", position, actualPosition) //
        .isEqualTo(position);
    return this;
  }

  public MediaControllerCompatAssert hasDuration(long duration) {
    isNotNull();
    long actualDuration = actual.getMetadata().getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected duration <%s> but was <%s>.", duration, actualDuration) //
        .isEqualTo(duration);
    return this;
  }

  public MediaControllerCompatAssert hasActions(long flags) {
    isNotNull();
    long actualFlags = actual.getPlaybackState().getActions();
    assertThat(actualFlags) //
        .overridingErrorMessage("Expected control flags <%s> but was <%s>.", actionsToString(flags),
            actionsToString(actualFlags)) //
        .isEqualTo(flags);
    return this;
  }

  public MediaControllerCompatAssert isPlaying() {
    isNotNull();
    assertThat(actual.getPlaybackState().getState()) //
        .overridingErrorMessage("Expected to be playing but was not.") //
        .isEqualTo(PlaybackStateCompat.STATE_PLAYING);
    return this;
  }

  public MediaControllerCompatAssert isNotPlaying() {
    isNotNull();
    assertThat(actual.getPlaybackState().getState()) //
        .overridingErrorMessage("Expected to not be playing but was.") //
        .isNotEqualTo(PlaybackStateCompat.STATE_PLAYING);
    return this;
  }

  public static String actionsToString(long actions) {
    return buildBitMaskString(actions) //
        .flag(PlaybackStateCompat.ACTION_STOP, "stop")
        .flag(PlaybackStateCompat.ACTION_PAUSE, "pause")
        .flag(PlaybackStateCompat.ACTION_PLAY, "play")
        .flag(PlaybackStateCompat.ACTION_REWIND, "rewind")
        .flag(PlaybackStateCompat.ACTION_SKIP_TO_PREVIOUS, "skip_to_previous")
        .flag(PlaybackStateCompat.ACTION_SKIP_TO_NEXT, "skip_to_next")
        .flag(PlaybackStateCompat.ACTION_FAST_FORWARD, "fast_forward")
        .flag(PlaybackStateCompat.ACTION_SET_RATING, "set_rating")
        .flag(PlaybackStateCompat.ACTION_SEEK_TO, "seek_to")
        .flag(PlaybackStateCompat.ACTION_PLAY_PAUSE, "play_pause")
        .flag(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, "play_from_media_id")
        .flag(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH, "play_from_search")
        .flag(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM, "skip_to_queue_item")
        .flag(PlaybackStateCompat.ACTION_PLAY_FROM_URI, "play_from_uri")
        .flag(PlaybackStateCompat.ACTION_PREPARE, "prepare")
        .flag(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, "prepare_from_media_id")
        .flag(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, "prepare_from_search")
        .flag(PlaybackStateCompat.ACTION_PREPARE_FROM_URI, "prepare_from_uri")
        .flag(PlaybackStateCompat.ACTION_SET_REPEAT_MODE, "set_repeat_mode")
        .flag(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, "set_shuffle_mode_enabled")
        .flag(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, "set_captioning_enabled")
        .get();
  }
}
