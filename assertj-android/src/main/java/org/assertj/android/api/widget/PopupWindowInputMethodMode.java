package org.assertj.android.api.widget;

import android.support.annotation.IntDef;
import android.widget.PopupWindow;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    PopupWindow.INPUT_METHOD_FROM_FOCUSABLE,
    PopupWindow.INPUT_METHOD_NEEDED,
    PopupWindow.INPUT_METHOD_NOT_NEEDED
})
@Retention(SOURCE)
@interface PopupWindowInputMethodMode {
}
