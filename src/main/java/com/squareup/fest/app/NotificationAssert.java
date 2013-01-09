package com.squareup.fest.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

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
        .overridingErrorMessage("Expected defaults <%s> but was <%s>", defaults, actualDefaults) //
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
        .overridingErrorMessage("Expected flags <%s> but was <%s>", flags, actualFlags) //
        .isEqualTo(flags);
    return this;
  }

  public NotificationAssert hasFullScreenIntent(PendingIntent intent) {
    isNotNull();
    assertThat(actual.fullScreenIntent).isEqualTo(intent);
    return this;
  }

  public NotificationAssert hasIcon(int resId) {
    isNotNull();
    int actualId = actual.icon;
    assertThat(actualId) //
        .overridingErrorMessage("Expected icon with ID <%s> but was <%s>", resId, actualId) //
        .isEqualTo(resId);
    return this;
  }

  public NotificationAssert hasIconLevel(int level) {
    isNotNull();
    int actualLevel = actual.iconLevel;
    assertThat(actualLevel) //
        .overridingErrorMessage("Expected icon level <%s> but was <%s>", level, actualLevel) //
        .isEqualTo(level);
    return this;
  }

  public NotificationAssert hasLargeIcon(Bitmap bitmap) {
    isNotNull();
    assertThat(actual.largeIcon).isEqualTo(bitmap);
    return this;
  }

  public NotificationAssert hasLedColor(int color) {
    isNotNull();
    int actualColor = actual.ledARGB;
    assertThat(actualColor) //
        .overridingErrorMessage("Expected LED color <%s> but was <%s>", Integer.toHexString(color),
            Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return this;
  }

  public NotificationAssert hasLedOffMs(int length) {
    isNotNull();
    int actualLength = actual.ledOffMS;
    assertThat(actualLength) //
        .overridingErrorMessage("Expected LED off time (ms) <%s> but was <%s>", length,
            actualLength) //
        .isEqualTo(length);
    return this;
  }

  public NotificationAssert hasLedOnMs(int length) {
    isNotNull();
    int actualLength = actual.ledOnMS;
    assertThat(actualLength) //
        .overridingErrorMessage("Expected LED on time (ms) <%s> but was <%s>", length,
            actualLength) //
        .isEqualTo(length);
    return this;
  }

  public NotificationAssert hasNumber(int number) {
    isNotNull();
    int actualNumber = actual.number;
    assertThat(actualNumber) //
        .overridingErrorMessage("Expected number <%s> but was <%s>", number, actualNumber) //
        .isEqualTo(number);
    return this;
  }

  public NotificationAssert hasPriority(int priority) {
    isNotNull();
    int actualPriority = actual.priority;
    assertThat(actualPriority) //
        .overridingErrorMessage("Expected priority <%s> but was <%s>", priorityToString(priority),
            priorityToString(actualPriority)) //
        .isEqualTo(priority);
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
        .overridingErrorMessage("Expected when <%s> but was <%s>", when, actualWhen) //
        .isEqualTo(when);
    return this;
  }



  public static String priorityToString(int priority) {
    switch (priority) {
      case Notification.PRIORITY_MIN:
        return "min";
      case Notification.PRIORITY_LOW:
        return "low";
      case Notification.PRIORITY_DEFAULT:
        return "default";
      case Notification.PRIORITY_HIGH:
        return "high";
      case Notification.PRIORITY_MAX:
        return "max";
      default:
        throw new IllegalArgumentException("Unknown priority: " + priority);
    }
  }
}
