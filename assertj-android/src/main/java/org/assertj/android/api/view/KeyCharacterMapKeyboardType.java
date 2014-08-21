package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.KeyCharacterMap;

@IntDef({
    KeyCharacterMap.NUMERIC,
    KeyCharacterMap.PREDICTIVE,
    KeyCharacterMap.ALPHA,
    KeyCharacterMap.FULL,
    KeyCharacterMap.SPECIAL_FUNCTION
})
@interface KeyCharacterMapKeyboardType {
}
