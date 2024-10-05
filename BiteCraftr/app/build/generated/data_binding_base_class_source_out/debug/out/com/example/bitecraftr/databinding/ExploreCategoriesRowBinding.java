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

public final class ExploreCategoriesRowBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView catImage;

  @NonNull
  public final TextView catTitle;

  private ExploreCategoriesRowBinding(@NonNull LinearLayout rootView, @NonNull ImageView catImage,
      @NonNull TextView catTitle) {
    this.rootView = rootView;
    this.catImage = catImage;
    this.catTitle = catTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ExploreCategoriesRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ExploreCategoriesRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.explore_categories_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ExploreCategoriesRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.catImage;
      ImageView catImage = ViewBindings.findChildViewById(rootView, id);
      if (catImage == null) {
        break missingId;
      }

      id = R.id.catTitle;
      TextView catTitle = ViewBindings.findChildViewById(rootView, id);
      if (catTitle == null) {
        break missingId;
      }

      return new ExploreCategoriesRowBinding((LinearLayout) rootView, catImage, catTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
