// Copyright 2013 Square, Inc.
package com.squareup.fest.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link SQLiteDatabase} instances. */
public class SqliteDatabaseAssert extends AbstractAssert<SqliteDatabaseAssert, SQLiteDatabase> {
  public SqliteDatabaseAssert(SQLiteDatabase actual) {
    super(actual, SqliteDatabaseAssert.class);
  }

  public SqliteDatabaseAssert hasMaximumSize(long size) {
    isNotNull();
    long actualSize = actual.getMaximumSize();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected maximum size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }

  public SqliteDatabaseAssert hasPageSize(long size) {
    isNotNull();
    long actualSize = actual.getPageSize();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected page size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }

  public SqliteDatabaseAssert hasPath(String path) {
    isNotNull();
    String actualPath = actual.getPath();
    assertThat(actualPath) //
        .overridingErrorMessage("Expected path <%s> but was <%s>.", path, actualPath) //
        .isEqualTo(path);
    return this;
  }

  public SqliteDatabaseAssert hasVersion(int version) {
    isNotNull();
    int actualVersion = actual.getVersion();
    assertThat(actualVersion) //
        .overridingErrorMessage("Expected version <%s> but was <%s>.", version, actualVersion) //
        .isEqualTo(version);
    return this;
  }

  public SqliteDatabaseAssert isInTransaction() {
    isNotNull();
    assertThat(actual.inTransaction()) //
        .overridingErrorMessage("Expected to be in transaction but was not.") //
        .isTrue();
    return this;
  }

  public SqliteDatabaseAssert isNotInTransaction() {
    isNotNull();
    assertThat(actual.inTransaction()) //
        .overridingErrorMessage("Expected to not be in transaction but was.") //
        .isFalse();
    return this;
  }

  public SqliteDatabaseAssert isDatabaseIntegrityOk() {
    isNotNull();
    assertThat(actual.isDatabaseIntegrityOk()) //
        .overridingErrorMessage("Expected database integrity to be OK but was not.") //
        .isTrue();
    return this;
  }

  public SqliteDatabaseAssert isDatabaseIntegrityNotOk() {
    isNotNull();
    assertThat(actual.isDatabaseIntegrityOk()) //
        .overridingErrorMessage("Expected database integrity to not be OK but was.") //
        .isFalse();
    return this;
  }

  public SqliteDatabaseAssert isLockedByCurrentThread() {
    isNotNull();
    assertThat(actual.isDbLockedByCurrentThread()) //
        .overridingErrorMessage("Expected DB to be locked by current thread but was not.") //
        .isTrue();
    return this;
  }

  public SqliteDatabaseAssert isNotLockedByCurrentThread() {
    isNotNull();
    assertThat(actual.isDbLockedByCurrentThread()) //
        .overridingErrorMessage("Expected DB to not be locked but current thread but was.") //
        .isFalse();
    return this;
  }

  public SqliteDatabaseAssert isOpen() {
    isNotNull();
    assertThat(actual.isOpen()) //
        .overridingErrorMessage("Expected DB to be open but was not.") //
        .isTrue();
    return this;
  }

  public SqliteDatabaseAssert isNotOpen() {
    isNotNull();
    assertThat(actual.isOpen()) //
        .overridingErrorMessage("Expected DB to not be open but was.") //
        .isFalse();
    return this;
  }

  public SqliteDatabaseAssert isReadOnly() {
    isNotNull();
    assertThat(actual.isReadOnly()) //
        .overridingErrorMessage("Expected DB to be read only but was not.") //
        .isTrue();
    return this;
  }

  public SqliteDatabaseAssert isNotReadOnly() {
    isNotNull();
    assertThat(actual.isReadOnly()) //
        .overridingErrorMessage("Expected DB to not be read only but was.") //
        .isFalse();
    return this;
  }

  public SqliteDatabaseAssert isWriteAheadLoggingEnabled() {
    isNotNull();
    assertThat(actual.isWriteAheadLoggingEnabled()) //
        .overridingErrorMessage(
            "Expected DB to have write-ahead logging enabled but was disabled.") //
        .isTrue();
    return this;
  }

  public SqliteDatabaseAssert isWriteAheadLoggingDisabled() {
    isNotNull();
    assertThat(actual.isWriteAheadLoggingEnabled()) //
        .overridingErrorMessage(
            "Expected DB to have write-ahead logging disabled but was enabled.") //
        .isFalse();
    return this;
  }
}
