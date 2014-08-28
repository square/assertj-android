package org.assertj.android.api.bluetooth;

import android.bluetooth.BluetoothGattDescriptor;
import android.support.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef(
    flag = true,
    value = {
        BluetoothGattDescriptor.PERMISSION_READ,
        BluetoothGattDescriptor.PERMISSION_READ_ENCRYPTED,
        BluetoothGattDescriptor.PERMISSION_READ_ENCRYPTED_MITM,
        BluetoothGattDescriptor.PERMISSION_WRITE,
        BluetoothGattDescriptor.PERMISSION_WRITE_ENCRYPTED,
        BluetoothGattDescriptor.PERMISSION_WRITE_ENCRYPTED_MITM,
        BluetoothGattDescriptor.PERMISSION_WRITE_SIGNED,
        BluetoothGattDescriptor.PERMISSION_WRITE_SIGNED_MITM
    }
)
@Retention(SOURCE)
@interface BluetoothGattDescriptorPermissions {
}
