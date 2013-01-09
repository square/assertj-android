// Copyright 2012 Square, Inc.
package com.squareup.fest;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ViewAnimator;
import com.squareup.fest.app.ActionBarAssert;
import com.squareup.fest.app.ActivityAssert;
import com.squareup.fest.app.DialogAssert;
import com.squareup.fest.graphics.BitmapAssert;
import com.squareup.fest.view.MenuItemAssert;
import com.squareup.fest.view.ViewAssert;
import com.squareup.fest.view.ViewGroupAssert;
import com.squareup.fest.widget.AdapterAssert;
import com.squareup.fest.widget.ViewAnimatorAssert;

public class Assertions extends org.fest.assertions.api.Assertions {
  public static ActionBarAssert assertThat(ActionBar actionBar) {
    return new ActionBarAssert(actionBar);
  }

  public static ActivityAssert assertThat(Activity actual) {
    return new ActivityAssert(actual);
  }

  public static AdapterAssert assertThat(Adapter actual) {
    return new AdapterAssert(actual);
  }

  public static BitmapAssert assertThat(Bitmap actual) {
    return new BitmapAssert(actual);
  }

  public static MenuItemAssert assertThat(MenuItem actual) {
    return new MenuItemAssert(actual);
  }

  public static ViewAssert assertThat(View actual) {
    return new ViewAssert(actual);
  }

  public static ViewAnimatorAssert assertThat(ViewAnimator actual) {
    return new ViewAnimatorAssert(actual);
  }

  public static ViewGroupAssert assertThat(ViewGroup actual) {
    return new ViewGroupAssert(actual);
  }

  public static DialogAssert assertThat(Dialog dialog) {
    return new DialogAssert(dialog);
  }
}
