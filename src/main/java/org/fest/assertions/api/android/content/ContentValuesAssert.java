package org.fest.assertions.api.android.content;

import android.content.ContentValues;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link ContentValues} instances. */
public class ContentValuesAssert extends AbstractAssert<ContentValuesAssert, ContentValues> {
  public ContentValuesAssert(ContentValues actual) {
    super(actual, ContentValuesAssert.class);
  }

  public ContentValuesAssert isEmpty() {
    isNotNull();
    assertThat(actual.size())
        .overridingErrorMessage("Expected to be empty but was not.")
        .isEqualTo(0);
    return this;
  }

  public ContentValuesAssert isNotEmpty() {
    isNotNull();
    assertThat(actual.size())
        .overridingErrorMessage("Expected to not be empty but was.")
        .isNotEqualTo(0);
    return this;
  }

  public ContentValuesAssert containsKey(String key) {
    isNotNull();
    assertThat(actual.containsKey(key))
        .overridingErrorMessage("Expected key <%s> but was not found.", key)
        .isTrue();
    return this;
  }
}
