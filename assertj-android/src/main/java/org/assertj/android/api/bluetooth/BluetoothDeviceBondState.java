package org.assertj.android.api.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.support.annotation.IntDef;

@IntDef({
    BluetoothDevice.BOND_NONE,
    BluetoothDevice.BOND_BONDING,
    BluetoothDevice.BOND_BONDED
})
@interface BluetoothDeviceBondState {
}
