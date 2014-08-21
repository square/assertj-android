package org.assertj.android.api.bluetooth;

import android.bluetooth.BluetoothGattService;
import android.support.annotation.IntDef;

@IntDef({
    BluetoothGattService.SERVICE_TYPE_PRIMARY,
    BluetoothGattService.SERVICE_TYPE_SECONDARY
})
@interface BluetoothGattServiceType {
}
