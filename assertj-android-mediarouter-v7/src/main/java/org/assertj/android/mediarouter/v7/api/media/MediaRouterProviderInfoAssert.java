package org.assertj.android.mediarouter.v7.api.media;

import android.content.ComponentName;
import android.support.v7.media.MediaRouter;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class MediaRouterProviderInfoAssert
    extends AbstractAssert<MediaRouterProviderInfoAssert, MediaRouter.ProviderInfo> {
  public MediaRouterProviderInfoAssert(MediaRouter.ProviderInfo actual) {
    super(actual, MediaRouterProviderInfoAssert.class);
  }

  public MediaRouterProviderInfoAssert hasComponentName(ComponentName componentName) {
    isNotNull();
    ComponentName actualComponentName = actual.getComponentName();
    assertThat(actualComponentName) //
        .overridingErrorMessage("Expected component name <%s> but was <%s>.", componentName,
            actualComponentName) //
        .isEqualTo(componentName);
    return this;
  }

  public MediaRouterProviderInfoAssert hasPackageName(String packageName) {
    isNotNull();
    String actualPackageName = actual.getPackageName();
    assertThat(actualPackageName) //
        .overridingErrorMessage("Expected package name <%s> but was <%s>.", packageName,
            actualPackageName) //
        .isEqualTo(packageName);
    return this;
  }
}
