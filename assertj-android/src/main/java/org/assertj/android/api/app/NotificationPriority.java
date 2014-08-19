package org.assertj.android.api.app;

import android.app.Notification;
import android.support.annotation.IntDef;

@IntDef({
    Notification.PRIORITY_MIN,
    Notification.PRIORITY_LOW,
    Notification.PRIORITY_DEFAULT,
    Notification.PRIORITY_HIGH,
    Notification.PRIORITY_MAX
})
@interface NotificationPriority {
}
