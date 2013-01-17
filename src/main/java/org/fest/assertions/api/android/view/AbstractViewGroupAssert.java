package org.fest.assertions.api.android.view;

import android.view.View;
import android.view.ViewGroup;

import static android.view.ViewGroup.FOCUS_AFTER_DESCENDANTS;
import static android.view.ViewGroup.FOCUS_BEFORE_DESCENDANTS;
import static android.view.ViewGroup.FOCUS_BLOCK_DESCENDANTS;
import static android.view.ViewGroup.PERSISTENT_ALL_CACHES;
import static android.view.ViewGroup.PERSISTENT_ANIMATION_CACHE;
import static android.view.ViewGroup.PERSISTENT_NO_CACHE;
import static android.view.ViewGroup.PERSISTENT_SCROLLING_CACHE;
import static org.fest.assertions.api.Assertions.assertThat;

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

  public S hasDescendantFocusability(int focusability) {
    isNotNull();
    int actualFocusability = actual.getDescendantFocusability();
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

  public S hasPersistentDrawingCache(int cache) {
    isNotNull();
    int actualCache = actual.getPersistentDrawingCache();
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

  public S hasMotionEventSplittingEnabled() {
    isNotNull();
    assertThat(actual.isMotionEventSplittingEnabled()) //
        .overridingErrorMessage("Expected motion event splitting enabled but was disabled") //
        .isTrue();
    return myself;
  }

  public S hasMotionEventSplittingDisabled() {
    isNotNull();
    assertThat(actual.isMotionEventSplittingEnabled()) //
        .overridingErrorMessage("Expected motion event splitting disabled but was enabled") //
        .isFalse();
    return myself;
  }

  private static String descendantFocusabilityToString(int focusability) {
    switch (focusability) {
      case FOCUS_AFTER_DESCENDANTS:
        return "afterDescendants";
      case FOCUS_BEFORE_DESCENDANTS:
        return "beforeDescendants";
      case FOCUS_BLOCK_DESCENDANTS:
        return "blockDescendants";
      default:
        throw new IllegalArgumentException("Unknown descendant focusability: " + focusability);
    }
  }

  private static String persistentDrawingCacheToString(int cache) {
    switch (cache) {
      case PERSISTENT_ALL_CACHES:
        return "all";
      case PERSISTENT_ANIMATION_CACHE:
        return "animation";
      case PERSISTENT_NO_CACHE:
        return "none";
      case PERSISTENT_SCROLLING_CACHE:
        return "scrolling";
      default:
        throw new IllegalArgumentException("Unknown persistent drawing cache: " + cache);
    }
  }
}
