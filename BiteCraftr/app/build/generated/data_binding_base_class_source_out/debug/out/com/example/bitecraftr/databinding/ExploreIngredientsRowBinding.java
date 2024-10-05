// Generated by view binder compiler. Do not edit!
package com.example.bitecraftr.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bitecraftr.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ExploreIngredientsRowBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView ingredientsImage;

  @NonNull
  public final TextView ingredientsTitle;

  private ExploreIngredientsRowBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView ingredientsImage, @NonNull TextView ingredientsTitle) {
    this.rootView = rootView;
    this.ingredientsImage = ingredientsImage;
    this.ingredientsTitle = ingredientsTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ExploreIngredientsRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ExploreIngredientsRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.explore_ingredients_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ExploreIngredientsRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ingredientsImage;
      ImageView ingredientsImage = ViewBindings.findChildViewById(rootView, id);
      if (ingredientsImage == null) {
        break missingId;
      }

      id = R.id.ingredientsTitle;
      TextView ingredientsTitle = ViewBindings.findChildViewById(rootView, id);
      if (ingredientsTitle == null) {
        break missingId;
      }

      return new ExploreIngredientsRowBinding((LinearLayout) rootView, ingredientsImage,
          ingredientsTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
