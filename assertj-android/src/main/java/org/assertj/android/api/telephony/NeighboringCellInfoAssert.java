package org.assertj.android.api.telephony;

import android.telephony.NeighboringCellInfo;

import org.assertj.core.api.AbstractAssert;

import static org.assertj.android.api.telephony.TelephonyManagerAssert.networkTypeToString;
import static org.assertj.core.api.Assertions.assertThat;

public class NeighboringCellInfoAssert extends AbstractAssert<NeighboringCellInfoAssert, NeighboringCellInfo> {
  public NeighboringCellInfoAssert(NeighboringCellInfo actual) {
    super(actual, NeighboringCellInfoAssert.class);
  }

  public NeighboringCellInfoAssert hasCid(int cid) {
    isNotNull();
    int actualCid = actual.getCid();
    assertThat(actualCid) //
        .overridingErrorMessage("Expected CID <%s> but was <%s>.", cid, actualCid) //
        .isEqualTo(cid);
    return this;
  }

  public NeighboringCellInfoAssert hasLac(int lac) {
    isNotNull();
    int actualLac = actual.getLac();
    assertThat(actualLac) //
        .overridingErrorMessage("Expected LAC <%s> but was <%s>.", lac, actualLac) //
        .isEqualTo(lac);
    return this;
  }

  public NeighboringCellInfoAssert hasNetworkType(@TelephonyManagerNetworkType int networkType) {
    isNotNull();
    int actualNetworkType = actual.getNetworkType();
    //noinspection ResourceType
    assertThat(actualNetworkType) //
        .overridingErrorMessage("Expected network type <%s> but was <%s>.",
            networkTypeToString(networkType), networkTypeToString(actualNetworkType)) //
        .isEqualTo(networkType);
    return this;
  }

  public NeighboringCellInfoAssert hasPsc(int psc) {
    isNotNull();
    int actualPsc = actual.getPsc();
    assertThat(actualPsc) //
        .overridingErrorMessage("Expected PSC <%s> but was <%s>.", psc, actualPsc) //
        .isEqualTo(psc);
    return this;
  }

  public NeighboringCellInfoAssert hasRssi(int rssi) {
    isNotNull();
    int actualRssi = actual.getRssi();
    assertThat(actualRssi) //
        .overridingErrorMessage("Expected RSSI <%s> but was <%s>.", rssi, actualRssi) //
        .isEqualTo(rssi);
    return this;
  }
}
