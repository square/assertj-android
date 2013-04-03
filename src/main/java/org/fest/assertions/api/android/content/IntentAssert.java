package org.fest.assertions.api.android.content;

import android.content.Intent;
import org.fest.assertions.api.AbstractAssert;
import org.fest.assertions.api.android.Utils;

import java.util.ArrayList;
import java.util.List;

import static android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION;
import static android.content.Intent.FLAG_GRANT_WRITE_URI_PERMISSION;
import static android.content.Intent.FLAG_DEBUG_LOG_RESOLUTION;
import static android.content.Intent.FLAG_FROM_BACKGROUND;
import static android.content.Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT;
import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK;
import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP;
import static android.content.Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET;
import static android.content.Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS;
import static android.content.Intent.FLAG_ACTIVITY_FORWARD_RESULT;
import static android.content.Intent.FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY;
import static android.content.Intent.FLAG_ACTIVITY_MULTIPLE_TASK;
import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;
import static android.content.Intent.FLAG_ACTIVITY_NO_ANIMATION;
import static android.content.Intent.FLAG_ACTIVITY_NO_HISTORY;
import static android.content.Intent.FLAG_RECEIVER_REGISTERED_ONLY;
import static android.content.Intent.FLAG_ACTIVITY_NO_USER_ACTION;
import static android.content.Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP;
import static android.content.Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED;
import static android.content.Intent.FLAG_ACTIVITY_REORDER_TO_FRONT;
import static android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP;
import static android.content.Intent.FLAG_ACTIVITY_TASK_ON_HOME;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link Intent} instances. */
public class IntentAssert extends AbstractAssert<IntentAssert, Intent> {
  public IntentAssert(Intent actual) {
    super(actual, IntentAssert.class);
  }

  public IntentAssert hasAction(String action) {
    isNotNull();
    String actualAction = actual.getAction();
    assertThat(actualAction) //
        .overridingErrorMessage("Expected action <%s> but was <%s>.", action, actualAction) //
        .isEqualTo(action);
    return this;
  }

  public IntentAssert hasType(String type) {
    isNotNull();
    String actualType = actual.getType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected type <%s> but was <%s>.", type, actualType) //
        .isEqualTo(type);
    return this;
  }

  public IntentAssert hasExtra(String name) {
    isNotNull();
    assertThat(actual.hasExtra(name)) //
        .overridingErrorMessage("Expected extra <%s> to be present but was not present.", name) //
        .isTrue();
    return this;
  }

  public IntentAssert hasFlags(int flags) {
    int expected = actual.getFlags();
    assertThat(expected)
      .overridingErrorMessage("Expected <%s> but was <%s>.", flagsToString(expected), flagsToString(flags))
      .isEqualTo(flags);
    return this;
  }

  public static String flagsToString(int flag) {
    List<String> parts = new ArrayList<String>();

    if ((flag & FLAG_GRANT_READ_URI_PERMISSION) != 0) {
      parts.add("grant_read_uri_permission");
    }
    if ((flag & FLAG_GRANT_WRITE_URI_PERMISSION) != 0) {
      parts.add("grant_write_uri_permission");
    }
    if ((flag & FLAG_DEBUG_LOG_RESOLUTION) != 0) {
      parts.add("debug_log_resolution");
    }
    if ((flag & FLAG_FROM_BACKGROUND) != 0) {
      parts.add("from_background");
    }
    if ((flag & FLAG_ACTIVITY_BROUGHT_TO_FRONT) != 0) {
      parts.add("activity_brought_to_front");
    }
    if ((flag & FLAG_ACTIVITY_CLEAR_TASK) != 0) {
      parts.add("activity_clear_task");
    }
    if ((flag & FLAG_ACTIVITY_CLEAR_TOP) != 0) {
      parts.add("activity_clear_top");
    }
    if ((flag & FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET) != 0) {
      parts.add("activity_clear_when_task_reset");
    }
    if ((flag & FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS) != 0) {
      parts.add("activity_exclude_from_recents");
    }
    if ((flag & FLAG_ACTIVITY_FORWARD_RESULT) != 0) {
      parts.add("activity_forward_result");
    }
    if ((flag & FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY) != 0) {
      parts.add("activity_launched_from_history");
    }
    if ((flag & FLAG_ACTIVITY_MULTIPLE_TASK) != 0) {
      parts.add("activity_multiple_task");
    }
    if ((flag & FLAG_ACTIVITY_NEW_TASK) != 0) {
      parts.add("activity_new_task");
    }
    if ((flag & FLAG_ACTIVITY_NO_ANIMATION) != 0) {
      parts.add("activity_no_animation");
    }
    if ((flag & FLAG_ACTIVITY_NO_HISTORY) != 0) {
      parts.add("activity_no_history");
    }
    if ((flag & FLAG_RECEIVER_REGISTERED_ONLY) != 0) {
      parts.add("receiver_registered_only");
    }
    if ((flag & FLAG_ACTIVITY_NO_USER_ACTION) != 0) {
      parts.add("activity_no_user_action");
    }
    if ((flag & FLAG_ACTIVITY_PREVIOUS_IS_TOP) != 0) {
      parts.add("activity_previous_is_top");
    }
    if ((flag & FLAG_ACTIVITY_RESET_TASK_IF_NEEDED) != 0) {
      parts.add("activity_reset_task_if _needed");
    }
    if ((flag & FLAG_ACTIVITY_REORDER_TO_FRONT) != 0) {
      parts.add("activity_reorder_to_front");
    }
    if ((flag & FLAG_ACTIVITY_SINGLE_TOP) != 0) {
      parts.add("activity_single_top");
    }
    if ((flag & FLAG_ACTIVITY_TASK_ON_HOME) != 0) {
      parts.add("activity_task_on_home");
    }
    return Utils.join(parts);
  }

}
