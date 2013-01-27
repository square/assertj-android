// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.preference;

import android.preference.RingtonePreference;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

import static android.media.RingtoneManager.TYPE_ALARM;
import static android.media.RingtoneManager.TYPE_NOTIFICATION;
import static android.media.RingtoneManager.TYPE_RINGTONE;
import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link RingtonePreference} instances. */
public class RingtonePreferenceAssert
    extends AbstractPreferenceAssert<RingtonePreferenceAssert, RingtonePreference> {
  public RingtonePreferenceAssert(RingtonePreference actual) {
    super(actual, RingtonePreferenceAssert.class);
  }

  public RingtonePreferenceAssert hasRingtoneType(int type) {
    isNotNull();
    int actualType = actual.getRingtoneType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected ringtone type <%s> but was <%s>.",
            ringtoneTypeToString(type), ringtoneTypeToString(actualType)) //
        .isEqualTo(type);
    return this;
  }

  public RingtonePreferenceAssert isShowingDefault() {
    isNotNull();
    assertThat(actual.getShowDefault()) //
        .overridingErrorMessage("Expected to be showing default but was not.") //
        .isTrue();
    return this;
  }

  public RingtonePreferenceAssert isNotShowingDefault() {
    isNotNull();
    assertThat(actual.getShowDefault()) //
        .overridingErrorMessage("Expected to not be showing default but was.") //
        .isFalse();
    return this;
  }

  public RingtonePreferenceAssert isShowingSilent() {
    isNotNull();
    assertThat(actual.getShowSilent()) //
        .overridingErrorMessage("Expected to be showing silent but was not.") //
        .isTrue();
    return this;
  }

  public RingtonePreferenceAssert isNotShowingSilent() {
    isNotNull();
    assertThat(actual.getShowSilent()) //
        .overridingErrorMessage("Expected to not be showing silent but was.") //
        .isFalse();
    return this;
  }

  private static String ringtoneTypeToString(int type) {
    List<String> parts = new ArrayList<String>();
    if ((type & TYPE_ALARM) != 0) {
      parts.add("alarm");
    }
    if ((type & TYPE_NOTIFICATION) != 0) {
      parts.add("notification");
    }
    if ((type & TYPE_RINGTONE) != 0) {
      parts.add("ringtone");
    }
    return TextUtils.join(", ", parts);
  }
}
