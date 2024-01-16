package com.kidssappsong.englishlullaby.ui;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.kidssappsong.englishlullaby.R;

public class PlayerFragmentDirections {
  private PlayerFragmentDirections() {
  }

  @NonNull
  public static NavDirections playertoanasayfa() {
    return new ActionOnlyNavDirections(R.id.playertoanasayfa);
  }
}
