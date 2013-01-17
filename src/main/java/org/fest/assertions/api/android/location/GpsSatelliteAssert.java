// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.location;

import android.location.GpsSatellite;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link GpsSatellite} instances. */
public class GpsSatelliteAssert extends AbstractAssert<GpsSatelliteAssert, GpsSatellite> {
  public GpsSatelliteAssert(GpsSatellite actual) {
    super(actual, GpsSatelliteAssert.class);
  }

  public GpsSatelliteAssert hasAzimuth(float azimuth) {
    isNotNull();
    float actualAzimuth = actual.getAzimuth();
    assertThat(actualAzimuth) //
        .overridingErrorMessage("Expected azimuth <%s> but was <%s>.", azimuth, actualAzimuth) //
        .isEqualTo(azimuth);
    return this;
  }

  public GpsSatelliteAssert hasElevation(float elevation) {
    isNotNull();
    float actualElevation = actual.getElevation();
    assertThat(actualElevation) //
        .overridingErrorMessage("Expected elevation <%s> but was <%s>.", elevation, actualElevation) //
        .isEqualTo(elevation);
    return this;
  }

  public GpsSatelliteAssert hasPrn(int prn) {
    isNotNull();
    int actualPrn = actual.getPrn();
    assertThat(actualPrn) //
        .overridingErrorMessage("Expected PRN <%s> but was <%s>.", prn, actualPrn) //
        .isEqualTo(prn);
    return this;
  }

  public GpsSatelliteAssert hasSnr(float snr) {
    isNotNull();
    float actualSnr = actual.getSnr();
    assertThat(actualSnr) //
        .overridingErrorMessage("Expected SNR <%s> but was <%s>.", snr, actualSnr) //
        .isEqualTo(snr);
    return this;
  }

  public GpsSatelliteAssert hasAlmanac() {
    isNotNull();
    assertThat(actual.hasAlmanac()) //
        .overridingErrorMessage("Expected to have almanac but did not.") //
        .isTrue();
    return this;
  }

  public GpsSatelliteAssert hasNoAlmanac() {
    isNotNull();
    assertThat(actual.hasAlmanac()) //
        .overridingErrorMessage("Expected to not have almanac but did.") //
        .isFalse();
    return this;
  }

  public GpsSatelliteAssert hasEphemeris() {
    isNotNull();
    assertThat(actual.hasEphemeris()) //
        .overridingErrorMessage("Expected to have ephemeris but did not.") //
        .isTrue();
    return this;
  }

  public GpsSatelliteAssert hasNotEphemeris() {
    isNotNull();
    assertThat(actual.hasEphemeris()) //
        .overridingErrorMessage("Expected to not have ephemeris but did.") //
        .isFalse();
    return this;
  }

  public GpsSatelliteAssert isUsedInFix() {
    isNotNull();
    assertThat(actual.usedInFix()) //
        .overridingErrorMessage("Expected to be used in fix but was not.") //
        .isTrue();
    return this;
  }

  public GpsSatelliteAssert isNotUsedInFix() {
    isNotNull();
    assertThat(actual.usedInFix()) //
        .overridingErrorMessage("Expected to not be used in fix but was.") //
        .isFalse();
    return this;
  }
}
