package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.Surface;

@IntDef({
    Surface.ROTATION_0,
    Surface.ROTATION_90,
    Surface.ROTATION_180,
    Surface.ROTATION_270
})
@interface SurfaceRotation {
}
