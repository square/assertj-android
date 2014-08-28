package org.assertj.android.api.bluetooth;

import android.bluetooth.BluetoothGattCharacteristic;
import android.support.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef(
    flag = true,
    value = {
        BluetoothGattCharacteristic.PERMISSION_READ,
        BluetoothGattCharacteristic.PERMISSION_READ_ENCRYPTED,
        BluetoothGattCharacteristic.PERMISSION_READ_ENCRYPTED_MITM,
        BluetoothGattCharacteristic.PERMISSION_WRITE,
        BluetoothGattCharacteristic.PERMISSION_WRITE_ENCRYPTED,
        BluetoothGattCharacteristic.PERMISSION_READ_ENCRYPTED_MITM,
        BluetoothGattCharacteristic.PERMISSION_WRITE_SIGNED,
        BluetoothGattCharacteristic.PERMISSION_WRITE_SIGNED_MITM
    }
)
@Retention(SOURCE)
@interface BluetoothGattCharacteristicPermissions {
}
