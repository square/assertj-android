package org.assertj.android.api.location;

import android.location.Criteria;
import android.support.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    Criteria.ACCURACY_COARSE,
    Criteria.ACCURACY_FINE
})
@Retention(SOURCE)
@interface CriteriaAccuracyRequirement {
}
