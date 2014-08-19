package org.assertj.android.api.bluetooth;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.Arrays;
import java.util.UUID;
import org.assertj.core.api.AbstractAssert;

import static android.bluetooth.BluetoothGattDescriptor.PERMISSION_READ;
import static android.bluetooth.BluetoothGattDescriptor.PERMISSION_READ_ENCRYPTED;
import static android.bluetooth.BluetoothGattDescriptor.PERMISSION_READ_ENCRYPTED_MITM;
import static android.bluetooth.BluetoothGattDescriptor.PERMISSION_WRITE;
import static android.bluetooth.BluetoothGattDescriptor.PERMISSION_WRITE_ENCRYPTED;
import static android.bluetooth.BluetoothGattDescriptor.PERMISSION_WRITE_ENCRYPTED_MITM;
import static android.bluetooth.BluetoothGattDescriptor.PERMISSION_WRITE_SIGNED;
import static android.bluetooth.BluetoothGattDescriptor.PERMISSION_WRITE_SIGNED_MITM;
import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR2;
import static org.assertj.android.internal.IntegerUtils.buildBitMaskString;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(JELLY_BEAN_MR2)
public class BluetoothGattDescriptorAssert
    extends AbstractAssert<BluetoothGattDescriptorAssert, BluetoothGattDescriptor> {
  public BluetoothGattDescriptorAssert(BluetoothGattDescriptor actual) {
    super(actual, BluetoothGattDescriptorAssert.class);
  }

  public BluetoothGattDescriptorAssert hasPermissions(@BluetoothGattDescriptorPermissions int permissions) {
    isNotNull();
    int actualPermissions = actual.getPermissions();
    //noinspection ResourceType
    assertThat(actualPermissions) //
        .overridingErrorMessage("Expected permissions <%s> but was <%s>.",
            permissionsToString(permissions), permissionsToString(actualPermissions)) //
        .isEqualTo(permissions);
    return this;
  }

  public BluetoothGattDescriptorAssert hasUuid(UUID uuid) {
    isNotNull();
    UUID actualUuid = actual.getUuid();
    assertThat(uuid) //
        .overridingErrorMessage("Expected UUID <%s> but was <%s>.", uuid, actualUuid) //
        .isEqualTo(uuid);
    return this;
  }

  public BluetoothGattDescriptorAssert hasValue(byte[] value) {
    isNotNull();
    byte[] actualValue = actual.getValue();
    assertThat(actualValue) //
        .overridingErrorMessage("Expected value <%s> but was <%s>.", Arrays.toString(value),
            Arrays.toString(actualValue)) //
        .isEqualTo(value);
    return this;
  }

  public static String permissionsToString(@BluetoothGattDescriptorPermissions int permissions) {
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
}
