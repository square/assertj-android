package org.assertj.android.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import org.assertj.core.util.Strings;

public final class BitmaskUtils {
  /**
   * Convenience builder for printing out a human-readable list of all of the individual values
   * in a bitmask.
   */
  public static BitMaskStringBuilder buildBitMaskString(long value) {
    return new BitMaskStringBuilder(value);
  }

  /** Convenience builder for printing out a human-readable string of a bitmask. */
  public static NamedValueStringBuilder buildNamedValueString(long value) {
    return new NamedValueStringBuilder(value);
  }

  public static final class BitMaskStringBuilder {
    private final long value;
    private final Map<Long, String> parts = new LinkedHashMap<>();

    private BitMaskStringBuilder(long value) {
      this.value = value;
    }

    public BitMaskStringBuilder flag(long flag, String flagName) {
      if ((value & flag) != 0) {
        if (parts.containsKey(flag)) {
          parts.put(flag, parts.get(flag) + "|" + flagName);
        } else {
          parts.put(flag, flagName);
        }
      }
      return this;
    }

    public String get() {
      if (value == 0) {
        return "none";
      }
      return Strings.join(parts.values()).with(", ");
    }
  }

  public static final class NamedValueStringBuilder {
    private final long value;
    private final Map<Long, String> valueNames = new LinkedHashMap<>();

    private NamedValueStringBuilder(long value) {
      this.value = value;
    }

    public NamedValueStringBuilder value(long value, String name) {
      String dupe = valueNames.get(value);
      if (dupe != null) {
        throw new IllegalStateException(
                "Duplicate value " + value + " with name " + dupe + " and " + name);
      }
      valueNames.put(value, name);
      return this;
    }

    public String getOrValue() {
      String name = valueNames.get(value);
      if (name == null) {
        name = String.valueOf(value);
      }
      return name;
    }

    public String get() {
      String name = valueNames.get(value);
      if (name == null) {
        throw new IllegalStateException("Unknown value: " + value);
      }
      return name;
    }
  }

  private BitmaskUtils() {
    throw new AssertionError("No instances.");
  }
}
