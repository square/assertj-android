package org.assertj.android.api.graphics;

import android.graphics.Paint;
import android.support.annotation.IntDef;

@IntDef(
    flag = true,
    value = {
        Paint.ANTI_ALIAS_FLAG,
        Paint.DEV_KERN_TEXT_FLAG,
        Paint.DITHER_FLAG,
        Paint.FAKE_BOLD_TEXT_FLAG,
        Paint.FILTER_BITMAP_FLAG,
        Paint.LINEAR_TEXT_FLAG,
        Paint.STRIKE_THRU_TEXT_FLAG,
        Paint.SUBPIXEL_TEXT_FLAG,
        Paint.UNDERLINE_TEXT_FLAG
})
@interface PaintFlags {
}
