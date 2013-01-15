// Copyright 2013 Square, Inc.
package com.squareup.fest.hardware.usb;

import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbRequest;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link UsbRequest} instances. */
public class UsbRequestAssert extends AbstractAssert<UsbRequestAssert, UsbRequest> {
  public UsbRequestAssert(UsbRequest actual) {
    super(actual, UsbRequestAssert.class);
  }

  public UsbRequestAssert hasClientData(Object data) {
    isNotNull();
    Object actualData = actual.getClientData();
    assertThat(actualData) //
        .overridingErrorMessage("Expected client data <%s> but was <%s>.", data, actualData) //
        .isEqualTo(data);
    return this;
  }

  public UsbRequestAssert hasEndpoint(UsbEndpoint endpoint) {
    isNotNull();
    UsbEndpoint actualEndpoint = actual.getEndpoint();
    assertThat(actualEndpoint) //
        .overridingErrorMessage("Expected endpoint <%s> but was <%s>.", endpoint, actualEndpoint) //
        .isEqualTo(endpoint);
    return this;
  }
}
