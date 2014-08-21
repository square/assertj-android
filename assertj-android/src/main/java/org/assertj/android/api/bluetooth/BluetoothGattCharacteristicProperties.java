package org.assertj.android.api.bluetooth;

import android.bluetooth.BluetoothGattCharacteristic;
import android.support.annotation.IntDef;

@IntDef(
    flag = true,
    value = {
        BluetoothGattCharacteristic.PROPERTY_BROADCAST,
        BluetoothGattCharacteristic.PROPERTY_EXTENDED_PROPS,
        BluetoothGattCharacteristic.PROPERTY_INDICATE,
        BluetoothGattCharacteristic.PROPERTY_NOTIFY,
        BluetoothGattCharacteristic.PROPERTY_READ,
        BluetoothGattCharacteristic.PROPERTY_SIGNED_WRITE,
        BluetoothGattCharacteristic.PROPERTY_WRITE,
        BluetoothGattCharacteristic.PROPERTY_WRITE_NO_RESPONSE
    }
)
@interface BluetoothGattCharacteristicProperties {
}
