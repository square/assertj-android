package org.assertj.android.api.telephony;

import android.annotation.TargetApi;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthWcdma;

import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR2;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(JELLY_BEAN_MR2)
public class CellInfoWcdmaAssert extends AbstractAssert<CellInfoWcdmaAssert, CellInfoWcdma> {
  public CellInfoWcdmaAssert(CellInfoWcdma actual) {
    super(actual, CellInfoWcdmaAssert.class);
  }

  public CellInfoWcdmaAssert hasCellIdentity(CellIdentityWcdma cellIdentity) {
    isNotNull();
    CellIdentityWcdma actualCellIdentity = actual.getCellIdentity();
    assertThat(actualCellIdentity) //
        .overridingErrorMessage("Expected cell identity <%s> but was <%s>.", cellIdentity, actualCellIdentity) //
        .isEqualTo(cellIdentity);
    return this;
  }

  public CellInfoWcdmaAssert hasCellSignalStrength(CellSignalStrengthWcdma cellSignalStrength) {
    isNotNull();
    CellSignalStrengthWcdma actualCellSignalStrength = actual.getCellSignalStrength();
    assertThat(actualCellSignalStrength) //
        .overridingErrorMessage("Expected cell signal strength <%s> but was <%s>.", cellSignalStrength, actualCellSignalStrength) //
        .isEqualTo(cellSignalStrength);
    return this;
  }
}
