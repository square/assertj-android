package org.assertj.android.api.telephony;

import android.annotation.TargetApi;
import android.telephony.CellIdentityCdma;
import android.telephony.CellInfoCdma;
import android.telephony.CellSignalStrengthCdma;

import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(JELLY_BEAN_MR1)
public class CellInfoCdmaAssert extends AbstractAssert<CellInfoCdmaAssert, CellInfoCdma> {
  public CellInfoCdmaAssert(CellInfoCdma actual) {
    super(actual, CellInfoCdmaAssert.class);
  }

  public CellInfoCdmaAssert hasCellIdentity(CellIdentityCdma cellIdentity) {
    isNotNull();
    CellIdentityCdma actualCellIdentity = actual.getCellIdentity();
    assertThat(actualCellIdentity) //
        .overridingErrorMessage("Expected cell identity <%s> but was <%s>.", cellIdentity, actualCellIdentity) //
        .isEqualTo(cellIdentity);
    return this;
  }

  public CellInfoCdmaAssert hasCellSignalStrength(CellSignalStrengthCdma cellSignalStrength) {
    isNotNull();
    CellSignalStrengthCdma actualCellSignalStrength = actual.getCellSignalStrength();
    assertThat(actualCellSignalStrength) //
        .overridingErrorMessage("Expected cell signal strength <%s> but was <%s>.", cellSignalStrength, actualCellSignalStrength) //
        .isEqualTo(cellSignalStrength);
    return this;
  }
}
