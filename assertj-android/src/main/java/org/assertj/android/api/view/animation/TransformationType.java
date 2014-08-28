package org.assertj.android.api.view.animation;

import android.support.annotation.IntDef;
import android.view.animation.Transformation;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    Transformation.TYPE_ALPHA,
    Transformation.TYPE_BOTH,
    Transformation.TYPE_IDENTITY,
    Transformation.TYPE_MATRIX
})
@Retention(SOURCE)
@interface TransformationType {
}
