// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.hardware.usb;

import android.hardware.usb.UsbEndpoint;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link UsbEndpoint} instances. */
public class UsbEndpointAssert extends AbstractAssert<UsbEndpointAssert, UsbEndpoint> {
  public UsbEndpointAssert(UsbEndpoint actual) {
    super(actual, UsbEndpointAssert.class);
  }

  public UsbEndpointAssert hasAddress(int address) {
    isNotNull();
    int actualAddress = actual.getAddress();
    assertThat(actualAddress) //
        .overridingErrorMessage("Expected address <%s> but was <%s>.", address, actualAddress) //
        .isEqualTo(address);
    return this;
  }

  public UsbEndpointAssert hasAttributes(int attributes) {
    isNotNull();
    int actualAttributes = actual.getAttributes();
    assertThat(actualAttributes) //
        .overridingErrorMessage("Expected attributes <%s> but was <%s>.", attributes,
            actualAttributes) //
        .isEqualTo(attributes);
    return this;
  }

  public UsbEndpointAssert hasDirection(int direction) {
    isNotNull();
    int actualDirection = actual.getDirection();
    assertThat(actualDirection) //
        .overridingErrorMessage("Expected direction <%s> but was <%s>.", direction,
            actualDirection) //
        .isEqualTo(direction);
    return this;
  }

  public UsbEndpointAssert hasEndpointNumber(int number) {
    isNotNull();
    int actualNumber = actual.getEndpointNumber();
    assertThat(actualNumber) //
        .overridingErrorMessage("Expected endpoint number <%s> but was <%s>.", number,
            actualNumber) //
        .isEqualTo(number);
    return this;
  }

  public UsbEndpointAssert hasInterval(int interval) {
    isNotNull();
    int actualInterval = actual.getInterval();
    assertThat(actualInterval) //
        .overridingErrorMessage("Expected interval <%s> but was <%s>.", interval, actualInterval) //
        .isEqualTo(interval);
    return this;
  }

  public UsbEndpointAssert hasMaximumPacketSize(int size) {
    isNotNull();
    int actualSize = actual.getMaxPacketSize();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected maximum packet size <%s> but was <%s>.", size,
            actualSize) //
        .isEqualTo(size);
    return this;
  }

  public UsbEndpointAssert hasType(int type) {
    isNotNull();
    int actualType = actual.getType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected type <%s> but was <%s>.", type, actualType) //
        .isEqualTo(type);
    return this;
  }
}
