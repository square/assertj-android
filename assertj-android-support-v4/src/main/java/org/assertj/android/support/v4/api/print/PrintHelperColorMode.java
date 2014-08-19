package org.assertj.android.support.v4.api.print;

import android.support.annotation.IntDef;
import android.support.v4.print.PrintHelper;

@IntDef({
    PrintHelper.COLOR_MODE_COLOR,
    PrintHelper.COLOR_MODE_MONOCHROME
})
@interface PrintHelperColorMode {
}
