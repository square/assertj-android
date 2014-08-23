package org.assertj.android.api.telephony;

import android.annotation.TargetApi;
import android.telephony.CellIdentityCdma;

import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(JELLY_BEAN_MR1)
public class CellIdentityCdmaAssert extends AbstractAssert<CellIdentityCdmaAssert, CellIdentityCdma> {
  public CellIdentityCdmaAssert(CellIdentityCdma actual) {
    super(actual, CellIdentityCdmaAssert.class);
  }

  public CellIdentityCdmaAssert hasBasestationId(int id) {
    isNotNull();
    int actualId = actual.getBasestationId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected base station ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public CellIdentityCdmaAssert hasLatitude(int latitude) {
    isNotNull();
    int actualLatitude = actual.getLatitude();
    assertThat(actualLatitude) //
        .overridingErrorMessage("Expected latitude <%s> but was <%s>.", latitude, actualLatitude) //
        .isEqualTo(latitude);
    return this;
  }

  public CellIdentityCdmaAssert hasLongitude(int longitude) {
    isNotNull();
    int actualLongitude = actual.getLongitude();
    assertThat(actualLongitude) //
        .overridingErrorMessage("Expected longitude <%s> but was <%s>.", longitude, actualLongitude) //
        .isEqualTo(longitude);
    return this;
  }

  public CellIdentityCdmaAssert hasNetworkId(int id) {
    isNotNull();
    int actualId = actual.getNetworkId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected network ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public CellIdentityCdmaAssert hasSystemId(int id) {
    isNotNull();
    int actualId = actual.getSystemId();
    assertThat(actualId)
        .overridingErrorMessage("Expected system ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }
}
