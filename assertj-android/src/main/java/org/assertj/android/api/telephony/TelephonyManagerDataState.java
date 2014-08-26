package org.assertj.android.api.telephony;

import android.support.annotation.IntDef;
import android.telephony.TelephonyManager;

@IntDef({
    TelephonyManager.DATA_CONNECTED,
    TelephonyManager.DATA_CONNECTING,
    TelephonyManager.DATA_DISCONNECTED,
    TelephonyManager.DATA_SUSPENDED
})
@interface TelephonyManagerDataState {
}
