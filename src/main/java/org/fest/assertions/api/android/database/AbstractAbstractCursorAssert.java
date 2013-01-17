// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.database;

import android.database.AbstractCursor;
import android.net.Uri;

import static org.fest.assertions.api.Assertions.assertThat;

public abstract class AbstractAbstractCursorAssert<S extends AbstractAbstractCursorAssert<S, A>, A extends AbstractCursor>
    extends AbstractCursorAssert<S, A> {
  protected AbstractAbstractCursorAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasNotificationUri(Uri uri) {
    isNotNull();
    Uri actualUri = actual.getNotificationUri();
    assertThat(actualUri) //
        .overridingErrorMessage("Expected notification URI <%s> but was <%s>.", uri, actualUri) //
        .isEqualTo(uri);
    return myself;
  }
}
