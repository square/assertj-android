// Copyright 2015 Square, Inc.
//
// This class is generated. Do not modify directly!
package org.assertj.android.playservices.api;

/** Assertions for testing Android classes. */
@SuppressWarnings("deprecation")
public final class Assertions {
  public static org.assertj.android.playservices.api.location.ActivityRecognitionResultAssert assertThat(
      com.google.android.gms.location.ActivityRecognitionResult actual) {
    return new org.assertj.android.playservices.api.location.ActivityRecognitionResultAssert(actual);
  }

  public static org.assertj.android.playservices.api.location.DetectedActivityAssert assertThat(
      com.google.android.gms.location.DetectedActivity actual) {
    return new org.assertj.android.playservices.api.location.DetectedActivityAssert(actual);
  }

  public static org.assertj.android.playservices.api.location.LocationRequestAssert assertThat(
      com.google.android.gms.location.LocationRequest actual) {
    return new org.assertj.android.playservices.api.location.LocationRequestAssert(actual);
  }

  public static org.assertj.android.playservices.api.maps.CameraPositionAssert assertThat(
      com.google.android.gms.maps.model.CameraPosition actual) {
    return new org.assertj.android.playservices.api.maps.CameraPositionAssert(actual);
  }

  public static org.assertj.android.playservices.api.maps.GoogleMapAssert assertThat(
      com.google.android.gms.maps.GoogleMap actual) {
    return new org.assertj.android.playservices.api.maps.GoogleMapAssert(actual);
  }

  public static org.assertj.android.playservices.api.maps.MarkerAssert assertThat(
      com.google.android.gms.maps.model.Marker actual) {
    return new org.assertj.android.playservices.api.maps.MarkerAssert(actual);
  }

  public static org.assertj.android.playservices.api.maps.UiSettingsAssert assertThat(
      com.google.android.gms.maps.UiSettings actual) {
    return new org.assertj.android.playservices.api.maps.UiSettingsAssert(actual);
  }

  private Assertions() {
    throw new AssertionError("No instances.");
  }
}
