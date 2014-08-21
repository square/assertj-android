package org.assertj.android.api.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.support.annotation.IntDef;

@IntDef({
    BluetoothDevice.DEVICE_TYPE_CLASSIC,
    BluetoothDevice.DEVICE_TYPE_DUAL,
    BluetoothDevice.DEVICE_TYPE_LE,
    BluetoothDevice.DEVICE_TYPE_UNKNOWN
})
@interface BluetoothDeviceType {
}
