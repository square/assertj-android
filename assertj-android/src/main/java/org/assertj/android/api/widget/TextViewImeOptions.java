package org.assertj.android.api.widget;

import android.support.annotation.IntDef;
import android.view.inputmethod.EditorInfo;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    EditorInfo.IME_ACTION_UNSPECIFIED,
    EditorInfo.IME_ACTION_NONE,
    EditorInfo.IME_ACTION_GO,
    EditorInfo.IME_ACTION_SEARCH,
    EditorInfo.IME_ACTION_SEND,
    EditorInfo.IME_ACTION_NEXT,
    EditorInfo.IME_ACTION_DONE,
    EditorInfo.IME_ACTION_PREVIOUS,
    EditorInfo.IME_FLAG_NO_FULLSCREEN,
    EditorInfo.IME_FLAG_NAVIGATE_PREVIOUS,
    EditorInfo.IME_FLAG_NAVIGATE_NEXT,
    EditorInfo.IME_FLAG_NO_EXTRACT_UI,
    EditorInfo.IME_FLAG_NO_ACCESSORY_ACTION,
    EditorInfo.IME_FLAG_NO_ENTER_ACTION,
    EditorInfo.IME_FLAG_FORCE_ASCII,
    EditorInfo.IME_NULL
})
@Retention(SOURCE)
@interface TextViewImeOptions {
}
