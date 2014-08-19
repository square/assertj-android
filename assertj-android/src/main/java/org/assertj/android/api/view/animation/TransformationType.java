package org.assertj.android.api.view.animation;

import android.support.annotation.IntDef;
import android.view.animation.Transformation;

@IntDef({
    Transformation.TYPE_ALPHA,
    Transformation.TYPE_BOTH,
    Transformation.TYPE_IDENTITY,
    Transformation.TYPE_MATRIX
})
@interface TransformationType {
}
