package org.assertj.android.api.telephony;

import android.annotation.TargetApi;
import android.telephony.CellSignalStrengthCdma;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(JELLY_BEAN_MR1)
public class CellSignalStrengthCdmaAssert extends AbstractCellSignalStrengthAssert<CellSignalStrengthCdmaAssert, CellSignalStrengthCdma> {
  public CellSignalStrengthCdmaAssert(CellSignalStrengthCdma actual) {
    super(actual, CellSignalStrengthCdmaAssert.class);
  }

  public CellSignalStrengthCdmaAssert hasCdmaDbm(int dbm) {
    isNotNull();
    int actualDbm = actual.getCdmaDbm();
    assertThat(actualDbm) //
        .overridingErrorMessage("Expected CDMA dBm <%s> but was <%s>.", dbm, actualDbm) //
        .isEqualTo(dbm);
    return this;
  }

  public CellSignalStrengthCdmaAssert hasCdmaEcio(int ecio) {
    isNotNull();
    int actualEcio = actual.getCdmaEcio();
    assertThat(actualEcio) //
        .overridingErrorMessage("Expected CDMA Ec/Io <%s> but was <%s>.", ecio, actualEcio) //
        .isEqualTo(ecio);
    return this;
  }

  public CellSignalStrengthCdmaAssert hasCdmaLevel(int level) {
    isNotNull();
    int actualLevel = actual.getCdmaLevel();
    assertThat(actualLevel) //
        .overridingErrorMessage("Expected CDMA level <%s> but was <%s>.", level, actualLevel) //
        .isEqualTo(level);
    return this;
  }

  public CellSignalStrengthCdmaAssert hasEvdoDbm(int dbm) {
    isNotNull();
    int actualDbm = actual.getEvdoDbm();
    assertThat(actualDbm) //
        .overridingErrorMessage("Expected EVDO dBm <%s> but was <%s>.", dbm, actualDbm) //
        .isEqualTo(dbm);
    return this;
  }

  public CellSignalStrengthCdmaAssert hasEvdoEcio(int ecio) {
    isNotNull();
    int actualEcio = actual.getEvdoEcio();
    assertThat(actualEcio) //
        .overridingErrorMessage("Expected EVDO Ec/Io <%s> but was <%s>.", ecio, actualEcio) //
        .isEqualTo(ecio);
    return this;
  }

  public CellSignalStrengthCdmaAssert hasEvdoLevel(int level) {
    isNotNull();
    int actualLevel = actual.getEvdoLevel();
    assertThat(actualLevel) //
        .overridingErrorMessage("Expected EVDO level <%s> but was <%s>.", level, actualLevel) //
        .isEqualTo(level);
    return this;
  }

  public CellSignalStrengthCdmaAssert hasEvdoSnr(int snr) {
    isNotNull();
    int actualSnr = actual.getEvdoSnr();
    assertThat(actualSnr) //
        .overridingErrorMessage("Expected EVDO signal to noise ratio <%s> but was <%s>.", snr, actualSnr) //
        .isEqualTo(snr);
    return this;
  }
}
