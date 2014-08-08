package org.assertj.android.internal;

import android.util.SparseArray;
import java.util.LinkedHashSet;
import java.util.Set;
import org.assertj.core.util.Strings;

public final class IntegerUtils {
  /**
   * Convenience builder for printing out a human-readable list of all of the individual values
   * in a bitmask.
   */
  public static BitMaskStringBuilder buildBitMaskString(int value) {
    return new BitMaskStringBuilder(value);
  }

  /** Convenience builder for printing out a human-readable string of an integer. */
  public static NamedValueStringBuilder buildNamedValueString(int value) {
    return new NamedValueStringBuilder(value);
  }

  public static final class BitMaskStringBuilder {
    private final int value;
    private final Set<String> parts = new LinkedHashSet<>();
    private int flags;

    private BitMaskStringBuilder(int value) {
      this.value = value;
    }

    public BitMaskStringBuilder flag(int flag, String flagName) {
      if ((flags & flag) != 0) {
        throw new IllegalStateException(
            "Duplicate flag detected: " + flagName + " with value " + Integer.toHexString(flag));
      }
      flags |= flag;

      if ((value & flag) != 0) {
        parts.add(flagName);
      }
      return this;
    }

    public String get() {
      if (value == 0) {
        return "none";
      }
      return Strings.join(parts).with(", ");
    }
  }

  public static final class NamedValueStringBuilder {
    private final int value;
    private final SparseArray<String> valueNames = new SparseArray<>();

    private NamedValueStringBuilder(int value) {
      this.value = value;
    }

    public NamedValueStringBuilder value(int value, String name) {
      String dupe = valueNames.get(value);
      if (dupe != null) {
        throw new IllegalStateException(
            "Duplicate value " + value + " with name " + dupe + " and " + name);
      }
      valueNames.put(value, name);
      return this;
    }

    public String getOrValue() {
      return valueNames.get(value, String.valueOf(value));
    }

    public String get() {
      String name = valueNames.get(value);
      if (name == null) {
        throw new IllegalStateException("Unknown value: " + value);
      }
      return name;
    }
  }

  private IntegerUtils() {
    throw new AssertionError("No instances.");
  }
}
