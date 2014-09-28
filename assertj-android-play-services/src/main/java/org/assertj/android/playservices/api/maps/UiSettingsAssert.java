package org.assertj.android.playservices.api.maps;

import com.google.android.gms.maps.UiSettings;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class UiSettingsAssert extends AbstractAssert<UiSettingsAssert, UiSettings> {
  public UiSettingsAssert(UiSettings actual) {
    super(actual, UiSettings.class);
  }

  public UiSettingsAssert hasCompassEnabled() {
    isNotNull();
    assertThat(actual.isCompassEnabled()) //
        .overridingErrorMessage("Expected compass to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public UiSettingsAssert hasCompassDisabled() {
    isNotNull();
    assertThat(actual.isCompassEnabled()) //
        .overridingErrorMessage("Expected compass to be disabled but was enabled.") //
        .isFalse();
    return this;
  }

  public UiSettingsAssert hasIndoorLevelPickerEnabled() {
    isNotNull();
    assertThat(actual.isIndoorLevelPickerEnabled()) //
        .overridingErrorMessage("Expected indoor level picker to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public UiSettingsAssert hasIndoorLevelPickerDisabled() {
    isNotNull();
    assertThat(actual.isIndoorLevelPickerEnabled()) //
        .overridingErrorMessage("Expected indoor level picker to be disabled but was enabled.") //
        .isFalse();
    return this;
  }

  public UiSettingsAssert hasMyLocationButtonEnabled() {
    isNotNull();
    assertThat(actual.isMyLocationButtonEnabled()) //
        .overridingErrorMessage("Expected my location button to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public UiSettingsAssert hasMyLocationButtonDisabled() {
    isNotNull();
    assertThat(actual.isMyLocationButtonEnabled()) //
        .overridingErrorMessage("Expected my location button to be disabled but was enabled.") //
        .isFalse();
    return this;
  }

  public UiSettingsAssert hasRotateGesturesEnabled() {
    isNotNull();
    assertThat(actual.isRotateGesturesEnabled()) //
        .overridingErrorMessage("Expected rotate gestures to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public UiSettingsAssert hasRotateGesturesDisabled() {
    isNotNull();
    assertThat(actual.isRotateGesturesEnabled()) //
        .overridingErrorMessage("Expected rotate gestures to be disabled but was enabled.") //
        .isFalse();
    return this;
  }

  public UiSettingsAssert hasScrollGesturesEnabled() {
    isNotNull();
    assertThat(actual.isScrollGesturesEnabled()) //
        .overridingErrorMessage("Expected scroll gestures to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public UiSettingsAssert hasScrollGesturesDisabled() {
    isNotNull();
    assertThat(actual.isScrollGesturesEnabled()) //
        .overridingErrorMessage("Expected scroll gestures to be disabled but was enabled.") //
        .isFalse();
    return this;
  }

  public UiSettingsAssert hasTiltGesturesEnabled() {
    isNotNull();
    assertThat(actual.isTiltGesturesEnabled()) //
        .overridingErrorMessage("Expected tilt gestures to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public UiSettingsAssert hasTiltGesturesDisabled() {
    isNotNull();
    assertThat(actual.isTiltGesturesEnabled()) //
        .overridingErrorMessage("Expected tilt gestures to be disabled but was enabled.") //
        .isFalse();
    return this;
  }

  public UiSettingsAssert hasZoomControlsEnabled() {
    isNotNull();
    assertThat(actual.isZoomControlsEnabled()) //
        .overridingErrorMessage("Expected zoom controls to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public UiSettingsAssert hasZoomControlsDisabled() {
    isNotNull();
    assertThat(actual.isZoomControlsEnabled()) //
        .overridingErrorMessage("Expected zoom controls to be disabled but was enabled.") //
        .isFalse();
    return this;
  }

  public UiSettingsAssert hasZoomGesturesEnabled() {
    isNotNull();
    assertThat(actual.isZoomGesturesEnabled()) //
        .overridingErrorMessage("Expected zoom gestures to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public UiSettingsAssert hasZoomGesturesDisabled() {
    isNotNull();
    assertThat(actual.isZoomGesturesEnabled()) //
        .overridingErrorMessage("Expected zoom gestures to be disabled but was enabled.") //
        .isFalse();
    return this;
  }
}
