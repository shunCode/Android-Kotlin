// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VerticalHorizontalListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView itemDogAge;

  @NonNull
  public final TextView itemDogHobbies;

  @NonNull
  public final TextView itemDogName;

  @NonNull
  public final ImageView itemImage;

  private VerticalHorizontalListItemBinding(@NonNull MaterialCardView rootView,
      @NonNull TextView itemDogAge, @NonNull TextView itemDogHobbies, @NonNull TextView itemDogName,
      @NonNull ImageView itemImage) {
    this.rootView = rootView;
    this.itemDogAge = itemDogAge;
    this.itemDogHobbies = itemDogHobbies;
    this.itemDogName = itemDogName;
    this.itemImage = itemImage;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vertical_horizontal_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.item_dog_age;
      TextView itemDogAge = rootView.findViewById(id);
      if (itemDogAge == null) {
        break missingId;
      }

      id = R.id.item_dog_hobbies;
      TextView itemDogHobbies = rootView.findViewById(id);
      if (itemDogHobbies == null) {
        break missingId;
      }

      id = R.id.item_dog_name;
      TextView itemDogName = rootView.findViewById(id);
      if (itemDogName == null) {
        break missingId;
      }

      id = R.id.item_image;
      ImageView itemImage = rootView.findViewById(id);
      if (itemImage == null) {
        break missingId;
      }

      return new VerticalHorizontalListItemBinding((MaterialCardView) rootView, itemDogAge,
          itemDogHobbies, itemDogName, itemImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
