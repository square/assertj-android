package org.fest.assertions.api.android.view;

import android.view.KeyEvent;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assetions for {@link KeyEvent} instances. */
public class KeyEventAssert extends AbstractInputEventAssert<KeyEventAssert, KeyEvent> {
  public KeyEventAssert(KeyEvent actual) {
    super(actual, KeyEventAssert.class);
  }

  public KeyEventAssert hasAction(int action) {
    isNotNull();
    int actualAction = actual.getAction();
    assertThat(actualAction) //
        .overridingErrorMessage("Expected action <%s> but was <%s>", action, actualAction) //
        .isEqualTo(action);
    return this;
  }

  public KeyEventAssert hasDisplayLabel(char label) {
    isNotNull();
    char actualLabel = actual.getDisplayLabel();
    assertThat(actualLabel) //
        .overridingErrorMessage("Expected label <%s> but was <%s>", label, actualLabel) //
        .isEqualTo(label);
    return this;
  }

  public KeyEventAssert hasDownTime(long time) {
    isNotNull();
    long actualTime = actual.getDownTime();
    assertThat(actualTime) //
        .overridingErrorMessage("Expected time <%s> but was <%s>", time, actualTime) //
        .isEqualTo(time);
    return this;
  }

  public KeyEventAssert hasKeyCode(int keyCode) {
    isNotNull();
    int actualKeyCode = actual.getKeyCode();
    assertThat(actualKeyCode) //
        .overridingErrorMessage("Expected key code <%s> but was <%s>", keyCode, actualKeyCode) //
        .isEqualTo(keyCode);
    return this;
  }

  public KeyEventAssert hasRepeatCount(int count) {
    isNotNull();
    int actualCount = actual.getRepeatCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected repeat count <%s> but was <%s>", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public KeyEventAssert hasSource(int source) {
    isNotNull();
    int actualSource = actual.getSource();
    assertThat(actualSource) //
        .overridingErrorMessage("Expected source <%s> but was <%s>", source, actualSource) //
        .isEqualTo(source);
    return this;
  }

  public KeyEventAssert hasModifiers(int modifiers) {
    isNotNull();
    assertThat(actual.hasModifiers(modifiers)) //
        .overridingErrorMessage("Expected modifiers <%s> but was not present", modifiers) //
        .isTrue();
    return this;
  }

  public KeyEventAssert hasNoModifiers() {
    isNotNull();
    assertThat(actual.hasNoModifiers()) //
        .overridingErrorMessage("Expected to have no modifiers but modifiers present") //
        .isTrue();
    return this;
  }

  // TODO all the 'is' methods
}
