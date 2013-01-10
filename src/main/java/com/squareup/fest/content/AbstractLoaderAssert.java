package com.squareup.fest.content;

import android.content.Loader;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractLoaderAssert<S extends AbstractLoaderAssert<S, A>, A extends Loader>
    extends AbstractAssert<S, A> {
  protected AbstractLoaderAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasId(int id) {
    isNotNull();
    int actualId = actual.getId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return myself;
  }

  public S isAbandoned() {
    isNotNull();
    assertThat(actual.isAbandoned()) //
        .overridingErrorMessage("Expected to be abandoned but was not abandoned.") //
        .isTrue();
    return myself;
  }

  public S isNotAbandoned() {
    isNotNull();
    assertThat(actual.isAbandoned()) //
        .overridingErrorMessage("Expected to not be abandoned but was abandoned.") //
        .isFalse();
    return myself;
  }

  public S isReset() {
    isNotNull();
    assertThat(actual.isReset()) //
        .overridingErrorMessage("Expected to be reset but was not reset.") //
        .isTrue();
    return myself;
  }

  public S isNotReset() {
    isNotNull();
    assertThat(actual.isReset()) //
        .overridingErrorMessage("Expected to not be reset but was reset.") //
        .isFalse();
    return myself;
  }

  public S isStarted() {
    isNotNull();
    assertThat(actual.isStarted()) //
        .overridingErrorMessage("Expected to be started but was not started.") //
        .isTrue();
    return myself;
  }

  public S isNotStarted() {
    isNotNull();
    assertThat(actual.isStarted()) //
        .overridingErrorMessage("Expected to not be started but was started.") //
        .isFalse();
    return myself;
  }
}
