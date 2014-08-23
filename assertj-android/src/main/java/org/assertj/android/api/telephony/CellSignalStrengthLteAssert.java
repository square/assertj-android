package org.assertj.android.api.telephony;

import android.annotation.TargetApi;
import android.telephony.CellSignalStrengthLte;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(JELLY_BEAN_MR1)
public class CellSignalStrengthLteAssert extends AbstractCellSignalStrengthAssert<CellSignalStrengthLteAssert, CellSignalStrengthLte> {
  public CellSignalStrengthLteAssert(CellSignalStrengthLte actual) {
    super(actual, CellSignalStrengthLteAssert.class);
  }

  public CellSignalStrengthLteAssert hasTimingAdvance(int timingAdvance) {
    isNotNull();
    int actualTimingAdvance = actual.getTimingAdvance();
    assertThat(actualTimingAdvance) //
        .overridingErrorMessage("Expected timing advance <%s> but was <%s>.", timingAdvance, actualTimingAdvance) //
        .isEqualTo(timingAdvance);
    return this;
  }
}
