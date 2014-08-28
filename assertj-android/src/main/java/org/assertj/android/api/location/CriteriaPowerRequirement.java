package org.assertj.android.api.location;

import android.location.Criteria;
import android.support.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    Criteria.NO_REQUIREMENT,
    Criteria.POWER_LOW,
    Criteria.POWER_MEDIUM,
    Criteria.POWER_HIGH
})
@Retention(SOURCE)
@interface CriteriaPowerRequirement {
}
