package org.assertj.android.api.view;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR2;
import static android.view.ViewGroup.FOCUS_AFTER_DESCENDANTS;
import static android.view.ViewGroup.FOCUS_BEFORE_DESCENDANTS;
import static android.view.ViewGroup.FOCUS_BLOCK_DESCENDANTS;
import static android.view.ViewGroup.LAYOUT_MODE_CLIP_BOUNDS;
import static android.view.ViewGroup.LAYOUT_MODE_OPTICAL_BOUNDS;
import static android.view.ViewGroup.PERSISTENT_ALL_CACHES;
import static android.view.ViewGroup.PERSISTENT_ANIMATION_CACHE;
import static android.view.ViewGroup.PERSISTENT_NO_CACHE;
import static android.view.ViewGroup.PERSISTENT_SCROLLING_CACHE;
import static org.assertj.android.internal.BitmaskUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractViewGroupAssert<S extends AbstractViewGroupAssert<S, A>, A extends ViewGroup>
    extends AbstractViewAssert<S, A> {
  protected AbstractViewGroupAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S isAddingStatesFromChildren() {
    isNotNull();
    assertThat(actual.addStatesFromChildren()) //
        .overridingErrorMessage("Expected adding states from children but was not") //
        .isTrue();
    return myself;
  }

  public S isNotAddingStatesFromChildren() {
    isNotNull();
    assertThat(actual.addStatesFromChildren()) //
        .overridingErrorMessage("Expected not adding states from children but was") //
        .isFalse();
    return myself;
  }

  public S hasChildCount(int count) {
    isNotNull();
    int actualCount = actual.getChildCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected child count <%s> but was <%s>", count, actualCount) //
        .isEqualTo(count);
    return myself;
  }

  public S hasDescendantFocusability(@ViewGroupDescendantFocusability int focusability) {
    isNotNull();
    int actualFocusability = actual.getDescendantFocusability();
    //noinspection ResourceType
    assertThat(actualFocusability) //
        .overridingErrorMessage("Expected descendant focusability <%s> but was <%s>",
            descendantFocusabilityToString(focusability),
            descendantFocusabilityToString(actualFocusability)) //
        .isEqualTo(focusability);
    return myself;
  }

  public S hasFocusedChild(View view) {
    isNotNull();
    View actualView = actual.getFocusedChild();
    assertThat(actualView) //
        .overridingErrorMessage("Expected focused child <%s> but was <%s>", view, actualView) //
        .isSameAs(view);
    return myself;
  }

  @TargetApi(JELLY_BEAN_MR2)
  public S hasLayoutMode(@ViewGroupLayoutMode int layoutMode) {
    isNotNull();
    int actualLayoutMode = actual.getLayoutMode();
    //noinspection ResourceType
    assertThat(actualLayoutMode) //
        .overridingErrorMessage("Expected layout mode <%s> but was <%s>.",
            layoutModeToString(layoutMode), layoutModeToString(actualLayoutMode)) //
        .isEqualTo(layoutMode);
    return myself;
  }

  public S hasPersistentDrawingCache(@ViewGroupPersistentDrawingCache int cache) {
    isNotNull();
    int actualCache = actual.getPersistentDrawingCache();
    //noinspection ResourceType
    assertThat(actualCache) //
        .overridingErrorMessage("Expected persistent drawing cache <%s> but was <%s>",
            persistentDrawingCacheToString(cache), persistentDrawingCacheToString(actualCache)) //
        .isEqualTo(cache);
    return myself;
  }

  public S isAlwaysDrawnWithCache() {
    isNotNull();
    assertThat(actual.isAlwaysDrawnWithCacheEnabled()) //
        .overridingErrorMessage("Expected to always draw with cache but was not") //
        .isTrue();
    return myself;
  }

  public S isNotAlwaysDrawnWithCache() {
    isNotNull();
    assertThat(actual.isAlwaysDrawnWithCacheEnabled()) //
        .overridingErrorMessage("Expected to not always draw with cache but was") //
        .isFalse();
    return myself;
  }

  @TargetApi(JELLY_BEAN_MR2)
  public S isClippingChildren() {
    isNotNull();
    assertThat(actual.getClipChildren()) //
        .overridingErrorMessage("Expected to be clipping children but was not.") //
        .isTrue();
    return myself;
  }

  @TargetApi(JELLY_BEAN_MR2)
  public S isNotClippingChildren() {
    isNotNull();
    assertThat(actual.getClipChildren()) //
        .overridingErrorMessage("Expected to not be clipping children but was.") //
        .isFalse();
    return myself;
  }

  public S hasAnimationCacheEnabled() {
    isNotNull();
    assertThat(actual.isAnimationCacheEnabled()) //
        .overridingErrorMessage("Expected animation cache enabled but was disabled") //
        .isTrue();
    return myself;
  }

  public S hasAnimationCacheDisabled() {
    isNotNull();
    assertThat(actual.isAnimationCacheEnabled()) //
        .overridingErrorMessage("Expected animation cache disabled but was enabled") //
        .isFalse();
    return myself;
  }

  @TargetApi(HONEYCOMB)
  public S hasMotionEventSplittingEnabled() {
    isNotNull();
    assertThat(actual.isMotionEventSplittingEnabled()) //
        .overridingErrorMessage("Expected motion event splitting enabled but was disabled") //
        .isTrue();
    return myself;
  }

  @TargetApi(HONEYCOMB)
  public S hasMotionEventSplittingDisabled() {
    isNotNull();
    assertThat(actual.isMotionEventSplittingEnabled()) //
        .overridingErrorMessage("Expected motion event splitting disabled but was enabled") //
        .isFalse();
    return myself;
  }

  public static String descendantFocusabilityToString(@ViewGroupDescendantFocusability int focusability) {
    return buildNamedValueString(focusability)
        .value(FOCUS_AFTER_DESCENDANTS, "afterDescendants")
        .value(FOCUS_BEFORE_DESCENDANTS, "beforeDescendants")
        .value(FOCUS_BLOCK_DESCENDANTS, "blockDescendants")
        .get();
  }

  public static String persistentDrawingCacheToString(@ViewGroupPersistentDrawingCache int cache) {
    return buildNamedValueString(cache)
        .value(PERSISTENT_ALL_CACHES, "all")
        .value(PERSISTENT_ANIMATION_CACHE, "animation")
        .value(PERSISTENT_NO_CACHE, "none")
        .value(PERSISTENT_SCROLLING_CACHE, "scrolling")
        .get();
  }

  public static String layoutModeToString(@ViewGroupLayoutMode int layoutMode) {
    return buildNamedValueString(layoutMode)
        .value(LAYOUT_MODE_CLIP_BOUNDS, "clip_bounds")
        .value(LAYOUT_MODE_OPTICAL_BOUNDS, "optical_bounds")
        .get();
  }
}
