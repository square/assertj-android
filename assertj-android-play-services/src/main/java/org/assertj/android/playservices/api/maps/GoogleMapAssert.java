package org.assertj.android.playservices.api.maps;

import com.google.android.gms.maps.GoogleMap;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleMapAssert extends AbstractAssert<GoogleMapAssert, GoogleMap> {
  public GoogleMapAssert(GoogleMap actual) {
    super(actual, GoogleMapAssert.class);
  }

  public GoogleMapAssert hasMapType(int mapType) {
    isNotNull();
    int actualMapType = actual.getMapType();
    assertThat(actualMapType) //
        .overridingErrorMessage("Expected map type <%s> but was <%s>.", mapType, actualMapType) //
        .isEqualTo(mapType);
    return this;
  }

  public GoogleMapAssert hasMaxZoomLevel(float zoomLevel) {
    isNotNull();
    float actualZoomLevel = actual.getMaxZoomLevel();
    assertThat(actualZoomLevel) //
        .overridingErrorMessage("Expected maximum zoom level <%s> but was <%s>.", zoomLevel,
            actualZoomLevel) //
        .isEqualTo(zoomLevel);
    return this;
  }

  public GoogleMapAssert hasMinZoomLevel(float zoomLevel) {
    isNotNull();
    float actualZoomLevel = actual.getMinZoomLevel();
    assertThat(actualZoomLevel) //
        .overridingErrorMessage("Expected minimum zoom level <%s> but was <%s>.", zoomLevel,
            actualZoomLevel) //
        .isEqualTo(zoomLevel);
    return this;
  }

  public GoogleMapAssert hasBuildingsEnabled() {
    isNotNull();
    assertThat(actual.isBuildingsEnabled()) //
        .overridingErrorMessage("Expected buildings to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public GoogleMapAssert hasBuildingsDisabled() {
    isNotNull();
    assertThat(actual.isBuildingsEnabled()) //
        .overridingErrorMessage("Expected buildings to be disabled but was enabled.") //
        .isFalse();
    return this;
  }

  public GoogleMapAssert hasIndoorEnabled() {
    isNotNull();
    assertThat(actual.isIndoorEnabled()) //
        .overridingErrorMessage("Expected indoor to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public GoogleMapAssert hasIndoorDisabled() {
    isNotNull();
    assertThat(actual.isIndoorEnabled()) //
        .overridingErrorMessage("Expected indoor to be disabled but was enabled.") //
        .isFalse();
    return this;
  }

  public GoogleMapAssert hasMyLocationEnabled() {
    isNotNull();
    assertThat(actual.isMyLocationEnabled()) //
        .overridingErrorMessage("Expected my location to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public GoogleMapAssert hasMyLocationDisabled() {
    isNotNull();
    assertThat(actual.isMyLocationEnabled()) //
        .overridingErrorMessage("Expected my location to be disabled but was enabled.") //
        .isFalse();
    return this;
  }

  public GoogleMapAssert hasTrafficEnabled() {
    isNotNull();
    assertThat(actual.isTrafficEnabled()) //
        .overridingErrorMessage("Expected traffic to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public GoogleMapAssert hasTrafficDisabled() {
    isNotNull();
    assertThat(actual.isTrafficEnabled()) //
        .overridingErrorMessage("Expected traffic to be disabled but was enabled.") //
        .isFalse();
    return this;
  }
}
