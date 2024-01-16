package com.kidssappsong.englishlullaby.databinding;
import com.kidssappsong.englishlullaby.R;
import com.kidssappsong.englishlullaby.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPlayerBindingImpl extends FragmentPlayerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 1);
        sViewsWithIds.put(R.id.toolbar_layout, 2);
        sViewsWithIds.put(R.id.constraintlayoutheader, 3);
        sViewsWithIds.put(R.id.playerGeriBtn, 4);
        sViewsWithIds.put(R.id.popupimg, 5);
        sViewsWithIds.put(R.id.playbtn, 6);
        sViewsWithIds.put(R.id.adView2, 7);
        sViewsWithIds.put(R.id.ileributton, 8);
        sViewsWithIds.put(R.id.btnkarisik, 9);
        sViewsWithIds.put(R.id.tekrarlabtn, 10);
        sViewsWithIds.put(R.id.geribtn, 11);
        sViewsWithIds.put(R.id.guideline2, 12);
        sViewsWithIds.put(R.id.progressBar, 13);
        sViewsWithIds.put(R.id.songStartTxt, 14);
        sViewsWithIds.put(R.id.songLenghtTxt, 15);
        sViewsWithIds.put(R.id.txtSongName, 16);
        sViewsWithIds.put(R.id.cardView3, 17);
        sViewsWithIds.put(R.id.imgPlayerMain, 18);
        sViewsWithIds.put(R.id.linearLayoutallsong, 19);
        sViewsWithIds.put(R.id.imageView5, 20);
        sViewsWithIds.put(R.id.buttontumsarkilar, 21);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPlayerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private FragmentPlayerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.gms.ads.AdView) bindings[7]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (android.widget.ImageButton) bindings[9]
            , (android.widget.Button) bindings[21]
            , (androidx.cardview.widget.CardView) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.ImageButton) bindings[11]
            , (androidx.constraintlayout.widget.Guideline) bindings[12]
            , (android.widget.ImageButton) bindings[8]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.ImageButton) bindings[6]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.SeekBar) bindings[13]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[14]
            , (android.widget.ImageButton) bindings[10]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[2]
            , (android.widget.TextView) bindings[16]
            );
        this.constraintLayout3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}