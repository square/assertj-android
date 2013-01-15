// Copyright 2013 Square, Inc.
package com.squareup.fest.hardware.usb;

import android.hardware.usb.UsbDeviceConnection;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link UsbDeviceConnection} instances. */
public class UsbDeviceConnectionAssert
    extends AbstractAssert<UsbDeviceConnectionAssert, UsbDeviceConnection> {
  public UsbDeviceConnectionAssert(UsbDeviceConnection actual) {
    super(actual, UsbDeviceConnectionAssert.class);
  }

  public UsbDeviceConnectionAssert hasFileDescriptor(int descriptor) {
    isNotNull();
    int actualDescriptor = actual.getFileDescriptor();
    assertThat(actualDescriptor) //
        .overridingErrorMessage("Expected file descriptor <%s> but was <%s>.", descriptor,
            actualDescriptor) //
        .isEqualTo(descriptor);
    return this;
  }

  public UsbDeviceConnectionAssert hasRawDescriptors(byte[] descriptors) {
    isNotNull();
    byte[] actualDescriptors = actual.getRawDescriptors();
    assertThat(actualDescriptors) //
        .overridingErrorMessage("Expected raw descriptors <%s> but was <%s>.", descriptors,
            actualDescriptors) //
        .isEqualTo(descriptors);
    return this;
  }

  public UsbDeviceConnectionAssert hasSerial(String serial) {
    isNotNull();
    String actualSerial = actual.getSerial();
    assertThat(actualSerial) //
        .overridingErrorMessage("Expected serial <%s> but was <%s>.", serial, actualSerial) //
        .isEqualTo(serial);
    return this;
  }
}
