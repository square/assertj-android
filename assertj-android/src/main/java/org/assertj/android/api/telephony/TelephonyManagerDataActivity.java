package org.assertj.android.api.telephony;

import android.support.annotation.IntDef;
import android.telephony.TelephonyManager;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    TelephonyManager.DATA_ACTIVITY_DORMANT,
    TelephonyManager.DATA_ACTIVITY_IN,
    TelephonyManager.DATA_ACTIVITY_INOUT,
    TelephonyManager.DATA_ACTIVITY_NONE,
    TelephonyManager.DATA_ACTIVITY_OUT
})
@Retention(SOURCE)
@interface TelephonyManagerDataActivity {
}
