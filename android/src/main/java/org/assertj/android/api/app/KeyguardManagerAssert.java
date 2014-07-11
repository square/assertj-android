package org.assertj.android.api.app;

import android.annotation.TargetApi;
import android.app.KeyguardManager;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link KeyguardManager} instances. */
public class KeyguardManagerAssert extends AbstractAssert<KeyguardManagerAssert, KeyguardManager> {
  public KeyguardManagerAssert(KeyguardManager actual) {
    super(actual, KeyguardManagerAssert.class);
  }

  public KeyguardManagerAssert hasRestrictedInputMode() {
    isNotNull();
    assertThat(actual.inKeyguardRestrictedInputMode()) //
        .overridingErrorMessage("Expected restricted input mode but was unrestricted.") //
        .isTrue();
    return this;
  }

  public KeyguardManagerAssert hasUnrestrictedInputMode() {
    isNotNull();
    assertThat(actual.inKeyguardRestrictedInputMode()) //
        .overridingErrorMessage("Expected unrestricted input mode but was restricted.") //
        .isFalse();
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public KeyguardManagerAssert hasLockedKeyguard() {
    isNotNull();
    assertThat(actual.isKeyguardLocked()) //
        .overridingErrorMessage("Expected locked keyguard but was unlocked.") //
        .isTrue();
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public KeyguardManagerAssert hasUnlockedKeyguard() {
    isNotNull();
    assertThat(actual.isKeyguardLocked()) //
        .overridingErrorMessage("Expected unlocked keyguard but was locked.") //
        .isFalse();
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public KeyguardManagerAssert hasSecureKeyguard() {
    isNotNull();
    assertThat(actual.isKeyguardSecure()) //
        .overridingErrorMessage("Expected secure keyguard but was insecure.") //
        .isTrue();
    return this;
  }

  @TargetApi(JELLY_BEAN)
  public KeyguardManagerAssert hasInsecureKeyguard() {
    isNotNull();
    assertThat(actual.isKeyguardSecure()) //
        .overridingErrorMessage("Expected insecure keyguard but was secure.") //
        .isFalse();
    return this;
  }
}
