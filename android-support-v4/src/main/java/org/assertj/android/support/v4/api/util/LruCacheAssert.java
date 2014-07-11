// Copyright 2013 Square, Inc.
package org.assertj.android.support.v4.api.util;

import android.support.v4.util.LruCache;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link LruCache} instances. */
public class LruCacheAssert<K, V> extends AbstractAssert<LruCacheAssert<K, V>, LruCache<K, V>> {
  public LruCacheAssert(LruCache<K, V> actual) {
    super(actual, LruCacheAssert.class);
  }

  public LruCacheAssert<K, V> hasEntry(K key) {
    isNotNull();
    assertThat(actual.snapshot()) //
        .overridingErrorMessage("Expected to contain entry with key <%s> but did not.") //
        .containsKey(key);
    return this;
  }

  public LruCacheAssert<K, V> hasCreateCount(int count) {
    isNotNull();
    int actualCount = actual.createCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected create count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public LruCacheAssert<K, V> hasEvictionCount(int count) {
    isNotNull();
    int actualCount = actual.evictionCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected eviction count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public LruCacheAssert<K, V> hasHitCount(int count) {
    isNotNull();
    int actualCount = actual.hitCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected hit count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public LruCacheAssert<K, V> hasMaxSize(int size) {
    isNotNull();
    int actualSize = actual.maxSize();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected max size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }

  public LruCacheAssert<K, V> hasMissCount(int count) {
    isNotNull();
    int actualCount = actual.missCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected miss count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public LruCacheAssert<K, V> hasPutCount(int count) {
    isNotNull();
    int actualCount = actual.putCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected put count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public LruCacheAssert<K, V> hasSize(int size) {
    isNotNull();
    int actualSize = actual.size();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }
}
