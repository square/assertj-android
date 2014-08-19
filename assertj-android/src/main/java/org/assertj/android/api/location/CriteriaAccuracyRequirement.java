package org.assertj.android.api.location;

import android.location.Criteria;
import android.support.annotation.IntDef;

@IntDef({
    Criteria.ACCURACY_COARSE,
    Criteria.ACCURACY_FINE
})
@interface CriteriaAccuracyRequirement {
}
