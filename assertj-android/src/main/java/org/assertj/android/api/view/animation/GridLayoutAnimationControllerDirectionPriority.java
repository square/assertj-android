package org.assertj.android.api.view.animation;

import android.support.annotation.IntDef;
import android.view.animation.GridLayoutAnimationController;

@IntDef({
    GridLayoutAnimationController.PRIORITY_NONE,
    GridLayoutAnimationController.PRIORITY_COLUMN,
    GridLayoutAnimationController.PRIORITY_ROW
})
@interface GridLayoutAnimationControllerDirectionPriority {
}
