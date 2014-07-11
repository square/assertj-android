package org.assertj.android.api.app;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link PendingIntent} instances. */
public class PendingIntentAssert extends AbstractAssert<PendingIntentAssert, PendingIntent> {
  public PendingIntentAssert(PendingIntent actual) {
    super(actual, PendingIntentAssert.class);
  }

  @TargetApi(JELLY_BEAN_MR1)
  public PendingIntentAssert hasCreatorPackage(String packageName) {
    isNotNull();
    String actualPackage = actual.getCreatorPackage();
    assertThat(actualPackage) //
        .overridingErrorMessage("Expected creator package <%s> but was <%s>.", packageName,
            actualPackage) //
        .isEqualTo(packageName);
    return this;
  }

  @TargetApi(JELLY_BEAN_MR1)
  public PendingIntentAssert hasCreatorUid(int uid) {
    isNotNull();
    int actualUid = actual.getCreatorUid();
    assertThat(actualUid) //
        .overridingErrorMessage("Expected creator UID <%s> but was <%s>.", uid, actualUid) //
        .isEqualTo(uid);
    return this;
  }

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
