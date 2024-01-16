package com.kidssappsong.englishlullaby.ui;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class PlayerFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private PlayerFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private PlayerFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static PlayerFragmentArgs fromBundle(@NonNull Bundle bundle) {
    PlayerFragmentArgs __result = new PlayerFragmentArgs();
    bundle.setClassLoader(PlayerFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("pozisyon")) {
      int pozisyon;
      pozisyon = bundle.getInt("pozisyon");
      __result.arguments.put("pozisyon", pozisyon);
    } else {
      throw new IllegalArgumentException("Required argument \"pozisyon\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static PlayerFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    PlayerFragmentArgs __result = new PlayerFragmentArgs();
    if (savedStateHandle.contains("pozisyon")) {
      int pozisyon;
      pozisyon = savedStateHandle.get("pozisyon");
      __result.arguments.put("pozisyon", pozisyon);
    } else {
      throw new IllegalArgumentException("Required argument \"pozisyon\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getPozisyon() {
    return (int) arguments.get("pozisyon");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("pozisyon")) {
      int pozisyon = (int) arguments.get("pozisyon");
      __result.putInt("pozisyon", pozisyon);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("pozisyon")) {
      int pozisyon = (int) arguments.get("pozisyon");
      __result.set("pozisyon", pozisyon);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    PlayerFragmentArgs that = (PlayerFragmentArgs) object;
    if (arguments.containsKey("pozisyon") != that.arguments.containsKey("pozisyon")) {
      return false;
    }
    if (getPozisyon() != that.getPozisyon()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getPozisyon();
    return result;
  }

  @Override
  public String toString() {
    return "PlayerFragmentArgs{"
        + "pozisyon=" + getPozisyon()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull PlayerFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(int pozisyon) {
      this.arguments.put("pozisyon", pozisyon);
    }

    @NonNull
    public PlayerFragmentArgs build() {
      PlayerFragmentArgs result = new PlayerFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setPozisyon(int pozisyon) {
      this.arguments.put("pozisyon", pozisyon);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getPozisyon() {
      return (int) arguments.get("pozisyon");
    }
  }
}
