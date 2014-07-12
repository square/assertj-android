package org.assertj.android.mediarouter.v7.api.media;

import android.content.ComponentName;
import android.support.v7.media.MediaRouteProvider;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class MediaRouteProviderProviderMetadataAssert extends
    AbstractAssert<MediaRouteProviderProviderMetadataAssert, MediaRouteProvider.ProviderMetadata> {
  public MediaRouteProviderProviderMetadataAssert(MediaRouteProvider.ProviderMetadata actual) {
    super(actual, MediaRouteProviderProviderMetadataAssert.class);
  }

  public MediaRouteProviderProviderMetadataAssert hasComponentName(ComponentName componentName) {
    isNotNull();
    ComponentName actualComponentName = actual.getComponentName();
    assertThat(actualComponentName) //
        .overridingErrorMessage("Expected component name <%s> but was <%s>.", componentName,
            actualComponentName) //
        .isEqualTo(componentName);
    return this;
  }

  public MediaRouteProviderProviderMetadataAssert hasPackageName(String packageName) {
    isNotNull();
    String actualPackageName = actual.getPackageName();
    assertThat(actualPackageName) //
        .overridingErrorMessage("Expected package name <%s> but was <%s>.", packageName,
            actualPackageName) //
        .isEqualTo(packageName);
    return this;
  }
}
