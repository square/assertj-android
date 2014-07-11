package org.assertj.android.api.content;

import android.content.SharedPreferences;
import java.util.Set;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.data.MapEntry;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractSharedPreferencesAssert
    <S extends AbstractSharedPreferencesAssert<S, A>, A extends SharedPreferences>
    extends AbstractAssert<S, A> {

  protected AbstractSharedPreferencesAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasKey(String key) {
    isNotNull();
    assertThat(actual.contains(key))
        .overridingErrorMessage("Expected key <%s> to be present but it was not.", key)
        .isTrue();
    return myself;
  }

  public S doesNotHaveKey(String key) {
    isNotNull();
    assertThat(actual.contains(key))
        .overridingErrorMessage("Expected key <%s> not to be present but it was.", key)
        .isFalse();
    return myself;
  }

  public S contains(String key, String value) {
    isNotNull();
    assertThat(actual.getAll())
        .overridingErrorMessage("Expected preferences to contain <%s> but it does not.",
            stringOf(key, value))
        .contains(MapEntry.entry(key, value));

    return myself;
  }

  public S doesNotContain(String key, String value) {
    isNotNull();
    assertThat(actual.getAll())
        .overridingErrorMessage("Expected preferences not to contain <%s> but it does.",
            stringOf(key, value))
        .doesNotContain(MapEntry.entry(key, value));
    return myself;
  }

  public S contains(String key, int value) {
    isNotNull();
    assertThat(actual.getAll())
        .overridingErrorMessage("Expected preferences to contain <%s> but it does not.",
            stringOf(key, value))
        .contains(MapEntry.entry(key, value));
    return myself;
  }

  public S doesNotContain(String key, int value) {
    isNotNull();
    assertThat(actual.getAll())
        .overridingErrorMessage("Expected preferences not to contain <%s> but it does.",
            stringOf(key, value))
        .doesNotContain(MapEntry.entry(key, value));
    return myself;
  }

  public S contains(String key, boolean value) {
    isNotNull();
    assertThat(actual.getAll())
        .overridingErrorMessage("Expected preferences to contain <%s> but it does not.",
            stringOf(key, value))
        .contains(MapEntry.entry(key, value));
    return myself;
  }

  public S doesNotContain(String key, boolean value) {
    isNotNull();
    assertThat(actual.getAll())
        .overridingErrorMessage("Expected preferences not to contain <%s> but it does.",
            stringOf(key, value))
        .doesNotContain(MapEntry.entry(key, value));
    return myself;
  }

  public S contains(String key, float value) {
    isNotNull();
    assertThat(actual.getAll())
        .overridingErrorMessage("Expected preferences to contain <%s> but it does not.",
            stringOf(key, value))
        .contains(MapEntry.entry(key, value));
    return myself;
  }

  public S doesNotContain(String key, float value) {
    isNotNull();
    assertThat(actual.getAll())
        .overridingErrorMessage("Expected preferences not to contain <%s> but it does.",
            stringOf(key, value))
        .doesNotContain(MapEntry.entry(key, value));
    return myself;
  }

  public S contains(String key, long value) {
    isNotNull();
    assertThat(actual.getAll())
        .overridingErrorMessage("Expected preferences to contain <%s> but it does not.",
            stringOf(key, value))
        .contains(MapEntry.entry(key, value));
    return myself;
  }

  public S doesNotContain(String key, long value) {
    isNotNull();
    assertThat(actual.getAll())
        .overridingErrorMessage("Expected preferences not to contain <%s> but it does.",
            stringOf(key, value))
        .doesNotContain(MapEntry.entry(key, value));
    return myself;
  }

  public S contains(String key, Set<String> value) {
    isNotNull();
    assertThat(actual.getAll())
        .overridingErrorMessage("Expected preferences to contain <%s> but it does not.",
            stringOf(key, value))
        .contains(MapEntry.entry(key, value));
    return myself;
  }

  public S doesNotContain(String key, Set<String> value) {
    isNotNull();
    assertThat(actual.getAll())
        .overridingErrorMessage("Expected preferences not to contain <%s> but it does.",
            stringOf(key, value))
        .doesNotContain(MapEntry.entry(key, value));
    return myself;
  }

  private static String stringOf(String key, Object value) {
    return "{" + key + "=" + value + '}';
  }
}
