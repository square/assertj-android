package org.fest.assertions.api.android.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import org.fest.assertions.api.android.Utils;
import java.util.ArrayList;
import java.util.List;
import org.fest.assertions.api.AbstractAssert;

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

  public NotificationAssert hasFullScreenIntent(PendingIntent intent) {
    isNotNull();
    assertThat(actual.fullScreenIntent).isEqualTo(intent);
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

  public NotificationAssert hasPriority(int priority) {
    isNotNull();
    int actualPriority = actual.priority;
    assertThat(actualPriority) //
        .overridingErrorMessage("Expected priority <%s> but was <%s>.", priorityToString(priority),
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
        .overridingErrorMessage("Expected when <%s> but was <%s>.", when, actualWhen) //
        .isEqualTo(when);
    return this;
  }

  private static String flagsToString(int flags) {
    if (flags == 0) {
      return "none";
    }
    List<String> parts = new ArrayList<String>();
    if ((flags & FLAG_AUTO_CANCEL) != 0) {
      parts.add("autoCancel");
    }
    if ((flags & FLAG_FOREGROUND_SERVICE) != 0) {
      parts.add("foregroundService");
    }
    if ((flags & FLAG_INSISTENT) != 0) {
      parts.add("insistent");
    }
    if ((flags & FLAG_NO_CLEAR) != 0) {
      parts.add("noClear");
    }
    if ((flags & FLAG_ONGOING_EVENT) != 0) {
      parts.add("ongoingEvent");
    }
    if ((flags & FLAG_ONLY_ALERT_ONCE) != 0) {
      parts.add("onlyAlertOnce");
    }
    if ((flags & FLAG_SHOW_LIGHTS) != 0) {
      parts.add("showLights");
    }
    if ((flags & FLAG_HIGH_PRIORITY) != 0) {
      parts.add("highPriority");
    }
    return Utils.join(parts);
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
