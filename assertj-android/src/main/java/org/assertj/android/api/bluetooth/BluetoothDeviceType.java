package org.assertj.android.api.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.support.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    BluetoothDevice.DEVICE_TYPE_CLASSIC,
    BluetoothDevice.DEVICE_TYPE_DUAL,
    BluetoothDevice.DEVICE_TYPE_LE,
    BluetoothDevice.DEVICE_TYPE_UNKNOWN
})
@Retention(SOURCE)
@interface BluetoothDeviceType {
}
