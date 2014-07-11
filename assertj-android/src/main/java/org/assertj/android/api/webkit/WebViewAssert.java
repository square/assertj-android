// Copyright 2013 Square, Inc.
package org.assertj.android.api.webkit;

import android.annotation.TargetApi;
import android.net.http.SslCertificate;
import android.webkit.WebView;
import org.assertj.android.api.widget.AbstractAbsoluteLayoutAssert;

import static android.os.Build.VERSION_CODES.HONEYCOMB;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link WebView} instances. */
public class WebViewAssert extends AbstractAbsoluteLayoutAssert<WebViewAssert, WebView> {
  public WebViewAssert(WebView actual) {
    super(actual, WebViewAssert.class);
  }

  public WebViewAssert canGoBack() {
    isNotNull();
    assertThat(actual.canGoBack()) //
        .overridingErrorMessage("Expected to be able to go back but could not.") //
        .isTrue();
    return this;
  }

  public WebViewAssert canNotGoBack() {
    isNotNull();
    assertThat(actual.canGoBack()) //
        .overridingErrorMessage("Expected to not be able to go back but could.") //
        .isFalse();
    return this;
  }

  public WebViewAssert canGoForward() {
    isNotNull();
    assertThat(actual.canGoForward()) //
        .overridingErrorMessage("Expected to be able to go forward but could not.") //
        .isTrue();
    return this;
  }

  public WebViewAssert canNotGoForward() {
    isNotNull();
    assertThat(actual.canGoForward()) //
        .overridingErrorMessage("Expected to not be able to go forward but could.") //
        .isFalse();
    return this;
  }

  public WebViewAssert hasCertificate(SslCertificate certificate) {
    isNotNull();
    SslCertificate actualCertificate = actual.getCertificate();
    assertThat(actualCertificate) //
        .overridingErrorMessage("Expected certificate <%s> but was <%s>.", certificate,
            actualCertificate) //
        .isSameAs(certificate);
    return this;
  }

  public WebViewAssert hasContentHeight(int height) {
    isNotNull();
    int actualHeight = actual.getContentHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected content height <%s> but was <%s>.", height,
            actualHeight) //
        .isEqualTo(height);
    return this;
  }

  public WebViewAssert hasOriginalUrl(String url) {
    isNotNull();
    String actualUrl = actual.getOriginalUrl();
    assertThat(actualUrl) //
        .overridingErrorMessage("Expected original URL <%s> but was <%s>.", url, actualUrl) //
        .isEqualTo(url);
    return this;
  }

  public WebViewAssert hasProgress(int progress) {
    isNotNull();
    int actualProgress = actual.getProgress();
    assertThat(actualProgress) //
        .overridingErrorMessage("Expected progress <%s> but was <%s>.", progress, actualProgress) //
        .isEqualTo(progress);
    return this;
  }

  public WebViewAssert hasTitle(String title) {
    isNotNull();
    String actualTitle = actual.getTitle();
    assertThat(actualTitle) //
        .overridingErrorMessage("Expected title <%s> but was <%s>.", title, actualTitle) //
        .isEqualTo(title);
    return this;
  }

  public WebViewAssert hasUrl(String url) {
    isNotNull();
    String actualUrl = actual.getUrl();
    assertThat(actualUrl) //
        .overridingErrorMessage("Expected URL <%s> but was <%s>.", url, actualUrl) //
        .isEqualTo(url);
    return this;
  }

  @TargetApi(HONEYCOMB)
  public WebViewAssert isPrivateBrowsingEnabled() {
    isNotNull();
    assertThat(actual.isPrivateBrowsingEnabled()) //
        .overridingErrorMessage("Expected private browsing to be enabled but was disabled.") //
        .isTrue();
    return this;
  }

  @TargetApi(HONEYCOMB)
  public WebViewAssert isPrivateBrowsingDisabled() {
    isNotNull();
    assertThat(actual.isPrivateBrowsingEnabled()) //
        .overridingErrorMessage("Expected private browsing to be disabled but was enabled.") //
        .isFalse();
    return this;
  }
}
