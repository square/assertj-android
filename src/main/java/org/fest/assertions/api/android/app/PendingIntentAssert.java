package org.fest.assertions.api.android.app;

import android.app.PendingIntent;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link PendingIntent} instances. */
public class PendingIntentAssert extends AbstractAssert<PendingIntentAssert, PendingIntent> {
  public PendingIntentAssert(PendingIntent actual) {
    super(actual, PendingIntentAssert.class);
  }

  // TODO API 17
  //public PendingIntentAssert hasCreatorPackage(String package) {
  //  isNotNull();
  //  String actualPackage = actual.getCreatorPackage();
  //  assertThat(actualPackage) //
  //      .overridingErrorMessage("Expected creator package <%s> but was <%s>.", package,
  //          actualPackage) //
  //      .isEqualTo(package);
  //  return this;
  //}
  //
  //public PendingIntentAssert hasCreatorUid(int uid) {
  //  isNotNull();
  //  int actualUid = actual.getCreatorUid();
  //  assertThat(actualUid) //
  //      .overridingErrorMessage("Expected creator UID <%s> but was <%s>.", uid, actualUid) //
  //      .isEqualTo(uid);
  //  return this;
  //}

  public PendingIntentAssert hasTargetPackage(String targetPackage) {
    isNotNull();
    String actualPackage = actual.getTargetPackage();
    assertThat(actualPackage) //
        .overridingErrorMessage("Expected target package <%s> but was <%s>.", targetPackage,
            actualPackage) //
        .isEqualTo(targetPackage);
    return this;
  }
}
