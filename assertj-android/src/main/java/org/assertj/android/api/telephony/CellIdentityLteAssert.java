package org.assertj.android.api.telephony;

import android.annotation.TargetApi;
import android.telephony.CellIdentityLte;

import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(JELLY_BEAN_MR1)
public class CellIdentityLteAssert extends AbstractAssert<CellIdentityLteAssert, CellIdentityLte> {
  public CellIdentityLteAssert(CellIdentityLte actual) {
    super(actual, CellIdentityLteAssert.class);
  }

  public CellIdentityLteAssert hasCi(int ci) {
    isNotNull();
    int actualCi = actual.getCi();
    assertThat(actualCi) //
        .overridingErrorMessage("Expected CI <%s> but was <%s>.", ci, actualCi) //
        .isEqualTo(ci);
    return this;
  }

  public CellIdentityLteAssert hasMcc(int mcc) {
    isNotNull();
    int actualMcc = actual.getMcc();
    assertThat(actualMcc) //
        .overridingErrorMessage("Expected MCC <%s> but was <%s>.", mcc, actualMcc) //
        .isEqualTo(mcc);
    return this;
  }

  public CellIdentityLteAssert hasMnc(int mnc) {
    isNotNull();
    int actualMnc = actual.getMnc();
    assertThat(actualMnc) //
        .overridingErrorMessage("Expected MNC <%s> but was <%s>.", mnc, actualMnc) //
        .isEqualTo(mnc);
    return this;
  }

  public CellIdentityLteAssert hasPci(int pci) {
    isNotNull();
    int actualPci = actual.getPci();
    assertThat(actualPci) //
        .overridingErrorMessage("Expected PCI <%s> but was <%s>.", pci, actualPci) //
        .isEqualTo(pci);
    return this;
  }

  public CellIdentityLteAssert hasTac(int tac) {
    isNotNull();
    int actualTac = actual.getTac();
    assertThat(actualTac) //
        .overridingErrorMessage("Expected TAC <%s> but was <%s>.", tac, actualTac) //
        .isEqualTo(tac);
    return this;
  }
}
