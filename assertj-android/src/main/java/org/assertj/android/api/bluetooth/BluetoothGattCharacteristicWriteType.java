package org.assertj.android.api.bluetooth;

import android.bluetooth.BluetoothGattCharacteristic;
import android.support.annotation.IntDef;

@IntDef({
    BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT,
    BluetoothGattCharacteristic.WRITE_TYPE_NO_RESPONSE,
    BluetoothGattCharacteristic.WRITE_TYPE_SIGNED
})
@interface BluetoothGattCharacteristicWriteType {
}
