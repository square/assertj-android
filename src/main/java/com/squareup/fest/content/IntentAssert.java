package com.squareup.fest.content;

import android.content.Intent;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public class IntentAssert extends AbstractAssert<IntentAssert, Intent> {
  public IntentAssert(Intent actual) {
    super(actual, IntentAssert.class);
  }

  public IntentAssert hasAction(String action) {
    isNotNull();
    String actualAction = actual.getAction();
    assertThat(actualAction) //
        .overridingErrorMessage("Expected intent action <%s> but was <%s>", action, actualAction) //
        .isEqualTo(action);
    return this;
  }

  public IntentAssert hasType(String type) {
    isNotNull();
    String actualType = actual.getType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected intent type <%s> but was <%s>", type, actualType) //
        .isEqualTo(type);
    return this;
  }

  public IntentAssert hasExtra(String name) {
    isNotNull();
    assertThat(actual.hasExtra(name)) //
        .overridingErrorMessage("Expected intent extra <%s> but was not present", name) //
        .isTrue();
    return this;
  }
}
