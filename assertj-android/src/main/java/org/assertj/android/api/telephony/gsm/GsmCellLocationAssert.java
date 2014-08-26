package org.assertj.android.api.telephony.gsm;

import android.annotation.TargetApi;
import android.telephony.gsm.GsmCellLocation;

import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.GINGERBREAD;
import static org.assertj.core.api.Assertions.assertThat;

public class GsmCellLocationAssert extends AbstractAssert<GsmCellLocationAssert, GsmCellLocation> {
  public GsmCellLocationAssert(GsmCellLocation actual) {
    super(actual, GsmCellLocationAssert.class);
  }

  public GsmCellLocationAssert hasCid(int cid) {
    isNotNull();
    int actualCid = actual.getCid();
    assertThat(actualCid) //
        .overridingErrorMessage("Expected CID <%s> but was <%s>.", cid, actualCid) //
        .isEqualTo(cid);
    return this;
  }

  public GsmCellLocationAssert hasLac(int lac) {
    isNotNull();
    int actualLac = actual.getLac();
    assertThat(actualLac) //
        .overridingErrorMessage("Expected LAC <%s> but was <%s>.", lac, actualLac) //
        .isEqualTo(lac);
    return this;
  }

  @TargetApi(GINGERBREAD)
  public GsmCellLocationAssert hasPsc(int psc) {
    isNotNull();
    int actualPsc = actual.getPsc();
    assertThat(actualPsc) //
        .overridingErrorMessage("Expected PSC <%s> but was <%s>.", psc, actualPsc) //
        .isEqualTo(psc);
    return this;
  }
}
