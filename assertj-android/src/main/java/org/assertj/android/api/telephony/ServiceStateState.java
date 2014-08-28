package org.assertj.android.api.telephony;

import android.support.annotation.IntDef;
import android.telephony.ServiceState;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    ServiceState.STATE_EMERGENCY_ONLY,
    ServiceState.STATE_IN_SERVICE,
    ServiceState.STATE_OUT_OF_SERVICE,
    ServiceState.STATE_POWER_OFF
})
@Retention(SOURCE)
@interface ServiceStateState {
}
