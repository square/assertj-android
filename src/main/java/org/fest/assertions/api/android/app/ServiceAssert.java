package org.fest.assertions.api.android.app;

import android.app.Service;

/**
 * Assertions for {@link Service} instances.
 * <p/>
 * This class is final. To extend use {@link AbstractServiceAssert}.
 */
public final class ServiceAssert extends AbstractServiceAssert<ServiceAssert, Service> {
  public ServiceAssert(Service actual) {
    super(actual, ServiceAssert.class);
  }
}
