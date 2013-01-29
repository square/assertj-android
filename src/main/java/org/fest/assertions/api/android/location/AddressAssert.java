// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.location;

import android.location.Address;
import java.util.Locale;
import org.fest.assertions.api.AbstractAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link Address} instances. */
public class AddressAssert extends AbstractAssert<AddressAssert, Address> {
  public AddressAssert(Address actual) {
    super(actual, AddressAssert.class);
  }

  public AddressAssert hasAddressLine(int index, String line) {
    isNotNull();
    String actualLine = actual.getAddressLine(index);
    assertThat(actualLine) //
        .overridingErrorMessage("Expected address line %s <%s> but was <%s>.", index, line,
            actualLine) //
        .isEqualTo(line);
    return this;
  }

  public AddressAssert hasAdminArea(String area) {
    isNotNull();
    String actualArea = actual.getAdminArea();
    assertThat(actualArea) //
        .overridingErrorMessage("Expected admin area <%s> but was <%s>.", area, actualArea) //
        .isEqualTo(area);
    return this;
  }

  public AddressAssert hasCountryCode(String code) {
    isNotNull();
    String actualCode = actual.getCountryCode();
    assertThat(actualCode) //
        .overridingErrorMessage("Expected country code <%s> but was <%s>.", code, actualCode) //
        .isEqualTo(code);
    return this;
  }

  public AddressAssert hasCountryName(String name) {
    isNotNull();
    String actualName = actual.getCountryName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected country name <%s> but was <%s>.", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public AddressAssert hasFeatureName(String name) {
    isNotNull();
    String actualName = actual.getFeatureName();
    assertThat(actualName) //
        .overridingErrorMessage("Expected feature name <%s> but was <%s>.", name, actualName) //
        .isEqualTo(name);
    return this;
  }

  public AddressAssert hasLatitude(double latitude) {
    isNotNull();
    double actualLatitude = actual.getLatitude();
    assertThat(actualLatitude) //
        .overridingErrorMessage("Expected latitude <%s> but was <%s>.", latitude, actualLatitude) //
        .isEqualTo(latitude);
    return this;
  }

  public AddressAssert hasLocale(Locale locale) {
    isNotNull();
    Locale actualLocale = actual.getLocale();
    assertThat(actualLocale) //
        .overridingErrorMessage("Expected locale <%s> but was <%s>.", locale, actualLocale) //
        .isEqualTo(locale);
    return this;
  }

  public AddressAssert hasLocality(String locality) {
    isNotNull();
    String actualLocality = actual.getLocality();
    assertThat(actualLocality) //
        .overridingErrorMessage("Expected locality <%s> but was <%s>.", locality, actualLocality) //
        .isEqualTo(locality);
    return this;
  }

  public AddressAssert hasLongitude(double longitude) {
    isNotNull();
    double actualLongitude = actual.getLongitude();
    assertThat(actualLongitude) //
        .overridingErrorMessage("Expected latitude <%s> but was <%s>.", longitude,
            actualLongitude) //
        .isEqualTo(longitude);
    return this;
  }

  public AddressAssert hasMaximumAddressLineIndex(int index) {
    isNotNull();
    int actualIndex = actual.getMaxAddressLineIndex();
    assertThat(actualIndex) //
        .overridingErrorMessage("Expected maximum address line index <%s> but was <%s>.", index,
            actualIndex) //
        .isEqualTo(index);
    return this;
  }

  public AddressAssert hasPhone(String phone) {
    isNotNull();
    String actualPhone = actual.getPhone();
    assertThat(actualPhone) //
        .overridingErrorMessage("Expected phone <%s> but was <%s>.", phone, actualPhone) //
        .isEqualTo(phone);
    return this;
  }

  public AddressAssert hasPostalCode(String code) {
    isNotNull();
    String actualCode = actual.getPostalCode();
    assertThat(actualCode) //
        .overridingErrorMessage("Expected postal code <%s> but was <%s>.", code, actualCode) //
        .isEqualTo(code);
    return this;
  }

  public AddressAssert hasPremises(String premises) {
    isNotNull();
    String actualPremises = actual.getPremises();
    assertThat(actualPremises) //
        .overridingErrorMessage("Expected premises <%s> but was <%s>.", premises,
            actualPremises) //
        .isEqualTo(premises);
    return this;
  }

  public AddressAssert hasSubAdminArea(String area) {
    isNotNull();
    String actualArea = actual.getSubAdminArea();
    assertThat(actualArea) //
        .overridingErrorMessage("Expected sub-admin area <%s> but was <%s>.", area, actualArea) //
        .isEqualTo(area);
    return this;
  }

  public AddressAssert hasSubLocality(String locality) {
    isNotNull();
    String actualLocality = actual.getSubLocality();
    assertThat(actualLocality) //
        .overridingErrorMessage("Expected sub-locality <%s> but was <%s>.", locality,
            actualLocality) //
        .isEqualTo(locality);
    return this;
  }

  public AddressAssert hasThoroughfare(String thoroughfare) {
    isNotNull();
    String actualThoroughfare = actual.getThoroughfare();
    assertThat(actualThoroughfare) //
        .overridingErrorMessage("Expected thoroughfare <%s> but was <%s>.", thoroughfare,
            actualThoroughfare) //
        .isEqualTo(thoroughfare);
    return this;
  }

  public AddressAssert hasUrl(String url) {
    isNotNull();
    String actualUrl = actual.getUrl();
    assertThat(actualUrl) //
        .overridingErrorMessage("Expected url <%s> but was <%s>.", url, actualUrl) //
        .isEqualTo(url);
    return this;
  }

  public AddressAssert hasLatitude() {
    isNotNull();
    assertThat(actual.hasLatitude()) //
        .overridingErrorMessage("Expected to have latitude but did not.") //
        .isTrue();
    return this;
  }

  public AddressAssert hasNoLatitude() {
    isNotNull();
    assertThat(actual.hasLatitude()) //
        .overridingErrorMessage("Expected to not have latitude but did.") //
        .isFalse();
    return this;
  }

  public AddressAssert hasLongitude() {
    isNotNull();
    assertThat(actual.hasLongitude()) //
        .overridingErrorMessage("Expected to have longitude but did not.") //
        .isTrue();
    return this;
  }

  public AddressAssert hasNoLongitude() {
    isNotNull();
    assertThat(actual.hasLongitude()) //
        .overridingErrorMessage("Expected to not have longitude but did.") //
        .isFalse();
    return this;
  }
}
