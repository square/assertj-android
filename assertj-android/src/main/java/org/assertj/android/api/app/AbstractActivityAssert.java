// Copyright 2012 Square, Inc.
package org.assertj.android.api.app;

import android.annotation.TargetApi;
import android.app.Activity;
import org.assertj.android.api.content.AbstractContextAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR2;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractActivityAssert<S extends AbstractActivityAssert<S, A>, A extends Activity>
    extends AbstractContextAssert<S, A> {
  public AbstractActivityAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasRequestedOrientation(int orientation) {
    isNotNull();
    int actualOrientation = actual.getRequestedOrientation();
    assertThat(actualOrientation) //
        // TODO use string of orientations
        .overridingErrorMessage("Expected orientation <%s> but was <%s>.", orientation,
            actualOrientation) //
        .isEqualTo(orientation);
    return myself;
  }

  public S hasTitle(CharSequence title) {
    isNotNull();
    CharSequence actualTitle = actual.getTitle();
    assertThat(actualTitle) //
        .overridingErrorMessage("Expected title <%s> but was <%s>.", title, actualTitle) //
        .isEqualTo(title);
    return myself;
  }

  public S hasTitle(int resId) {
    isNotNull();
    return hasTitle(actual.getString(resId));
  }

  public S hasTitleColor(int color) {
    isNotNull();
    int actualColor = actual.getTitleColor();
    assertThat(actualColor) //
        .overridingErrorMessage("Expected title color <%s> but was <%s>.",
            Integer.toHexString(color), Integer.toHexString(actualColor)) //
        .isEqualTo(color);
    return myself;
  }

  public S hasWindowFocus() {
    isNotNull();
    assertThat(actual.hasWindowFocus()) //
        .overridingErrorMessage("Expected to have focus but was not focused.") //
        .isTrue();
    return myself;
  }

  @TargetApi(HONEYCOMB)
  public S isChangingConfigurations() {
    isNotNull();
    assertThat(actual.isChangingConfigurations()) //
        .overridingErrorMessage("Expected changing configurations but was not changing.") //
        .isTrue();
    return myself;
  }

  @TargetApi(HONEYCOMB)
  public S isNotChangingConfigurations() {
    isNotNull();
    assertThat(actual.isChangingConfigurations()) //
        .overridingErrorMessage("Expected not to be changing configurations but was changing.") //
        .isFalse();
    return myself;
  }

  public S isChild() {
    isNotNull();
    assertThat(actual.isChild()) //
        .overridingErrorMessage("Expected to be a child but was not a child.") //
        .isTrue();
    return myself;
  }

  public S isNotChild() {
    isNotNull();
    assertThat(actual.isChild()) //
        .overridingErrorMessage("Expected not to be a child but was a child.") //
        .isFalse();
    return myself;
  }

  @TargetApi(JELLY_BEAN_MR1)
  public S isDestroyed() {
    isNotNull();
    assertThat(actual.isDestroyed()) //
        .overridingErrorMessage("Expected to be destroyed but was not destroyed.") //
        .isTrue();
    return myself;
  }

  @TargetApi(JELLY_BEAN_MR1)
  public S isNotDestroyed() {
    isNotNull();
    assertThat(actual.isDestroyed()) //
        .overridingErrorMessage("Expected not to be destroyed but was destroyed.") //
        .isFalse();
    return myself;
  }

  public S isFinishing() {
    isNotNull();
    assertThat(actual.isFinishing()) //
        .overridingErrorMessage("Expected to be finishing but was not finishing.") //
        .isTrue();
    return myself;
  }

  public S isNotFinishing() {
    isNotNull();
    assertThat(actual.isFinishing()) //
        .overridingErrorMessage("Expected to not be finishing but was finishing.") //
        .isFalse();
    return myself;
  }

  @TargetApi(JELLY_BEAN_MR2)
  public S isImmersive() {
    isNotNull();
    assertThat(actual.isImmersive()) //
        .overridingErrorMessage("Expected to be immersive but was not.") //
        .isTrue();
    return myself;
  }

  @TargetApi(JELLY_BEAN_MR2)
  public S isNotImmersive() {
    isNotNull();
    assertThat(actual.isImmersive()) //
        .overridingErrorMessage("Expected to not be immersive but was.") //
        .isFalse();
    return myself;
  }

  public S isTaskRoot() {
    isNotNull();
    assertThat(actual.isTaskRoot()) //
        .overridingErrorMessage("Expected to be task root but was not task root.") //
        .isTrue();
    return myself;
  }

  public S isNotTaskRoot() {
    isNotNull();
    assertThat(actual.isTaskRoot()) //
        .overridingErrorMessage("Expected not to be task root but was task root.") //
        .isFalse();
    return myself;
  }
}
