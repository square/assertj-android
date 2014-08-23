package org.assertj.android.api.telephony;

import android.telephony.ServiceState;
import org.assertj.core.api.AbstractAssert;

import static android.telephony.ServiceState.STATE_EMERGENCY_ONLY;
import static android.telephony.ServiceState.STATE_IN_SERVICE;
import static android.telephony.ServiceState.STATE_OUT_OF_SERVICE;
import static android.telephony.ServiceState.STATE_POWER_OFF;
import static org.assertj.android.internal.IntegerUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

public class ServiceStateAssert extends AbstractAssert<ServiceStateAssert, ServiceState> {
  public ServiceStateAssert(ServiceState actual) {
    super(actual, ServiceStateAssert.class);
  }

  public ServiceStateAssert isManualSelection() {
    isNotNull();
    assertThat(actual.getIsManualSelection()) //
        .overridingErrorMessage("Expected to have manual selection mode but had automatic.") //
        .isTrue();
    return this;
  }

  public ServiceStateAssert isAutomaticSelection() {
    isNotNull();
    assertThat(actual.getIsManualSelection()) //
        .overridingErrorMessage("Expected to have automatic selection mode but had manual.") //
        .isFalse();
    return this;
  }

  public ServiceStateAssert hasOperatorAlphaLong(String operatorAlphaLong) {
    isNotNull();
    String actualOperatorAlphaLong = actual.getOperatorAlphaLong();
    assertThat(actualOperatorAlphaLong) //
        .overridingErrorMessage(
            "Expected operator name in long alphanumeric format <%s> but was <%s>.",
            operatorAlphaLong, actualOperatorAlphaLong) //
        .isEqualTo(operatorAlphaLong);
    return this;
  }

  public ServiceStateAssert hasOperatorAlphaShort(String operatorAlphaShort) {
    isNotNull();
    String actualOperatorAlphaShort = actual.getOperatorAlphaShort();
    assertThat(actualOperatorAlphaShort) //
        .overridingErrorMessage(
            "Expected operator name in short alphanumeric format <%s> but was <%s>.",
            operatorAlphaShort, actualOperatorAlphaShort) //
        .isEqualTo(operatorAlphaShort);
    return this;
  }

  public ServiceStateAssert hasOperatorNumeric(String operatorNumeric) {
    isNotNull();
    String actualOperatorNumeric = actual.getOperatorNumeric();
    assertThat(actualOperatorNumeric) //
        .overridingErrorMessage("Expected operator numeric ID <%s> but was <%s>.", operatorNumeric,
            actualOperatorNumeric) //
        .isEqualTo(operatorNumeric);
    return this;
  }

  public ServiceStateAssert isRoaming() {
    isNotNull();
    assertThat(actual.getRoaming()) //
        .overridingErrorMessage("Expected to be in roaming but was not.") //
        .isTrue();
    return this;
  }

  public ServiceStateAssert isNotRoaming() {
    isNotNull();
    assertThat(actual.getRoaming()) //
        .overridingErrorMessage("Expected to not be in roaming but was.") //
        .isFalse();
    return this;
  }

  public ServiceStateAssert hasState(@ServiceStateState int state) {
    isNotNull();
    int actualState = actual.getState();
    //noinspection ResourceType
    assertThat(actualState) //
        .overridingErrorMessage("Expected state <%s> but was <%s>.", serviceStateToString(state),
            serviceStateToString(actualState)) //
        .isEqualTo(state);
    return this;
  }

  public static String serviceStateToString(@ServiceStateState int serviceState) {
    return buildNamedValueString(serviceState) //
        .value(STATE_EMERGENCY_ONLY, "emergency_only")
        .value(STATE_IN_SERVICE, "in_service")
        .value(STATE_OUT_OF_SERVICE, "out_of_service")
        .value(STATE_POWER_OFF, "power_off")
        .get();
  }
}
