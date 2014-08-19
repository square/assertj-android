// Copyright 2013 Square, Inc.
package org.assertj.android.api.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.TargetApi;
import org.assertj.core.api.AbstractAssert;

import static android.accessibilityservice.AccessibilityServiceInfo.CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY;
import static android.accessibilityservice.AccessibilityServiceInfo.CAPABILITY_CAN_REQUEST_FILTER_KEY_EVENTS;
import static android.accessibilityservice.AccessibilityServiceInfo.CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION;
import static android.accessibilityservice.AccessibilityServiceInfo.CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT;
import static android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH;
import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR2;
import static org.assertj.android.internal.IntegerUtils.buildBitMaskString;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link AccessibilityServiceInfo} instances. */
public class AccessibilityServiceInfoAssert
    extends AbstractAssert<AccessibilityServiceInfoAssert, AccessibilityServiceInfo> {
  public AccessibilityServiceInfoAssert(AccessibilityServiceInfo actual) {
    super(actual, AccessibilityServiceInfoAssert.class);
  }

  @TargetApi(JELLY_BEAN_MR2)
  public AccessibilityServiceInfoAssert hasCapabilities(@AccessibilityServiceInfoCapabilities int capabilities) {
    isNotNull();
    int actualCapabilities = actual.getCapabilities();
    //noinspection ResourceType
    assertThat(actualCapabilities) //
        .overridingErrorMessage("Expected capabilities <%s> but was <%s>.",
            capabilitiesToString(capabilities), capabilitiesToString(actualCapabilities)) //
        .isEqualTo(capabilities);
    return this;
  }

  @TargetApi(JELLY_BEAN_MR2)
  public AccessibilityServiceInfoAssert hasDescription(String description) {
    isNotNull();
    String actualDescription = actual.getDescription();
    assertThat(actualDescription) //
        .overridingErrorMessage("Expected description <%s> but was <%s>.", description,
            actualDescription) //
        .isEqualTo(description);
    return this;
  }

  @TargetApi(ICE_CREAM_SANDWICH)
  public AccessibilityServiceInfoAssert hasId(String id) {
    isNotNull();
    String actualId = actual.getId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  @TargetApi(ICE_CREAM_SANDWICH)
  public AccessibilityServiceInfoAssert hasSettingsActivityName(String name) {
    isNotNull();
    String actualName = actual.getSettingsActivityName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected settings activity name <%s> but was <%s>.", name,
            actualName) //
        .isEqualTo(name);
    return this;
  }

  public static String capabilitiesToString(@AccessibilityServiceInfoCapabilities int capabilities) {
    return buildBitMaskString(capabilities)
        .flag(CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY, "request_enhanced_web_accessibility")
        .flag(CAPABILITY_CAN_REQUEST_FILTER_KEY_EVENTS, "request_filter_key_events")
        .flag(CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION, "request_touch_exploration")
        .flag(CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT, "retrieve_window_content")
        .get();
  }
}
