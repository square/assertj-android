package org.assertj.android.support.v4.api.media;

import android.support.annotation.IntDef;
import android.support.v4.media.TransportMediator;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef(
    flag = true,
    value = {
        TransportMediator.FLAG_KEY_MEDIA_FAST_FORWARD,
        TransportMediator.FLAG_KEY_MEDIA_NEXT,
        TransportMediator.FLAG_KEY_MEDIA_PAUSE,
        TransportMediator.FLAG_KEY_MEDIA_PLAY,
        TransportMediator.FLAG_KEY_MEDIA_PLAY_PAUSE,
        TransportMediator.FLAG_KEY_MEDIA_PREVIOUS,
        TransportMediator.FLAG_KEY_MEDIA_REWIND,
        TransportMediator.FLAG_KEY_MEDIA_STOP
    }
)
@Retention(SOURCE)
@interface TransportMediatorControlFlags {
}
