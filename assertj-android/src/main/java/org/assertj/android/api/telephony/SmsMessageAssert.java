package org.assertj.android.api.telephony;

import android.telephony.SmsMessage;

import org.assertj.core.api.AbstractAssert;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class SmsMessageAssert extends AbstractAssert<SmsMessageAssert, SmsMessage> {
  public SmsMessageAssert(SmsMessage actual) {
    super(actual, SmsMessageAssert.class);
  }

  public SmsMessageAssert hasDisplayMessageBody(String displayMessageBody) {
    isNotNull();
    String actualDisplayMessageBody = actual.getDisplayMessageBody();
    assertThat(actualDisplayMessageBody) //
        .overridingErrorMessage("Expected display message body <%s> but was <%s>.",
            displayMessageBody, actualDisplayMessageBody) //
        .isEqualTo(displayMessageBody);
    return this;
  }

  public SmsMessageAssert hasDisplayOriginatingAddress(String displayOriginatingAddress) {
    isNotNull();
    String actualDisplayOriginatingAddress = actual.getDisplayOriginatingAddress();
    assertThat(actualDisplayOriginatingAddress) //
        .overridingErrorMessage("Expected display originating address <%s> but was <%s>.",
            displayOriginatingAddress, actualDisplayOriginatingAddress) //
        .isEqualTo(displayOriginatingAddress);
    return this;
  }

  public SmsMessageAssert hasEmailBody(String emailBody) {
    isNotNull();
    String actualEmailBody = actual.getEmailBody();
    assertThat(actualEmailBody) //
        .overridingErrorMessage("Expected email body <%s> but was <%s>.", emailBody, actualEmailBody) //
        .isEqualTo(emailBody);
    return this;
  }

  public SmsMessageAssert hasEmailFrom(String emailFrom) {
    isNotNull();
    String actualEmailFrom = actual.getEmailFrom();
    assertThat(actualEmailFrom) //
        .overridingErrorMessage("Expected email from <%s> but was <%s>.", emailFrom, actualEmailFrom) //
        .isEqualTo(emailFrom);
    return this;
  }

  public SmsMessageAssert hasIndexOnIcc(int index) {
    isNotNull();
    int actualIndex = actual.getIndexOnIcc();
    assertThat(actualIndex) //
        .overridingErrorMessage("Expected index on ICC <%s> but was <%s>.", index, actualIndex) //
        .isEqualTo(index);
    return this;
  }

  public SmsMessageAssert hasIndexOnSim(int index) {
    isNotNull();
    int actualIndex = actual.getIndexOnSim();
    assertThat(actualIndex) //
        .overridingErrorMessage("Expected index on SIM <%s> but was <%s>.", index, actualIndex) //
        .isEqualTo(index);
    return this;
  }

  public SmsMessageAssert hasMessageBody(String messageBody) {
    isNotNull();
    String actualMessageBody = actual.getMessageBody();
    assertThat(actualMessageBody) //
        .overridingErrorMessage("Expected message body <%s> but was <%s>.",
            messageBody, actualMessageBody) //
        .isEqualTo(messageBody);
    return this;
  }

  public SmsMessageAssert hasMessageClass(SmsMessage.MessageClass messageClass) {
    isNotNull();
    SmsMessage.MessageClass actualMessageClass = actual.getMessageClass();
    assertThat(actualMessageClass) //
        .overridingErrorMessage("Expected message class <%s> but was <%s>.",
            messageClass, actualMessageClass) //
        .isEqualTo(messageClass);
    return this;
  }

  public SmsMessageAssert hasOriginatingAddress(String originatingAddress) {
    isNotNull();
    String actualOriginatingAddress = actual.getOriginatingAddress();
    assertThat(actualOriginatingAddress) //
        .overridingErrorMessage("Expected originating address <%s> but was <%s>.",
            originatingAddress, actualOriginatingAddress) //
        .isEqualTo(originatingAddress);
    return this;
  }

  public SmsMessageAssert hasPdu(byte[] pdu) {
    isNotNull();
    byte[] actualPdu = actual.getPdu();
    assertThat(actualPdu) //
        .overridingErrorMessage("Expected PDU <%s> but was <%s>.", Arrays.toString(pdu),
            Arrays.toString(actualPdu)) //
        .isEqualTo(pdu);
    return this;
  }

  public SmsMessageAssert hasProtocolIdentifier(int protocolIdentifier) {
    isNotNull();
    int actualProtocolIdentifier = actual.getProtocolIdentifier();
    assertThat(actualProtocolIdentifier) //
        .overridingErrorMessage("Expected protocol identifier <%s> but was <%s>.",
            protocolIdentifier, actualProtocolIdentifier) //
        .isEqualTo(protocolIdentifier);
    return this;
  }

  public SmsMessageAssert hasPseudoSubject(String pseudoSubject) {
    isNotNull();
    String actualPseudoSubject = actual.getPseudoSubject();
    assertThat(actualPseudoSubject) //
        .overridingErrorMessage("Expected pseudo subject <%s> but was <%s>.",
            pseudoSubject, actualPseudoSubject) //
        .isEqualTo(pseudoSubject);
    return this;
  }

  public SmsMessageAssert hasServiceCenterAddress(String address) {
    isNotNull();
    String actualAddress = actual.getServiceCenterAddress();
    assertThat(actualAddress) //
        .overridingErrorMessage("Expected service center address <%s> but was <%s>.",
            address, actualAddress) //
        .isEqualTo(address);
    return this;
  }

  public SmsMessageAssert hasStatus(int status) {
    isNotNull();
    int actualStatus = actual.getStatus();
    assertThat(actualStatus) //
        .overridingErrorMessage("Expected status <%s> but was <%s>.", status, actualStatus) //
        .isEqualTo(status);
    return this;
  }

  public SmsMessageAssert hasStatusOnIcc(int status) {
    isNotNull();
    int actualStatus = actual.getStatusOnIcc();
    assertThat(actualStatus) //
        .overridingErrorMessage("Expected status on the ICC <%s> but was <%s>.", status, actualStatus) //
        .isEqualTo(status);
    return this;
  }

  public SmsMessageAssert hasStatusOnSim(int status) {
    isNotNull();
    int actualStatus = actual.getStatusOnSim();
    assertThat(actualStatus) //
        .overridingErrorMessage("Expected status on the SIM <%s> but was <%s>.", status, actualStatus) //
        .isEqualTo(status);
    return this;
  }

  public SmsMessageAssert hasTimestampMillis(long timestamp) {
    isNotNull();
    long actualTimestamp = actual.getTimestampMillis();
    assertThat(actualTimestamp) //
        .overridingErrorMessage("Expected timestamp in millis <%s> but was <%s>.", timestamp, actualTimestamp) //
        .isEqualTo(timestamp);
    return this;
  }

  public SmsMessageAssert hasUserData(byte[] data) {
    isNotNull();
    byte[] actualData = actual.getUserData();
    assertThat(actualData) //
        .overridingErrorMessage("Expected user data <%s> but was <%s>.", Arrays.toString(data),
            Arrays.toString(actualData)) //
        .isEqualTo(data);
    return this;
  }

  public SmsMessageAssert isCphsMwiMessage() {
    isNotNull();
    assertThat(actual.isCphsMwiMessage()) //
        .overridingErrorMessage("Expected to be CPHS MWI message but was not.") //
        .isTrue();
    return this;
  }

  public SmsMessageAssert isEmail() {
    isNotNull();
    assertThat(actual.isEmail()) //
        .overridingErrorMessage("Expected to be an email but was not.") //
        .isTrue();
    return this;
  }

  public SmsMessageAssert isMWIClearMessage() {
    isNotNull();
    assertThat(actual.isMWIClearMessage()) //
        .overridingErrorMessage("Expected to be MWI clear message but was not.") //
        .isTrue();
    return this;
  }

  public SmsMessageAssert isMWISetMessage() {
    isNotNull();
    assertThat(actual.isMWISetMessage()) //
        .overridingErrorMessage("Expected to be MWI set message but was not.") //
        .isTrue();
    return this;
  }

  public SmsMessageAssert isMwiDontStore() {
    isNotNull();
    assertThat(actual.isMwiDontStore()) //
        .overridingErrorMessage("Expected to be MWI message that should not be stored but was not.") //
        .isTrue();
    return this;
  }

  public SmsMessageAssert isReplace() {
    isNotNull();
    assertThat(actual.isReplace()) //
        .overridingErrorMessage("Expected to be a replace short message but was not.") //
        .isTrue();
    return this;
  }

  public SmsMessageAssert isReplyPathPresent() {
    isNotNull();
    assertThat(actual.isReplyPathPresent()) //
        .overridingErrorMessage("Expected 'TP-Reply-Path' bit is set but was not.") //
        .isTrue();
    return this;
  }

  public SmsMessageAssert isStatusReportMessage() {
    isNotNull();
    assertThat(actual.isStatusReportMessage()) //
        .overridingErrorMessage("Expected to be a status report message but was not.") //
        .isTrue();
    return this;
  }
}
