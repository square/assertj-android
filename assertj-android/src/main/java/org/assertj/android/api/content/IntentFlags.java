package org.assertj.android.api.content;

import android.content.Intent;
import android.support.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef(
    flag = true,
    value = {
        Intent.FLAG_GRANT_READ_URI_PERMISSION,
        Intent.FLAG_GRANT_WRITE_URI_PERMISSION,
        Intent.FLAG_DEBUG_LOG_RESOLUTION,
        Intent.FLAG_FROM_BACKGROUND,
        Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT,
        Intent.FLAG_ACTIVITY_CLEAR_TASK,
        Intent.FLAG_ACTIVITY_CLEAR_TOP,
        Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET,
        Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS,
        Intent.FLAG_ACTIVITY_FORWARD_RESULT,
        Intent.FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY,
        Intent.FLAG_ACTIVITY_MULTIPLE_TASK,
        Intent.FLAG_ACTIVITY_NEW_TASK,
        Intent.FLAG_ACTIVITY_NO_ANIMATION,
        Intent.FLAG_ACTIVITY_NO_HISTORY,
        Intent.FLAG_RECEIVER_REGISTERED_ONLY,
        Intent.FLAG_ACTIVITY_NO_USER_ACTION,
        Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP,
        Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED,
        Intent.FLAG_ACTIVITY_REORDER_TO_FRONT,
        Intent.FLAG_ACTIVITY_SINGLE_TOP,
        Intent.FLAG_ACTIVITY_TASK_ON_HOME
    }
)
@Retention(SOURCE)
@interface IntentFlags {
}
