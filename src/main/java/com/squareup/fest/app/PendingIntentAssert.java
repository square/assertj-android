package com.squareup.fest.app;

import android.app.PendingIntent;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public class PendingIntentAssert extends AbstractAssert<PendingIntentAssert, PendingIntent> {
  public PendingIntentAssert(PendingIntent actual) {
    super(actual, PendingIntentAssert.class);
  }

  // TODO API 17
  //public PendingIntentAssert hasCreatorPackage(String creatorPackage) {
  //  isNotNull();
  //  assertThat(actual.getCreatorPackage()).isEqualTo(creatorPackage);
  //  return this;
  //}
  //
  //public PendingIntentAssert hasCreatorUid(int uid) {
  //  isNotNull();
  //  assertThat(actual.getCreatorUid()).isEqualTo(uid);
  //  return this;
  //}

  public PendingIntentAssert hasTargetPackage(String targetPackage) {
    isNotNull();
    String actualPackage = actual.getTargetPackage();
    assertThat(actualPackage) //
        .overridingErrorMessage("Expected target package <%s> but was <%s>", targetPackage,
            actualPackage) //
        .isEqualTo(targetPackage);
    return this;
  }
}
