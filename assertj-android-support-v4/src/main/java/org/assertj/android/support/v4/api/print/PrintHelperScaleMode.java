package org.assertj.android.support.v4.api.print;

import android.support.annotation.IntDef;
import android.support.v4.print.PrintHelper;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    PrintHelper.SCALE_MODE_FILL,
    PrintHelper.SCALE_MODE_FIT
})
@Retention(SOURCE)
@interface PrintHelperScaleMode {
}
