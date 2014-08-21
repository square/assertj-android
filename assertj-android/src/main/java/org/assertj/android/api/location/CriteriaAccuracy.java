package org.assertj.android.api.location;

import android.location.Criteria;
import android.support.annotation.IntDef;

@IntDef({
    Criteria.ACCURACY_LOW,
    Criteria.ACCURACY_MEDIUM,
    Criteria.ACCURACY_HIGH
})
@interface CriteriaAccuracy {
}
