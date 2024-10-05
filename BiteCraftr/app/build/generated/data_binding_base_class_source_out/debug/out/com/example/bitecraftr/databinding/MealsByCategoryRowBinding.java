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

public final class MealsByCategoryRowBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ShapeableImageView mealImg;

  @NonNull
  public final TextView mealTxtView;

  private MealsByCategoryRowBinding(@NonNull ConstraintLayout rootView,
      @NonNull ShapeableImageView mealImg, @NonNull TextView mealTxtView) {
    this.rootView = rootView;
    this.mealImg = mealImg;
    this.mealTxtView = mealTxtView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MealsByCategoryRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MealsByCategoryRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.meals_by_category_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MealsByCategoryRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mealImg;
      ShapeableImageView mealImg = ViewBindings.findChildViewById(rootView, id);
      if (mealImg == null) {
        break missingId;
      }

      id = R.id.mealTxtView;
      TextView mealTxtView = ViewBindings.findChildViewById(rootView, id);
      if (mealTxtView == null) {
        break missingId;
      }

      return new MealsByCategoryRowBinding((ConstraintLayout) rootView, mealImg, mealTxtView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
