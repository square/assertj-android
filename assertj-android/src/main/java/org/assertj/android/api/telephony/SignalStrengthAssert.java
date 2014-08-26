package org.assertj.android.api.telephony;

import android.telephony.SignalStrength;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class SignalStrengthAssert extends AbstractAssert<SignalStrengthAssert, SignalStrength> {
  public SignalStrengthAssert(SignalStrength actual) {
    super(actual, SignalStrengthAssert.class);
  }

  public SignalStrengthAssert hasCdmaDbm(int dbm) {
    isNotNull();
    int actualDbm = actual.getCdmaDbm();
    assertThat(actualDbm) //
        .overridingErrorMessage("Expected CDMA dBm <%s> but was <%s>.", dbm, actualDbm) //
        .isEqualTo(dbm);
    return this;
  }

  public SignalStrengthAssert hasCdmaEcio(int ecio) {
    isNotNull();
    int actualEcio = actual.getCdmaEcio();
    assertThat(actualEcio) //
        .overridingErrorMessage("Expected CDMA Ec/Io <%s> but was <%s>.", ecio, actualEcio) //
        .isEqualTo(ecio);
    return this;
  }

  public SignalStrengthAssert hasEvdoDbm(int dbm) {
    isNotNull();
    int actualDbm = actual.getEvdoDbm();
    assertThat(actualDbm) //
        .overridingErrorMessage("Expected EVDO dBm <%s> but was <%s>.", dbm, actualDbm) //
        .isEqualTo(dbm);
    return this;
  }

  public SignalStrengthAssert hasEvdoEcio(int ecio) {
    isNotNull();
    int actualEcio = actual.getEvdoEcio();
    assertThat(actualEcio) //
        .overridingErrorMessage("Expected EVDO Ec/Io <%s> but was <%s>.", ecio, actualEcio) //
        .isEqualTo(ecio);
    return this;
  }

  public SignalStrengthAssert hasEvdoSnr(int snr) {
    isNotNull();
    int actualSnr = actual.getEvdoSnr();
    assertThat(actualSnr) //
        .overridingErrorMessage("Expected EVDO signal to noise ratio <%s> but was <%s>.", snr,
            actualSnr) //
        .isEqualTo(snr);
    return this;
  }

  public SignalStrengthAssert hasGsmSignalStrength(int signalStrength) {
    isNotNull();
    int actualSignalStrength = actual.getGsmSignalStrength();
    assertThat(actualSignalStrength) //
        .overridingErrorMessage("Expected GSM signal strength <%s> but was <%s>.", signalStrength,
            actualSignalStrength) //
        .isEqualTo(signalStrength);
    return this;
  }

  public SignalStrengthAssert isGsm() {
    isNotNull();
    assertThat(actual.isGsm()) //
        .overridingErrorMessage("Expected to be for GSM but was not.") //
        .isTrue();
    return this;
  }

  public SignalStrengthAssert isNotGsm() {
    isNotNull();
    assertThat(actual.isGsm()) //
        .overridingErrorMessage("Expected to not be for GSM but was.") //
        .isFalse();
    return this;
  }
}
