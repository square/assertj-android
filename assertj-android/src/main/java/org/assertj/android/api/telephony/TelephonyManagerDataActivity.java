package org.assertj.android.api.telephony;

import android.support.annotation.IntDef;
import android.telephony.TelephonyManager;

@IntDef({
    TelephonyManager.DATA_ACTIVITY_DORMANT,
    TelephonyManager.DATA_ACTIVITY_IN,
    TelephonyManager.DATA_ACTIVITY_INOUT,
    TelephonyManager.DATA_ACTIVITY_NONE,
    TelephonyManager.DATA_ACTIVITY_OUT
})
@interface TelephonyManagerDataActivity {
}
