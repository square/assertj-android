package org.assertj.android.api.telephony;

import android.annotation.TargetApi;
import android.telephony.CellSignalStrengthWcdma;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR2;

@TargetApi(JELLY_BEAN_MR2)
public class CellSignalStrengthWcdmaAssert extends AbstractCellSignalStrengthAssert<CellSignalStrengthWcdmaAssert, CellSignalStrengthWcdma> {
  public CellSignalStrengthWcdmaAssert(CellSignalStrengthWcdma actual) {
    super(actual, CellSignalStrengthWcdmaAssert.class);
  }
}
