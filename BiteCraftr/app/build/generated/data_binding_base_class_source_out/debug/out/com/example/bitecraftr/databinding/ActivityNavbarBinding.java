// Generated by view binder compiler. Do not edit!
package com.example.bitecraftr.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bitecraftr.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNavbarBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BottomNavigationView bottomNavigation;

  @NonNull
  public final FrameLayout fragmentContainer;

  @NonNull
  public final ConstraintLayout main;

  private ActivityNavbarBinding(@NonNull ConstraintLayout rootView,
      @NonNull BottomNavigationView bottomNavigation, @NonNull FrameLayout fragmentContainer,
      @NonNull ConstraintLayout main) {
    this.rootView = rootView;
    this.bottomNavigation = bottomNavigation;
    this.fragmentContainer = fragmentContainer;
    this.main = main;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNavbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNavbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_navbar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNavbarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottom_navigation;
      BottomNavigationView bottomNavigation = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigation == null) {
        break missingId;
      }

      id = R.id.fragmentContainer;
      FrameLayout fragmentContainer = ViewBindings.findChildViewById(rootView, id);
      if (fragmentContainer == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      return new ActivityNavbarBinding((ConstraintLayout) rootView, bottomNavigation,
          fragmentContainer, main);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
