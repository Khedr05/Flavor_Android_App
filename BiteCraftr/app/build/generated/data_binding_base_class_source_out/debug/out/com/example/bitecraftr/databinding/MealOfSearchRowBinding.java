// Generated by view binder compiler. Do not edit!
package com.example.bitecraftr.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bitecraftr.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MealOfSearchRowBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ShapeableImageView searchedMealImg;

  @NonNull
  public final TextView searchedMealTitle;

  private MealOfSearchRowBinding(@NonNull ConstraintLayout rootView,
      @NonNull ShapeableImageView searchedMealImg, @NonNull TextView searchedMealTitle) {
    this.rootView = rootView;
    this.searchedMealImg = searchedMealImg;
    this.searchedMealTitle = searchedMealTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MealOfSearchRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MealOfSearchRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.meal_of_search_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MealOfSearchRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.searchedMealImg;
      ShapeableImageView searchedMealImg = ViewBindings.findChildViewById(rootView, id);
      if (searchedMealImg == null) {
        break missingId;
      }

      id = R.id.searchedMealTitle;
      TextView searchedMealTitle = ViewBindings.findChildViewById(rootView, id);
      if (searchedMealTitle == null) {
        break missingId;
      }

      return new MealOfSearchRowBinding((ConstraintLayout) rootView, searchedMealImg,
          searchedMealTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
