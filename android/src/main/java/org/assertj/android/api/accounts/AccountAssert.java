// Copyright 2013 Square, Inc.
package org.assertj.android.api.accounts;

import android.accounts.Account;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link Account} instances. */
public class AccountAssert extends AbstractAssert<AccountAssert, Account> {
  public AccountAssert(Account actual) {
    super(actual, AccountAssert.class);
  }

  public AccountAssert hasName(String name) {
    isNotNull();
    String actualName = actual.name;
    assertThat(actualName) //
        .overridingErrorMessage("Expected name <%s> but was <%s>.", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public AccountAssert hasType(String type) {
    isNotNull();
    String actualType = actual.type;
    assertThat(actualType) //
        .overridingErrorMessage("Expected type <%s> but was <%s>.", type, actualType) //
        .isEqualTo(type);
    return this;
  }
}
