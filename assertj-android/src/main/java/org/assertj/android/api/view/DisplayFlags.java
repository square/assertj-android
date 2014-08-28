package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.Display;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef(
    flag = true,
    value = {
        Display.FLAG_PRESENTATION,
        Display.FLAG_PRIVATE,
        Display.FLAG_SECURE,
        Display.FLAG_SUPPORTS_PROTECTED_BUFFERS
    }
)
@Retention(SOURCE)
@interface DisplayFlags {
}
