package org.fest.assertions.api.android.content;

import static org.fest.util.Objects.HASH_CODE_PRIME;
import static org.fest.util.Objects.areEqual;
import static org.fest.util.Objects.hashCodeFor;
import static org.fest.util.Strings.quote;

public class ContentValuesEntry {
  private final String key;
  private final Object value;

  public static ContentValuesEntry entry(String key, Object value) {
    return new ContentValuesEntry(key, value);
  }

  private ContentValuesEntry(String key, Object value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public Object getValue() {
    return value;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    ContentValuesEntry other = (ContentValuesEntry) obj;
    return areEqual(key, other.key) && areEqual(value, other.value);
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = HASH_CODE_PRIME * result + hashCodeFor(key);
    result = HASH_CODE_PRIME * result + hashCodeFor(value);
    return result;
  }

  @Override
  public String toString() {
    return String.format("%s[key=%s, value=%s]", getClass().getSimpleName(), quote(key), quote(value));
  }
}