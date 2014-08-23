package org.assertj.android.api.telephony;

import android.annotation.TargetApi;
import android.telephony.CellSignalStrengthGsm;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;

@TargetApi(JELLY_BEAN_MR1)
public class CellSignalStrengthGsmAssert extends AbstractCellSignalStrengthAssert<CellSignalStrengthGsmAssert, CellSignalStrengthGsm> {
  public CellSignalStrengthGsmAssert(CellSignalStrengthGsm actual) {
    super(actual, CellSignalStrengthGsmAssert.class);
  }
}
