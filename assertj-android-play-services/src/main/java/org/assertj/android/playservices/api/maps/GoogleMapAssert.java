package org.assertj.android.playservices.api.maps;

import com.google.android.gms.maps.GoogleMap;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleMapAssert extends AbstractAssert<GoogleMapAssert, GoogleMap> {
  public GoogleMapAssert(GoogleMap actual) {
    super(actual, GoogleMap.class);
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

  public GoogleMapAssert hasBuildingsEnabled(boolean enabled) {
    isNotNull();
    boolean actualEnabled = actual.isBuildingsEnabled();
    assertThat(actualEnabled) //
        .overridingErrorMessage("Expected buildings enabled <%s> but was <%s>.", enabled,
            actualEnabled) //
        .isEqualTo(enabled);
    return this;
  }

  public GoogleMapAssert hasIndoorEnabled(boolean enabled) {
    isNotNull();
    boolean actualEnabled = actual.isIndoorEnabled();
    assertThat(actualEnabled) //
        .overridingErrorMessage("Expected indoor enabled <%s> but was <%s>.", enabled,
            actualEnabled) //
        .isEqualTo(enabled);
    return this;
  }

  public GoogleMapAssert hasMyLocationEnabled(boolean enabled) {
    isNotNull();
    boolean actualEnabled = actual.isMyLocationEnabled();
    assertThat(actualEnabled) //
        .overridingErrorMessage("Expected my location enabled <%s> but was <%s>.", enabled,
            actualEnabled) //
        .isEqualTo(enabled);
    return this;
  }

  public GoogleMapAssert hasTrafficEnabled(boolean enabled) {
    isNotNull();
    boolean actualEnabled = actual.isTrafficEnabled();
    assertThat(actualEnabled) //
        .overridingErrorMessage("Expected traffic enabled <%s> but was <%s>.", enabled,
            actualEnabled) //
        .isEqualTo(enabled);
    return this;
  }
}
