package com.squareup.fest.content;

import android.content.Loader;
import com.squareup.fest.Assertions;
import org.fest.assertions.api.AbstractAssert;

public abstract class AbstractLoaderAssert<S extends AbstractLoaderAssert<S, A>, A extends Loader>
    extends AbstractAssert<S, A> {
  protected AbstractLoaderAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasId(int id) {
    isNotNull();
    int actualId = actual.getId();
    Assertions.assertThat(actualId) //
        .overridingErrorMessage("Expected loader ID <%s> but was <%s>", id, actualId) //
        .isEqualTo(id);
    return myself;
  }

  public S isAbandoned() {
    isNotNull();
    // TODO
    return myself;
  }

  public S isNotAbandoned() {
    isNotNull();
    // TODO this
    return myself;
  }

  public S isReset() {
    isNotNull();
    // TODO
    return myself;
  }

  public S isNotReset() {
    isNotNull();
    // TODO
    return myself;
  }

  public S isStarted() {
    isNotNull();
    // TODO
    return myself;
  }

  public S isNotStarted() {
    isNotNull();
    // TODO
    return myself;
  }
}
