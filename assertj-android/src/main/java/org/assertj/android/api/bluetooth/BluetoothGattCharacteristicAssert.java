package org.assertj.android.api.bluetooth;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGattCharacteristic;
import java.util.Arrays;
import java.util.UUID;
import org.assertj.core.api.AbstractAssert;

import static android.bluetooth.BluetoothGattCharacteristic.PERMISSION_READ;
import static android.bluetooth.BluetoothGattCharacteristic.PERMISSION_READ_ENCRYPTED;
import static android.bluetooth.BluetoothGattCharacteristic.PERMISSION_READ_ENCRYPTED_MITM;
import static android.bluetooth.BluetoothGattCharacteristic.PERMISSION_WRITE;
import static android.bluetooth.BluetoothGattCharacteristic.PERMISSION_WRITE_ENCRYPTED;
import static android.bluetooth.BluetoothGattCharacteristic.PERMISSION_WRITE_ENCRYPTED_MITM;
import static android.bluetooth.BluetoothGattCharacteristic.PERMISSION_WRITE_SIGNED;
import static android.bluetooth.BluetoothGattCharacteristic.PERMISSION_WRITE_SIGNED_MITM;
import static android.bluetooth.BluetoothGattCharacteristic.PROPERTY_BROADCAST;
import static android.bluetooth.BluetoothGattCharacteristic.PROPERTY_EXTENDED_PROPS;
import static android.bluetooth.BluetoothGattCharacteristic.PROPERTY_INDICATE;
import static android.bluetooth.BluetoothGattCharacteristic.PROPERTY_NOTIFY;
import static android.bluetooth.BluetoothGattCharacteristic.PROPERTY_READ;
import static android.bluetooth.BluetoothGattCharacteristic.PROPERTY_SIGNED_WRITE;
import static android.bluetooth.BluetoothGattCharacteristic.PROPERTY_WRITE;
import static android.bluetooth.BluetoothGattCharacteristic.PROPERTY_WRITE_NO_RESPONSE;
import static android.bluetooth.BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT;
import static android.bluetooth.BluetoothGattCharacteristic.WRITE_TYPE_NO_RESPONSE;
import static android.bluetooth.BluetoothGattCharacteristic.WRITE_TYPE_SIGNED;
import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR2;
import static org.assertj.android.internal.IntegerUtils.buildBitMaskString;
import static org.assertj.android.internal.IntegerUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(JELLY_BEAN_MR2)
public class BluetoothGattCharacteristicAssert
    extends AbstractAssert<BluetoothGattCharacteristicAssert, BluetoothGattCharacteristic> {
  public BluetoothGattCharacteristicAssert(BluetoothGattCharacteristic actual) {
    super(actual, BluetoothGattCharacteristicAssert.class);
  }

  public BluetoothGattCharacteristicAssert hasInstanceId(int id) {
    isNotNull();
    int actualId = actual.getInstanceId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected instance ID <%s> but was <%s>", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public BluetoothGattCharacteristicAssert hasPermissions(@BluetoothGattCharacteristicPermissions int permissions) {
    isNotNull();
    int actualPermissions = actual.getPermissions();
    //noinspection ResourceType
    assertThat(actualPermissions) //
        .overridingErrorMessage("Expected permissions <%s> but was <%s>.",
            permissionsToString(permissions), permissionsToString(actualPermissions)) //
        .isEqualTo(permissions);
    return this;
  }

  public BluetoothGattCharacteristicAssert hasProperties(@BluetoothGattCharacteristicProperties int properties) {
    isNotNull();
    int actualProperties = actual.getProperties();
    //noinspection ResourceType
    assertThat(actualProperties) //
        .overridingErrorMessage("Expected properties <%s> but was <%s>.",
            propertiesToString(properties), propertiesToString(actualProperties)) //
        .isEqualTo(properties);
    return this;
  }

  public BluetoothGattCharacteristicAssert hasUuid(UUID uuid) {
    isNotNull();
    UUID actualUuid = actual.getUuid();
    assertThat(uuid) //
        .overridingErrorMessage("Expected UUID <%s> but was <%s>.", uuid, actualUuid) //
        .isEqualTo(uuid);
    return this;
  }

  public BluetoothGattCharacteristicAssert hasValue(byte[] value) {
    isNotNull();
    byte[] actualValue = actual.getValue();
    assertThat(actualValue) //
        .overridingErrorMessage("Expected value <%s> but was <%s>.", Arrays.toString(value),
            Arrays.toString(actualValue)) //
        .isEqualTo(value);
    return this;
  }

  public BluetoothGattCharacteristicAssert hasWriteType(@BluetoothGattCharacteristicWriteType int writeType) {
    isNotNull();
    int actualWriteType = actual.getWriteType();
    //noinspection ResourceType
    assertThat(actualWriteType) //
        .overridingErrorMessage("Expected write type <%s> but was <%s>.",
            writeTypeToString(writeType), writeTypeToString(actualWriteType)) //
        .isEqualTo(writeType);
    return this;
  }

  public static String writeTypeToString(@BluetoothGattCharacteristicWriteType int writeType) {
    return buildNamedValueString(writeType) //
        .value(WRITE_TYPE_DEFAULT, "default")
        .value(WRITE_TYPE_NO_RESPONSE, "no_response")
        .value(WRITE_TYPE_SIGNED, "signed")
        .get();
  }

  public static String permissionsToString(@BluetoothGattCharacteristicPermissions int permissions) {
    return buildBitMaskString(permissions) //
        .flag(PERMISSION_READ, "read")
        .flag(PERMISSION_READ_ENCRYPTED, "read_encrypted")
        .flag(PERMISSION_READ_ENCRYPTED_MITM, "read_encrypted_mitm")
        .flag(PERMISSION_WRITE, "write")
        .flag(PERMISSION_WRITE_ENCRYPTED, "write_encrypted")
        .flag(PERMISSION_WRITE_ENCRYPTED_MITM, "write_encrypted_mitm")
        .flag(PERMISSION_WRITE_SIGNED, "write_signed")
        .flag(PERMISSION_WRITE_SIGNED_MITM, "write_signed_mitm")
        .get();
  }

  public static String propertiesToString(@BluetoothGattCharacteristicProperties int properties) {
    return buildBitMaskString(properties) //
        .flag(PROPERTY_BROADCAST, "broadcast")
        .flag(PROPERTY_EXTENDED_PROPS, "extended_props")
        .flag(PROPERTY_INDICATE, "indicate")
        .flag(PROPERTY_NOTIFY, "notify")
        .flag(PROPERTY_READ, "read")
        .flag(PROPERTY_SIGNED_WRITE, "signed_write")
        .flag(PROPERTY_WRITE, "write")
        .flag(PROPERTY_WRITE_NO_RESPONSE, "write_no_response")
        .get();
  }
}
