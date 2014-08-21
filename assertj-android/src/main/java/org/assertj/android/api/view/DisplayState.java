package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.Display;

@IntDef({
    Display.STATE_DOZING,
    Display.STATE_OFF,
    Display.STATE_ON,
    Display.STATE_UNKNOWN
})
@interface DisplayState {
}
