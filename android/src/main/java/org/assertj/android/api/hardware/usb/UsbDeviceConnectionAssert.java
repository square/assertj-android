// Copyright 2013 Square, Inc.
package org.assertj.android.api.hardware.usb;

import android.annotation.TargetApi;
import android.hardware.usb.UsbDeviceConnection;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB_MR1;
import static android.os.Build.VERSION_CODES.HONEYCOMB_MR2;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link UsbDeviceConnection} instances. */
@TargetApi(HONEYCOMB_MR1)
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

  @TargetApi(HONEYCOMB_MR2)
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
