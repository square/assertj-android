package org.assertj.android.api.view;

import android.annotation.TargetApi;
import android.view.VelocityTracker;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.FROYO;
import static org.assertj.core.api.Assertions.assertThat;

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

  @TargetApi(FROYO)
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

  @TargetApi(FROYO)
  public VelocityTrackerAssert hasYVelocity(int id, float velocity) {
    isNotNull();
    float actualVelocity = actual.getYVelocity(id);
    assertThat(actualVelocity) //
        .overridingErrorMessage("Expected Y velocity <%s> with ID %s but was <%s>", velocity, id,
            actualVelocity) //
        .isEqualTo(velocity);
    return this;
  }
}
