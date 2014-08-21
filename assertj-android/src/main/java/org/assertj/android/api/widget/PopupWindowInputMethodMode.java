package org.assertj.android.api.widget;

import android.support.annotation.IntDef;
import android.widget.PopupWindow;

@IntDef({
    PopupWindow.INPUT_METHOD_FROM_FOCUSABLE,
    PopupWindow.INPUT_METHOD_NEEDED,
    PopupWindow.INPUT_METHOD_NOT_NEEDED
})
@interface PopupWindowInputMethodMode {
}
