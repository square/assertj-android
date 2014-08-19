package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.ViewGroup;

@IntDef({
    ViewGroup.PERSISTENT_ALL_CACHES,
    ViewGroup.PERSISTENT_ANIMATION_CACHE,
    ViewGroup.PERSISTENT_NO_CACHE,
    ViewGroup.PERSISTENT_SCROLLING_CACHE
})
@interface ViewGroupPersistentDrawingCache {
}
