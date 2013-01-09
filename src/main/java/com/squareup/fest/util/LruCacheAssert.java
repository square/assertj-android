package com.squareup.fest.util;

import android.util.LruCache;
import com.squareup.fest.Assertions;
import org.fest.assertions.api.AbstractAssert;

public class LruCacheAssert extends AbstractAssert<LruCacheAssert, LruCache> {
  protected LruCacheAssert(LruCache actual) {
    super(actual, LruCacheAssert.class);
  }

  public LruCacheAssert hasCreateCount(int count) {
    isNotNull();
    int actualCount = actual.createCount();
    Assertions.assertThat(actualCount) //
        .overridingErrorMessage("Expected create count <%s> but was <%s>", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public LruCacheAssert hasEvictionCount(int count) {
    isNotNull();
    int actualCount = actual.evictionCount();
    Assertions.assertThat(actualCount) //
        .overridingErrorMessage("Expected eviction count <%s> but was <%s>", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public LruCacheAssert hasHitCount(int count) {
    isNotNull();
    int actualCount = actual.hitCount();
    Assertions.assertThat(actualCount) //
        .overridingErrorMessage("Expected hit count <%s> but was <%s>", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public LruCacheAssert hasMaxSize(int size) {
    isNotNull();
    int actualSize = actual.maxSize();
    Assertions.assertThat(actualSize) //
        .overridingErrorMessage("Expected max size <%s> but was <%s>", size, actualSize) //
        .isEqualTo(size);
    return this;
  }

  public LruCacheAssert hasMissCount(int count) {
    isNotNull();
    int actualCount = actual.missCount();
    Assertions.assertThat(actualCount) //
        .overridingErrorMessage("Expected miss count <%s> but was <%s>", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public LruCacheAssert hasPutCount(int count) {
    isNotNull();
    int actualCount = actual.putCount();
    Assertions.assertThat(actualCount) //
        .overridingErrorMessage("Expected put count <%s> but was <%s>", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public LruCacheAssert hasSize(int size) {
    isNotNull();
    int actualSize = actual.size();
    Assertions.assertThat(actualSize) //
        .overridingErrorMessage("Expected size <%s> but was <%s>", size, actualSize) //
        .isEqualTo(size);
    return this;
  }
}
