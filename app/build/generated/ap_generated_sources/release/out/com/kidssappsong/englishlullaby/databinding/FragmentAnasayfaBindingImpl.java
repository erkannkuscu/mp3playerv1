package com.kidssappsong.englishlullaby.databinding;
import com.kidssappsong.englishlullaby.R;
import com.kidssappsong.englishlullaby.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAnasayfaBindingImpl extends FragmentAnasayfaBinding  {

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
        sViewsWithIds.put(R.id.textView, 4);
        sViewsWithIds.put(R.id.textView2, 5);
        sViewsWithIds.put(R.id.animasyonlukalp, 6);
        sViewsWithIds.put(R.id.adView2, 7);
        sViewsWithIds.put(R.id.imageView4, 8);
        sViewsWithIds.put(R.id.constraintLayoutgovde, 9);
        sViewsWithIds.put(R.id.imageView2, 10);
        sViewsWithIds.put(R.id.outlinedTextField, 11);
        sViewsWithIds.put(R.id.aramatxt, 12);
        sViewsWithIds.put(R.id.rwanasayfa, 13);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAnasayfaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentAnasayfaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.gms.ads.AdView) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[2]
            );
        this.constarintlayoutbody.setTag(null);
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