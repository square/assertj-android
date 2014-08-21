package org.assertj.android.api.location;

import android.location.Criteria;
import android.support.annotation.IntDef;

@IntDef({
    Criteria.NO_REQUIREMENT,
    Criteria.POWER_LOW,
    Criteria.POWER_MEDIUM,
    Criteria.POWER_HIGH
})
@interface CriteriaPowerRequirement {
}
