package org.assertj.android.api.telephony;

import android.support.annotation.IntDef;
import android.telephony.TelephonyManager;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    TelephonyManager.CALL_STATE_IDLE,
    TelephonyManager.CALL_STATE_OFFHOOK,
    TelephonyManager.CALL_STATE_RINGING
})
@Retention(SOURCE)
@interface TelephonyManagerCallState {
}
