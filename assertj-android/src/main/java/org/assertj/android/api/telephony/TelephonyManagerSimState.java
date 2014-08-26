package org.assertj.android.api.telephony;

import android.support.annotation.IntDef;
import android.telephony.TelephonyManager;

@IntDef({
    TelephonyManager.SIM_STATE_ABSENT,
    TelephonyManager.SIM_STATE_NETWORK_LOCKED,
    TelephonyManager.SIM_STATE_PIN_REQUIRED,
    TelephonyManager.SIM_STATE_PUK_REQUIRED,
    TelephonyManager.SIM_STATE_READY,
    TelephonyManager.SIM_STATE_UNKNOWN
})
@interface TelephonyManagerSimState {
}
