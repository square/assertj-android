package org.assertj.android.api.telephony;

import android.support.annotation.IntDef;
import android.telephony.TelephonyManager;

@IntDef({
    TelephonyManager.PHONE_TYPE_CDMA,
    TelephonyManager.PHONE_TYPE_GSM,
    TelephonyManager.PHONE_TYPE_NONE,
    TelephonyManager.PHONE_TYPE_SIP
})
@interface TelephonyManagerPhoneType {
}
