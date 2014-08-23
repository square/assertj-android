package org.assertj.android.api.telephony;

import android.annotation.TargetApi;
import android.telephony.CellSignalStrength;

import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(JELLY_BEAN_MR1)
public abstract class AbstractCellSignalStrengthAssert<S extends AbstractCellSignalStrengthAssert<S, A>, A extends CellSignalStrength> extends AbstractAssert<S, A> {
  protected AbstractCellSignalStrengthAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasAsuLevel(int level) {
    isNotNull();
    int actualLevel = actual.getAsuLevel();
    assertThat(actualLevel) //
        .overridingErrorMessage("Expected ASU level <%s> but was <%s>.", level, actualLevel) //
        .isEqualTo(level);
    return myself;
  }

  public S hasDbm(int dbm) {
    isNotNull();
    int actualDbm = actual.getDbm();
    assertThat(actualDbm) //
        .overridingErrorMessage("Expected dBm <%s> but was <%s>.", dbm, actualDbm) //
        .isEqualTo(dbm);
    return myself;
  }

  public S hasLevel(int level) {
    isNotNull();
    int actualLevel = actual.getLevel();
    assertThat(actualLevel) //
        .overridingErrorMessage("Expected level <%s> but was <%s>.", level, actualLevel) //
        .isEqualTo(level);
    return myself;
  }
}
