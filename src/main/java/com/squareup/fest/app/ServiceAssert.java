package com.squareup.fest.app;

import android.app.Service;

public final class ServiceAssert extends AbstractServiceAssert<ServiceAssert, Service> {
  public ServiceAssert(Service actual) {
    super(actual, ServiceAssert.class);
  }
}
