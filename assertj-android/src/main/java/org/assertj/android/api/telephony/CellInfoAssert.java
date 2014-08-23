package org.assertj.android.api.telephony;

import android.annotation.TargetApi;
import android.telephony.CellInfo;

import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(JELLY_BEAN_MR1)
public class CellInfoAssert extends AbstractAssert<CellInfoAssert, CellInfo> {
  public CellInfoAssert(CellInfo actual) {
    super(actual, CellInfoAssert.class);
  }

  public CellInfoAssert hasTimeStamp(long timeStamp) {
    isNotNull();
    long actualTimeStamp = actual.getTimeStamp();
    assertThat(actualTimeStamp) //
        .overridingErrorMessage("Expected time stamp <%s> but was <%s>.", timeStamp, actualTimeStamp) //
        .isEqualTo(timeStamp);
    return this;
  }

  public CellInfoAssert isRegistered() {
    isNotNull();
    assertThat(actual.isRegistered()) //
        .overridingErrorMessage("Expected to be registered but was not") //
        .isTrue();
    return this;
  }
}
