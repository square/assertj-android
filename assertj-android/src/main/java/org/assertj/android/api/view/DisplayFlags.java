package org.assertj.android.api.view;

import android.support.annotation.IntDef;
import android.view.Display;

@IntDef(
    flag = true,
    value = {
        Display.FLAG_PRESENTATION,
        Display.FLAG_PRIVATE,
        Display.FLAG_SECURE,
        Display.FLAG_SUPPORTS_PROTECTED_BUFFERS
    }
)
@interface DisplayFlags {
}
