package org.assertj.android.mediarouter.v7.api.media;

import android.support.v7.media.RemotePlaybackClient;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class RemotePlaybackClientAssert
    extends AbstractAssert<RemotePlaybackClientAssert, RemotePlaybackClient> {
  public RemotePlaybackClientAssert(RemotePlaybackClient actual) {
    super(actual, RemotePlaybackClientAssert.class);
  }

  public RemotePlaybackClientAssert hasSessionId(String sessionId) {
    isNotNull();
    String actualSessionId = actual.getSessionId();
    assertThat(actualSessionId) //
        .overridingErrorMessage("Expected session ID <%s> but was <%s>.", sessionId,
            actualSessionId) //
        .isEqualTo(sessionId);
    return this;
  }

  public RemotePlaybackClientAssert hasSession() {
    isNotNull();
    assertThat(actual.hasSession()) //
        .overridingErrorMessage("Expected to have session but did not.") //
        .isTrue();
    return this;
  }

  public RemotePlaybackClientAssert doesNotHaveSession() {
    isNotNull();
    assertThat(actual.hasSession()) //
        .overridingErrorMessage("Expected to not have session but did.") //
        .isFalse();
    return this;
  }

  public RemotePlaybackClientAssert hasQueuingSupported() {
    isNotNull();
    assertThat(actual.isQueuingSupported()) //
        .overridingErrorMessage("Expected to have queuing supported but did not.") //
        .isTrue();
    return this;
  }

  public RemotePlaybackClientAssert doesNotHaveQueuingSupported() {
    isNotNull();
    assertThat(actual.isQueuingSupported()) //
        .overridingErrorMessage("Expected to not have queuing supported but did.") //
        .isFalse();
    return this;
  }

  public RemotePlaybackClientAssert hasRemotePlaybackSupported() {
    isNotNull();
    assertThat(actual.isRemotePlaybackSupported()) //
        .overridingErrorMessage("Expected to have remote playback supported but did not.") //
        .isTrue();
    return this;
  }

  public RemotePlaybackClientAssert doesNotHaveRemotePlaybackSupported() {
    isNotNull();
    assertThat(actual.isRemotePlaybackSupported()) //
        .overridingErrorMessage("Expected to not have remote playback supported but did.") //
        .isFalse();
    return this;
  }

  public RemotePlaybackClientAssert hasSessionManagementSupported() {
    isNotNull();
    assertThat(actual.isSessionManagementSupported()) //
        .overridingErrorMessage("Expected to have session management supported but did not.") //
        .isTrue();
    return this;
  }

  public RemotePlaybackClientAssert doesNotHaveSessionManagementSupported() {
    isNotNull();
    assertThat(actual.isSessionManagementSupported()) //
        .overridingErrorMessage("Expected to not have session management supported but did.") //
        .isFalse();
    return this;
  }
}
