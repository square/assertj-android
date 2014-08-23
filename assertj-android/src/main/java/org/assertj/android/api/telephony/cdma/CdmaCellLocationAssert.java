package org.assertj.android.api.telephony.cdma;

import android.telephony.cdma.CdmaCellLocation;

import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class CdmaCellLocationAssert extends AbstractAssert<CdmaCellLocationAssert, CdmaCellLocation> {
  public CdmaCellLocationAssert(CdmaCellLocation actual) {
    super(actual, CdmaCellLocationAssert.class);
  }

  public CdmaCellLocationAssert hasBaseStationId(int id) {
    isNotNull();
    int actualId = actual.getBaseStationId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected base station ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public CdmaCellLocationAssert hasBaseStationLatitude(int latitude) {
    isNotNull();
    int actualLatitude = actual.getBaseStationLatitude();
    assertThat(actualLatitude) //
        .overridingErrorMessage("Expected base station latitude <%s> but was <%s>.", latitude, actualLatitude) //
        .isEqualTo(latitude);
    return this;
  }

  public CdmaCellLocationAssert hasBaseStationLongitude(int longitude) {
    isNotNull();
    int actualLongitude = actual.getBaseStationLongitude();
    assertThat(actualLongitude) //
        .overridingErrorMessage("Expected base station longitude <%s> but was <%s>.", longitude, actualLongitude) //
        .isEqualTo(longitude);
    return this;
  }

  public CdmaCellLocationAssert hasNetworkId(int id) {
    isNotNull();
    int actualId = actual.getNetworkId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected network ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public CdmaCellLocationAssert hasSystemId(int id) {
    isNotNull();
    int actualId = actual.getSystemId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected system ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }
}
