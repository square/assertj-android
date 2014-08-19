package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.View;

@IntDef({
    View.VISIBLE,
    View.INVISIBLE,
    View.GONE
})
@interface ViewVisibility {
}
