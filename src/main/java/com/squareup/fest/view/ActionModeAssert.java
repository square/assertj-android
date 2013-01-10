package com.squareup.fest.view;

import android.view.ActionMode;
import android.view.View;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link ActionMode} instances. */
public class ActionModeAssert extends AbstractAssert<ActionModeAssert, ActionMode> {
  public ActionModeAssert(ActionMode actual) {
    super(actual, ActionModeAssert.class);
  }

  public ActionModeAssert hasCustomView() {
    isNotNull();
    assertThat(actual.getCustomView()) //
        .overridingErrorMessage("Expected custom view but was not present.") //
        .isNotNull();
    return this;
  }

  public ActionModeAssert hasCustomView(View view) {
    isNotNull();
    View actualView = actual.getCustomView();
    assertThat(actualView) //
        .overridingErrorMessage("Expected custom view <%s> but was <%s>.", view, actualView) //
        .isEqualTo(view);
    return this;
  }

  public ActionModeAssert hasSubtitle(CharSequence subtitle) {
    isNotNull();
    CharSequence actualSubtitle = actual.getSubtitle();
    assertThat(actualSubtitle) //
        .overridingErrorMessage("Expected subtitle <%s> but was <%s>.", subtitle, actualSubtitle) //
        .isEqualTo(subtitle);
    return this;
  }

  public ActionModeAssert hasTag(Object tag) {
    isNotNull();
    Object actualTag = actual.getTag();
    assertThat(actualTag) //
        .overridingErrorMessage("Expected tag <%s> but was <%s>.", tag, actualTag) //
        .isEqualTo(tag);
    return this;
  }

  public ActionModeAssert hasTitle(CharSequence title) {
    isNotNull();
    CharSequence actualTitle = actual.getTitle();
    assertThat(actualTitle) //
        .overridingErrorMessage("Expected title <%s> but was <%s>.", title, actualTitle) //
        .isEqualTo(title);
    return this;
  }

  public ActionModeAssert hasOptionalTitleHint() {
    isNotNull();
    assertThat(actual.getTitleOptionalHint()) //
        .overridingErrorMessage("Expected to have optional title hint but was not optional.") //
        .isTrue();
    return this;
  }

  public ActionModeAssert hasNonOptionalTitleHint() {
    isNotNull();
    assertThat(actual.getTitleOptionalHint()) //
        .overridingErrorMessage("Expected to have non-optional title hint but was optional.") //
        .isFalse();
    return this;
  }

  public ActionModeAssert hasOptionalTitle() {
    isNotNull();
    assertThat(actual.isTitleOptional()) //
        .overridingErrorMessage("Expected to have optional title but was not optional.") //
        .isTrue();
    return this;
  }

  public ActionModeAssert hasNonOptionalTitle() {
    isNotNull();
    assertThat(actual.isTitleOptional()) //
        .overridingErrorMessage("Expected to have non-optional title but was optional.") //
        .isFalse();
    return this;
  }
}
