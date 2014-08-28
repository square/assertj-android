package org.assertj.android.api.telephony;

import android.support.annotation.IntDef;
import android.telephony.TelephonyManager;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    TelephonyManager.PHONE_TYPE_CDMA,
    TelephonyManager.PHONE_TYPE_GSM,
    TelephonyManager.PHONE_TYPE_NONE,
    TelephonyManager.PHONE_TYPE_SIP
})
@Retention(SOURCE)
@interface TelephonyManagerPhoneType {
}
