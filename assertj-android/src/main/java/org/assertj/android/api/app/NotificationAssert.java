package org.assertj.android.api.app;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import org.assertj.android.api.util.BitMaskStringBuilder;
import org.assertj.core.api.AbstractAssert;

import static android.app.Notification.FLAG_AUTO_CANCEL;
import static android.app.Notification.FLAG_FOREGROUND_SERVICE;
import static android.app.Notification.FLAG_HIGH_PRIORITY;
import static android.app.Notification.FLAG_INSISTENT;
import static android.app.Notification.FLAG_NO_CLEAR;
import static android.app.Notification.FLAG_ONGOING_EVENT;
import static android.app.Notification.FLAG_ONLY_ALERT_ONCE;
import static android.app.Notification.FLAG_SHOW_LIGHTS;
import static android.app.Notification.PRIORITY_DEFAULT;
import static android.app.Notification.PRIORITY_HIGH;
import static android.app.Notification.PRIORITY_LOW;
import static android.app.Notification.PRIORITY_MAX;
import static android.app.Notification.PRIORITY_MIN;
import static android.os.Build.VERSION_CODES.GINGERBREAD;
import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static android.os.Build.VERSION_CODES.KITKAT_WATCH;
import static org.assertj.core.api.Assertions.assertThat;

public class NotificationAssert extends AbstractAssert<NotificationAssert, Notification> {
  public NotificationAssert(Notification actual) {
    super(actual, NotificationAssert.class);
  }

  public NotificationAssert hasContentIntent(PendingIntent intent) {
    isNotNull();
    assertThat(actual.contentIntent).isEqualTo(intent);
    return this;
  }

  public NotificationAssert hasDefaults(int defaults) {
    isNotNull();
    int actualDefaults = actual.defaults;
    assertThat(actualDefaults) //
        .overridingErrorMessage("Expected defaults <%s> but was <%s>.", defaults, actualDefaults) //
        .isEqualTo(defaults);
    return this;
  }

  public NotificationAssert hasDeleteIntent(PendingIntent intent) {
    isNotNull();
    assertThat(actual.deleteIntent).isEqualTo(intent);
    return this;
  }

  public NotificationAssert hasFlags(int flags) {
    isNotNull();
    int actualFlags = actual.flags;
    assertThat(actualFlags) //
        .overridingErrorMessage("Expected flags <%s> but was <%s>.", flagsToString(flags),
            flagsToString(actualFlags)) //
        .isEqualTo(flags);
    return this;
  }

  @TargetApi(GINGERBREAD)
  public NotificationAssert hasFullScreenIntent(PendingIntent intent) {
    isNotNull();
    assertThat(actual.fullScreenIntent).isEqualTo(intent);
    return this;
  }

  @TargetApi(KITKAT_WATCH)
  public NotificationAssert hasGroup(String group) {
    isNotNull();
    String actualGroup = actual.getGroup();
    assertThat(actual.getGroup()) //
        .overridingErrorMessage("Expected group <%s> but was <%s>.", group, actualGroup)
        .isEqualTo(group);
    return this;
  }

  public NotificationAssert hasIcon(int resId) {
    isNotNull();
    int actualId = actual.icon;
    assertThat(actualId) //
        .overridingErrorMessage("Expected icon with ID <%s> but was <%s>.", resId, actualId) //
        .isEqualTo(resId);
    return this;
  }

  public NotificationAssert hasIconLevel(int level) {
    isNotNull();
    int actualLevel = actual.iconLevel;
    assertThat(actualLevel) //
        .overridingErrorMessage("Expected icon level <%s> but was <%s>.", level, actualLevel) //
        .isEqualTo(level);
    return this;
  }

  @TargetApi(HONEYCOMB)
  public NotificationAssert hasLargeIcon(Bitmap bitmap) {
    isNotNull();
    assertThat(actual.largeIcon).isEqualTo(bitmap);
    return this;
  }

  public NotificationAssert hasLedColor(int color) {
    isNotNull();
    int actualColor = actual.ledARGB;
    assertThat(actualColor) //
        .overridingErrorMessage("Expected LED color <%s> but was <%s>.", Integer.toHexString(color),
            Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return this;
  }

  public NotificationAssert hasLedOffMs(int length) {
    isNotNull();
    int actualLength = actual.ledOffMS;
    assertThat(actualLength) //
        .overridingErrorMessage("Expected LED off time (ms) <%s> but was <%s>.", length,
            actualLength) //
        .isEqualTo(length);
    return this;
  }

  public NotificationAssert hasLedOnMs(int length) {
    isNotNull();
    int actualLength = actual.ledOnMS;
    assertThat(actualLength) //
        .overridingErrorMessage("Expected LED on time (ms) <%s> but was <%s>.", length,
            actualLength) //
        .isEqualTo(length);
    return this;
  }

  public NotificationAssert hasNumber(int number) {
    isNotNull();
    int actualNumber = actual.number;
    assertThat(actualNumber) //
        .overridingErrorMessage("Expected number <%s> but was <%s>.", number, actualNumber) //
        .isEqualTo(number);
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public NotificationAssert hasPriority(int priority) {
    isNotNull();
    int actualPriority = actual.priority;
    assertThat(actualPriority) //
        .overridingErrorMessage("Expected priority <%s> but was <%s>.", priorityToString(priority),
            priorityToString(actualPriority)) //
        .isEqualTo(priority);
    return this;
  }

  @TargetApi(KITKAT_WATCH)
  public NotificationAssert hasSortKey(String sortKey) {
    isNotNull();
    assertThat(actual.getSortKey()) //
        .overridingErrorMessage("Expected sortKey <%s> but was <%s>.", sortKey, actual.getSortKey())
        .isEqualTo(sortKey);
    return this;
  }

  public NotificationAssert hasTickerText(CharSequence text) {
    isNotNull();
    assertThat(actual.tickerText).isEqualTo(text);
    return this;
  }

  public NotificationAssert hasVibration(long[] vibration) {
    isNotNull();
    assertThat(actual.vibrate).isEqualTo(vibration);
    return this;
  }

  public NotificationAssert hasWhen(long when) {
    isNotNull();
    long actualWhen = actual.when;
    assertThat(actualWhen) //
        .overridingErrorMessage("Expected when <%s> but was <%s>.", when, actualWhen) //
        .isEqualTo(when);
    return this;
  }

  private static String flagsToString(int flags) {
    return new BitMaskStringBuilder(flags) //
        .flag(FLAG_AUTO_CANCEL, "autoCancel")
        .flag(FLAG_FOREGROUND_SERVICE, "foregroundService")
        .flag(FLAG_INSISTENT, "insistent")
        .flag(FLAG_NO_CLEAR, "noClear")
        .flag(FLAG_ONGOING_EVENT, "ongoingEvent")
        .flag(FLAG_ONLY_ALERT_ONCE, "onlyAlertOnce")
        .flag(FLAG_SHOW_LIGHTS, "showLights")
        .flag(FLAG_HIGH_PRIORITY, "highPriority")
        .get();
  }

  private static String priorityToString(int priority) {
    switch (priority) {
      case PRIORITY_MIN:
        return "min";
      case PRIORITY_LOW:
        return "low";
      case PRIORITY_DEFAULT:
        return "default";
      case PRIORITY_HIGH:
        return "high";
      case PRIORITY_MAX:
        return "max";
      default:
        throw new IllegalArgumentException("Unknown priority: " + priority);
    }
  }
}
