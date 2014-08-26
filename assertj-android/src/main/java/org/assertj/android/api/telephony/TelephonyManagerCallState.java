package org.assertj.android.api.telephony;

import android.support.annotation.IntDef;
import android.telephony.TelephonyManager;

@IntDef({
    TelephonyManager.CALL_STATE_IDLE,
    TelephonyManager.CALL_STATE_OFFHOOK,
    TelephonyManager.CALL_STATE_RINGING
})
@interface TelephonyManagerCallState {
}
