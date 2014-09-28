package org.assertj.android.playservices.api.maps;

import com.google.android.gms.maps.UiSettings;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class UiSettingsAssert extends AbstractAssert<UiSettingsAssert, UiSettings> {
  public UiSettingsAssert(UiSettings actual) {
    super(actual, UiSettings.class);
  }

  public UiSettingsAssert hasCompassEnabled(boolean enabled) {
    isNotNull();
    boolean actualEnabled = actual.isCompassEnabled();
    assertThat(actualEnabled) //
        .overridingErrorMessage("Expected compass enabled <%s> but was <%s>.", enabled,
            actualEnabled) //
        .isEqualTo(enabled);
    return this;
  }

  public UiSettingsAssert hasIndoorLevelPickerEnabled(boolean enabled) {
    isNotNull();
    boolean actualEnabled = actual.isIndoorLevelPickerEnabled();
    assertThat(actualEnabled) //
        .overridingErrorMessage("Expected indoor level picker enabled <%s> but was <%s>.", enabled,
            actualEnabled) //
        .isEqualTo(enabled);
    return this;
  }

  public UiSettingsAssert hasMyLocationButtonEnabled(boolean enabled) {
    isNotNull();
    boolean actualEnabled = actual.isMyLocationButtonEnabled();
    assertThat(actualEnabled) //
        .overridingErrorMessage("Expected my location button enabled <%s> but was <%s>.", enabled,
            actualEnabled) //
        .isEqualTo(enabled);
    return this;
  }

  public UiSettingsAssert hasRotateGesturesEnabled(boolean enabled) {
    isNotNull();
    boolean actualEnabled = actual.isRotateGesturesEnabled();
    assertThat(actualEnabled) //
        .overridingErrorMessage("Expected rotate gestures enabled <%s> but was <%s>.", enabled,
            actualEnabled) //
        .isEqualTo(enabled);
    return this;
  }

  public UiSettingsAssert hasScrollGesturesEnabled(boolean enabled) {
    isNotNull();
    boolean actualEnabled = actual.isScrollGesturesEnabled();
    assertThat(actualEnabled) //
        .overridingErrorMessage("Expected scroll gestures enabled <%s> but was <%s>.", enabled,
            actualEnabled) //
        .isEqualTo(enabled);
    return this;
  }

  public UiSettingsAssert hasTiltGesturesEnabled(boolean enabled) {
    isNotNull();
    boolean actualEnabled = actual.isTiltGesturesEnabled();
    assertThat(actualEnabled) //
        .overridingErrorMessage("Expected tilt gestures enabled <%s> but was <%s>.", enabled,
            actualEnabled) //
        .isEqualTo(enabled);
    return this;
  }

  public UiSettingsAssert hasZoomControlsEnabled(boolean enabled) {
    isNotNull();
    boolean actualEnabled = actual.isZoomControlsEnabled();
    assertThat(actualEnabled) //
        .overridingErrorMessage("Expected zoom controls enabled <%s> but was <%s>.", enabled,
            actualEnabled) //
        .isEqualTo(enabled);
    return this;
  }

  public UiSettingsAssert hasZoomGesturesEnabled(boolean enabled) {
    isNotNull();
    boolean actualEnabled = actual.isZoomGesturesEnabled();
    assertThat(actualEnabled) //
        .overridingErrorMessage("Expected zoom gestures enabled <%s> but was <%s>.", enabled,
            actualEnabled) //
        .isEqualTo(enabled);
    return this;
  }
}
