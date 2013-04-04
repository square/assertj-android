package org.fest.assertions.api.android.util;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Convenience builder for printing out a human-readable list of all of the individual values
 * in a bitmask.
 */
public class BitMaskStringBuilder {
  private final int flags;
  private final Set<String> parts = new LinkedHashSet<String>();

  public BitMaskStringBuilder(int flags) {
    this.flags = flags;
  }

  public BitMaskStringBuilder flag(int flag, String flagName) {
    if ((flags & flag) != 0) {
      parts.add(flagName);
    }
    return this;
  }

  public String get() {
    if (flags == 0) {
      return "none";
    }

    StringBuilder result = new StringBuilder();
    for (String part : parts) {
      if (result.length() > 0) {
        result.append(", ");
      }
      result.append(part);
    }
    return result.toString();
  }
}
