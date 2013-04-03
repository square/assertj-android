package org.fest.assertions.api.android.content;

import android.content.Intent;
import org.fest.assertions.api.AbstractAssert;

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
      .overridingErrorMessage("Expected <%s> but was <%s>.", flagToString(expected), flagToString(flags))
      .isEqualTo(flags);
    return this;
  }

  public static String flagToString(int flag) {
    switch(flag) {
      case Intent.FLAG_GRANT_READ_URI_PERMISSION:
        return "grant_read_uri_permission";
      case Intent.FLAG_GRANT_WRITE_URI_PERMISSION:
        return "grant_write_uri_permission";
      case Intent.FLAG_DEBUG_LOG_RESOLUTION:
        return "debug_log_resolution";
      case Intent.FLAG_FROM_BACKGROUND:
        return "from_background";
      case Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT:
        return "activity_brought_to_front";
      case Intent.FLAG_ACTIVITY_CLEAR_TASK:
        return "activity_clear_task";
      case Intent.FLAG_ACTIVITY_CLEAR_TOP:
        return "activity_clear_top";
      case Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET:
        return "activity_clear_when_task_reset";
      case Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS:
        return "activity_exclude_from_recents";
      case Intent.FLAG_ACTIVITY_FORWARD_RESULT:
        return "activity_forward_result";
      case Intent.FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY:
        return "activity_launched_from_history";
      case Intent.FLAG_ACTIVITY_MULTIPLE_TASK:
        return "activity_multiple_task";
      case Intent.FLAG_ACTIVITY_NEW_TASK:
        return "activity_new_task";
      case Intent.FLAG_ACTIVITY_NO_ANIMATION:
        return "activity_no_animation";
      case Intent.FLAG_ACTIVITY_NO_HISTORY:
        return "activity_no_history";
      case Intent.FLAG_ACTIVITY_NO_USER_ACTION:
        return "activity_no_user_action";
      case Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP:
        return "activity_previous_is_top";
      case Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED:
        return "activity_reset_task_if_needed";
      case Intent.FLAG_ACTIVITY_REORDER_TO_FRONT:
        return "activity_reorder_to_front";
      case Intent.FLAG_ACTIVITY_SINGLE_TOP:
        return "activity_single_top";
      case Intent.FLAG_ACTIVITY_TASK_ON_HOME:
        return "activity_task_on_home";
      //  case Intent.FLAG_RECEIVER_REGISTERED_ONLY:
      //    return "receiver_registered_only";
      default:
        return flag + "";
    }
  }

}
