package com.kidssappsong.englishlullaby.ui;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.kidssappsong.englishlullaby.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class AnasayfaFragmentDirections {
  private AnasayfaFragmentDirections() {
  }

  @NonNull
  public static Anasayfaplayergecis anasayfaplayergecis(int pozisyon) {
    return new Anasayfaplayergecis(pozisyon);
  }

  public static class Anasayfaplayergecis implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private Anasayfaplayergecis(int pozisyon) {
      this.arguments.put("pozisyon", pozisyon);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Anasayfaplayergecis setPozisyon(int pozisyon) {
      this.arguments.put("pozisyon", pozisyon);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("pozisyon")) {
        int pozisyon = (int) arguments.get("pozisyon");
        __result.putInt("pozisyon", pozisyon);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.anasayfaplayergecis;
    }

    @SuppressWarnings("unchecked")
    public int getPozisyon() {
      return (int) arguments.get("pozisyon");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      Anasayfaplayergecis that = (Anasayfaplayergecis) object;
      if (arguments.containsKey("pozisyon") != that.arguments.containsKey("pozisyon")) {
        return false;
      }
      if (getPozisyon() != that.getPozisyon()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getPozisyon();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "Anasayfaplayergecis(actionId=" + getActionId() + "){"
          + "pozisyon=" + getPozisyon()
          + "}";
    }
  }
}
