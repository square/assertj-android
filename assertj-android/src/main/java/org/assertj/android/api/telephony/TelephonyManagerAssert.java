package org.assertj.android.api.telephony;

import android.annotation.TargetApi;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR2;
import static android.os.Build.VERSION_CODES.KITKAT;
import static android.telephony.TelephonyManager.CALL_STATE_IDLE;
import static android.telephony.TelephonyManager.CALL_STATE_OFFHOOK;
import static android.telephony.TelephonyManager.CALL_STATE_RINGING;
import static android.telephony.TelephonyManager.DATA_ACTIVITY_DORMANT;
import static android.telephony.TelephonyManager.DATA_ACTIVITY_IN;
import static android.telephony.TelephonyManager.DATA_ACTIVITY_INOUT;
import static android.telephony.TelephonyManager.DATA_ACTIVITY_NONE;
import static android.telephony.TelephonyManager.DATA_ACTIVITY_OUT;
import static android.telephony.TelephonyManager.DATA_CONNECTED;
import static android.telephony.TelephonyManager.DATA_CONNECTING;
import static android.telephony.TelephonyManager.DATA_DISCONNECTED;
import static android.telephony.TelephonyManager.DATA_SUSPENDED;
import static android.telephony.TelephonyManager.NETWORK_TYPE_1xRTT;
import static android.telephony.TelephonyManager.NETWORK_TYPE_CDMA;
import static android.telephony.TelephonyManager.NETWORK_TYPE_EDGE;
import static android.telephony.TelephonyManager.NETWORK_TYPE_EHRPD;
import static android.telephony.TelephonyManager.NETWORK_TYPE_EVDO_0;
import static android.telephony.TelephonyManager.NETWORK_TYPE_EVDO_A;
import static android.telephony.TelephonyManager.NETWORK_TYPE_EVDO_B;
import static android.telephony.TelephonyManager.NETWORK_TYPE_GPRS;
import static android.telephony.TelephonyManager.NETWORK_TYPE_HSDPA;
import static android.telephony.TelephonyManager.NETWORK_TYPE_HSPA;
import static android.telephony.TelephonyManager.NETWORK_TYPE_HSPAP;
import static android.telephony.TelephonyManager.NETWORK_TYPE_HSUPA;
import static android.telephony.TelephonyManager.NETWORK_TYPE_IDEN;
import static android.telephony.TelephonyManager.NETWORK_TYPE_LTE;
import static android.telephony.TelephonyManager.NETWORK_TYPE_UMTS;
import static android.telephony.TelephonyManager.NETWORK_TYPE_UNKNOWN;
import static android.telephony.TelephonyManager.PHONE_TYPE_CDMA;
import static android.telephony.TelephonyManager.PHONE_TYPE_GSM;
import static android.telephony.TelephonyManager.PHONE_TYPE_NONE;
import static android.telephony.TelephonyManager.PHONE_TYPE_SIP;
import static android.telephony.TelephonyManager.SIM_STATE_ABSENT;
import static android.telephony.TelephonyManager.SIM_STATE_NETWORK_LOCKED;
import static android.telephony.TelephonyManager.SIM_STATE_PIN_REQUIRED;
import static android.telephony.TelephonyManager.SIM_STATE_PUK_REQUIRED;
import static android.telephony.TelephonyManager.SIM_STATE_READY;
import static android.telephony.TelephonyManager.SIM_STATE_UNKNOWN;
import static org.assertj.android.internal.BitmaskUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

public class TelephonyManagerAssert
    extends AbstractAssert<TelephonyManagerAssert, TelephonyManager> {
  public TelephonyManagerAssert(TelephonyManager actual) {
    super(actual, TelephonyManagerAssert.class);
  }

  public TelephonyManagerAssert hasCallState(@TelephonyManagerCallState int state) {
    isNotNull();
    int actualState = actual.getCallState();
    //noinspection ResourceType
    assertThat(actualState) //
        .overridingErrorMessage("Expected call state <%s> but was <%s>.", callStateToString(state),
            callStateToString(actualState)) //
        .isEqualTo(state);
    return this;
  }

  public TelephonyManagerAssert hasCellLocation(CellLocation cellLocation) {
    isNotNull();
    CellLocation actualCellLocation = actual.getCellLocation();
    assertThat(actualCellLocation) //
        .overridingErrorMessage("Expected cell location <%s> but was <%s>.", cellLocation,
            actualCellLocation) //
        .isEqualTo(cellLocation);
    return this;
  }

  public TelephonyManagerAssert hasDataActivity(@TelephonyManagerDataActivity int dataActivity) {
    isNotNull();
    int actualDataActivity = actual.getDataActivity();
    //noinspection ResourceType
    assertThat(actualDataActivity) //
        .overridingErrorMessage("Expected data activity <%s> but was <%s>.",
            dataActivityToString(dataActivity), dataActivityToString(actualDataActivity)) //
        .isEqualTo(dataActivity);
    return this;
  }

  public TelephonyManagerAssert hasDataState(@TelephonyManagerDataState int dataState) {
    isNotNull();
    int actualDataState = actual.getDataState();
    //noinspection ResourceType
    assertThat(actualDataState) //
        .overridingErrorMessage("Expected data state <%s> but was <%s>.",
            dataStateToString(dataState), dataStateToString(actualDataState)) //
        .isEqualTo(dataState);
    return this;
  }

  public TelephonyManagerAssert hasDeviceId(String deviceId) {
    isNotNull();
    String actualDeviceId = actual.getDeviceId();
    assertThat(actualDeviceId) //
        .overridingErrorMessage("Expected device ID <%s> but was <%s>.", deviceId,
            actualDeviceId) //
        .isEqualTo(deviceId);
    return this;
  }

  public TelephonyManagerAssert hasDeviceSoftwareVersion(String version) {
    isNotNull();
    String actualVersion = actual.getDeviceSoftwareVersion();
    assertThat(actualVersion) //
        .overridingErrorMessage("Expected device software version <%s> but was <%s>.", version,
            actualVersion) //
        .isEqualTo(version);
    return this;
  }

  @TargetApi(JELLY_BEAN_MR2)
  public TelephonyManagerAssert hasGroupIdLevel1(String level) {
    isNotNull();
    String actualLevel = actual.getGroupIdLevel1();
    assertThat(actualLevel) //
        .overridingErrorMessage("Expected group ID level 1 <%s> but was <%s>.", level,
            actualLevel) //
        .isEqualTo(level);
    return this;
  }

  public TelephonyManagerAssert hasLine1Number(String number) {
    isNotNull();
    String actualNumber = actual.getLine1Number();
    assertThat(actualNumber) //
        .overridingErrorMessage("Expected line 1 number <%s> but was <%s>.", number,
            actualNumber) //
        .isEqualTo(number);
    return this;
  }

  @TargetApi(KITKAT)
  public TelephonyManagerAssert hasMmsUAProfUrl(String url) {
    isNotNull();
    String actualUrl = actual.getMmsUAProfUrl();
    assertThat(actualUrl) //
        .overridingErrorMessage("Expected MMS user agent profile URL <%s> but was <%s>.", url,
            actualUrl) //
        .isEqualTo(url);
    return this;
  }

  @TargetApi(KITKAT)
  public TelephonyManagerAssert hasMmsUserAgent(String userAgent) {
    isNotNull();
    String actualUserAgent = actual.getMmsUserAgent();
    assertThat(actualUserAgent) //
        .overridingErrorMessage("Expected MMS user agent <%s> but was <%s>.", userAgent,
            actualUserAgent) //
        .isEqualTo(userAgent);
    return this;
  }

  public TelephonyManagerAssert hasNetworkCountryIso(String iso) {
    isNotNull();
    String actualIso = actual.getNetworkCountryIso();
    assertThat(actualIso) //
        .overridingErrorMessage("Expected network country ISO <%s> but was <%s>.", iso,
            actualIso) //
        .isEqualTo(iso);
    return this;
  }

  public TelephonyManagerAssert hasNetworkOperator(String operator) {
    isNotNull();
    String actualOperator = actual.getNetworkOperator();
    assertThat(actualOperator) //
        .overridingErrorMessage("Expected network operator <%s> but was <%s>.", operator,
            actualOperator) //
        .isEqualTo(operator);
    return this;
  }

  public TelephonyManagerAssert hasNetworkOperatorName(String name) {
    isNotNull();
    String actualName = actual.getNetworkOperatorName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected network operator name <%s> but was <%s>.", name,
            actualName) //
        .isEqualTo(name);
    return this;
  }

  public TelephonyManagerAssert hasNetworkType(@TelephonyManagerNetworkType int type) {
    isNotNull();
    int actualType = actual.getNetworkType();
    //noinspection ResourceType
    assertThat(actualType) //
        .overridingErrorMessage("Expected network type <%s> but was <%s>.",
            networkTypeToString(type), networkTypeToString(actualType)) //
        .isEqualTo(type);
    return this;
  }

  public TelephonyManagerAssert hasPhoneType(@TelephonyManagerPhoneType int type) {
    isNotNull();
    int actualType = actual.getPhoneType();
    //noinspection ResourceType
    assertThat(actualType) //
        .overridingErrorMessage("Expected phone type <%s> but was <%s>.", phoneTypeToString(type),
            phoneTypeToString(actualType)) //
        .isEqualTo(type);
    return this;
  }

  public TelephonyManagerAssert hasSimCountryIso(String iso) {
    isNotNull();
    String actualIso = actual.getSimCountryIso();
    assertThat(actualIso) //
        .overridingErrorMessage("Expected SIM country ISO <%s> but was <%s>.", iso, actualIso) //
        .isEqualTo(iso);
    return this;
  }

  public TelephonyManagerAssert hasSimOperator(String operator) {
    isNotNull();
    String actualOperator = actual.getSimOperator();
    assertThat(actualOperator) //
        .overridingErrorMessage("Expected SIM operator <%s> but was <%s>.", operator,
            actualOperator) //
        .isEqualTo(operator);
    return this;
  }

  public TelephonyManagerAssert hasSimOperatorName(String name) {
    isNotNull();
    String actualName = actual.getSimOperatorName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected SIM operator name <%s> but was <%s>.", name,
            actualName) //
        .isEqualTo(name);
    return this;
  }

  public TelephonyManagerAssert hasSimSerialNumber(String serialNumber) {
    isNotNull();
    String actualSerialNumber = actual.getSimSerialNumber();
    assertThat(actualSerialNumber) //
        .overridingErrorMessage("Expected SIM serial number <%s> but was <%s>.", serialNumber,
            actualSerialNumber) //
        .isEqualTo(serialNumber);
    return this;
  }

  public TelephonyManagerAssert hasSimState(@TelephonyManagerSimState int state) {
    isNotNull();
    int actualState = actual.getSimState();
    //noinspection ResourceType
    assertThat(actualState) //
        .overridingErrorMessage("Expected SIM state <%s> but was <%s>.", simStateToString(state),
            simStateToString(actualState)) //
        .isEqualTo(state);
    return this;
  }

  public TelephonyManagerAssert hasSubscriberId(String id) {
    isNotNull();
    String actualId = actual.getSubscriberId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected subscriber ID <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public TelephonyManagerAssert hasVoiceMailAlphaTag(String tag) {
    isNotNull();
    String actualTag = actual.getVoiceMailAlphaTag();
    assertThat(actualTag) //
        .overridingErrorMessage("Expected voice mail alpha tag <%s> but was <%s>.", tag,
            actualTag) //
        .isEqualTo(tag);
    return this;
  }

  public TelephonyManagerAssert hasVoiceMailNumber(String number) {
    isNotNull();
    String actualNumber = actual.getVoiceMailNumber();
    assertThat(actualNumber) //
        .overridingErrorMessage("Expected voice mail number <%s> but was <%s>.", number,
            actualNumber) //
        .isEqualTo(number);
    return this;
  }

  public TelephonyManagerAssert hasIccCard() {
    isNotNull();
    assertThat(actual.hasIccCard()) //
        .overridingErrorMessage("Expected an ICC card to be present but was not.") //
        .isTrue();
    return this;
  }

  public TelephonyManagerAssert doesNotHaveIccCard() {
    isNotNull();
    assertThat(actual.hasIccCard()) //
        .overridingErrorMessage("Expected an ICC card to not be present but was.") //
        .isFalse();
    return this;
  }

  public TelephonyManagerAssert isNetworkRoaming() {
    isNotNull();
    assertThat(actual.isNetworkRoaming()) //
        .overridingErrorMessage("Expected the device to be considered roaming but was not.") //
        .isTrue();
    return this;
  }

  public TelephonyManagerAssert isNotNetworkRoaming() {
    isNotNull();
    assertThat(actual.isNetworkRoaming()) //
        .overridingErrorMessage("Expected the device to not be considered roaming but was.") //
        .isFalse();
    return this;
  }

  public static String callStateToString(@TelephonyManagerCallState int callState) {
    return buildNamedValueString(callState) //
        .value(CALL_STATE_IDLE, "idle")
        .value(CALL_STATE_OFFHOOK, "offhook")
        .value(CALL_STATE_RINGING, "ringing")
        .get();
  }

  public static String dataActivityToString(@TelephonyManagerDataActivity int dataActivity) {
    return buildNamedValueString(dataActivity) //
        .value(DATA_ACTIVITY_DORMANT, "dormant")
        .value(DATA_ACTIVITY_IN, "in")
        .value(DATA_ACTIVITY_INOUT, "inout")
        .value(DATA_ACTIVITY_NONE, "none")
        .value(DATA_ACTIVITY_OUT, "out")
        .get();
  }

  public static String dataStateToString(@TelephonyManagerDataState int dataState) {
    return buildNamedValueString(dataState) //
        .value(DATA_CONNECTED, "connected")
        .value(DATA_CONNECTING, "connecting")
        .value(DATA_DISCONNECTED, "disconnected")
        .value(DATA_SUSPENDED, "suspended")
        .get();
  }

  public static String networkTypeToString(@TelephonyManagerNetworkType int networkType) {
    return buildNamedValueString(networkType) //
        .value(NETWORK_TYPE_1xRTT, "1xRTT")
        .value(NETWORK_TYPE_CDMA, "cdma")
        .value(NETWORK_TYPE_EDGE, "edge")
        .value(NETWORK_TYPE_EHRPD, "ehrpd")
        .value(NETWORK_TYPE_EVDO_0, "evdo_0")
        .value(NETWORK_TYPE_EVDO_A, "evdo_A")
        .value(NETWORK_TYPE_EVDO_B, "evdo_b")
        .value(NETWORK_TYPE_GPRS, "gprs")
        .value(NETWORK_TYPE_HSDPA, "hsdpa")
        .value(NETWORK_TYPE_HSPA, "hspa")
        .value(NETWORK_TYPE_HSPAP, "hspap")
        .value(NETWORK_TYPE_HSUPA, "hsupa")
        .value(NETWORK_TYPE_IDEN, "iden")
        .value(NETWORK_TYPE_LTE, "lte")
        .value(NETWORK_TYPE_UMTS, "umts")
        .value(NETWORK_TYPE_UNKNOWN, "uknown")
        .get();
  }

  public static String phoneTypeToString(@TelephonyManagerPhoneType int phoneType) {
    return buildNamedValueString(phoneType) //
        .value(PHONE_TYPE_CDMA, "cdma")
        .value(PHONE_TYPE_GSM, "gsm")
        .value(PHONE_TYPE_NONE, "none")
        .value(PHONE_TYPE_SIP, "sip")
        .get();
  }

  public static String simStateToString(@TelephonyManagerSimState int simState) {
    return buildNamedValueString(simState) //
        .value(SIM_STATE_ABSENT, "absent")
        .value(SIM_STATE_NETWORK_LOCKED, "network_locked")
        .value(SIM_STATE_PIN_REQUIRED, "pin_required")
        .value(SIM_STATE_PUK_REQUIRED, "puk_required")
        .value(SIM_STATE_READY, "ready")
        .value(SIM_STATE_UNKNOWN, "uknown")
        .get();
  }
}
