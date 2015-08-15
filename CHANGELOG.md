Change Log
==========

Version 1.1.0 *(2015-08-15)*
----------------------------

 * New: Design library add-on module! Includes assertions for `NavigationView`, `Snackbar`,
   `TabLayout`, and `TabLayout.Tab`.
 * Fix: Correct `minSdkVersion` declared in Card View, Palette, and Recycler View modules.


Version 1.0.1 *(2015-07-23)*
----------------------------

 * Add assertions for `CameraPosition`, `GoogleMap`, `Marker`, and `UiSettings` to Play Services.
 * Change methods taking a `boolean` to have individual "enabled" and "disabled" assertions in
   Play Services.
 * Add string conversions for `Activity`, `Display`, `TextView` and `View` flag assertions messages.
 * Moved assertions from `ListViewAssert` to `AbstractListViewAssert`.
 * Fix: Use correct value from view for `NumberPickerAssert.hasValue`.
 * Fix: Correct `Intent.hasFlags` assert and update its known flags.
 * Fix: Update AppCompat's `SearchView` assertion to reflect it extending from `LinearLayout`.


Version 1.0.0 *(2014-08-27)*
----------------------------

Convert project from 'fest-android' to 'assertj-android'.

 * New: Add-on modules!
   * Support library (v4)
   * Google Play Services
   * AppCompat (v7)
   * Media Router (v7)
   * Grid Layout (v7)
   * Recycler View (v7)
   * Card View (v7)
   * Pallete (v7)


----

NOTE: The following change log is from the 'fest-android' releases which remain
a part of this repository history.

Version 1.0.8 *(2014-04-05)*
----------------------------

 * New assertions:
   * `android.content.SharedPreferences`
 * Added `hasItem` and `doesNotHaveItem` check to `Adapter`.
 * Added `hasRequestedOrientation` check to `Activity`.
 * Fix: `TextView`'s `endsWith` now properly matches the end of text instead of start.


Version 1.0.7 *(2013-09-11)*
----------------------------

 * Added check for input method target for `TextView`.
 * Fix: `TextView` empty check uses empty `String` instead of empty `CharSequence`.
 * Fix: Correct missing format arguments on some error strings.


Version 1.0.6 *(2013-08-17)*
----------------------------

 * Added checks for the absence of fragments by ID or tag on `FragmentManager`.
 * Added component name and data check for `Intent`.
 * Fix: Correct missing format arguments on some error strings.


Version 1.0.5 *(2013-06-06)*
----------------------------

 * Added bitmap and paint check to `BitmapDrawble`.
 * Added map-liked assertions for `ContentValues`.


Version 1.0.4 *(2013-04-04)*
----------------------------

 * Added custom view check for `ActionBar`.
 * Added flag assert for `Intent`.
 * Added regex 'matches' and 'does not match' for `TextView`.


Version 1.0.3 *(2013-02-27)*
----------------------------

 * Update to FEST 2.0M10 which resolves a potential Android incompatibility.


Version 1.0.2 *(2013-02-26)*
----------------------------

 * New assertions:
   * `android.content.ContentValues`
 * Added negative assertions to `CursorLoader`.
 * Added `String` text assertion to `TextView`.
 * Generation script now supports Python 3.


Version 1.0.1 *(2013-02-05)*
----------------------------

 * New assertions:
   * `android.app.Instrumentation.ActivityMonitor`
   * `android.app.Instrumentation.ActivityResult`
   * `android.app.ListActivity`
   * `android.preference.CheckBoxPreference`
   * `android.preference.DialogPreference`
   * `android.preference.EditTextPreference`
   * `android.preference.ListPreference`
   * `android.preference.MultiSelectListPreference`
   * `android.preference.PreferenceActivity`
   * `android.preference.Preference`
   * `android.preference.PreferenceGroup`
   * `android.preference.PreferenceScreen`
   * `android.preference.RingtonePreference`
   * `android.preference.SwitchPreference`
   * `android.preference.TwoStatePreference`
   * `android.util.AttributeSet`
   * `android.util.Pair`
 * Added convenience methods for orientations to `Display`, `LinearLayout`, and
   `GridLayout`.
 * Added error and ellipsis checks for `TextView`.
 * Added column name checks for `Cursor`.
 * `LinearLayout` and `AdapterView` assertions now correctly extend from `ViewGroup` assertions.
 * Added `TextView` text assertions for empty, contains, starts with, and ends with.
 * Added general `hasVisibility(int)` assertion for `View`.
 * Correct spelling of `isNotInvisible` assertions for `View`.
 * Support for generics by assertions classes (e.g., `LruCacheAssert<K, V>`).
 * Support using string resource ID for most text assertions.


Version 1.0.0 *(2013-01-17)*
----------------------------

Initial release.
