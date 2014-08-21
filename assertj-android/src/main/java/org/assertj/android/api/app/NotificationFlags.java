package org.assertj.android.api.app;

import android.app.Notification;
import android.support.annotation.IntDef;

@IntDef(
    flag = true,
    value = {
        Notification.FLAG_AUTO_CANCEL,
        Notification.FLAG_FOREGROUND_SERVICE,
        Notification.FLAG_INSISTENT,
        Notification.FLAG_NO_CLEAR,
        Notification.FLAG_ONGOING_EVENT,
        Notification.FLAG_ONLY_ALERT_ONCE,
        Notification.FLAG_SHOW_LIGHTS,
        Notification.FLAG_HIGH_PRIORITY
    }
)
@interface NotificationFlags {
}
