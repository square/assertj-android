package org.assertj.android.api.telephony;

import android.annotation.TargetApi;
import android.telephony.CellIdentityLte;
import android.telephony.CellInfoLte;
import android.telephony.CellSignalStrengthLte;

import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(JELLY_BEAN_MR1)
public class CellInfoLteAssert extends AbstractAssert<CellInfoLteAssert, CellInfoLte> {
  public CellInfoLteAssert(CellInfoLte actual) {
    super(actual, CellInfoLteAssert.class);
  }

  public CellInfoLteAssert hasCellIdentity(CellIdentityLte cellIdentity) {
    isNotNull();
    CellIdentityLte actualCellIdentity = actual.getCellIdentity();
    assertThat(actualCellIdentity) //
        .overridingErrorMessage("Expected cell identity <%s> but was <%s>.", cellIdentity, actualCellIdentity) //
        .isEqualTo(cellIdentity);
    return this;
  }

  public CellInfoLteAssert hasCellSignalStrength(CellSignalStrengthLte cellSignalStrength) {
    isNotNull();
    CellSignalStrengthLte actualCellSignalStrength = actual.getCellSignalStrength();
    assertThat(actualCellSignalStrength) //
        .overridingErrorMessage("Expected cell signal strength <%s> but was <%s>.", cellSignalStrength, actualCellSignalStrength) //
        .isEqualTo(cellSignalStrength);
    return this;
  }
}
