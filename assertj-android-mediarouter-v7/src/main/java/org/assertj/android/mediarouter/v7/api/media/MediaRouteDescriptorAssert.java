package org.assertj.android.mediarouter.v7.api.media;

import android.support.v7.media.MediaRouteDescriptor;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class MediaRouteDescriptorAssert
    extends AbstractAssert<MediaRouteDescriptorAssert, MediaRouteDescriptor> {
  public MediaRouteDescriptorAssert(MediaRouteDescriptor actual) {
    super(actual, MediaRouteDescriptorAssert.class);
  }

  public MediaRouteDescriptorAssert hasDescription(String description) {
    isNotNull();
    String actualDescription = actual.getDescription();
    assertThat(actualDescription) //
        .overridingErrorMessage("Expected description <%s> but was <%s>.", description,
            actualDescription) //
        .isEqualTo(description);
    return this;
  }

  public MediaRouteDescriptorAssert hasId(String id) {
    isNotNull();
    String actualId = actual.getId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected id <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public MediaRouteDescriptorAssert hasName(String name) {
    isNotNull();
    String actualName = actual.getName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected name <%s> but was <%s>.", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public MediaRouteDescriptorAssert hasPlaybackStream(int playbackStream) {
    isNotNull();
    int actualPlaybackStream = actual.getPlaybackStream();
    assertThat(actualPlaybackStream) //
        .overridingErrorMessage("Expected playback stream <%s> but was <%s>.", playbackStream,
            actualPlaybackStream) //
        .isEqualTo(playbackStream);
    return this;
  }

  public MediaRouteDescriptorAssert hasPlaybackType(int playbackType) {
    isNotNull();
    int actualPlaybackType = actual.getPlaybackType();
    assertThat(actualPlaybackType) //
        .overridingErrorMessage("Expected playback type <%s> but was <%s>.", playbackType,
            actualPlaybackType) //
        .isEqualTo(playbackType);
    return this;
  }

  public MediaRouteDescriptorAssert hasPresentationDisplayId(int displayId) {
    isNotNull();
    int actualDisplayId = actual.getPresentationDisplayId();
    assertThat(actualDisplayId) //
        .overridingErrorMessage("Expected presentation display ID <%s> but was <%s>.", displayId,
            actualDisplayId) //
        .isEqualTo(displayId);
    return this;
  }

  public MediaRouteDescriptorAssert hasVolume(int volume) {
    isNotNull();
    int actualVolume = actual.getVolume();
    assertThat(actualVolume) //
        .overridingErrorMessage("Expected volume <%s> but was <%s>.", volume,
            actualVolume) //
        .isEqualTo(volume);
    return this;
  }

  public MediaRouteDescriptorAssert hasVolumeHandling(int volumeHandling) {
    isNotNull();
    int actualVolumeHandling = actual.getVolumeHandling();
    assertThat(actualVolumeHandling) //
        .overridingErrorMessage("Expected volume handling <%s> but was <%s>.", volumeHandling,
            actualVolumeHandling) //
        .isEqualTo(volumeHandling);
    return this;
  }

  public MediaRouteDescriptorAssert hasVolumeMax(int volumeMax) {
    isNotNull();
    int actualVolumeMax = actual.getVolumeMax();
    assertThat(actualVolumeMax) //
        .overridingErrorMessage("Expected playback stream <%s> but was <%s>.", volumeMax,
            actualVolumeMax) //
        .isEqualTo(volumeMax);
    return this;
  }

  public MediaRouteDescriptorAssert isConnecting() {
    isNotNull();
    assertThat(actual.isConnecting()) //
        .overridingErrorMessage("Expected to be connecting but was not.") //
        .isTrue();
    return this;
  }

  public MediaRouteDescriptorAssert isNotConnecting() {
    isNotNull();
    assertThat(actual.isConnecting()) //
        .overridingErrorMessage("Expected to not be connecting but was.") //
        .isFalse();
    return this;
  }

  public MediaRouteDescriptorAssert isEnabled() {
    isNotNull();
    assertThat(actual.isEnabled()) //
        .overridingErrorMessage("Expected to be enabled but was not.") //
        .isTrue();
    return this;
  }

  public MediaRouteDescriptorAssert isDisabled() {
    isNotNull();
    assertThat(actual.isEnabled()) //
        .overridingErrorMessage("Expected to be disabled but was enabled.") //
        .isFalse();
    return this;
  }

  public MediaRouteDescriptorAssert isValid() {
    isNotNull();
    assertThat(actual.isValid()) //
        .overridingErrorMessage("Expected to be valid but was not.") //
        .isTrue();
    return this;
  }

  public MediaRouteDescriptorAssert isNotValid() {
    isNotNull();
    assertThat(actual.isValid()) //
        .overridingErrorMessage("Expected to not be valid but was.") //
        .isFalse();
    return this;
  }
}
