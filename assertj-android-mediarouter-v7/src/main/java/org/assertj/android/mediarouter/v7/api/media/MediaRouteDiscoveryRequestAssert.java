package org.assertj.android.mediarouter.v7.api.media;

import android.support.v7.media.MediaRouteDiscoveryRequest;
import org.assertj.core.api.AbstractAssert;

public class MediaRouteDiscoveryRequestAssert
    extends AbstractAssert<MediaRouteDiscoveryRequestAssert, MediaRouteDiscoveryRequest> {
  public MediaRouteDiscoveryRequestAssert(MediaRouteDiscoveryRequest actual) {
    super(actual, MediaRouteDiscoveryRequestAssert.class);
  }

  public MediaRouteDiscoveryRequestAssert isActiveScan() {
    isNotNull();
    return this;
  }

  public MediaRouteDiscoveryRequestAssert isNotActiveScan() {
    isNotNull();
    return this;
  }

  public MediaRouteDiscoveryRequestAssert isValid() {
    isNotNull();
    return this;
  }

  public MediaRouteDiscoveryRequestAssert isNotValid() {
    isNotNull();
    return this;
  }
}
