package org.fest.assertions.api.android.content;

import android.content.ContentValues;
import org.fest.assertions.api.AbstractAssert;
import org.fest.assertions.core.WritableAssertionInfo;
import org.fest.assertions.internal.Failures;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.fest.assertions.error.ShouldContain.shouldContain;
import static org.fest.util.Objects.areEqual;

/** Assertions for {@link ContentValues} instances. */
public class ContentValuesAssert extends AbstractAssert<ContentValuesAssert, ContentValues> {
  public ContentValuesAssert(ContentValues actual) {
    super(actual, ContentValuesAssert.class);
  }

  public ContentValuesAssert isEmpty() {
    isNotNull();
    assertThat(actual.size())
        .overridingErrorMessage("Expected to be empty but was not.")
        .isZero();
    return this;
  }

  public ContentValuesAssert isNotEmpty() {
    isNotNull();
    assertThat(actual.size())
        .overridingErrorMessage("Expected to not be empty but was.")
        .isNotZero();
    return this;
  }

  public ContentValuesAssert containsKey(String key) {
    isNotNull();
    assertThat(actual.containsKey(key))
        .overridingErrorMessage("Expected key <%s> but was not found.", key)
        .isTrue();
    return this;
  }

  public ContentValuesAssert containsValue(Object expectedValue) {
    isNotNull();
    Set<Map.Entry<String, Object>> entries = actual.valueSet();
    List<Object> values = new ArrayList<Object>(entries.size());
    for (Map.Entry<String, Object> entry : entries) {
      values.add(entry.getValue());
    }
    assertThat(values)
         .overridingErrorMessage("Expected <%s> but was not found", expectedValue.toString())
         .contains(expectedValue);
    return this;
  }

  public ContentValuesAssert contains(ContentValuesEntry... entries) {
    isNotEmptyOrNull(entries);
    Set<ContentValuesEntry> notFound = new LinkedHashSet<ContentValuesEntry>();
    for (ContentValuesEntry entry : entries) {
      if (!containsEntry(actual, entry)) {
        notFound.add(entry);
      }
    }
    if (notFound.isEmpty()) {
      return this;
    }
    throw Failures.instance().failure(new WritableAssertionInfo(), shouldContain(actual, entries, notFound));
  }

  public ContentValuesAssert hasSize(int expected) {
    isNotNull();
    int size = actual.size();
    assertThat(size)
            .overridingErrorMessage("Expected size <%d> but was <%d>.", expected, size)
            .isEqualTo(expected);
    return this;
  }

  private void isNotEmptyOrNull(ContentValuesEntry[] entries) {
    if (entries == null) {
      throw new NullPointerException("The array of entries to look for should not be null");
    }
    if (entries.length == 0) {
      throw new IllegalArgumentException("The array of entries to look for should not be empty");
    }
  }

  private boolean containsEntry(ContentValues actual, ContentValuesEntry entry) {
    if (entry == null) {
      throw new NullPointerException("Entries to look for should not be null");
    }
    String key = entry.getKey();
    if (!actual.containsKey(key)) {
      return false;
    }
    return areEqual(actual.get(key), entry.getValue());
  }
}
