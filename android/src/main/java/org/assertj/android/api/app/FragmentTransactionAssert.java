package org.assertj.android.api.app;

import android.annotation.TargetApi;
import android.app.FragmentTransaction;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link FragmentTransaction} instances. */
@TargetApi(HONEYCOMB)
public class FragmentTransactionAssert
    extends AbstractAssert<FragmentTransactionAssert, FragmentTransaction> {
  public FragmentTransactionAssert(FragmentTransaction actual) {
    super(actual, FragmentManagerAssert.class);
  }

  public FragmentTransactionAssert isAddToBackStackAllowed() {
    isNotNull();
    assertThat(actual.isAddToBackStackAllowed()) //
        .overridingErrorMessage("Expected add to back stack to be allowed but was disallowed.") //
        .isTrue();
    return this;
  }

  public FragmentTransactionAssert isAddToBackStackDisallowed() {
    isNotNull();
    assertThat(actual.isAddToBackStackAllowed()) //
        .overridingErrorMessage("Expected add to back stack to be disallowed but was allowed.") //
        .isFalse();
    return this;
  }

  public FragmentTransactionAssert isEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected empty transaction but was not empty.") //
        .isTrue();
    return this;
  }

  public FragmentTransactionAssert isNotEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected non-empty transaction but was empty.") //
        .isFalse();
    return this;
  }
}
