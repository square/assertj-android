// Copyright 2013 Square, Inc.
package org.assertj.android.api.hardware.usb;

import android.annotation.TargetApi;
import android.hardware.usb.UsbDevice;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB_MR1;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link UsbDevice} instances. */
@TargetApi(HONEYCOMB_MR1)
public class UsbDeviceAssert extends AbstractAssert<UsbDeviceAssert, UsbDevice> {
  public UsbDeviceAssert(UsbDevice actual) {
    super(actual, UsbDeviceAssert.class);
  }

  public UsbDeviceAssert hasDeviceClass(int value) {
    isNotNull();
    int actualValue = actual.getDeviceClass();
    assertThat(actualValue) //
        .overridingErrorMessage("Expected device class <%s> but was <%s>.", value, actualValue) //
        .isEqualTo(value);
    return this;
  }

  public UsbDeviceAssert hasDeviceId(int id) {
    isNotNull();
    int actualId = actual.getDeviceId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected device id <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public UsbDeviceAssert hasDeviceName(String name) {
    isNotNull();
    String actualName = actual.getDeviceName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected device name <%s> but was <%s>.", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public UsbDeviceAssert hasDeviceProtocol(int protocol) {
    isNotNull();
    int actualProtocol = actual.getDeviceProtocol();
    assertThat(actualProtocol) //
        .overridingErrorMessage("Expected device protocol <%s> but was <%s>.", protocol,
            actualProtocol) //
        .isEqualTo(protocol);
    return this;
  }

  public UsbDeviceAssert hasDeviceSubclass(int subclass) {
    isNotNull();
    int actualSubclass = actual.getDeviceSubclass();
    assertThat(actualSubclass) //
        .overridingErrorMessage("Expected device subclass <%s> but was <%s>.", subclass,
            actualSubclass) //
        .isEqualTo(subclass);
    return this;
  }

  public UsbDeviceAssert hasInterfaceCount(int count) {
    isNotNull();
    int actualCount = actual.getInterfaceCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected interface count <%s> but was <%s>.", count,
            actualCount) //
        .isEqualTo(count);
    return this;
  }

  public UsbDeviceAssert hasProductId(int id) {
    isNotNull();
    int actualId = actual.getProductId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected product ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public UsbDeviceAssert hasVendorId(int id) {
    isNotNull();
    int actualId = actual.getVendorId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected vendor ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }
}
