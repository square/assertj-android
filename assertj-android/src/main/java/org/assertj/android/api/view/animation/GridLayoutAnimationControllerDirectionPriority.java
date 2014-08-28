package org.assertj.android.api.view.animation;

import android.support.annotation.IntDef;
import android.view.animation.GridLayoutAnimationController;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    GridLayoutAnimationController.PRIORITY_NONE,
    GridLayoutAnimationController.PRIORITY_COLUMN,
    GridLayoutAnimationController.PRIORITY_ROW
})
@Retention(SOURCE)
@interface GridLayoutAnimationControllerDirectionPriority {
}
