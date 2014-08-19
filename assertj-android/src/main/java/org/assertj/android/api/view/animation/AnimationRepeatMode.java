package org.assertj.android.api.view.animation;

import android.support.annotation.IntDef;
import android.view.animation.Animation;

@IntDef({
    Animation.RESTART,
    Animation.REVERSE
})
@interface AnimationRepeatMode {
}
