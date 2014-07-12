package org.assertj.android.playservices.api.location;

import com.google.android.gms.location.ActivityRecognitionResult;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class ActivityRecognitionResultAssert
    extends AbstractAssert<ActivityRecognitionResultAssert, ActivityRecognitionResult> {
  public ActivityRecognitionResultAssert(ActivityRecognitionResult actual) {
    super(actual, ActivityRecognitionResultAssert.class);
  }

  public ActivityRecognitionResultAssert hasElapsedRealtimeMillis(long millis) {
    isNotNull();
    long actualMillis = actual.getElapsedRealtimeMillis();
    assertThat(actualMillis) //
        .overridingErrorMessage("Expected elapsed realtime millis <%s> but was <%s>.", millis,
            actualMillis) //
        .isEqualTo(millis);
    return this;
  }

  public ActivityRecognitionResultAssert hasTime(long time) {
    isNotNull();
    long actualTime = actual.getTime();
    assertThat(actualTime) //
        .overridingErrorMessage("Expected time <%s> but was <%s>.", time, actualTime) //
        .isEqualTo(time);
    return this;
  }
}
