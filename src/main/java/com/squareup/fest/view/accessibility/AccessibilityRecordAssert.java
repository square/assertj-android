// Copyright 2013 Square, Inc.
package com.squareup.fest.view.accessibility;

import android.view.accessibility.AccessibilityRecord;

/**
 * Assertions for {@link AccessibilityRecord} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractAccessibilityRecordAssert}.
 */
public final class AccessibilityRecordAssert
    extends AbstractAccessibilityRecordAssert<AccessibilityRecordAssert, AccessibilityRecord> {
  public AccessibilityRecordAssert(AccessibilityRecord actual) {
    super(actual, AccessibilityRecordAssert.class);
  }
}
