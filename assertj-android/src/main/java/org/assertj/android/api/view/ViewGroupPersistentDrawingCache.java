package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.ViewGroup;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    ViewGroup.PERSISTENT_ALL_CACHES,
    ViewGroup.PERSISTENT_ANIMATION_CACHE,
    ViewGroup.PERSISTENT_NO_CACHE,
    ViewGroup.PERSISTENT_SCROLLING_CACHE
})
@Retention(SOURCE)
@interface ViewGroupPersistentDrawingCache {
}
