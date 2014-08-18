package org.assertj.android.api.bluetooth;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGattService;

import org.assertj.core.api.AbstractAssert;

import java.util.UUID;

import static android.bluetooth.BluetoothGattService.SERVICE_TYPE_PRIMARY;
import static android.bluetooth.BluetoothGattService.SERVICE_TYPE_SECONDARY;
import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR2;
import static org.assertj.android.internal.IntegerUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(JELLY_BEAN_MR2)
public class BluetoothGattServiceAssert
    extends AbstractAssert<BluetoothGattServiceAssert, BluetoothGattService> {
  public BluetoothGattServiceAssert(BluetoothGattService actual) {
    super(actual, BluetoothGattServiceAssert.class);
  }

  public BluetoothGattServiceAssert hasInstanceId(int id) {
    isNotNull();
    int actualId = actual.getInstanceId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected instance ID <%s> but was <%s>", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public BluetoothGattServiceAssert hasType(int type) {
    isNotNull();
    int actualType = actual.getType();
    assertThat(actualType) //
        .overridingErrorMessage("Expected type <%s> but was <%s>.", typeToString(type),
            typeToString(actualType)) //
        .isEqualTo(type);
    return this;
  }

  public BluetoothGattServiceAssert hasUuid(UUID uuid) {
    isNotNull();
    UUID actualUuid = actual.getUuid();
    assertThat(uuid) //
        .overridingErrorMessage("Expected UUID <%s> but was <%s>.", uuid, actualUuid) //
        .isEqualTo(uuid);
    return this;
  }

  public static String typeToString(int type) {
    return buildNamedValueString(type) //
        .value(SERVICE_TYPE_PRIMARY, "primary")
        .value(SERVICE_TYPE_SECONDARY, "secondary")
        .get();
  }
}
