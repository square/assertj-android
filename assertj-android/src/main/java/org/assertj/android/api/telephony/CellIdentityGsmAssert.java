package org.assertj.android.api.telephony;

import android.annotation.TargetApi;
import android.telephony.CellIdentityGsm;

import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(JELLY_BEAN_MR1)
public class CellIdentityGsmAssert extends AbstractAssert<CellIdentityGsmAssert, CellIdentityGsm> {
  public CellIdentityGsmAssert(CellIdentityGsm actual) {
    super(actual, CellIdentityGsmAssert.class);
  }

  public CellIdentityGsmAssert hasCid(int cid) {
    isNotNull();
    int actualCid = actual.getCid();
    assertThat(actualCid) //
        .overridingErrorMessage("Expected CID <%s> but was <%s>.", cid, actualCid) //
        .isEqualTo(cid);
    return this;
  }

  public CellIdentityGsmAssert hasLac(int lac) {
    isNotNull();
    int actualLac = actual.getLac();
    assertThat(actualLac) //
        .overridingErrorMessage("Expected LAC <%s> but was <%s>.", lac, actualLac) //
        .isEqualTo(lac);
    return this;
  }

  public CellIdentityGsmAssert hasMcc(int mcc) {
    isNotNull();
    int actualMcc = actual.getMcc();
    assertThat(actualMcc) //
        .overridingErrorMessage("Expected MCC <%s> but was <%s>.", mcc, actualMcc) //
        .isEqualTo(mcc);
    return this;
  }

  public CellIdentityGsmAssert hasMnc(int mnc) {
    isNotNull();
    int actualMnc = actual.getMnc();
    assertThat(actualMnc) //
        .overridingErrorMessage("Expected MNC <%s> but was <%s>.", mnc, actualMnc) //
        .isEqualTo(mnc);
    return this;
  }

  public CellIdentityGsmAssert hasPsc(int psc) {
    isNotNull();
    int actualPsc = actual.getPsc();
    assertThat(actualPsc) //
        .overridingErrorMessage("Expected PSC <%s> but was <%s>.", psc, actualPsc) //
        .isEqualTo(psc);
    return this;
  }
}
