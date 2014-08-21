package org.assertj.android.api.widget;

import android.support.annotation.IntDef;
import android.widget.ListPopupWindow;

@IntDef({
    ListPopupWindow.INPUT_METHOD_FROM_FOCUSABLE,
    ListPopupWindow.INPUT_METHOD_NEEDED,
    ListPopupWindow.INPUT_METHOD_NOT_NEEDED
})
@interface ListPopupWindowInputMethodMode {
}
