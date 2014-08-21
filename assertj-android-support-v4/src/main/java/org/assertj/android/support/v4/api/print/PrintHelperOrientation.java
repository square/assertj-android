package org.assertj.android.support.v4.api.print;

import android.support.annotation.IntDef;
import android.support.v4.print.PrintHelper;

@IntDef({
    PrintHelper.ORIENTATION_LANDSCAPE,
    PrintHelper.ORIENTATION_PORTRAIT
})
@interface PrintHelperOrientation {
}
