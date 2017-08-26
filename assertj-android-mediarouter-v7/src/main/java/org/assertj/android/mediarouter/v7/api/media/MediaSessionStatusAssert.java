package org.assertj.android.mediarouter.v7.api.media;

import android.support.v7.media.MediaSessionStatus;
import org.assertj.core.api.AbstractAssert;

import static android.support.v7.media.MediaSessionStatus.SESSION_STATE_ACTIVE;
import static android.support.v7.media.MediaSessionStatus.SESSION_STATE_ENDED;
import static android.support.v7.media.MediaSessionStatus.SESSION_STATE_INVALIDATED;
import static org.assertj.android.internal.BitmaskUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

public class MediaSessionStatusAssert
    extends AbstractAssert<MediaSessionStatusAssert, MediaSessionStatus> {
  public MediaSessionStatusAssert(MediaSessionStatus actual) {
    super(actual, MediaSessionStatusAssert.class);
  }

  public MediaSessionStatusAssert hasSessionState(@MediaSessionStatusState int state) {
    isNotNull();
    int actualState = actual.getSessionState();
    //noinspection ResourceType
    assertThat(actualState) //
        .overridingErrorMessage("Expected session state <%s> but was <%s>.",
            sessionStateToString(state), sessionStateToString(actualState)) //
        .isEqualTo(state);
    return this;
  }

  public MediaSessionStatusAssert hasTimestamp(long timestamp) {
    isNotNull();
    long actualTimestamp = actual.getTimestamp();
    assertThat(actualTimestamp) //
        .overridingErrorMessage("Expected timestamp <%s> but was <%s>.", timestamp,
            actualTimestamp) //
        .isEqualTo(timestamp);
    return this;
  }

  public MediaSessionStatusAssert hasQueuePaused() {
    isNotNull();
    assertThat(actual.isQueuePaused()) //
        .overridingErrorMessage("Expected queue to be paused but was not.")
        .isTrue();
    return this;
  }

  public MediaSessionStatusAssert doesNotHaveQueuePaused() {
    isNotNull();
    assertThat(actual.isQueuePaused()) //
        .overridingErrorMessage("Expected queue to not be paused but was.")
        .isFalse();
    return this;
  }

  public static String sessionStateToString(@MediaSessionStatusState int state) {
    return buildNamedValueString(state)
        .value(SESSION_STATE_ACTIVE, "active")
        .value(SESSION_STATE_ENDED, "ended")
        .value(SESSION_STATE_INVALIDATED, "invalidated")
        .get();
  }
}
