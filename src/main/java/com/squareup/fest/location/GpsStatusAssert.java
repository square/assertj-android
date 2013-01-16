// Copyright 2013 Square, Inc.
package com.squareup.fest.location;

import android.location.GpsStatus;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link GpsStatus} instances. */
public class GpsStatusAssert extends AbstractAssert<GpsStatusAssert, GpsStatus> {
  public GpsStatusAssert(GpsStatus actual) {
    super(actual, GpsStatusAssert.class);
  }

  public GpsStatusAssert hasMaximumSatellites(int count) {
    isNotNull();
    int actualCount = actual.getMaxSatellites();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected maximum satellites <%s> but was <%s>.", count,
            actualCount) //
        .isEqualTo(count);
    return this;
  }

  public GpsStatusAssert hasTimeToFirstFix(int time) {
    isNotNull();
    int actualTime = actual.getTimeToFirstFix();
    assertThat(actualTime) //
        .overridingErrorMessage("Expected time to first fix <%s> but was <%s>.", time,
            actualTime) //
        .isEqualTo(time);
    return this;
  }
}
