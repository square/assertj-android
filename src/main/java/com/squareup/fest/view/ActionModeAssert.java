package com.squareup.fest.view;

import android.view.ActionMode;
import android.view.View;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public class ActionModeAssert extends AbstractAssert<ActionModeAssert, ActionMode> {
  public ActionModeAssert(ActionMode actual) {
    super(actual, ActionModeAssert.class);
  }

  public ActionModeAssert hasCustomView() {
    isNotNull();
    assertThat(actual.getCustomView()) //
        .overridingErrorMessage("Expected action mode custom view but was not present") //
        .isNotNull();
    return this;
  }

  public ActionModeAssert hasCustomView(View view) {
    isNotNull();
    View actualView = actual.getCustomView();
    assertThat(actualView) //
        .overridingErrorMessage("Expected action mode custom view <%s> but was <%s>", view,
            actualView) //
        .isEqualTo(view);
    return this;
  }

  public ActionModeAssert hasSubtitle(CharSequence subtitle) {
    isNotNull();
    CharSequence actualSubtitle = actual.getSubtitle();
    assertThat(actualSubtitle) //
        .overridingErrorMessage("Expected action mode subtitle <%s> but was <%s>", subtitle,
            actualSubtitle) //
        .isEqualTo(subtitle);
    return this;
  }

  public ActionModeAssert hasTag(Object tag) {
    isNotNull();
    Object actualTag = actual.getTag();
    assertThat(actualTag) //
        .overridingErrorMessage("Expected action mode tag <%s> but was <%s>", tag, actualTag) //
        .isEqualTo(tag);
    return this;
  }

  public ActionModeAssert hasTitle(CharSequence title) {
    isNotNull();
    CharSequence actualTitle = actual.getTitle();
    assertThat(actualTitle) //
        .overridingErrorMessage("Expected action mode title <%s> but was <%s>", title,
            actualTitle) //
        .isEqualTo(title);
    return this;
  }

  public ActionModeAssert hasOptionalTitleHint() {
    isNotNull();
    assertThat(actual.getTitleOptionalHint()) //
        .overridingErrorMessage("Expected optional action mode title hint but was not optional") //
        .isTrue();
    return this;
  }

  public ActionModeAssert hasNonOptionalTitleHint() {
    isNotNull();
    assertThat(actual.getTitleOptionalHint()) //
        .overridingErrorMessage("Expected non-optional action mode title hint but was optional") //
        .isFalse();
    return this;
  }

  public ActionModeAssert hasOptionalTitle() {
    isNotNull();
    assertThat(actual.isTitleOptional()) //
        .overridingErrorMessage("Expected optional action mode title but was not optional") //
        .isTrue();
    return this;
  }

  public ActionModeAssert hasNonOptionalTitle() {
    isNotNull();
    assertThat(actual.isTitleOptional()) //
        .overridingErrorMessage("Expected non-optional action mode title but was optional") //
        .isFalse();
    return this;
  }
}
