package org.assertj.android.support.v4.api.print;

import android.support.annotation.IntDef;
import android.support.v4.print.PrintHelper;

@IntDef({
    PrintHelper.SCALE_MODE_FILL,
    PrintHelper.SCALE_MODE_FIT
})
@interface PrintHelperScaleMode {
}
