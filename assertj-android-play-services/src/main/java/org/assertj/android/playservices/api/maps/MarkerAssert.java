package org.assertj.android.playservices.api.maps;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class MarkerAssert extends AbstractAssert<MarkerAssert, Marker> {
  public MarkerAssert(Marker actual) {
    super(actual, Marker.class);
  }

  public MarkerAssert hasAlpha(float alpha) {
    isNotNull();
    float actualAlpha = actual.getAlpha();
    assertThat(actualAlpha) //
        .overridingErrorMessage("Expected alpha <%s> but was <%s>.", alpha, actualAlpha) //
        .isEqualTo(alpha);
    return this;
  }

  public MarkerAssert hasId(String id) {
    isNotNull();
    String actualId = actual.getId();
    assertThat(actualId) //
        .overridingErrorMessage("Expected id <%s> but was <%s>.", id, actualId) //
        .isEqualTo(id);
    return this;
  }

  public MarkerAssert hasPosition(LatLng position) {
    isNotNull();
    LatLng actualLatLng = actual.getPosition();
    assertThat(actualLatLng) //
        .overridingErrorMessage("Expected position <%s> but was <%s>.", position, actualLatLng) //
        .isEqualTo(position);
    return this;
  }

  public MarkerAssert hasRotation(float rotation) {
    isNotNull();
    float actualRotation = actual.getRotation();
    assertThat(actualRotation) //
        .overridingErrorMessage("Expected rotation <%s> but was <%s>.", rotation, actualRotation) //
        .isEqualTo(rotation);
    return this;
  }

  public MarkerAssert hasSnippet(String snippet) {
    isNotNull();
    String actualSnippet = actual.getSnippet();
    assertThat(actualSnippet) //
        .overridingErrorMessage("Expected snippet <%s> but was <%s>.", snippet, actualSnippet) //
        .isEqualTo(snippet);
    return this;
  }

  public MarkerAssert hasTitle(String title) {
    isNotNull();
    String actualTitle = actual.getTitle();
    assertThat(actualTitle) //
        .overridingErrorMessage("Expected title <%s> but was <%s>.", title, actualTitle) //
        .isEqualTo(title);
    return this;
  }

  public MarkerAssert isDraggable() {
    isNotNull();
    assertThat(actual.isDraggable()) //
        .overridingErrorMessage("Expected to be draggable but was not.") //
        .isTrue();
    return this;
  }

  public MarkerAssert isNotDraggable() {
    isNotNull();
    assertThat(actual.isDraggable()) //
        .overridingErrorMessage("Expected to not be draggable but was.") //
        .isFalse();
    return this;
  }

  public MarkerAssert isFlat() {
    isNotNull();
    assertThat(actual.isFlat()) //
        .overridingErrorMessage("Expected to be flat but was not.") //
        .isTrue();
    return this;
  }

  public MarkerAssert isNotFlat() {
    isNotNull();
    assertThat(actual.isFlat()) //
        .overridingErrorMessage("Expected to not be flat but was.") //
        .isFalse();
    return this;
  }

  public MarkerAssert isInfoWindowShown(boolean shown) {
    isNotNull();
    boolean actualShown = actual.isInfoWindowShown();
    assertThat(actualShown) //
        .overridingErrorMessage("Expected info window shown <%s> but was <%s>.", shown,
            actualShown) //
        .isEqualTo(shown);
    return this;
  }

  public MarkerAssert isVisible() {
    isNotNull();
    assertThat(actual.isVisible()) //
        .overridingErrorMessage("Expected to be visible but was not.") //
        .isTrue();
    return this;
  }

  public MarkerAssert isNotVisible() {
    isNotNull();
    assertThat(actual.isVisible()) //
        .overridingErrorMessage("Expected to not be visible but was.") //
        .isFalse();
    return this;
  }
}
