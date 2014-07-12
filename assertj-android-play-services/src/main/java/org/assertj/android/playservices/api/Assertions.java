// Copyright 2014 Square, Inc.
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

  private Assertions() {
    throw new AssertionError("No instances.");
  }
}
