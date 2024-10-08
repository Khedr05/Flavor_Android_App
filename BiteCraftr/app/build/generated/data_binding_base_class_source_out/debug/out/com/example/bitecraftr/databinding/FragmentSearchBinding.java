// Generated by view binder compiler. Do not edit!
package com.example.bitecraftr.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bitecraftr.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSearchBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TabItem catTab;

  @NonNull
  public final TabItem conTab;

  @NonNull
  public final TabItem intTab;

  @NonNull
  public final TabItem mealTab;

  @NonNull
  public final RecyclerView recView;

  @NonNull
  public final SearchView searchView;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final LinearLayout topBar;

  private FragmentSearchBinding(@NonNull ScrollView rootView, @NonNull TabItem catTab,
      @NonNull TabItem conTab, @NonNull TabItem intTab, @NonNull TabItem mealTab,
      @NonNull RecyclerView recView, @NonNull SearchView searchView, @NonNull TabLayout tabLayout,
      @NonNull TextView textView3, @NonNull LinearLayout topBar) {
    this.rootView = rootView;
    this.catTab = catTab;
    this.conTab = conTab;
    this.intTab = intTab;
    this.mealTab = mealTab;
    this.recView = recView;
    this.searchView = searchView;
    this.tabLayout = tabLayout;
    this.textView3 = textView3;
    this.topBar = topBar;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.catTab;
      TabItem catTab = ViewBindings.findChildViewById(rootView, id);
      if (catTab == null) {
        break missingId;
      }

      id = R.id.conTab;
      TabItem conTab = ViewBindings.findChildViewById(rootView, id);
      if (conTab == null) {
        break missingId;
      }

      id = R.id.intTab;
      TabItem intTab = ViewBindings.findChildViewById(rootView, id);
      if (intTab == null) {
        break missingId;
      }

      id = R.id.mealTab;
      TabItem mealTab = ViewBindings.findChildViewById(rootView, id);
      if (mealTab == null) {
        break missingId;
      }

      id = R.id.recView;
      RecyclerView recView = ViewBindings.findChildViewById(rootView, id);
      if (recView == null) {
        break missingId;
      }

      id = R.id.searchView;
      SearchView searchView = ViewBindings.findChildViewById(rootView, id);
      if (searchView == null) {
        break missingId;
      }

      id = R.id.tabLayout;
      TabLayout tabLayout = ViewBindings.findChildViewById(rootView, id);
      if (tabLayout == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.topBar;
      LinearLayout topBar = ViewBindings.findChildViewById(rootView, id);
      if (topBar == null) {
        break missingId;
      }

      return new FragmentSearchBinding((ScrollView) rootView, catTab, conTab, intTab, mealTab,
          recView, searchView, tabLayout, textView3, topBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
