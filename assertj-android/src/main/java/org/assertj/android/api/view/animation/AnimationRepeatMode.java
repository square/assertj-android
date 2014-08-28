package org.assertj.android.api.view.animation;

import android.support.annotation.IntDef;
import android.view.animation.Animation;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    Animation.RESTART,
    Animation.REVERSE
})
@Retention(SOURCE)
@interface AnimationRepeatMode {
}
