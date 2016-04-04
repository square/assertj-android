package org.assertj.android.mediarouter.v7.api.media;

import android.support.v7.media.MediaRouteDiscoveryRequest;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class MediaRouteDiscoveryRequestAssert
    extends AbstractAssert<MediaRouteDiscoveryRequestAssert, MediaRouteDiscoveryRequest> {
  public MediaRouteDiscoveryRequestAssert(MediaRouteDiscoveryRequest actual) {
    super(actual, MediaRouteDiscoveryRequestAssert.class);
  }

  public MediaRouteDiscoveryRequestAssert isActiveScan() {
    isNotNull();
    assertThat(actual.isActiveScan()) //
        .overridingErrorMessage("is performing active scanning") //
        .isTrue();
    return this;
  }

  public MediaRouteDiscoveryRequestAssert isNotActiveScan() {
    isNotNull();
    assertThat(actual.isActiveScan()) //
        .overridingErrorMessage("is not performing active scanning") //
        .isFalse();
    return this;
  }

  public MediaRouteDiscoveryRequestAssert isValid() {
    isNotNull();
    assertThat(actual.isValid()) //
        .overridingErrorMessage("Expected to be valid but was not.") //
        .isTrue();
    return this;
  }

  public MediaRouteDiscoveryRequestAssert isNotValid() {
    isNotNull();
    assertThat(actual.isValid()) //
        .overridingErrorMessage("Expected to not be valid but was.") //
        .isFalse();
    return this;
  }
}
