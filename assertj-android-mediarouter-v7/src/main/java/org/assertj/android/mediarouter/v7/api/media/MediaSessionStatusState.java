package org.assertj.android.mediarouter.v7.api.media;

import android.support.annotation.IntDef;
import android.support.v7.media.MediaSessionStatus;

@IntDef({
    MediaSessionStatus.SESSION_STATE_ACTIVE,
    MediaSessionStatus.SESSION_STATE_ENDED,
    MediaSessionStatus.SESSION_STATE_INVALIDATED
})
@interface MediaSessionStatusState {
}
