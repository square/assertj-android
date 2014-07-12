package org.assertj.android.playservices.api.location;

import com.google.android.gms.location.LocationRequest;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class LocationRequestAssert extends AbstractAssert<LocationRequestAssert, LocationRequest> {
  public LocationRequestAssert(LocationRequest actual) {
    super(actual, LocationRequestAssert.class);
  }

  public LocationRequestAssert hasExpirationTime(long time) {
    isNotNull();
    long actualTime = actual.getExpirationTime();
    assertThat(actualTime) //
        .overridingErrorMessage("Expected expiration time <%s> but was <%s>.", time, actualTime) //
        .isEqualTo(time);
    return this;
  }

  public LocationRequestAssert hasFastestInterval(long interval) {
    isNotNull();
    long actualInterval = actual.getFastestInterval();
    assertThat(actualInterval) //
        .overridingErrorMessage("Expected fastest interval <%s> but was <%s>.", interval,
            actualInterval) //
        .isEqualTo(interval);
    return this;
  }

  public LocationRequestAssert hasInterval(long interval) {
    isNotNull();
    long actualInterval = actual.getInterval();
    assertThat(actualInterval) //
        .overridingErrorMessage("Expected interval <%s> but was <%s>.", interval, actualInterval) //
        .isEqualTo(interval);
    return this;
  }

  public LocationRequestAssert hasUpdates(int updates) {
    isNotNull();
    int actualUpdates = actual.getNumUpdates();
    assertThat(actualUpdates) //
        .overridingErrorMessage("Expected updates <%s> but was <%s>.", updates, actualUpdates) //
        .isEqualTo(updates);
    return this;
  }

  public LocationRequestAssert hasPriority(int priority) {
    isNotNull();
    int actualPriority = actual.getPriority();
    assertThat(actualPriority) //
        .overridingErrorMessage("Expected priority <%s> but was <%s>.", priority, actualPriority) //
        .isEqualTo(priority);
    return this;
  }

  public LocationRequestAssert hasSmallestDisplacement(float displacement) {
    isNotNull();
    float actualDisplacement = actual.getSmallestDisplacement();
    assertThat(actualDisplacement) //
        .overridingErrorMessage("Expected smallest displacement <%s> but was <%s>.", displacement,
            actualDisplacement) //
        .isEqualTo(displacement);
    return this;
  }
}
