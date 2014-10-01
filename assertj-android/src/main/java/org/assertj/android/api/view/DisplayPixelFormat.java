package org.assertj.android.api.view;

import android.graphics.PixelFormat;
import android.support.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    PixelFormat.UNKNOWN,
    PixelFormat.TRANSLUCENT,
    PixelFormat.TRANSPARENT,
    PixelFormat.OPAQUE,
    PixelFormat.RGBA_8888,
    PixelFormat.RGBX_8888,
    PixelFormat.RGB_888,
    PixelFormat.RGB_565,
    PixelFormat.RGBA_5551,
    PixelFormat.RGBA_4444,
    PixelFormat.A_8,
    PixelFormat.L_8,
    PixelFormat.LA_88,
    PixelFormat.RGB_332,
    PixelFormat.YCbCr_422_SP,
    PixelFormat.YCbCr_420_SP,
    PixelFormat.YCbCr_422_I,
    PixelFormat.JPEG
})
@Retention(SOURCE)
@interface DisplayPixelFormat {
}
