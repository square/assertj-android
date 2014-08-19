package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.DragEvent;

@IntDef({
    DragEvent.ACTION_DRAG_ENDED,
    DragEvent.ACTION_DRAG_ENTERED,
    DragEvent.ACTION_DRAG_EXITED,
    DragEvent.ACTION_DRAG_LOCATION,
    DragEvent.ACTION_DRAG_STARTED,
    DragEvent.ACTION_DROP
})
@interface DragEventAction {
}
