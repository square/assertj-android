package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.KeyCharacterMap;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    KeyCharacterMap.NUMERIC,
    KeyCharacterMap.PREDICTIVE,
    KeyCharacterMap.ALPHA,
    KeyCharacterMap.FULL,
    KeyCharacterMap.SPECIAL_FUNCTION
})
@Retention(SOURCE)
@interface KeyCharacterMapKeyboardType {
}
