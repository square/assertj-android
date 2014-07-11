// Copyright 2013 Square, Inc.
package org.assertj.android.api.location;

import android.location.LocationProvider;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.android.api.location.CriteriaAssert.accuracyRequirementToString;
import static org.assertj.android.api.location.CriteriaAssert.powerRequirementToString;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link LocationProvider} instances. */
public class LocationProviderAssert
    extends AbstractAssert<LocationProviderAssert, LocationProvider> {
  public LocationProviderAssert(LocationProvider actual) {
    super(actual, LocationProviderAssert.class);
  }

  public LocationProviderAssert hasAccuracy(int accuracy) {
    isNotNull();
    int actualAccuracy = actual.getAccuracy();
    assertThat(actualAccuracy) //
        .overridingErrorMessage("Expected accuracy <%s> but was <%s>.",
            accuracyRequirementToString(accuracy), accuracyRequirementToString(actualAccuracy)) //
        .isEqualTo(accuracy);
    return this;
  }

  public LocationProviderAssert hasName(String name) {
    isNotNull();
    String actualName = actual.getName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected name <%s> but was <%s>.", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public LocationProviderAssert hasPowerRequirement(int requirement) {
    isNotNull();
    int actualRequirement = actual.getPowerRequirement();
    assertThat(actualRequirement) //
        .overridingErrorMessage("Expected power requirement <%s> but was <%s>.",
            powerRequirementToString(requirement), powerRequirementToString(actualRequirement)) //
        .isEqualTo(requirement);
    return this;
  }

  public LocationProviderAssert hasMonetaryCost() {
    isNotNull();
    assertThat(actual.hasMonetaryCost()) //
        .overridingErrorMessage("Expected to have monetary cost but did not.") //
        .isTrue();
    return this;
  }

  public LocationProviderAssert hasNoMonetaryCost() {
    isNotNull();
    assertThat(actual.hasMonetaryCost()) //
        .overridingErrorMessage("Expected to not have monetary cost but did.") //
        .isFalse();
    return this;
  }

  public LocationProviderAssert hasCellRequirement() {
    isNotNull();
    assertThat(actual.requiresCell()) //
        .overridingErrorMessage("Expected to require cell network but did not.") //
        .isTrue();
    return this;
  }

  public LocationProviderAssert hasNoCellRequirement() {
    isNotNull();
    assertThat(actual.requiresCell()) //
        .overridingErrorMessage("Expected to not require cell network but did.") //
        .isFalse();
    return this;
  }

  public LocationProviderAssert hasNetworkRequirement() {
    isNotNull();
    assertThat(actual.requiresNetwork()) //
        .overridingErrorMessage("Expected to require network but did not.") //
        .isTrue();
    return this;
  }

  public LocationProviderAssert hasNoNetworkRequirement() {
    isNotNull();
    assertThat(actual.requiresNetwork()) //
        .overridingErrorMessage("Expected to not require network but did.") //
        .isFalse();
    return this;
  }

  public LocationProviderAssert hasSatelliteRequirement() {
    isNotNull();
    assertThat(actual.requiresSatellite()) //
        .overridingErrorMessage("Expected to require satellites but did not.") //
        .isTrue();
    return this;
  }

  public LocationProviderAssert hasNoSatelliteRequirement() {
    isNotNull();
    assertThat(actual.requiresSatellite()) //
        .overridingErrorMessage("Expected to not require satellites but did.") //
        .isFalse();
    return this;
  }

  public LocationProviderAssert hasAltitudeSupport() {
    isNotNull();
    assertThat(actual.supportsAltitude()) //
        .overridingErrorMessage("Expected to support altitude but did not.") //
        .isTrue();
    return this;
  }

  public LocationProviderAssert hasNoAltitudeSupport() {
    isNotNull();
    assertThat(actual.supportsAltitude()) //
        .overridingErrorMessage("Expected to not support altitude but did.") //
        .isFalse();
    return this;
  }

  public LocationProviderAssert hasBearingSupport() {
    isNotNull();
    assertThat(actual.supportsBearing()) //
        .overridingErrorMessage("Expected to support bearing but did not.") //
        .isTrue();
    return this;
  }

  public LocationProviderAssert hasNoBearingSupport() {
    isNotNull();
    assertThat(actual.supportsBearing()) //
        .overridingErrorMessage("Expected to not support bearing but did.") //
        .isFalse();
    return this;
  }

  public LocationProviderAssert hasSpeedSupport() {
    isNotNull();
    assertThat(actual.supportsSpeed()) //
        .overridingErrorMessage("Expected to support speed but did not.") //
        .isTrue();
    return this;
  }

  public LocationProviderAssert hasNoSpeedSupport() {
    isNotNull();
    assertThat(actual.supportsSpeed()) //
        .overridingErrorMessage("Expected to not support speed but did.") //
        .isFalse();
    return this;
  }
}
