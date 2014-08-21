package org.assertj.android.api.view.animation;

import android.support.annotation.IntDef;
import android.view.animation.GridLayoutAnimationController;

@IntDef({
    GridLayoutAnimationController.DIRECTION_TOP_TO_BOTTOM,
    GridLayoutAnimationController.DIRECTION_BOTTOM_TO_TOP,
    GridLayoutAnimationController.DIRECTION_LEFT_TO_RIGHT,
    GridLayoutAnimationController.DIRECTION_RIGHT_TO_LEFT
})
@interface GridLayoutAnimationControllerDirection {
}
