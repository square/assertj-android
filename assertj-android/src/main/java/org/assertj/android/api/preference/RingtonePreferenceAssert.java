// Copyright 2013 Square, Inc.
package org.assertj.android.api.preference;

import android.preference.RingtonePreference;

import static android.media.RingtoneManager.TYPE_ALARM;
import static android.media.RingtoneManager.TYPE_NOTIFICATION;
import static android.media.RingtoneManager.TYPE_RINGTONE;
import static org.assertj.android.internal.BitmaskUtils.buildBitMaskString;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link RingtonePreference} instances. */
public class RingtonePreferenceAssert
    extends AbstractPreferenceAssert<RingtonePreferenceAssert, RingtonePreference> {
  public RingtonePreferenceAssert(RingtonePreference actual) {
    super(actual, RingtonePreferenceAssert.class);
  }

  public RingtonePreferenceAssert hasRingtoneType(@RingtoneType int type) {
    isNotNull();
    int actualType = actual.getRingtoneType();
    //noinspection ResourceType
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

  private static String ringtoneTypeToString(@RingtoneType int type) {
    return buildBitMaskString(type) //
        .flag(TYPE_ALARM, "alarm")
        .flag(TYPE_NOTIFICATION, "notification")
        .flag(TYPE_RINGTONE, "ringtone")
        .get();
  }
}
