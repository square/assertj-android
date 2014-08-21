package org.assertj.android.mediarouter.v7.api.media;

import android.support.annotation.IntDef;
import android.support.v7.media.MediaItemStatus;

@IntDef({
    MediaItemStatus.PLAYBACK_STATE_BUFFERING,
    MediaItemStatus.PLAYBACK_STATE_CANCELED,
    MediaItemStatus.PLAYBACK_STATE_ERROR,
    MediaItemStatus.PLAYBACK_STATE_FINISHED,
    MediaItemStatus.PLAYBACK_STATE_INVALIDATED,
    MediaItemStatus.PLAYBACK_STATE_PAUSED,
    MediaItemStatus.PLAYBACK_STATE_PENDING,
    MediaItemStatus.PLAYBACK_STATE_PLAYING
})
@interface MediaItemStatusPlaybackState {
}
