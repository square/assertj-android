package org.fest.assertions.api.android.view;

import android.view.VelocityTracker;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link VelocityTracker} instances. */
public class VelocityTrackerAssert extends AbstractAssert<VelocityTrackerAssert, VelocityTracker> {
  public VelocityTrackerAssert(VelocityTracker actual) {
    super(actual, VelocityTrackerAssert.class);
  }

  public VelocityTrackerAssert hasXVelocity(float velocity) {
    isNotNull();
    float actualVelocity = actual.getXVelocity();
    assertThat(actualVelocity) //
        .overridingErrorMessage("Expected X velocity <%s> but was <%s>", velocity,
            actualVelocity) //
        .isEqualTo(velocity);
    return this;
  }

  public VelocityTrackerAssert hasXVelocity(int id, float velocity) {
    isNotNull();
    float actualVelocity = actual.getXVelocity(id);
    assertThat(actualVelocity) //
        .overridingErrorMessage("Expected X velocity <%s> with ID %s but was <%s>", velocity, id,
            actualVelocity) //
        .isEqualTo(velocity);
    return this;
  }

  public VelocityTrackerAssert hasYVelocity(float velocity) {
    isNotNull();
    float actualVelocity = actual.getYVelocity();
    assertThat(actualVelocity) //
        .overridingErrorMessage("Expected Y velocity <%s> but was <%s>", velocity,
            actualVelocity) //
        .isEqualTo(velocity);
    return this;
  }

  public VelocityTrackerAssert hasYVelocity(int id, float velocity) {
    isNotNull();
    float actualVelocity = actual.getYVelocity(id);
    assertThat(actualVelocity) //
        .overridingErrorMessage("Expected Y velocity <%s> with ID %s but was <%s>", velocity, id,
            actualVelocity) //
        .isEqualTo(velocity);
    return this;
  }

  // TODO API 17
  //public VelocityTrackerAssert isPooled() {
  //  isNotNull();
  //  assertThat(actual.isPooled()) //
  //      .overrideErrorMessage("Expected to be pooled but was not pooled") //
  //      .isTrue();
  //  return this;
  //}
  //
  //public VelocityTrackerAssert isNotPooled() {
  //  isNotNull();
  //  assertThat(actual.isPooled()) //
  //      .overrideErrorMessage("Expected to not be pooled but was pooled") //
  //      .isFalse();
  //  return this;
  //}
}
