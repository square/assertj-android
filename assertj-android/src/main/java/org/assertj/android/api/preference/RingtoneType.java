package org.assertj.android.api.preference;

import android.media.RingtoneManager;
import android.support.annotation.IntDef;

@IntDef(
    flag = true,
    value = {
        RingtoneManager.TYPE_ALARM,
        RingtoneManager.TYPE_NOTIFICATION,
        RingtoneManager.TYPE_RINGTONE
    }
)
@interface RingtoneType {
}
