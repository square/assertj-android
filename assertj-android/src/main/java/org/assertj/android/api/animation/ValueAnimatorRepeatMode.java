package org.assertj.android.api.animation;

import android.animation.ValueAnimator;
import android.support.annotation.IntDef;

@IntDef({
    ValueAnimator.RESTART,
    ValueAnimator.REVERSE
})
@interface ValueAnimatorRepeatMode {
}
