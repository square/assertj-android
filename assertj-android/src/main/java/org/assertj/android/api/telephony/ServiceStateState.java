package org.assertj.android.api.telephony;

import android.support.annotation.IntDef;
import android.telephony.ServiceState;

@IntDef({
    ServiceState.STATE_EMERGENCY_ONLY,
    ServiceState.STATE_IN_SERVICE,
    ServiceState.STATE_OUT_OF_SERVICE,
    ServiceState.STATE_POWER_OFF
})
@interface ServiceStateState {
}
