package org.assertj.android.support.v4.api.print;

import android.support.annotation.IntDef;
import android.support.v4.print.PrintHelper;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    PrintHelper.ORIENTATION_LANDSCAPE,
    PrintHelper.ORIENTATION_PORTRAIT
})
@Retention(SOURCE)
@interface PrintHelperOrientation {
}
