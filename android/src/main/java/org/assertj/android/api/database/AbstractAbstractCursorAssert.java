// Copyright 2013 Square, Inc.
package org.assertj.android.api.database;

import android.annotation.TargetApi;
import android.database.AbstractCursor;
import android.net.Uri;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractAbstractCursorAssert<S extends AbstractAbstractCursorAssert<S, A>, A extends AbstractCursor>
    extends AbstractCursorAssert<S, A> {
  protected AbstractAbstractCursorAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  @TargetApi(HONEYCOMB)
  public S hasNotificationUri(Uri uri) {
    isNotNull();
    Uri actualUri = actual.getNotificationUri();
    assertThat(actualUri) //
        .overridingErrorMessage("Expected notification URI <%s> but was <%s>.", uri, actualUri) //
        .isEqualTo(uri);
    return myself;
  }
}
