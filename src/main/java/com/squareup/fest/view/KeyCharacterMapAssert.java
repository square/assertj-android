package com.squareup.fest.view;

import android.view.KeyCharacterMap;
import org.fest.assertions.api.AbstractAssert;

import static android.view.KeyCharacterMap.ALPHA;
import static android.view.KeyCharacterMap.FULL;
import static android.view.KeyCharacterMap.NUMERIC;
import static android.view.KeyCharacterMap.PREDICTIVE;
import static android.view.KeyCharacterMap.SPECIAL_FUNCTION;
import static org.fest.assertions.api.Assertions.assertThat;

public class KeyCharacterMapAssert extends AbstractAssert<KeyCharacterMapAssert, KeyCharacterMap> {
  public KeyCharacterMapAssert(KeyCharacterMap actual) {
    super(actual, KeyCharacterMapAssert.class);
  }

  public KeyCharacterMapAssert hasKeyboardType(int type) {
    isNotNull();
    int actualType = actual.getKeyboardType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected keyboard type <%s> but was <%s>.",
            keyboardTypeToString(type), keyboardTypeToString(actualType)) //
        .isEqualTo(type);
    return this;
  }

  public KeyCharacterMapAssert hasModifierBehavior(int value) {
    isNotNull();
    int actualValue = actual.getModifierBehavior();
    assertThat(actualValue) //
        .overridingErrorMessage("Expected modifier behavior <%s> but was <%s>.", value,
            actualValue) //
        .isEqualTo(value);
    return this;
  }

  public static String keyboardTypeToString(int type) {
    switch (type) {
      case NUMERIC:
        return "numeric";
      case PREDICTIVE:
        return "predictive";
      case ALPHA:
        return "alpha";
      case FULL:
        return "full";
      case SPECIAL_FUNCTION:
        return "specialFunction";
      default:
        throw new IllegalArgumentException("Unknown keyboard type: " + type);
    }
  }
}
