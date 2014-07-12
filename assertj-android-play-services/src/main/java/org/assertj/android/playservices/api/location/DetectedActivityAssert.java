package org.assertj.android.playservices.api.location;

import com.google.android.gms.location.DetectedActivity;
import org.assertj.core.api.AbstractAssert;

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

  public DetectedActivityAssert hasType(int type) {
    isNotNull();
    int actualType = actual.getType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected type <%s> but was <%s>.", typeToString(type),
            typeToString(actualType)) //
        .isEqualTo(type);
    return this;
  }

  public static String typeToString(int type) {
    switch (type) {
      case DetectedActivity.IN_VEHICLE:
        return "in_vehicle";
      case DetectedActivity.ON_BICYCLE:
        return "on_bicycle";
      case DetectedActivity.ON_FOOT:
        return "on_foot";
      case DetectedActivity.RUNNING:
        return "running";
      case DetectedActivity.STILL:
        return "still";
      case DetectedActivity.TILTING:
        return "tilting";
      case DetectedActivity.UNKNOWN:
        return "unknown";
      case DetectedActivity.WALKING:
        return "walking";
      default:
        throw new IllegalArgumentException("Unknown type: " + type);
    }
  }
}
