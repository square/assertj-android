package org.fest.assertions.api.android;

import android.text.TextUtils;
import java.util.List;

public final class Utils {
  public static String join(List<String> parts) {
    return TextUtils.join(", ", parts);
  }

  private Utils() {
    // No instances.
  }
}
