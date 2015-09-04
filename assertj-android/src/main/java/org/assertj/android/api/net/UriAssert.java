package org.assertj.android.api.net;

import android.net.Uri;

import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public final class UriAssert extends AbstractAssert<UriAssert, Uri> {

    public UriAssert(Uri actual) {
        super(actual, UriAssert.class);
    }

    public UriAssert hasPath(String path) {
        isNotNull();
        String actualPath = actual.getPath();
        assertThat(actualPath) //
            .overridingErrorMessage("Expected path <%s> but was <%s>.", path, actualPath) //
            .isEqualTo(path);
        return this;
    }

    public UriAssert hasNoPath(String action) {
        isNotNull();
        String actualPath = actual.getPath();
        assertThat(actualPath)
            .overridingErrorMessage("Expected no path but was <%s>.", actualPath)
            .isNull();
        return this;
    }

    public UriAssert hasPort(int port) {
        isNotNull();
        int actualPort = actual.getPort();
        assertThat(actualPort)
            .overridingErrorMessage("Expected port <%d> but was <%s>.", port, actualPort)
            .isEqualTo(port);
        return this;
    }

    public UriAssert hasHost(String host) {
        isNotNull();
        String actualHost = actual.getHost();
        assertThat(actualHost)
            .overridingErrorMessage("Expected host <%s> but was <%s>.", host, actualHost)
            .isEqualTo(host);
        return this;
    }

    public UriAssert hasFragment(String fragment) {
        isNotNull();
        String actualFragment = actual.getFragment();
        assertThat(actualFragment)
            .overridingErrorMessage("Expected fragment <%s> but was <%s>.", fragment, actualFragment)
            .isEqualTo(fragment);
        return this;
    }

    public UriAssert hasNoFragment() {
        isNotNull();
        String actualFragment = actual.getFragment();
        assertThat(actualFragment)
            .overridingErrorMessage("Expected no fragment but was <%s>.", actualFragment)
            .isNull();
        return this;
    }

    public UriAssert hasQuery(String query) {
        isNotNull();
        String actualQuery = actual.getQuery();
        assertThat(actualQuery)
            .overridingErrorMessage("Expected query <%s> but was <%s>.", query, actualQuery)
            .isEqualTo(query);
        return this;
    }

    public UriAssert hasNoQuery() {
        isNotNull();
        String actualQuery = actual.getQuery();
        assertThat(actual.getQuery())
            .overridingErrorMessage("Expected no query but was <%s>.", actualQuery)
            .isNull();
        return this;
    }

    public UriAssert hasScheme(String scheme) {
        isNotNull();
        String actualScheme = actual.getScheme();
        assertThat(actualScheme)
            .overridingErrorMessage("Expected scheme <%s> but was <%s>.", scheme, actualScheme)
            .isEqualTo(scheme);
        return this;
    }

    public UriAssert hasUserInfo(String userInfo) {
        isNotNull();
        String actualUserInfo = actual.getUserInfo();
        assertThat(actualUserInfo)
            .overridingErrorMessage("Expected userInfo <%s> but was <%s>.", userInfo, actualUserInfo)
            .isEqualTo(userInfo);
        return this;
    }

    public UriAssert hasNoUserInfo() {
        isNotNull();
        String actualUserInfo = actual.getUserInfo();
        assertThat(actualUserInfo)
            .overridingErrorMessage("Expected no userInfo but was <%s>.", actualUserInfo)
            .isNull();
        return this;
    }

}
