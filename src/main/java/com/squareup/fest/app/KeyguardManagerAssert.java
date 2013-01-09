package com.squareup.fest.app;

import android.app.KeyguardManager;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public class KeyguardManagerAssert extends AbstractAssert<KeyguardManagerAssert, KeyguardManager> {
  public KeyguardManagerAssert(KeyguardManager actual) {
    super(actual, KeyguardManagerAssert.class);
  }

  public KeyguardManagerAssert hasRestrictedInputMode() {
    isNotNull();
    assertThat(actual.inKeyguardRestrictedInputMode()) //
        .overridingErrorMessage("Expected restricted input mode but was unrestricted") //
        .isTrue();
    return this;
  }

  public KeyguardManagerAssert hasUnrestrictedInputMode() {
    isNotNull();
    assertThat(actual.inKeyguardRestrictedInputMode()) //
        .overridingErrorMessage("Expected unrestricted input mode but was restricted") //
        .isFalse();
    return this;
  }

  public KeyguardManagerAssert hasLockedKeyguard() {
    isNotNull();
    assertThat(actual.isKeyguardLocked()) //
        .overridingErrorMessage("Expected locked keyguard but was unlocked") //
        .isTrue();
    return this;
  }

  public KeyguardManagerAssert hasUnlockedKeyguard() {
    isNotNull();
    assertThat(actual.isKeyguardLocked()) //
        .overridingErrorMessage("Expected unlocked keyguard but was locked") //
        .isFalse();
    return this;
  }

  public KeyguardManagerAssert hasSecureKeyguard() {
    isNotNull();
    assertThat(actual.isKeyguardSecure()) //
        .overridingErrorMessage("Expected secure keyguard but was unsecure") //
        .isTrue();
    return this;
  }

  public KeyguardManagerAssert hasUnsecureKeyguard() {
    isNotNull();
    assertThat(actual.isKeyguardSecure()) //
        .overridingErrorMessage("Expected unsecure keygaurd but was secure") //
        .isFalse();
    return this;
  }
}
