package org.assertj.android.playservices.api.location;

import com.google.android.gms.location.DetectedActivity;
import org.assertj.core.api.AbstractAssert;

import static com.google.android.gms.location.DetectedActivity.IN_VEHICLE;
import static com.google.android.gms.location.DetectedActivity.ON_BICYCLE;
import static com.google.android.gms.location.DetectedActivity.ON_FOOT;
import static com.google.android.gms.location.DetectedActivity.RUNNING;
import static com.google.android.gms.location.DetectedActivity.STILL;
import static com.google.android.gms.location.DetectedActivity.TILTING;
import static com.google.android.gms.location.DetectedActivity.UNKNOWN;
import static com.google.android.gms.location.DetectedActivity.WALKING;
import static org.assertj.android.internal.BitmaskUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

public class DetectedActivityAssert
    extends AbstractAssert<DetectedActivityAssert, DetectedActivity> {
  public DetectedActivityAssert(DetectedActivity actual) {
    super(actual, DetectedActivityAssert.class);
  }

  public DetectedActivityAssert hasConfidence(int confidence) {
    isNotNull();
    int actualConfidence = actual.getConfidence();
    assertThat(actualConfidence) //
        .overridingErrorMessage("Expected confidence <%s> but was <%s>.", confidence,
            actualConfidence) //
        .isEqualTo(confidence);
    return this;
  }

  public DetectedActivityAssert hasType(@DetectedActivityType int type) {
    isNotNull();
    int actualType = actual.getType();
    //noinspection ResourceType
    assertThat(actualType) //
        .overridingErrorMessage("Expected type <%s> but was <%s>.", typeToString(type),
            typeToString(actualType)) //
        .isEqualTo(type);
    return this;
  }

  public static String typeToString(@DetectedActivityType int type) {
    return buildNamedValueString(type)
        .value(IN_VEHICLE, "in vehicle")
        .value(ON_BICYCLE, "on bicycle")
        .value(ON_FOOT, "on foot")
        .value(RUNNING, "running")
        .value(STILL, "still")
        .value(TILTING, "tilting")
        .value(UNKNOWN, "unknown")
        .value(WALKING, "walking")
        .get();
  }
}
