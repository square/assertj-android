package org.assertj.android.api.telephony;

import android.annotation.TargetApi;
import android.telephony.CellIdentityGsm;
import android.telephony.CellInfoGsm;
import android.telephony.CellSignalStrengthGsm;

import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(JELLY_BEAN_MR1)
public class CellInfoGsmAssert extends AbstractAssert<CellInfoGsmAssert, CellInfoGsm> {
  public CellInfoGsmAssert(CellInfoGsm actual) {
    super(actual, CellInfoGsmAssert.class);
  }

  public CellInfoGsmAssert hasCellIdentity(CellIdentityGsm cellIdentity) {
    isNotNull();
    CellIdentityGsm actualCellIdentity = actual.getCellIdentity();
    assertThat(actualCellIdentity) //
        .overridingErrorMessage("Expected cell identity <%s> but was <%s>.", cellIdentity, actualCellIdentity) //
        .isEqualTo(cellIdentity);
    return this;
  }

  public CellInfoGsmAssert hasCellSignalStrength(CellSignalStrengthGsm cellSignalStrength) {
    isNotNull();
    CellSignalStrengthGsm actualCellSignalStrength = actual.getCellSignalStrength();
    assertThat(actualCellSignalStrength) //
        .overridingErrorMessage("Expected cell signal strength <%s> but was <%s>.", cellSignalStrength, actualCellSignalStrength) //
        .isEqualTo(cellSignalStrength);
    return this;
  }
}
