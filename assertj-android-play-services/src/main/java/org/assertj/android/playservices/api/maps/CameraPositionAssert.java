package org.assertj.android.playservices.api.maps;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class CameraPositionAssert extends AbstractAssert<CameraPositionAssert, CameraPosition> {
  public CameraPositionAssert(CameraPosition actual) {
    super(actual, CameraPosition.class);
  }

  public CameraPositionAssert hasBearing(float bearing) {
    isNotNull();
    float actualBearing = actual.bearing;
    assertThat(actualBearing) //
        .overridingErrorMessage("Expected bearing <%s> but was <%s>.", bearing, actualBearing) //
        .isEqualTo(bearing);
    return this;
  }

  public CameraPositionAssert hasTarget(LatLng target) {
    isNotNull();
    LatLng actualTarget = actual.target;
    assertThat(actualTarget) //
        .overridingErrorMessage("Expected target <%s> but was <%s>.", target, actualTarget) //
        .isEqualTo(target);
    return this;
  }

  public CameraPositionAssert hasTilt(float tilt) {
    isNotNull();
    float actualTilt = actual.tilt;
    assertThat(actualTilt) //
        .overridingErrorMessage("Expected tilt <%s> but was <%s>.", tilt, actualTilt) //
        .isEqualTo(tilt);
    return this;
  }

  public CameraPositionAssert hasZoom(float zoom) {
    isNotNull();
    float actualZoom = actual.zoom;
    assertThat(actualZoom) //
        .overridingErrorMessage("Expected zoom <%s> but was <%s>.", zoom, actualZoom) //
        .isEqualTo(zoom);
    return this;
  }
}
