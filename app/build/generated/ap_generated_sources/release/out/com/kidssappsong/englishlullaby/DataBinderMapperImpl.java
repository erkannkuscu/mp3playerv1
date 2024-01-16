package com.kidssappsong.englishlullaby;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kidssappsong.englishlullaby.databinding.AnasayfacardviewBindingImpl;
import com.kidssappsong.englishlullaby.databinding.FragmentAnasayfaBindingImpl;
import com.kidssappsong.englishlullaby.databinding.FragmentPlayerBindingImpl;
import com.kidssappsong.englishlullaby.databinding.PlayercardviewBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ANASAYFACARDVIEW = 1;

  private static final int LAYOUT_FRAGMENTANASAYFA = 2;

  private static final int LAYOUT_FRAGMENTPLAYER = 3;

  private static final int LAYOUT_PLAYERCARDVIEW = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kidssappsong.englishlullaby.R.layout.anasayfacardview, LAYOUT_ANASAYFACARDVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kidssappsong.englishlullaby.R.layout.fragment_anasayfa, LAYOUT_FRAGMENTANASAYFA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kidssappsong.englishlullaby.R.layout.fragment_player, LAYOUT_FRAGMENTPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kidssappsong.englishlullaby.R.layout.playercardview, LAYOUT_PLAYERCARDVIEW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ANASAYFACARDVIEW: {
          if ("layout/anasayfacardview_0".equals(tag)) {
            return new AnasayfacardviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for anasayfacardview is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTANASAYFA: {
          if ("layout/fragment_anasayfa_0".equals(tag)) {
            return new FragmentAnasayfaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_anasayfa is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLAYER: {
          if ("layout/fragment_player_0".equals(tag)) {
            return new FragmentPlayerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_player is invalid. Received: " + tag);
        }
        case  LAYOUT_PLAYERCARDVIEW: {
          if ("layout/playercardview_0".equals(tag)) {
            return new PlayercardviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for playercardview is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/anasayfacardview_0", com.kidssappsong.englishlullaby.R.layout.anasayfacardview);
      sKeys.put("layout/fragment_anasayfa_0", com.kidssappsong.englishlullaby.R.layout.fragment_anasayfa);
      sKeys.put("layout/fragment_player_0", com.kidssappsong.englishlullaby.R.layout.fragment_player);
      sKeys.put("layout/playercardview_0", com.kidssappsong.englishlullaby.R.layout.playercardview);
    }
  }
}
