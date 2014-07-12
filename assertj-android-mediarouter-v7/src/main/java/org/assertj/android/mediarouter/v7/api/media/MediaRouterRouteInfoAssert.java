package org.assertj.android.mediarouter.v7.api.media;

import android.support.v7.media.MediaRouter;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class MediaRouterRouteInfoAssert
    extends AbstractAssert<MediaRouterRouteInfoAssert, MediaRouter.RouteInfo> {
  public MediaRouterRouteInfoAssert(MediaRouter.RouteInfo actual) {
    super(actual, MediaRouterRouteInfoAssert.class);
  }

  public MediaRouterRouteInfoAssert hasDescription(String description) {
    isNotNull();
    String actualDescription = actual.getDescription();
    assertThat(actualDescription) //
        .overridingErrorMessage("Expected description <%s> but was <%s>.", description,
            actualDescription) //
        .isEqualTo(description);
    return this;
  }

  public MediaRouterRouteInfoAssert hasId(String id) {
    isNotNull();
    String actualId = actual.getId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected id <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public MediaRouterRouteInfoAssert hasName(String name) {
    isNotNull();
    String actualName = actual.getName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected name <%s> but was <%s>.", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public MediaRouterRouteInfoAssert hasPlaybackStream(int playbackStream) {
    isNotNull();
    int actualPlaybackStream = actual.getPlaybackStream();
    assertThat(actualPlaybackStream) //
        .overridingErrorMessage("Expected playback stream <%s> but was <%s>.", playbackStream,
            actualPlaybackStream) //
        .isEqualTo(playbackStream);
    return this;
  }

  public MediaRouterRouteInfoAssert hasPlaybackType(int playbackType) {
    isNotNull();
    int actualPlaybackType = actual.getPlaybackType();
    assertThat(actualPlaybackType) //
        .overridingErrorMessage("Expected playback type <%s> but was <%s>.", playbackType,
            actualPlaybackType) //
        .isEqualTo(playbackType);
    return this;
  }

  public MediaRouterRouteInfoAssert hasVolume(int volume) {
    isNotNull();
    int actualVolume = actual.getVolume();
    assertThat(actualVolume) //
        .overridingErrorMessage("Expected volume <%s> but was <%s>.", volume,
            actualVolume) //
        .isEqualTo(volume);
    return this;
  }

  public MediaRouterRouteInfoAssert hasVolumeHandling(int volumeHandling) {
    isNotNull();
    int actualVolumeHandling = actual.getVolumeHandling();
    assertThat(actualVolumeHandling) //
        .overridingErrorMessage("Expected volume handling <%s> but was <%s>.", volumeHandling,
            actualVolumeHandling) //
        .isEqualTo(volumeHandling);
    return this;
  }

  public MediaRouterRouteInfoAssert hasVolumeMax(int volumeMax) {
    isNotNull();
    int actualVolumeMax = actual.getVolumeMax();
    assertThat(actualVolumeMax) //
        .overridingErrorMessage("Expected playback stream <%s> but was <%s>.", volumeMax,
            actualVolumeMax) //
        .isEqualTo(volumeMax);
    return this;
  }

  public MediaRouterRouteInfoAssert isConnecting() {
    isNotNull();
    assertThat(actual.isConnecting()) //
        .overridingErrorMessage("Expected to be connecting but was not.") //
        .isTrue();
    return this;
  }

  public MediaRouterRouteInfoAssert isNotConnecting() {
    isNotNull();
    assertThat(actual.isConnecting()) //
        .overridingErrorMessage("Expected to not be connecting but was.") //
        .isFalse();
    return this;
  }

  public MediaRouterRouteInfoAssert isEnabled() {
    isNotNull();
    assertThat(actual.isEnabled()) //
        .overridingErrorMessage("Expected to be enabled but was not.") //
        .isTrue();
    return this;
  }

  public MediaRouterRouteInfoAssert isDisabled() {
    isNotNull();
    assertThat(actual.isEnabled()) //
        .overridingErrorMessage("Expected to be disabled but was enabled.") //
        .isFalse();
    return this;
  }

  public MediaRouterRouteInfoAssert isSelected() {
    isNotNull();
    assertThat(actual.isSelected()) //
        .overridingErrorMessage("Expected to be selected but was not.") //
        .isTrue();
    return this;
  }

  public MediaRouterRouteInfoAssert isNotSelected() {
    isNotNull();
    assertThat(actual.isSelected()) //
        .overridingErrorMessage("Expected to not be selected but was.") //
        .isFalse();
    return this;
  }
}
