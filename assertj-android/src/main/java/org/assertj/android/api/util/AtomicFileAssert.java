package org.assertj.android.api.util;

import android.annotation.TargetApi;
import android.util.AtomicFile;
import java.io.File;
import org.assertj.core.api.AbstractAssert;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static org.assertj.core.api.Assertions.assertThat;

@TargetApi(JELLY_BEAN_MR1)
public class AtomicFileAssert extends AbstractAssert<AtomicFileAssert, AtomicFile> {
  public AtomicFileAssert(AtomicFile actual) {
    super(actual, AtomicFileAssert.class);
  }

  public AtomicFileAssert hasBaseFile(File file) {
    isNotNull();
    File actualFile = actual.getBaseFile();
    assertThat(actualFile) //
        .overridingErrorMessage("Expected base file <%s> but was <%s>.", file, actualFile) //
        .isEqualTo(file);
    return this;
  }
}
