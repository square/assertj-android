package org.assertj.android.api.app;

import android.annotation.TargetApi;
import android.app.Fragment;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static android.os.Build.VERSION_CODES.HONEYCOMB_MR2;
import static android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(HONEYCOMB)
public abstract class AbstractFragmentAssert<S extends AbstractFragmentAssert<S, A>, A extends Fragment> extends AbstractAssert<S, A> {
  protected AbstractFragmentAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasId(int id) {
    isNotNull();
    int actualId = actual.getId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected ID <%s> but was <%s>", id, actualId) //
        .isEqualTo(id);
    return myself;
  }

  public S hasTag(String tag) {
    isNotNull();
    String actualTag = actual.getTag();
    assertThat(actualTag).isEqualTo(tag);
    return myself;
  }

  @TargetApi(ICE_CREAM_SANDWICH_MR1)
  public S isUserVisible() {
    isNotNull();
    assertThat(actual.getUserVisibleHint()) //
        .overridingErrorMessage("Expected user visible hint but was not set") //
        .isTrue();
    return myself;
  }

  @TargetApi(ICE_CREAM_SANDWICH_MR1)
  public S isNotUserVisible() {
    isNotNull();
    assertThat(actual.getUserVisibleHint()) //
        .overridingErrorMessage("Expected no user visible hint but was set") //
        .isFalse();
    return myself;
  }

  public S isAdded() {
    isNotNull();
    assertThat(actual.isAdded()) //
        .overridingErrorMessage("Expected added but was not added") //
        .isTrue();
    return myself;
  }

  public S isNotAdded() {
    isNotNull();
    assertThat(actual.isAdded()) //
        .overridingErrorMessage("Expected not added but was added") //
        .isFalse();
    return myself;
  }

  @TargetApi(HONEYCOMB_MR2)
  public S isDetached() {
    isNotNull();
    assertThat(actual.isDetached()) //
        .overridingErrorMessage("Expected detached but was not detached") //
        .isTrue();
    return myself;
  }

  @TargetApi(HONEYCOMB_MR2)
  public S isNotDetached() {
    isNotNull();
    assertThat(actual.isDetached()) //
        .overridingErrorMessage("Expected not detached but was detached") //
        .isFalse();
    return myself;
  }

  public S isHidden() {
    isNotNull();
    assertThat(actual.isHidden()) //
        .overridingErrorMessage("Expected hidden but was not hidden") //
        .isTrue();
    return myself;
  }

  public S isNotHidden() {
    isNotNull();
    assertThat(actual.isHidden()) //
        .overridingErrorMessage("Expected not hidden but was hidden") //
        .isFalse();
    return myself;
  }

  public S isInLayout() {
    isNotNull();
    assertThat(actual.isInLayout()) //
        .overridingErrorMessage("Expected in layout but was not in layout") //
        .isTrue();
    return myself;
  }

  public S isNotInLayout() {
    isNotNull();
    assertThat(actual.isInLayout()) //
        .overridingErrorMessage("Expected not in layout but was in layout") //
        .isFalse();
    return myself;
  }

  public S isRemoving() {
    isNotNull();
    assertThat(actual.isRemoving()) //
        .overridingErrorMessage("Expected removing but was not removing") //
        .isTrue();
    return myself;
  }

  public S isNotRemoving() {
    isNotNull();
    assertThat(actual.isRemoving()) //
        .overridingErrorMessage("Expected not removing but was removing") //
        .isFalse();
    return myself;
  }

  public S isResumed() {
    isNotNull();
    assertThat(actual.isResumed()) //
        .overridingErrorMessage("Expected resumed but was not resumed") //
        .isTrue();
    return myself;
  }

  public S isNotResumed() {
    isNotNull();
    assertThat(actual.isResumed()) //
        .overridingErrorMessage("Expected not resumed but was resumed") //
        .isFalse();
    return myself;
  }

  public S isVisible() {
    isNotNull();
    assertThat(actual.isVisible()) //
        .overridingErrorMessage("Expected visible but was not visible") //
        .isTrue();
    return myself;
  }

  public S isNotVisible() {
    isNotNull();
    assertThat(actual.isVisible()) //
        .overridingErrorMessage("Expected not visible but was visible") //
        .isFalse();
    return myself;
  }
}
