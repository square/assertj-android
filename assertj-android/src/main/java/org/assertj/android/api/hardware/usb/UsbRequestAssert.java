// Copyright 2013 Square, Inc.
package org.assertj.android.api.hardware.usb;

import android.annotation.TargetApi;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbRequest;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB_MR1;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link UsbRequest} instances. */
@TargetApi(HONEYCOMB_MR1)
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
